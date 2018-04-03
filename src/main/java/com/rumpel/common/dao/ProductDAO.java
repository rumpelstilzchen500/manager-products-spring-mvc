package com.rumpel.common.dao;


import com.rumpel.common.models.Product;
import com.rumpel.common.models.User;

import java.sql.SQLException;
import java.util.List;

public interface ProductDAO {

    void add(Product product) throws SQLException;
    List<User> getAll() throws SQLException;
}
