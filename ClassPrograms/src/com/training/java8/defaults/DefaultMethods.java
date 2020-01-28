package com.training.java8.defaults;

import java.time.format.DateTimeFormatter;

public class DefaultMethods {

    private static final DateTimeFormatter READABLE_FORMAT;

    static {
        READABLE_FORMAT = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    }

    public static void main(String[] args) {
        SimpleTime timeUtil = new SimpleTimeUtil();
       System.out.println("Initial LocalDateTime is {}"+ timeUtil.currentLocalDateTime());

        timeUtil.setDate(25, 6, 2014);
       System.out.println("Changed LocalDate to {}"+ timeUtil.currentLocalDateTime());

        timeUtil.setTime(22, 10, 30);
       System.out.println("Changed LocalTime to {}"+ timeUtil.currentLocalDateTime());

       System.out.println("ISO 8601 LocalDateTime is {}"+ timeUtil.zonedDateTime("Asia/Tokyo"));

       System.out.println("Readable LocalDateTime is {}"+ timeUtil.currentLocalDateTime().format(READABLE_FORMAT));
    }
}
