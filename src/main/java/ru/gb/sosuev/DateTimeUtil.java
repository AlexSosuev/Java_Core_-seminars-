package ru.gb.sosuev;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class DateTimeUtil {
    private static final String DATE_TIME_FORMAT = "dd-MM-yyyy HH:mm:ss";

    public static String getCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_TIME_FORMAT);
        return now.format(formatter);
    }
}