import java.math.BigInteger;

public class Task {
        public static void main(String[] args) {
            for (int i = 0; i <= 10000; i++) {
                System.out.printf("Factorial of %d = %d",i,factorial(i));
                System.out.println();
            }
        }

        public static BigInteger factorial(int num){
            BigInteger f = BigInteger.ONE;
            if(num == 0||num == 1) return BigInteger.ONE;
            else {
                for (int i = 2; i <= num; i++) {
                    f = f.multiply(new BigInteger(String.valueOf(i)));
                }
            }
            return f;
        }
}
