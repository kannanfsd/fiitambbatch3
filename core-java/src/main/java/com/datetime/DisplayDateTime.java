package com.datetime;

import java.time.*;
import java.util.Date;

public class DisplayDateTime {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        LocalDate localDate = LocalDate.now();  // static LocalDate now()
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();  // static LocalTime now()
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();  // static LocalDateTime now()
        System.out.println(localDateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();  // static ZonedDateTime now()
        System.out.println(zonedDateTime);

        LocalDate localDate2 = LocalDate.of(1999, 05, 23);  // static LocalDate of(int year, int month, int dayOfMonth)
        System.out.println(localDate2);

        LocalTime localTime2 = LocalTime.of(9, 35, 42);
        System.out.println(localTime2);

        LocalDateTime localDateTime2 = LocalDateTime.of(1999, 5, 23, 9, 35, 42);
        System.out.println(localDateTime2);

        ZoneId zoneId = ZoneId.of("America/New_York");  // static ZoneId systemDefault()
        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(localDateTime, zoneId);
        System.out.println("New York Time: "+zonedDateTime2);
    }
}
