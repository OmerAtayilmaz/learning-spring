package com.example.demo.Controller;

import com.example.demo.Dao.IDaoConnection;
import com.example.demo.Dao.UserDao;
import com.example.demo.Dto.UserDto;
import com.example.demo.repository.UserRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Entity.User;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
@RestController
@Log4j2
public class UserController implements IDaoConnection<UserDto> {


    @Autowired
    UserRepository blogRespository;

    @GetMapping("/awesome")
    public List<UserDto> userDtoList(){
        return blogRespository.findAll();
    }
    UserDao userDao;


    public UserController(){
        userDao=new UserDao();
    }

    @GetMapping("/log4j2")
    public ResponseEntity<User> login(){
        User user=new User(1L,"omeratayilmaz@gmail.com","test1234","/images.png");
        log.info("{} logged in with password:{}",user.getEmail(),user.getPassword());
        log.trace("Trace");
        log.debug("Debug");
        log.warn("Warning");
        log.fatal("Fatal");
        log.error("Error");
        return ResponseEntity.ok(user);
    }


    @Override
    @GetMapping("/create")
    public void create(UserDto userDto) {
        //userDto.setName("Huracan");
        //userDto.setSurname("Buracan");
        userDao.create(userDto);
    }

    @Override
    public void update(UserDto userDto) {

    }

    @Override
    public void delete(UserDto userDto) {

    }

    @Override
    public ArrayList<UserDto> list() {
        return null;
    }
}
