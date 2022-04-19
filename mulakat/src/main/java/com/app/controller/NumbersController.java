package com.app.controller;
import com.app.dto.NumbersDto;
import com.app.dto.UserDto;
import com.app.service.NumberService;
import com.app.service.UserService;
import java.util.List;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/number")
@RequiredArgsConstructor
public class NumbersController {

    NumberService numberService;
    @CrossOrigin(origins ="http://127.0.0.1:5500" )
    @PostMapping
    public ResponseEntity<NumbersDto> save(@RequestBody NumbersDto numbersDto){
        return ResponseEntity.ok(numberService.save(numbersDto));
    }

    @CrossOrigin(origins ="http://127.0.0.1:5500" )
    @GetMapping
    public ResponseEntity<List<NumbersDto>> getAll(){
        return ResponseEntity.ok(numberService.getAll());
    }


}
