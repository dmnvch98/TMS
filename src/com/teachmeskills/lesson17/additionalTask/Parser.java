package com.teachmeskills.lesson17.additionalTask;

import com.teachmeskills.lesson17.Utils;

import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.teachmeskills.lesson17.Utils.*;

public class Parser {
    public final static String DOCUMENT_NUMBER_REGEX = "\\d{4}-[a-zA-Z]{3}-\\d{4}-[a-zA-Z]{3}-\\d[a-zA-Z]\\d[a-zA-Z]";
    public final static String EMAIL_REGEX = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    public final static String PHONE_REGEX = "\\+375\\((29|25|33|44)\\)\\d{7}";

    public void getDocuments() {
        List<Path> filesPaths = getFilesPaths();
        Map<String, Document> fileNameAndContentMap = filesPaths
                .stream()
                .collect(Collectors.toMap((Path x) -> x.getFileName().toString().replaceFirst("[.][^.]+$", ""),
                        path -> {
                            List<String> content = readFileAndReturnValues(path);
                            return new Document(
                                    parseInfo(content, DOCUMENT_NUMBER_REGEX),
                                    parseInfo(content, EMAIL_REGEX),
                                    parseInfo(content, PHONE_REGEX)
                            );
                        })
                );
        fileNameAndContentMap.entrySet().forEach(System.out::println);
    }

    public List<String> parseInfo(List<String> content, String regex) {
        return content.stream().filter(line -> line.matches(regex)).toList();
    }
}