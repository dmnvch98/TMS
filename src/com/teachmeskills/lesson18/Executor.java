package com.teachmeskills.lesson18;

import com.teachmeskills.lesson18.mainTask.DomXmlParser;
import com.teachmeskills.lesson18.mainTask.SaxXmlParser;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import static com.teachmeskills.Utils.*;
import static com.teachmeskills.lesson18.ParserUtils.*;

public class Executor {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        new Executor().init();
    }

    public void init() {
        List<Path> xmlFilesPaths = filterXmlFiles(getFilesPaths());
        int xmlFileNumber = xmlFilesPaths.size();

        if (xmlFileNumber == 1) {
            askSelectParserMethod(xmlFilesPaths.get(0).toString());
        } else if (xmlFileNumber > 1) {
            String path = ParserUtils.selectFile(xmlFilesPaths);
            askSelectParserMethod(path);
        } else {
            print("There are no xml files in directory");
        }
    }

    public void askSelectParserMethod(String filePath) {
        int enteredNumber = askEnterNumber("""
                Choose which parser you want to parse the XML document with :
                1 - SAX\s
                2 - DOM""");
        switch (enteredNumber) {
            case 1 -> new SaxXmlParser().readXml(filePath);
            case 2 -> new DomXmlParser().readXml(filePath);
        }
    }
}
