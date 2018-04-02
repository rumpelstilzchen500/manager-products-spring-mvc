package com.rumpel.common.xml.parse_xml;


import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.IOException;

public class PathToElement {
    private static String _PATH_OFFERS = "F:\\projects\\managerproducts\\src\\main\\resources\\public\\offers.xml";
    DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
    Document document = documentBuilder.parse(new File(_PATH_OFFERS));

    XPathFactory xPathFactory = XPathFactory.newInstance();
    XPath xPath = xPathFactory.newXPath();

    public PathToElement() throws ParserConfigurationException, IOException, SAXException, XPathExpressionException {
        //TagSelector();

    }
    public void TagSelector() throws XPathExpressionException {
        /*int i = 1;
        while (i < 2) {
            //System.out.println(xPath.evaluate("/КоммерческаяИнформация/ПакетПредложений/Предложения/Предложение[" + i + "]/Наименование[1]", document));
            //System.out.println(xPath.evaluate("/КоммерческаяИнформация/ПакетПредложений/Предложения/Предложение[" + i + "]/Цены[1]/Цена/ЦенаЗаЕдиницу", document));
            //System.out.println(xPath.evaluate("/КоммерческаяИнформация/ПакетПредложений/Предложения/Предложение[" + i + "]/Ид[1]", document));
            System.out.println("_________________________________");
            i++;
        }*/
    }

    public String getName() throws XPathExpressionException {
        String name = xPath.evaluate("/КоммерческаяИнформация/ПакетПредложений/Предложения/Предложение[1]/Наименование[1]", document);
        return name;
    }


}
