package br.com.lipelacross.todolist.filter;

import at.favre.lib.crypto.bcrypt.BCrypt;
import br.com.lipelacross.todolist.models.UserModel;
import br.com.lipelacross.todolist.services.UserService;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Base64;

@Component
public class FilterTaskAuth extends OncePerRequestFilter {

    @Autowired
    private UserService userService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        String authHeader = request.getHeader("authorization");

        if (!request.getServletPath().startsWith("/tasks")) {
            filterChain.doFilter(request, response);
            return;
        }

        if (authHeader == null) {
            response.sendError(401, "Where is the auth?");
            return;
        }

        String authKeyEncoded = authHeader.replace("Basic ", "");

        String authDecoded = new String(Base64.getDecoder().decode(authKeyEncoded));

        String[] authDecodedArray = authDecoded.split(":");

        String username = authDecodedArray[0];
        String password = authDecodedArray[1];

        UserModel user = userService.findByUsername(username);

        if (user == null || !BCrypt.verifyer().verify(password.getBytes(), user.getPassword().getBytes()).verified) {
            response.sendError(401, "Not authorization.");
            return;
        }

        request.setAttribute("user_id", user.getId());

        filterChain.doFilter(request, response);
    }
}
