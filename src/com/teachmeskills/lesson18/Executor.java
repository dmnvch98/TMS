package com.teachmeskills.lesson18;

import com.teachmeskills.lesson18.mainTask.DomXmlParser;
import com.teachmeskills.lesson18.mainTask.Parseble;
import com.teachmeskills.lesson18.mainTask.SaxXmlParser;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

import static com.teachmeskills.Utils.*;

public class Executor {
    public static final String filePath = "src/com/teachmeskills/lesson18/mainTask/test.xml";
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        new Executor().init();
    }

    public void init() {
        int enteredNumber = askEnterNumber("""
                Select by which parser do you want to parse xml document:
                1 - SAX\s
                2 - DOM""");
        switch (enteredNumber) {
            case 1 -> new SaxXmlParser().readXml(filePath);
            case 2 -> new DomXmlParser().readXml(filePath);
        }
    }
}
