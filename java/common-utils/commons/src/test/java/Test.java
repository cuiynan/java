import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * @author : cuiyingnan
 * @date : 2020/2/25 10:37
 * @desc :
 */
public class Test {

    @org.junit.Test
    public void test() {
        BigDecimal r = new BigDecimal(12798.1234);

        DecimalFormat df1 = new DecimalFormat("###0.00");
        df1.setRoundingMode(RoundingMode.HALF_UP);
        System.out.println(df1.format(r));

        DecimalFormat df2 = new DecimalFormat("#,##0.00");
        System.out.println(df2.format(r));

         df2 = new DecimalFormat("#,###.0#");
        System.out.println(df2.format(r));

         df2 = new DecimalFormat("#,###.##");
        System.out.println(df2.format(r));
    }

    @org.junit.Test
    public void ttt(){
        String investPrice = DecimalFormat.getNumberInstance().format(1000000003.2);
        System.out.println(investPrice);
    }
}
