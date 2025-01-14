package src.essential_classes;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class EssentialClasses9 {
    public static void main(String[] args) {
        BigDecimal LiterPrice = BigDecimal.valueOf(5.799);
        BigDecimal LitersUsed = BigDecimal.valueOf(21.752);
        BigDecimal AmountToPay = LitersUsed.multiply(LiterPrice);
        System.out.println(AmountToPay); //126.139848

        //arredondando ...
        BigDecimal AmountToPayRounded = AmountToPay.setScale(2, RoundingMode.HALF_EVEN);
        System.out.println(AmountToPayRounded); //126.14

    }
}
