package com.enoca.store.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class storeApi {

    @GetMapping("/")
    public ResponseEntity<String> getMapping(){
        String data="Hello World!";

        return ResponseEntity.ok(data);
    }

    @GetMapping("/test")
    public String getData(){
        return "asdsadsadsad";
    }
}
