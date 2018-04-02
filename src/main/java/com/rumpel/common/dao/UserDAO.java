package com.rumpel.common.dao;

import com.rumpel.common.models.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDAO {
    //create
    void add(User user) throws SQLException;
    //read
    List<User> getAll() throws SQLException; //SQL
    List<User> getNameById(int i) throws SQLException;//HQL
    //update
    void update(User user) throws SQLException;
    //delete
    void delete(User user) throws SQLException;

}
