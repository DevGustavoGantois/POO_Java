package src.java_time;

import java.time.LocalTime;

public class LocalTimeSimple2 {
    public static void main(String[] args) {
        LocalTime hourNow = LocalTime.now();
        LocalTime hourNowMinus2Hours = hourNow.minusHours(2);

        boolean past = hourNow.isBefore(hourNowMinus2Hours);
        boolean future = hourNow.isAfter(hourNowMinus2Hours);

        System.out.println(past);
        System.out.println(future);
    }
}
