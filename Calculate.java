import java.math.BigInteger;
import java.math.BigDecimal;
public class Calculate {
    public static boolean isPrime(BigInteger b) {
        //BigInteger half = b.divide(new BigInteger("2"));
        BigDecimal top = new BigDecimal(sqrt(b));
        BigDecimal in = new BigDecimal("1");
        boolean a = true;
        int f = 0;
        while(a) {
            BigDecimal div = top.divide(in);
            if (div.remainder(new BigDecimal("1")).compareTo(BigDecimal.ZERO)==0) {
                System.out.println("factor with " + in.toString() + " found");
                f++;
            }
            in=in.add(BigDecimal.ONE);
            if (in.compareTo(top)>0) {
                break;
            }
        }
        if (f>1) {
            return false;
        }
        return true;
    }
    public static BigInteger sqrt(BigInteger x) {
        BigInteger div = BigInteger.ZERO.setBit(x.bitLength()/2);
        BigInteger div2 = div;
        for(;;) {
            BigInteger y = div.add(x.divide(div)).shiftRight(1);
            if (y.equals(div) || y.equals(div2))
                return y;
            div2 = div;
            div = y;
        }
    }
}