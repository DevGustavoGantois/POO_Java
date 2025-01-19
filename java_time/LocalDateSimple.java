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

        //Manipulações com Java Time LocalDate
        LocalDate aniversaryGustavo = LocalDate.of(2023, 4, 3);
        LocalDate date30years = aniversaryGustavo.plusYears(15);
        LocalDate newDate = aniversaryGustavo.minusDays(7);

        System.out.println(newDate);

        System.out.println(date30years);

        //Comparando respectivas datas:
        LocalDate date1 = LocalDate.of(2023, 3, 4);
        LocalDate date2 = LocalDate.of(2024, 4, 3);

        //date2 está após a date1? true
        System.out.println(date2.isAfter(date1));
    }
}
