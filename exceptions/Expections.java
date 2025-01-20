package src.exceptions;

import java.text.NumberFormat;

public class Expections {
    public static void main(String[] args) {
        try {
            Double value = (double) (100 / 3);
            System.out.println(value);

        } catch (StateValidationException ex) {
            System.out.println("error");
            System.out.println(ex.getMessage());
            System.out.println("Select the valid state.");
        } finally {
            System.out.println("Finally block");
        }

        Double value_two = NumberFormat.getCurrencyInstance().parse("a175");
        System.out.println(value_two);


        stateCheck("ba");
    }

    public static void stateCheck(String nameState) throws StateValidationException {
        if(!nameState.equalsIgnoreCase("BA"))
            throw new StateValidationException();
        System.out.println("Welcome" + nameState.toUpperCase());
    }
}
