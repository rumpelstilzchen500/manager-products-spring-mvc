package com.rumpel.common.service;



import javax.xml.xpath.XPathExpressionException;
import java.sql.SQLException;


public interface ProductService {
    void setAll(int i) throws SQLException, XPathExpressionException;
}
