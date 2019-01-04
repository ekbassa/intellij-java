package Helpers;

import jdk.internal.org.xml.sax.SAXException;
import org.openqa.selenium.WebDriver;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;



public class ReadData {
    private static WebDriver driver;

    public static String configFilePath ="E:\\Users\\Bassam\\Documents\\Training\\Xml\\Config.xml";
    public static String namesFilePath  = "E:\\Users\\Bassam\\Documents\\Training\\Xml\\Names.xml";

    public static String getData (String keyName,String filePath) throws ParserConfigurationException,
            IOException, SAXException, org.xml.sax.SAXException {
        File configXmlFile = new File(filePath);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = null;
        dBuilder = dbFactory.newDocumentBuilder();
        Document doc = null;
        assert dBuilder != null;
        doc = dBuilder.parse(configXmlFile);

        if (doc != null) {
            doc.getDocumentElement().normalize();
        }
        assert doc != null;
        return doc.getElementsByTagName(keyName).item(0).getTextContent();
    }
}

