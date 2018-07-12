import java.math.BigInteger;
public class BigIntegerTest {
    public static void sizeTest() {
        BigInteger b = new BigInteger("37");
        while(true) {
            try {
                b=b.pow(10);
                System.out.println("BASE 10 LENGTH: " + (b.toString().length()) + " BASE 2 LENGTH: " + b.bitCount());
            } catch (Exception e) {
                System.out.println("FINAL SIZE:" + b.toString().length());
            }
        }
    }
    public static void primeTest(String n) {
        boolean p = Calculate.BigSlow(new BigInteger(n));
        System.out.println(p);
    }
    public static void upTo(long n) {
        long i=3;
        while(i<n) {
            BigInteger test = new BigInteger(""+i);
            if (Calculate.BigSlow(test)) {
                System.out.println("prime found: " + i);
            }
            i+=2;
        }
    }
    public static void main(String[] args) {
        //upTo(100000);
        mersenneTest(10000);
    }
    public static void bigAddTest(String m) {
        BigInteger max = new BigInteger(m);
        Calculate.BigAdd(max);
    }
    public static void mersenneTest(int max) {
        BigInteger largest = Calculate.mersenne(max);
        System.out.println("largest prime found: " + largest.toString());
    }
}