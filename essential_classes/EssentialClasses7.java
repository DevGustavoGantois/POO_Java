package src.essential_classes;

import java.math.BigDecimal;

public class EssentialClasses7 {
    public static void main(String[] args) {
        BigDecimal zero =  BigDecimal.ZERO;
        BigDecimal result = zero.add(new BigDecimal("100"));
        result  = result.subtract(new BigDecimal("27.5"));
        System.out.println(result);

        result = result.multiply(new BigDecimal("27.5"));
    }

    //Conseguimos realizar operações através do BigDecimal, tanto simples quanto avançadas.
}
