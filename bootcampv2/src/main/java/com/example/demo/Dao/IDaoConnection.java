package com.example.demo.Dao;

import com.example.demo.DB.DatabaseConnection;

import java.sql.Connection;
import java.util.ArrayList;

public interface IDaoConnection<T> {
     void create(T t);
     void update(T t);
     void delete(T t);
     ArrayList<T> list();

     default Connection getInterfaceConnection(){
          return DatabaseConnection.getInstance().getCon();
     }
}
