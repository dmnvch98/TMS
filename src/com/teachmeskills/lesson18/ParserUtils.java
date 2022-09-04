package com.teachmeskills.lesson18;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static com.teachmeskills.Utils.*;

public final class ParserUtils {
    private ParserUtils() {
    }

    public static void createFileAndWrite(List<String> content, String fileName) {
        Path file = Paths.get(fileName);
        try {
            Files.write(file, content, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Path> getFilesPaths() {
        String dirName = askEnterString();
        List<Path> filesPaths = new ArrayList<>();

        try (Stream<Path> paths = Files.list(new File(dirName).toPath())) {
            filesPaths = paths
                    .toList();
        } catch (IOException e) {
            System.out.println("No such directory");
        }
        return filesPaths;
    }

    public static List<Path> filterXmlFiles(List<Path> paths) {
        return paths
                .stream()
                .filter(file -> file.getFileName().toString().matches(".*\\w+.*\\.xml"))
                .toList();
    }

    public static String selectFile(List<Path> paths) {
        print("Select which xml file to parse: ");
        for (int i = 0; i < paths.size(); i++) {
            System.out.println(i + " - " + paths.get(i).getFileName());
        }
        int enteredNumber = askEnterNumber();
        return paths.get(enteredNumber).toString();
    }
}
