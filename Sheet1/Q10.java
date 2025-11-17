import java.util.*;

public class Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int input1 = input.nextInt();

        if (input1 <= 1) {
            System.out.print(1); // Not prime
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(input1); i++) {
                if (input1 % i == 0) {
                    System.out.print(1); // Not prime
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(2); // Prime
            }
        }
    }
}