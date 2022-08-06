package com.example.demo.DB;

import lombok.Data;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Data
@Log4j2
public class DatabaseConnection extends DatabaseInfo {

    private String url=this.getUrl();
    private String userName=this.getUserName();
    private String password=this.getPassword();
    private String forNameData=this.getForNameData();
    private Connection con;
    //singleton design pattern
    private static DatabaseConnection instance;

    private DatabaseConnection() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            log.info("Driver success");
            con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:8889/spring","root","root");
            log.info("Connection success");
        }catch(Exception e){
        log.error(e.getMessage());
            e.printStackTrace();
        }
    }

    public static DatabaseConnection getInstance() {
    try {
        if (instance == null || instance.con.isClosed()) {
            instance = new DatabaseConnection();
        }
    }catch (SQLException e){
        log.error(e);
        e.printStackTrace();
    }
        return instance;
    }

    public static void main(String[] args) {
        DatabaseConnection connection=new DatabaseConnection();
    }


}
