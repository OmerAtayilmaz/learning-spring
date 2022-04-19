package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@EnableJpaRepositories
@RestController
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

    @RequestMapping("*")
    public ResponseEntity<Map<String,Object>> handleRoutes(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("status",404);
        map.put("message","There is no route like that, please try another one");
        map.put("detail","This is an undefined route");
        return ResponseEntity.ok(map);
    }


}
