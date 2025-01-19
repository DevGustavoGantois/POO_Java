package src.java_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class OtherFormatted {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 4, 9);

       String dateFormatted = date.format((DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG))); //13 de abril de 2024
        System.out.println(dateFormatted);
        dateFormatted = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)); // 13 de abr. de 2024
        System.out.println(dateFormatted);
        dateFormatted = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)); //13/04/2024
        System.out.println(dateFormatted);
        dateFormatted = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)); //sexta-feira, 13 de abril de 2024
        System.out.println(dateFormatted);
}
