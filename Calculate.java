import java.math.BigInteger;
import java.math.BigDecimal;
public class Calculate {
    public static boolean BigSlow(BigInteger b) {
        //BigInteger half = b.divide(new BigInteger("2"));
        BigDecimal num = new BigDecimal(b);
        BigDecimal top = new BigDecimal(sqrt(b));
        BigDecimal in = new BigDecimal("1");
        boolean a = true;
        int f = 0;
        //System.out.println("top: " + top.toString());
        //System.out.println("input num: " + b.toString());
        while(a) {
            BigDecimal div = num.divide(in, 50, BigDecimal. ROUND_HALF_UP);
            //System.out.println("dec remainder mod 1: " + div.remainder(BigDecimal.ONE).toString());
            //System.out.println("in: " + in.toString());
            //System.out.println("div: " + div.toString());
            if (div.remainder(new BigDecimal("1")).compareTo(BigDecimal.ZERO)==0) {
                //System.out.println("factor with " + in.toString() + " found");
                f++;
            }
            if (f>1) {
                break;
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
    public static BigInteger BigAdd(BigInteger max) {
        BigInteger prev = new BigInteger("3");
        BigInteger i = new BigInteger("4");
        boolean a = true;
        while(a) {
            if (prev.multiply(new BigInteger("2")).compareTo(i)<0) {
                System.out.println("prev: " + prev.toString());
                System.out.println("i: " + i.toString());
                prev=i.subtract(prev);
                
                
                
            }
            i=i.add(new BigInteger("2"));
            if(i.compareTo(max)>0) {
                break;
            }
        }
        System.out.println("largest prime: " + prev.toString());
        return prev;
        
    }
}