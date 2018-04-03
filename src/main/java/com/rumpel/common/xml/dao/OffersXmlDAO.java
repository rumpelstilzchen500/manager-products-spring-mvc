package com.rumpel.common.xml.dao;


import javax.xml.xpath.XPathExpressionException;

public interface OffersXmlDAO {
    String getId(int i) throws XPathExpressionException;
    String getName(int i) throws XPathExpressionException;
    String getPriceRetail(int i) throws XPathExpressionException;
}
