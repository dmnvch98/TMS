package com.teachmeskills.lesson17;

import com.teachmeskills.lesson17.additionalTask.Parser;
import com.teachmeskills.lesson17.mainTask.IPChecker;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

import static com.teachmeskills.Utils.print;

public class Executor {
    public static void main(String[] args) throws IOException {
        Parser parser = new Parser();
        parser.showParseInfo();
    }
}
