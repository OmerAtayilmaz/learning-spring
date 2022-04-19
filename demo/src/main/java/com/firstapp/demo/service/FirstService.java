package com.firstapp.demo.service;

import com.firstapp.demo.dto.FirstDto;
import com.firstapp.demo.entity.FirstEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface FirstService {
    public List<FirstDto > getAllData();
    public FirstDto olustur(FirstDto firstDto);
   /* public ResponseEntity<FirstEntity> getDataById(Long id);
    public void createData();
    public ResponseEntity<FirstEntity> updateData(Long id);
    public void deleteData(Long id);*/
 }