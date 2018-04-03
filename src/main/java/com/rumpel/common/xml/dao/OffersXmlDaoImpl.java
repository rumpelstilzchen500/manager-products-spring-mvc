package com.rumpel.common.xml.dao;


import com.rumpel.common.xml.util.XmlUtil;

import javax.xml.xpath.XPathExpressionException;

public class OffersXmlDaoImpl implements OffersXmlDAO{

    public String getId(int i) throws XPathExpressionException {
        String id = XmlUtil.getxPath().evaluate("/КоммерческаяИнформация/ПакетПредложений/Предложения/Предложение[" + i +"]/Ид[1]", XmlUtil.getDocument());
        return id;
    }

    public String getName(int i) throws XPathExpressionException {
        String name = XmlUtil.getxPath().evaluate("/КоммерческаяИнформация/ПакетПредложений/Предложения/Предложение[" + i +"]/Наименование[1]", XmlUtil.getDocument());
        return name;
    }

    public String getArticle(int i) throws XPathExpressionException {
        String article = XmlUtil.getxPath().evaluate("/КоммерческаяИнформация/ПакетПредложений/Предложения/Предложение[" + i +"]/Артикул[1]", XmlUtil.getDocument());
        return article;
    }

    public Integer getPriceRetail(int i) throws XPathExpressionException {
        String price_retail = XmlUtil.getxPath().evaluate("/КоммерческаяИнформация/ПакетПредложений/Предложения/Предложение[" + i +"]/Цены[1]/Цена/ЦенаЗаЕдиницу", XmlUtil.getDocument());
        Integer price_retail_int = Integer.parseInt(price_retail);

        return  price_retail_int;
    }
}
