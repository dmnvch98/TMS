package com.teachmeskills.lesson18;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public final class Utils {
    private Utils() {
    }

    public static void createFileAndWrite(List<String> content, String fileName) {
        Path file = Paths.get(fileName);
        try {
            Files.write(file, content, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
