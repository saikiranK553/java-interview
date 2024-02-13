package com.maveric.code;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTimeApiDemo {
    public static void main(String[] args) {
        //Date
        LocalDate localDate=LocalDate.now();
        System.out.println(localDate);

        //Time
        LocalTime localTime=LocalTime.now();
        System.out.println(localTime);

        //retrieve year,month and day
        int dd=localDate.getDayOfMonth();
        int mm=localDate.getMonthValue();
        int yyyy=localDate.getYear();
        System.out.println("in "+dd+":"+mm+":"+yyyy);
    }
}
