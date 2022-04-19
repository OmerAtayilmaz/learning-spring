package com.app.service;

import com.app.dto.NumbersDto;
import com.app.dto.UserDto;

import java.util.List;

public interface NumberService {
    NumbersDto save(NumbersDto numbersDto);
    void delete(Long id);
    List<NumbersDto> getAll();
    NumbersDto update(NumbersDto numbersDto);
}
