package com.teachmeskills.lesson10.additionalTask;

import java.util.*;

import static com.teachmeskills.lesson10.Utils.print;

public class AdditionalTask {
    public final static String TEST_TEXT = "Lorem Ipsum is simply dummy text of the printing and typesetting industry";
    public final static String INCORRECT_VALUE = "Введено некорректное число";

    public String[] getMinMaxWord(String testString) {
        String[] separatedString = testString.split(" ");
        String[] minMaxWords = new String[]{separatedString[0], separatedString[0]};
        for (int i = 1; i < separatedString.length; i++) {
            if (separatedString[i].length() < minMaxWords[0].length()) {
                minMaxWords[0] = separatedString[i];
            } else if (separatedString[i].length() > minMaxWords[1].length()) {
                minMaxWords[1] = separatedString[i];
            }
        }
        return minMaxWords;
    }

    public String getMinRepeatedLettersWord(String testString) {
        String[] separatedString = testString.split(" ");
        Map<String, Integer> wordAndUniqueLetters = new LinkedHashMap<>();
        for (String word : separatedString) {
            Integer uniqueLetterCounter = 0;
            char[] wordChars = word.toCharArray();
            for (int i = 0; i < wordChars.length; i++) {
                if (i == word.lastIndexOf(wordChars[i])) {
                    uniqueLetterCounter++;
                }
            }
            wordAndUniqueLetters.put(word, uniqueLetterCounter);
        }
        Integer minUniqueLettersNumber = Collections.min(wordAndUniqueLetters.values());
        String result = "";
        for (Map.Entry<String, Integer> keyValue : wordAndUniqueLetters.entrySet()) {
            if (keyValue.getValue().equals(minUniqueLettersNumber)) {
                return keyValue.getKey();
            }
        }
        return result;
    }

    public boolean isPalindrome(String testString, int wordNumber) {
        String[] separatedString = testString.split(" ");
        if ((separatedString.length > wordNumber - 1 && wordNumber > 0)) {
            return separatedString[wordNumber]
                    .equals(new StringBuilder(separatedString[wordNumber])
                            .reverse()
                            .toString());
        } else {
            print(INCORRECT_VALUE);
        }
        return false;
    }

    public String duplicateEachLetterInString(String testString) {
        return testString.replaceAll(".", "$0$0");
    }
}
