package com.teachmeskills.lesson14.mainTask;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

public class DateService {
    public static String getDayOfWeek(long epochTime) {
        Date date = new Date(epochTime * 1000);
        return new SimpleDateFormat("EEEEEEE").format(date);
    }

    public static String getNextTuesdayDate() {
        LocalDate dt = LocalDate.now();
        return dt.with(TemporalAdjusters.next(DayOfWeek.TUESDAY)).toString();
    }
}
