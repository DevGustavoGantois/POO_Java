package src.java_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class LocalDateLocales {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2025, 9, 29);

        Locale[] locales = {Locale.CANADA, Locale.US, new Locale("fi", "FI"), Locale.UK};

        for(Locale locale:locales){
            String dateFormatted = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
            System.out.println(dateFormatted);
        }
    }
}
