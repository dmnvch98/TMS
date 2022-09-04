package com.teachmeskills.lesson18.mainTask;

import com.teachmeskills.lesson18.Utils;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.IntStream;

public class DomXmlParser implements Parseble {
    public String firstName;
    public String lastName;
    public String title;

    @Override
    public void readXml(String path) {
        // Instantiate the Factory
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        try {
            // optional, but recommended
            // process XML securely, avoid attacks like XML External Entities (XXE)
            dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);

            // parse XML file
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse(new File(path));

            // optional, but recommended
            // http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
            doc.getDocumentElement().normalize();
            // get <book>
            firstName = doc.getElementsByTagName("firstName").item(0).getTextContent();
            lastName = doc.getElementsByTagName("lastName").item(0).getTextContent();
            title = doc.getElementsByTagName("title").item(0).getTextContent();
            String resultFileName = firstName + "_" + lastName + "_" + title + ".txt";

            NodeList list = doc.getDocumentElement().getElementsByTagName("line");
            List<String> linesList = IntStream.range(0, list.getLength())
                    .mapToObj(list::item)
                    .map(Node::getTextContent)
                    .map(x -> x.replace("\n", ""))
                    .map(String::trim)
                    .toList();

            Utils.createFileAndWrite(linesList, resultFileName);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}
