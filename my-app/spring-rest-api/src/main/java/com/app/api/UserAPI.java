package com.app.api;

import com.app.models.User;
import com.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/users")

public class UserAPI {

    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void init(){
        User user= new User();
        user.setId("2");
        user.setName("Ömer");
        user.setSurname("Atayilmaz");
        userRepository.save(user);
    }
    @PostMapping
    public ResponseEntity<User> create(@RequestBody User user){
        return ResponseEntity.ok(userRepository.save(user));
    }

    @GetMapping
    public ResponseEntity<List<User>> select(){
        return ResponseEntity.ok(userRepository.findAll());
    }

}
