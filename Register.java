package src;

import java.time.LocalDate;

public class Register {
    String name;
    String sex;
    Long phone;
    LocalDate bornDate;
    Double sugestValue;
    boolean client;

    public Register(String name, String sex, Long phone, LocalDate bornDate, Double sugestValue, boolean client) {
        this.name = name;
        this.sex = sex;
        this.phone = phone;
        this.bornDate = bornDate;
        this.sugestValue = sugestValue;
        this.client = client;
    }

}
