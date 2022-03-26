package ru.tpu;/*
 * @author timtims
 * @date 26.03.2022
 */

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class DateTime {
    public static void main(String[] args){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate date = LocalDate.parse("26.02.2022", formatter);
        Timestamp timestamp = Timestamp.valueOf(date.atStartOfDay());

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timestamp.getTime());
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        calendar.set(Calendar.MILLISECOND,0);

        if (timestamp.getTime() == calendar.getTime().getTime()) {
            System.out.println("equal");
        } else {
            System.out.println(timestamp.getTime());
        }
        System.out.println(calendar.getTime());


    }

}
