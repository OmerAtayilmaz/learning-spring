package com.example.demo;

import com.example.demo.Controller.UserController;
import com.example.demo.Dao.UserDao;
import com.example.demo.Dto.UserDto;

public class MainTest {
    public static void main(String[] args) {
        UserController userController=new UserController();
        UserDto userDto=UserDto.builder()
                        .name("AWESOME")
                        .surname("YEESS")
                        .build();
        //userDto.setName("Ahmet");
        //userDto.setSurname("Awesome");
        userController.create(userDto);
    }
}
