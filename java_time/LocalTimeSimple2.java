package src.java_time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeSimple2 {
    public static void main(String[] args) {
        LocalTime hourNow = LocalTime.now();
        LocalTime hourNowMinus2Hours = hourNow.minusHours(2);

        boolean past = hourNow.isBefore(hourNowMinus2Hours);
        boolean future = hourNow.isAfter(hourNowMinus2Hours);

        System.out.println(past);
        System.out.println(future);


        LocalTime hour = LocalTime.of(13, 21, 42);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ss-mm-HH"); //Horas minutos e segundos.
        String formattedHour = hour.format(formatter);
        System.out.println(hour); //13:21:42
        System.out.println(formattedHour); //42-12-13
    }
}
