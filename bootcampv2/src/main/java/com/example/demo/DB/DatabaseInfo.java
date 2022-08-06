package com.example.demo.DB;


import lombok.Data;

@Data
public class DatabaseInfo {
    private String url;
    private String userName;
    private String password;

    private String forNameData;

    public DatabaseInfo() {
        this.url="jdbc:mysql://localhost:8889/spring";
        this.userName="root";
        this.password="root";
        this.forNameData="com.mysql.jdbc.Driver";
    }
}
