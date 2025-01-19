package src.java_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateSimple {
    public static void main(String[] args) {
        //Podemos discutir aspectos de fusos horários quando estamos falando de LocalDate Time.
        LocalDate actuallyDate = LocalDate.now();
        //Data de aniversário
        LocalDate myAniversary = LocalDate.of(2025,6,30);

        System.out.println(actuallyDate);
        System.out.println(myAniversary);

        String stringDateBr = "19/01/2024";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate correctDate = LocalDate.parse(stringDateBr, formatter);

        System.out.println(correctDate);
    }
}
