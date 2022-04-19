package com.firstapp.demo.service.impl;

import com.firstapp.demo.dto.FirstDto;
import com.firstapp.demo.entity.FirstEntity;
import com.firstapp.demo.repository.FirstRepository;
import com.firstapp.demo.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class FirstServiceImpl implements FirstService {


    @Autowired
    public FirstRepository firstRepository;

    @Override
    public List<FirstDto > getAllData() {
       List<FirstDto > firstEntities=new ArrayList<>();
       List<FirstEntity> firstEntityList=firstRepository.findAll();
       firstEntityList.forEach((item)->{
           FirstDto firstDto=new FirstDto();
           firstDto.setId(item.getId());
           firstDto.setName(item.getName());
           firstDto.setSurname(item.getSurname());
           firstDto.setEmail(item.getEmail());
           firstEntities.add(firstDto);
       });
       return firstEntities;
    }


    @Transactional
    @Override
    public FirstDto olustur(FirstDto firstDto) {
        FirstEntity myObj=new FirstEntity();
        myObj.setName(firstDto.getName());
        myObj.setSurname(firstDto.getSurname());
        myObj.setEmail(firstDto.getEmail());
        firstRepository.save(myObj);
        return firstDto;
    }
}
