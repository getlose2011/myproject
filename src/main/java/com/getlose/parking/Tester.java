package com.getlose.parking;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Tester {

    public static void main(String[] args) {
        LocalDateTime enter = LocalDateTime.of(2019,02,15,8,0,0);
        LocalDateTime leave = LocalDateTime.of(2019,02,15,12,30,0);
        Car car = new Car("AAA-001",enter);
        car.setLeave(leave);
        System.out.println(car.getDuration());
        long hours = (long) Math.ceil(car.getDuration()/60.0);

        System.out.println(hours);
        //java();
        //java8();
    }

    private static void java8() {
        //java 8
        Instant instant = Instant.now();
        System.out.println(instant);//帶有時區的時間
        //local,immutable物件不可以被改變
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(formatter.format(localDateTime));
        System.out.println(localDateTime.plus(Duration.ofHours(3)));
        System.out.println(localDateTime.plus(Duration.ofDays(3)));

        LocalDateTime other = LocalDateTime.of(2019,02,15,8,0,0);
        System.out.println(other);
    }

    private static void java() {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(date));
        String s = "2019/01/01 12:29:00";
        try {
            Date other = sdf.parse(s);
            System.out.println(other);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //mutable 物件可以被改變
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());

        calendar.set(Calendar.MONTH,9);//10月
        System.out.println(calendar.getTime());

        calendar.add(Calendar.DAY_OF_YEAR,3);
        System.out.println(calendar.getTime());
    }

}
