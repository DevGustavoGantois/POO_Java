package src.java_time;

import java.time.LocalDate;

public class LocalDateSimple {
    public static void main(String[] args) {
        //Podemos discutir aspectos de fusos horários quando estamos falando de LocalDate Time.
        LocalDate actuallyDate = LocalDate.now();

        System.out.println(actuallyDate);
    }
}
