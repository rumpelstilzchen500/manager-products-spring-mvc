package com.rumpel.common.dao;

import com.rumpel.common.models.Product;
import com.rumpel.common.util.SessionUtil;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;

@Repository
public class ProductDAOImpl extends SessionUtil implements ProductDAO{

    public void add(Product product) throws SQLException {
        openTransactionSession();
        Session session = getSession();
        session.save(product);
        closeTransactionSession();
    }
}
