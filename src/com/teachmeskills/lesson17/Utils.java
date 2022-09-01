package com.teachmeskills.lesson17;

import com.teachmeskills.lesson17.additionalTask.Parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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
            filesPaths = paths
                    .limit(documentsToReadNumber)
                    .toList();
        } catch (IOException e) {
            System.out.println("No such file");
        }
        return filesPaths;
    }

    public static List<String> readFileAndReturnValues(Path path) {
        try (Stream<String> stream = Files.lines(Paths.get(path.toString()))) {
            return stream.toList();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}
