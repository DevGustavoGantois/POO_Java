package src.java_time;

import java.time.LocalTime;

public class LocalTimeSimple {
    public static void main(String[] args) {
        LocalTime hourNow = LocalTime.now();
        LocalTime hour30minutes = hourNow.plusMinutes(12);
        LocalTime hourMinus2Hours = hourNow.minusHours(2);

        System.out.println(hourNow);
        System.out.println(hour30minutes);
        System.out.println(hourMinus2Hours);
    }
}
