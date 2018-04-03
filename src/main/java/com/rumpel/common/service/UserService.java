package com.rumpel.common.service;

import com.rumpel.common.dao.UserDAO;
import com.rumpel.common.models.User;
import com.rumpel.common.util.SessionUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

public class UserService extends SessionUtil implements UserDAO{

    public void add(User user) throws SQLException {
        openTransactionSession();
        Session session = getSession();
        session.save(user);
        closeTransactionSession();
    }

    public List<User> getAll() throws SQLException {
        openTransactionSession();
        Session session = getSession();
        String sql = "SELECT first_name FROM user";
        Query query = session.createSQLQuery(sql);//user - table
        List<User> first_nameList = query.list();
        //closeTransactionSession();
        return first_nameList;
    }

    public List<User> getNameById(int i) throws SQLException {
        openTransactionSession();
        Session session = getSession();
        String hqlGetNameById = "SELECT U.first_name FROM User U WHERE U.id = ";
        Query query = session.createQuery(hqlGetNameById + i ); //User - class

        List firstLastName = query.list();

        //closeTransactionSession();
        return firstLastName;
    }
    public void update(User user) throws SQLException{
        openTransactionSession();
        Session session = getSession();
        String hqlUpdate = "UPDATE User SET first_name =:first_name " +
                "where id_user = :id_user";
        Query query = session.createQuery(hqlUpdate); //"UPDATE User SET first_name = 'Update name' where id_user = '2'"
        query.setParameter("first_name", "Update name");
        query.setParameter("id_user", "3");
        query.executeUpdate();
        //closeTransactionSession();
    }

    public void delete(User user) throws SQLException {
        openTransactionSession();
        Session session = getSession();
        String hqlDelete ="DELETE FROM User WHERE first_name =:first_name " +
                "AND id_user = :id_user";
        Query query = session.createQuery(hqlDelete);
        query.setParameter("first_name", "test_first_n123123123123123");
        query.setParameter("id_user", "4");
        query.executeUpdate();
        closeTransactionSession();
     }
}
