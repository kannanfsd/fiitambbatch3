package com.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(1999, 05, 23);  // static LocalDate of(int year, int month, int dayOfMonth
        LocalTime localTime = LocalTime.of(7, 35, 42);
        LocalDateTime localDateTime = LocalDateTime.of(1999, 5, 23, 9, 35, 42);

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = dateFormatter.format(localDate);
        System.out.println("Formatted Date: "+formattedDate);

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm a");
        String formattedTime = timeFormatter.format(localTime);
        System.out.println("Formatted Time: "+formattedTime);

//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm a");
//        String formattedDateTime = dateTimeFormatter.format(localDateTime);
//        System.out.println("Formatted DateTime: "+formattedDateTime);
    }
}
