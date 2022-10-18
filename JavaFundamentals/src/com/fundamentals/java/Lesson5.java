package com.fundamentals.java;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;

public class Lesson5 {

    public void localDateTimeExample(){
        LocalDateTime timeNow = LocalDateTime.now();
        System.out.println(timeNow);
        System.out.println(timeNow.getMonth());
        System.out.println(timeNow.getDayOfYear());
        System.out.println(timeNow.minusMonths(2));
        System.out.println(timeNow.plusDays(23));

    } // end method

    public void localEpochExample(){
        LocalDateTime epochNow = LocalDateTime.ofEpochSecond(1666050028L, 0, ZoneOffset.MIN);
        System.out.println(epochNow);
        System.out.println(epochNow.withDayOfMonth(11));

    } // end method

    public void localDateParseExample(){
        LocalDateTime born = LocalDateTime.parse("1800-12-11T17:00:30");
        System.out.println(born);
        System.out.println(born.getMonth());
        System.out.println(born.getDayOfYear());
        System.out.println(born.minusMonths(2));
        System.out.println(born.plusDays(23));

    } // end method

    public void localDateExample(){
        LocalDate dateNow = LocalDate.now(ZoneId.systemDefault());
        System.out.println(dateNow.atTime(9, 25));
        System.out.println(dateNow.getChronology().eras());

    } // end method

    public void epochDateExample(){
        LocalDate epochDate = LocalDate.ofEpochDay(8175L);
//        LocalDate epochDate = LocalDate.parse("1992-05-20");
//        long day = epochDate.toEpochDay();
        System.out.println(epochDate.isLeapYear());
        System.out.println(epochDate.lengthOfYear());
//        System.out.println(day);
        System.out.println(epochDate);

    } // end method

    public void localTimeExample(){
        LocalTime time = LocalTime.now(Clock.systemUTC());
        System.out.println(time);
        System.out.println(time.atOffset(ZoneOffset.ofHours(-5)));
        int hour = time.getHour();
        System.out.println(hour);
        System.out.println(time.withMinute(45));
//        System.out.println(timeNow.atDate());
//        System.out.println(timeNow.getHour());
//        System.out.println(timeNow.getMinute(2));
//        System.out.println(timeNow.equals());

    } // end method

    public void bornDateFormatterExample(){
        LocalDateTime born = LocalDateTime.parse("1800-12-11T17:00:30");
        String sampleDate = born.format(DateTimeFormatter.ofPattern("MM dd yyyy G - h:mm a"));
        System.out.println(sampleDate);
        ZonedDateTime zone = born.atZone(ZoneId.of("-0500"));
        System.out.println(zone.format(DateTimeFormatter.ofPattern("VV zzz")));
    } // end method

    public void timePeriodExample(){
        Period period = Period.of(4, 8, 21);
        Temporal temp = period.addTo(LocalDate.now());
        System.out.println(temp);
    } // end method

} // end class
