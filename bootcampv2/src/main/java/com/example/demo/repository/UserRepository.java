package com.example.demo.repository;

import com.example.demo.Dto.UserDto;
import com.example.demo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserDto,Long> {
    List<UserDto> findByTitleContainingOrContentContaining(String text, String textAgain);

}
