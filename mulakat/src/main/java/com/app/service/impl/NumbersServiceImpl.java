package com.app.service.impl;

import com.app.dto.NumbersDto;
import com.app.entity.PhoneNumber;
import com.app.entity.User;
import com.app.repo.PhoneNumberRepository;
import com.app.service.NumberService;

import java.util.ArrayList;
import java.util.List;

public class NumbersServiceImpl implements NumberService {
    PhoneNumberRepository phoneNumberRepository;
    @Override
    public NumbersDto save(NumbersDto numbersDto) {
        PhoneNumber phoneNumber=new PhoneNumber();
        phoneNumber.setPhonenumber(numbersDto.getPhone());
        phoneNumber.setActive(numbersDto.isActive());
        phoneNumber.setUser_id(numbersDto.getUser_id());
        phoneNumberRepository.save(phoneNumber);

    numbersDto.setId(phoneNumber.getId());
    return numbersDto;
    }

    @Override
    public void delete(Long id) {

    }


    @Override
    public List<NumbersDto> getAll() {
        List<PhoneNumber> phoneNumberList=phoneNumberRepository.findAll();
        List<NumbersDto> numbersDtos=new ArrayList<>();
        phoneNumberList.forEach((item)->{
            NumbersDto numbersDto=new NumbersDto();
            numbersDto.setId(item.getId());
            numbersDto.setActive(item.isActive());
            numbersDto.setPhone(item.getPhonenumber());
            numbersDtos.add(numbersDto);
        });
        return numbersDtos;
    }

    @Override
    public NumbersDto update(NumbersDto numbersDto) {
        return null;
    }
}
