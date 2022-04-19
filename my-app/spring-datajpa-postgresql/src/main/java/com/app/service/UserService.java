package com.app.service;
import com.app.dto.UserDTO;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    UserDTO save(UserDTO userDTO);
    void delete(Long id);
    List<UserDTO> getAll();
    Page<UserDTO> getAll(Pageable pageable);
}
