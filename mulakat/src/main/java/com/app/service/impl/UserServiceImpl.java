package com.app.service.impl;
import com.app.dto.UserDto;
import com.app.entity.PhoneNumber;
import com.app.entity.User;
import com.app.repo.PhoneNumberRepository;
import com.app.repo.UserRepository;
import com.app.service.UserService;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PhoneNumberRepository phoneNumberRepository;


    @Override
    @Transactional
    public UserDto save(UserDto userDto) {
      // Assert.notNull(userDto.getName(),"This field cannot be empty!");
        User user=new User();
        user.setName(userDto.getName());
        user.setSurname(userDto.getSurname());
        user.setEmail(userDto.getEmail());
        final User userDb=userRepository.save(user);
        List<PhoneNumber> phoneNumberList=new ArrayList<>();
        userDto.getPhoneNumberList().forEach((item)->{
            PhoneNumber phoneNumber=new PhoneNumber();
            phoneNumber.setPhonenumber(item);
            phoneNumber.setActive(true);
            phoneNumber.setUser(userDb);
            phoneNumberList.add(phoneNumber);
        });
        phoneNumberRepository.saveAll(phoneNumberList);
        userDto.setId(userDb.getId());
        return userDto;
    }

    @Override
    public void delete(Long id) {
      try {
          userRepository.deleteById(id);
      }catch (Exception e){
          System.out.println(e);
      }
    }

    @Override
    public List<UserDto> getAll() {
        List<User> userList=userRepository.findAll();
        List<UserDto> userDtos=new ArrayList<>();
        userList.forEach((item)->{
            UserDto userDto=new UserDto();
            userDto.setId(item.getId());
            userDto.setName(item.getName());
            userDto.setEmail(item.getEmail());
            userDto.setSurname(item.getSurname());
            userDto.setPhoneNumberList(item.getPhoneList().stream().map(PhoneNumber::getPhonenumber)
            .collect(Collectors.toList()));
            userDtos.add(userDto);
        });
        return userDtos;
    }

    @Override
    public UserDto update(UserDto userDto) {
    return  null;
    }
}
