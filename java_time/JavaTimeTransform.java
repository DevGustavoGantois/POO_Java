package src.java_time;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class JavaTimeTransform {
    public static void main(String[] args) {
        LocalDateTime hourDate = LocalDateTime.of(2023, 1, 24);
        LocalDate localDate = LocalDate.now();
        waitDate(hourDate.toLocalDate());
        LocalDateTime hourDate2 = localDate.atTime(20, 0);
        waitDateHour(hourDate2);
    }
    static void waitDate(LocalDate date) {

    };

    static void waitDateHour(LocalDateTime date) {}
}
