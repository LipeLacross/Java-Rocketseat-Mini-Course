package br.com.lipelacross.todolist.controller;

import at.favre.lib.crypto.bcrypt.BCrypt;
import br.com.lipelacross.todolist.models.UserModel;
import br.com.lipelacross.todolist.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity create(@RequestBody UserModel newUser) {
        String newPassword = BCrypt.withDefaults().hashToString(12, newUser.getPassword().toCharArray());
        newUser.setPassword(newPassword);

        UserModel userObject = userService.create(newUser);
        if (userObject != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(userObject);
        } else {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("{\"success\":0, \"cause\": \"User already exist.\"}");
        }
    }
}
