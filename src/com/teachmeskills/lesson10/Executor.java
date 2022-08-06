package com.teachmeskills.lesson10;

import com.teachmeskills.lesson10.additionalTask.AdditionalTask;
import com.teachmeskills.lesson10.mainTask.Document;
import com.teachmeskills.lesson10.mainTask.DocumentService;

import static com.teachmeskills.lesson10.Utils.print;
import static com.teachmeskills.lesson10.Utils.printArray;

public class Executor {
    public static void main(String[] args) {
        Document document = new Document("3423-sdf-0932-qwe-2y1y");
        print(DocumentService.getDocumentPeriodNumbers(document));
        print(DocumentService.replaceCharPeriodsToAsterisks(document));
        print(DocumentService.getAllCharsSeparatedBySlashLowercase(document));
        print(DocumentService.getAllCharsSeparatedBySlashUppercase(document));
        print(DocumentService.isDocumentNumberContainsAbc(document));
        print(DocumentService.isDocumentNumberStartWithFives(document));
        print(DocumentService.isDocumentNumberEndsWithValue(document));

        AdditionalTask additionalTask = new AdditionalTask();
        printArray(additionalTask.getMinMaxWord(AdditionalTask.TEST_TEXT));
        print(additionalTask.getMinRepeatedLettersWord(AdditionalTask.TEST_TEXT));
        print(additionalTask.isPalindrome(AdditionalTask.TEST_TEXT, 3));
        print(additionalTask.isPalindrome("sdfsdf fff aqd", 1));
        print(additionalTask.duplicateEachLetterInString("hello"));
    }
}
