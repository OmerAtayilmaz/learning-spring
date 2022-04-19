package com.firstapp.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.util.Calendar.JANUARY;

@Configuration
public class StudentConfig {
    /*
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
           Student alex=new Student(25l,"Alex","19921032",19,LocalDate.now());
           Student julia=new Student(23l,"Julia","1910202",21,LocalDate.of(2000,JANUARY,8));
           studentRepository.saveAll(List.of(alex,julia));
        };
    }
    */

}
