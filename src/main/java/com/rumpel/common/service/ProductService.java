package com.rumpel.common.service;


import com.rumpel.common.models.Product;

import java.sql.SQLException;

public interface ProductService {
    void add(Product product) throws SQLException;
}
