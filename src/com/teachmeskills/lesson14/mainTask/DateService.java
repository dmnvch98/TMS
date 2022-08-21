package com.teachmeskills.lesson14.mainTask;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

public class DateService {
    public static final String DAY_OF_THE_WEEK_PATTERN = "EEEEEEE";
    public String getDayOfWeek(long epochTime) {
        Date date = new Date(epochTime * 1000);
        return new SimpleDateFormat(DAY_OF_THE_WEEK_PATTERN).format(date);
    }

    public String getNextTuesdayDate() {
        LocalDate currentDate = LocalDate.now();
        return currentDate.with(TemporalAdjusters.next(DayOfWeek.TUESDAY)).toString();
    }
}
