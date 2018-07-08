import java.math.BigInteger;
public class BigIntegerTest {
    public static void main(String[] args) {
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
    public static void primeTest(int n) {
        boolean p = Calculate.isPrime(new BigInteger(n+""));
        System.out.println(p);
    }
}