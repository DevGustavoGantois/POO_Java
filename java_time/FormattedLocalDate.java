package src.java_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattedLocalDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 1, 13);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //Podemos usar vários tipos de formatações

        System.out.println(date); //2023-01-13

        //Formatando a data criada acima
        System.out.println(formatter.format(date));
    }
}
