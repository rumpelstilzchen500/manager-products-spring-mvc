package com.rumpel.common;

import com.rumpel.common.models.User;
import com.rumpel.common.service.UserService;
import com.rumpel.common.xml.parse_xml.PathToElement;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ParserConfigurationException, SAXException, XPathExpressionException, IOException {
        UserService userService = new UserService();
        PathToElement pathToElement = new PathToElement();

        User user = new User();
        user.setFirst_name(pathToElement.getName());
        user.setLast_name("test_last_name2");
        user.setPhone(932071888);
        user.setSex("man");

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
        userService.closeTransactionSession();

    }
}