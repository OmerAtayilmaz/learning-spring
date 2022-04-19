package com.app.controller;

import com.app.dto.UserDTO;
import com.app.service.UserService;
import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @PostMapping
    public ResponseEntity<UserDTO> add(@RequestBody UserDTO userDTO){
        return ResponseEntity.ok(userService.save(userDTO));
    }

    @GetMapping
    public ResponseEntity<List<UserDTO>> showAll(){
        return ResponseEntity.ok(userService.getAll());
    }
}
