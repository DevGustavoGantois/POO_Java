package src.essential_classes;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class EssentialClasses8 {
    public static void main(String[] args) {
        //Precisamos aplicar uma escala para não ocorrer uma dizima periódica.
        BigDecimal divide = BigDecimal.valueOf(3);
        BigDecimal result = BigDecimal.TEN.divide(divide, 3, RoundingMode.HALF_EVEN); //Definindo o modo de arredondamento e o mais comum é o HALF_EVEN. Ele eleva o resultado da nossa dizima
        System.out.println(result); //3.333
            }
}
