package com.rumpel.common.service;



import com.rumpel.common.models.User;

import javax.xml.xpath.XPathExpressionException;
import java.sql.SQLException;
import java.util.List;


public interface ProductService {
    void setAll(int i) throws SQLException, XPathExpressionException;
    List<User> getAll() throws SQLException;
}
