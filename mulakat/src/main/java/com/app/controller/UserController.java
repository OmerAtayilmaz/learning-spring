package com.app.controller;
import com.app.dto.UserDto;
import com.app.service.UserService;
import java.util.List;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class UserController {


    private final UserService userService;

    @CrossOrigin(origins ="http://127.0.0.1:5500" )
    @PostMapping("/user")
    public ResponseEntity<UserDto> save(@RequestBody UserDto userDto){
        return ResponseEntity.ok(userService.save(userDto));
    }
    @CrossOrigin(origins ="http://127.0.0.1:5500" )
    @GetMapping("/user")
    public ResponseEntity<List<UserDto>> getAll(){
        return ResponseEntity.ok(userService.getAll());
    }

    @CrossOrigin(origins ="http://127.0.0.1:5500" )
    @DeleteMapping("/user")
    public void delete(@RequestParam(name = "id") Long id){
         userService.delete(id);
    }

    @CrossOrigin(origins ="http://127.0.0.1:5500" )
    @PutMapping
    public void update(@RequestBody UserDto userDto){

    }


}
