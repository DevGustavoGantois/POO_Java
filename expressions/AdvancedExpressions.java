package src.expressions;

import java.time.LocalDate;

public class AdvancedExpressions {
    public static void main(String[] args) {
        String name = "Gustavo Gantois Caria Carvalho";
        String surname = "Guga";
        //Com a combinação de índices + position temos a capacidade de inverter as posições dos nossos argumentos:
        System.out.println(String.format("%2$s %1$s", name, surname));


        Integer age = 21;
        Double salary = 3000.00;
        LocalDate AdmissionDate = LocalDate.now();
        System.out.println(AdmissionDate);
        //Através dos números após as porcentagens podemos definir quantos caracteres queremos q apareçam."
        String funcData = String.format("Age: %05d Name: %-15.15s Sal.: %,.2f", age, salary, name);
        System.out.println(funcData);

        //Formatando a data:
        String funDateData = String.format("Date: %td/<%tm/<%tY", AdmissionDate, AdmissionDate);
    }
}
