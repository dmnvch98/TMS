package com.teachmeskills.lesson17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;
import static com.teachmeskills.Utils.*;

public final class Utils {
    private static Scanner scanner;
    private Utils() {
    }

    public static List<Path> getFilesPaths() {
        String dirName = askEnterString();
        int documentsToReadNumber = askEnterNumber();
        List<Path> filesPaths = new ArrayList<>();

        try (Stream<Path> paths = Files.list(new File(dirName).toPath())) {
            filesPaths = paths.limit(documentsToReadNumber).toList();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return filesPaths;
    }

    public static List<String> readFileAndReturnValues(Path path) {
        File file = new File(path.toString());
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<String> content = new ArrayList<>();
        while (scanner.hasNextLine()) {
            content.add(scanner.nextLine());
        }
        return content;
    }
}
