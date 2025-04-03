package Task1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {


    public static double roundBigDecimal(BigDecimal bigDecimal){

        return bigDecimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static BigDecimal reverseBigDecimal(BigDecimal bigDecimal){

        return bigDecimal.setScale(1, RoundingMode.HALF_UP).negate();
    }

    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("4.2545");
        System.out.println("Rounded Value: " +  roundBigDecimal(bigDecimal));
        System.out.println("Reversed Value: " + reverseBigDecimal(bigDecimal));
    }

}
