package com.app.service.impl;

import com.app.dto.UserDTO;
import com.app.entity.User;
import com.app.entity.PhoneNumber;
import com.app.repo.PhoneNumberRepository;
import com.app.repo.PersonRepository;
import com.app.service.UserService;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final PersonRepository personRepository;
    private final PhoneNumberRepository phoneNumberRepository;


    @Override
    @Transactional //işlem ya tamamiyle yapılır,ya da hiç uygulamaz ve uygulanmışı geri alır!
    public UserDTO save(UserDTO userDTO) {

        User user =new User();
        user.setAdi(userDTO.getAdi());
        user.setSoyadi(userDTO.getSoyadi());
        final User personDb=personRepository.save(user);
        return userDTO;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<UserDTO> getAll() {
        List<User> personList=personRepository.findAll();
        List<UserDTO> userDTOList =new ArrayList<>();
        personList.forEach((item)->{
            UserDTO userDTO =new UserDTO();
            userDTO.setId(item.getId());
            userDTO.setAdi(item.getAdi());
            userDTO.setSoyadi(item.getSoyadi());
            userDTOList.add(userDTO);
        });
        return userDTOList;
    }

    @Override
    public Page<UserDTO> getAll(Pageable pageable) {
        return null;
    }
}
