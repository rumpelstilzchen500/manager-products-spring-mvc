package com.rumpel.common;

import com.rumpel.common.models.User;
import com.rumpel.common.service.UserService;
import com.rumpel.common.xml.dao.OffersXmlDaoImpl;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ParserConfigurationException, SAXException, XPathExpressionException, IOException {
        UserService userService = new UserService();
        OffersXmlDaoImpl offersXmlDao = new OffersXmlDaoImpl();

        User user = new User();
        user.setFirst_name(offersXmlDao.getName(1));
        user.setLast_name(offersXmlDao.getId(1));
        user.setPhone(932071888);
        user.setSex(offersXmlDao.getPriceRetail(1));

        //create
        userService.add(user);
        //read
        //System.out.println(userService.getAll());
        //System.out.println(userService.getNameById(3));
        //update
        //userService.update(user);
        //delete
        //userService.delete(user);
        //new PathToElement();
        //userService.closeTransactionSession();

    }
}