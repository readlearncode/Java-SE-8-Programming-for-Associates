package readlearncode.section1.subsection1;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class PreciseCalculations {

    public static void main(String...args){

        BigDecimal x = new BigDecimal(10);
        BigDecimal y = new BigDecimal(6);
        BigDecimal result = x.divide(y, new MathContext(5, RoundingMode.HALF_UP));
        System.out.println(result);

    }
}