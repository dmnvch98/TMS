package com.teachmeskills.lesson17.mainTask;

import static com.teachmeskills.Utils.askEnterString;

public class IPChecker {
    public final static String IP_REGEX = "(\\b25[0-5]|\\b2[0-4][0-9]|\\b[01]?[0-9][0-9]?)" +
            "(\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}";

    public boolean checkIpAddress() {
        String address = askEnterString();
        return address.matches(IP_REGEX);
    }
}
