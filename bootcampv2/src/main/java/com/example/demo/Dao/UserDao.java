package com.example.demo.Dao;

import com.example.demo.Dto.UserDto;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

@Log4j2
public class UserDao implements IDaoConnection<UserDto>{
    @Override
    public void create(UserDto user) {
        try(Connection connection=getInterfaceConnection()){
            String sql="insert into user(name,surname) values(?,?);";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,user.getName());//1:birinci soru işareti
            preparedStatement.setString(2,user.getSurname());
            int rowEffected=preparedStatement.executeUpdate();
            if(rowEffected>0)
                log.info("UserDao Ekleme Başarılı");
            else
                log.error("UserDao ekleme başarısız :)");


        }catch(Exception e){
        log.error(UserDao.class+" Ekleme sırasında hata meydana geldi");
        e.printStackTrace();

        }
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
