package com.teachmeskills.lesson17.additionalTask;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.teachmeskills.lesson17.Utils.*;
import static com.teachmeskills.Utils.*;

public class Parser {
    public final static String DOCUMENT_NUMBER_REGEX = "\\d{4}-[a-zA-Zа-яА-я]{3}-\\d{4}-[a-zA-Zа-яА-я]{3}-" +
            "\\d[a-zA-Zа-яА-я]\\d[a-zA-Zа-яА-я]";
    public final static String EMAIL_REGEX = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    public final static String PHONE_REGEX = "\\+375\\((29|25|33|44)\\)\\d{7}";
    public final static String EXTENSION_REGEX = "[.][^.]+$";
    public final static String TXT_EXTENSION_REGEX = ".*\\w+.*\\.txt";
    private int incorrectFilesToParse = 0;

    public Optional<Map<String, Document>> getDocuments() {
        List<Path> filesPathsList = getFilesPaths();
        if (isDirectoryNotEmpty(filesPathsList)) {
            filesPathsList = filesPathsList.stream().filter(this::checkFileExtension).toList();
            if (doesDirectoryHasTxtFiles(filesPathsList)) {
                Map<String, Document> fileNamedAndContentMap = filesPathsList
                        .stream()
                        .collect(Collectors.toMap(x -> x.getFileName().toString().replaceFirst(EXTENSION_REGEX, ""),
                                path -> {
                                    List<String> content = readFileAndReturnValues(path);
                                    return new Document(
                                            parseInfo(content, DOCUMENT_NUMBER_REGEX),
                                            parseInfo(content, EMAIL_REGEX),
                                            parseInfo(content, PHONE_REGEX)
                                    );
                                })
                        );
                return Optional.of(fileNamedAndContentMap);
            }
        }
        return Optional.empty();
    }

    public List<String> parseInfo(List<String> content, String regex) {
        return content.stream().filter(line -> line.matches(regex)).toList();
    }

    public boolean checkFileExtension(Path path) {
        if (path.toString().matches(TXT_EXTENSION_REGEX)) {
            return true;
        } else {
            this.incorrectFilesToParse++;
            return false;
        }
    }

    public void showParseInfo() {
        print("Successfully processed files: " + getDocuments().orElse(new HashMap<>()).size() +
                "\nIncorrect files: " + incorrectFilesToParse);
    }

    private static boolean doesDirectoryHasTxtFiles(List<Path> list) {
        if (!(list.size() == 0)) {
            return true;
        } else {
            print("Directory does not contain txt files");
            return false;
        }
    }

    private static boolean isDirectoryNotEmpty(List<Path> list) {
        if (!(list.size() == 0)) {
            return true;
        } else {
            print("Directory does not contain any files");
            return false;
        }
    }
}