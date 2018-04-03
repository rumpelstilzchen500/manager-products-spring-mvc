package com.rumpel.common.service;


import com.rumpel.common.models.Product;
import com.rumpel.common.util.SessionUtil;
import org.hibernate.Session;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class ProductServiceImpl extends SessionUtil implements ProductService{

    public void add(Product product) throws SQLException {
        openTransactionSession();
        Session session = getSession();
        session.save(product);
        closeTransactionSession();
    }
}
