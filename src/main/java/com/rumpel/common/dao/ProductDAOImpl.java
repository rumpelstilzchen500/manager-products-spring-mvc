package com.rumpel.common.dao;

import com.rumpel.common.models.Product;
import com.rumpel.common.models.User;
import com.rumpel.common.util.SessionUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ProductDAOImpl extends SessionUtil implements ProductDAO{

    public void add(Product product) throws SQLException {
        openTransactionSession();
        Session session = getSession();
        session.save(product);
        closeTransactionSession();
    }

    public List<User> getAll() throws SQLException {
        openTransactionSession();
        Session session = getSession();
        String sql = "SELECT full_name FROM product";
        Query query = session.createSQLQuery(sql);//user - table
        List<User> first_nameList = query.list();
        closeTransactionSession();
        return first_nameList;
    }
}
