package src.essential_classes;

import java.math.BigDecimal;

public class EssentialClasses6 {
    public static void main(String[] args) {
        BigDecimal zero = BigDecimal.ZERO;
        BigDecimal ten = BigDecimal.TEN;

        BigDecimal decimal = BigDecimal.valueOf(1234.5678);
        BigDecimal stringNumber = new BigDecimal("1234.5678");

        //Quando temos um objeto BigDecimal ele representa número, mas na linguagem Java ele ainda é um objeto
        //e dentro dele ele tem um número e operações.
    }
}
