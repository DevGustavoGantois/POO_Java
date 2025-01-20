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

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public Long getPhone() {
        return phone;
    }

    public LocalDate getBornDate() {
        return bornDate;
    }

    public Double getSugestValue() {
        return sugestValue;
    }

    public boolean isClient() {
        return client;
    }
}
