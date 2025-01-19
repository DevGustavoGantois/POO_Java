package src.java_time;

import java.time.LocalDate;

public class FormattedLocalDateMonthYear {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2025, 8, 23);
        System.out.println(date.getDayOfMonth()); //retorna o dia 23 do mês => 23
        System.out.println(date.getYear()); //retorna o ano => 2025
        System.out.println(date.getMonth()); //retorna o elemento de enum
        System.out.println(date.getMonthValue()); //retorna o número do mês
    }


}
