package br.com.lipelacross.todolist.services;

import br.com.lipelacross.todolist.models.UserModel;
import br.com.lipelacross.todolist.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserModel create(UserModel newUser) {
        if (userRepository.findByUsername(newUser.getUsername()) == null) {
            return userRepository.save(newUser);
        }
        return null;
    }

    public UserModel findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
