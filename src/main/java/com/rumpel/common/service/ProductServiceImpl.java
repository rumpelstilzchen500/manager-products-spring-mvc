package com.rumpel.common.service;


import com.rumpel.common.dao.ProductDAOImpl;
import com.rumpel.common.models.Product;
import com.rumpel.common.models.User;
import com.rumpel.common.util.SessionUtil;
import com.rumpel.common.xml.dao.OffersXmlDaoImpl;
import org.hibernate.Session;
import org.springframework.stereotype.Service;

import javax.xml.xpath.XPathExpressionException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl extends SessionUtil implements ProductService{

    Product product = new Product();
    OffersXmlDaoImpl offersXmlDao = new OffersXmlDaoImpl();
    ProductDAOImpl productDAO = new ProductDAOImpl();

    public void setAll(int i) throws SQLException, XPathExpressionException {
        product.setFullName(offersXmlDao.getName(i));
        product.setArticle(offersXmlDao.getArticle(i));
        product.setPrice_retail(offersXmlDao.getPriceRetail(i));
        product.setCode("НЕ ведется");
        product.setCode_id_from_1C(offersXmlDao.getId(i));
        product.setPrice_purchase(0);
        product.setPrice_wholesale(0);
        productDAO.add(product);

    }
}
