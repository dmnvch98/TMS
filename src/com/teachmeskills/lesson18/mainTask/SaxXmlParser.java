package com.teachmeskills.lesson18.mainTask;

import com.teachmeskills.lesson18.ParserUtils;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SaxXmlParser implements Parseble {
    private static Sonnet sonnet;

    @Override
    public void readXml(String path) {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        try {
            SAXParser parser = factory.newSAXParser();
            AdvancedXMLHandler handler = new AdvancedXMLHandler();
            parser.parse(new File(path), handler);
            String resultFileName = sonnet.getAuthorFirstName()
                    + "_" + sonnet.getAuthorLastName()
                    + "_" + sonnet.getSonnetTitle()
                    + ".txt";
            ParserUtils.createFileAndWrite(sonnet.getLines(), resultFileName);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static class AdvancedXMLHandler extends DefaultHandler {
        private String authorFirstName;
        private String authorLastName;
        private String sonnetTitle;
        private String lastElementName;
        private final List<String> lines = new ArrayList<>();

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) {
            lastElementName = qName;
        }

        @Override
        public void endElement(String uri, String localName, String qName) {
            if (authorFirstName != null
                    && !authorFirstName.isEmpty()
                    && authorLastName != null
                    && !authorLastName.isEmpty()
                    && sonnetTitle != null
                    && !sonnetTitle.isEmpty()
                    && !lines.isEmpty()) {
                sonnet = new Sonnet(authorFirstName, authorLastName, sonnetTitle, lines);
            }
        }

        @Override
        public void characters(char[] ch, int start, int length) {
            String information = new String(ch, start, length);

            information = information.replace("\n", "").trim();

            if (!information.isEmpty()) {
                switch (lastElementName) {
                    case "firstName" -> authorFirstName = information;
                    case "lastName" -> authorLastName = information;
                    case "title" -> sonnetTitle = information;
                    case "line" -> lines.add(information);
                }
            }
        }
    }
}
