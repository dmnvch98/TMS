package com.teachmeskills.lesson17;
import com.teachmeskills.lesson17.additionalTask.Parser;
import com.teachmeskills.lesson17.mainTask.IPChecker;

import static com.teachmeskills.Utils.print;

public class Executor {
    public static void main(String[] args) {
        Parser parser = new Parser();
        parser.getDocuments();
    }

}
