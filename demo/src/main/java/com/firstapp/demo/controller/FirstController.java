package com.firstapp.demo.controller;


import com.firstapp.demo.dto.FirstDto;
import com.firstapp.demo.entity.FirstEntity;
import com.firstapp.demo.service.FirstService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor //service için constructor oluşturur.
public class FirstController {

    @Autowired
    private final FirstService firstService;

    @GetMapping
    public String getData(){
        return "Hello World!";
    }

    @GetMapping("/all")
    public List<FirstDto> getAllData(){
        return firstService.getAllData();
    }
    @GetMapping("/test")
    public ResponseEntity<FirstEntity> getObject(){
        FirstEntity myobj=new FirstEntity();
        Long id=25l;
        /*
        * @DurationUnit(ChronoUnit.SECONDS)
        * @DefaultValue()
        * @DataSizeUnit(DataUnit.MEGABYTES)  @DefaultValue("2MB") DataSize bufferSize
        *
        * */
        String name="Jonas";
        String surname="Smoak";
        myobj.setId(id);
        myobj.setName(name);
        myobj.setSurname(surname);
        return ResponseEntity.ok(myobj);
    }

    @GetMapping("/{id}/profile")
    public ResponseEntity<FirstEntity> getId(@PathVariable Long id){
        FirstEntity firstEntity=new FirstEntity();
        firstEntity.setId(id);
        firstEntity.setName("Current User");
        return ResponseEntity.ok(firstEntity);
    }

    @PostMapping
    public ResponseEntity<FirstDto> createObject(@RequestBody FirstDto theDataComeFromBody){
        FirstDto firstDto=new FirstDto();
        firstDto.setName(theDataComeFromBody.getName());
        firstDto.setSurname(theDataComeFromBody.getSurname());
        firstDto.setEmail(theDataComeFromBody.getEmail());
        firstService.olustur(firstDto);
        return  ResponseEntity.ok(firstDto);
    }
}
