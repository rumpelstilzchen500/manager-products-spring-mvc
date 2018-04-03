package com.rumpel.common.dao;


import com.rumpel.common.models.Product;

import java.sql.SQLException;

public interface ProductDAO {

    void add(Product product) throws SQLException;
}
