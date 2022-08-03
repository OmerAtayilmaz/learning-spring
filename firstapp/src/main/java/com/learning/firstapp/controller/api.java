package com.learning.firstapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class api {

    @GetMapping("helloworld")
    public ResponseEntity<Object> helloWorld(){
        return ResponseEntity.ok("Test");
    }
}
