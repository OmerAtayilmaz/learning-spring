package com.app.service;
import com.app.dto.UserDto;
import java.util.List;

public interface UserService {
    UserDto save(UserDto userDto);
    void delete(Long id);
    void update();

    List <UserDto> getAll();
    UserDto update(UserDto userDto);
}
