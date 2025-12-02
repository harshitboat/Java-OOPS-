
import java.util.*;
public class Q14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int input1 = input.nextInt();
		int input2 = input.nextInt();
	        int count = 0;
	        for (int i = input1; i <= input2; i++) {
		        boolean isPrime = true;

		        if (i < 2) {
		            isPrime = false;
		        } else {
		            for (int j = 2; j <= Math.sqrt(i); j++) {
		                if (i % j == 0) {
		                	isPrime = false;
		                    break;
		                }
		            }
		        }

		        if (isPrime) {
	                count++;
	            }
	        }

		    System.out.print(count);
		    
	}

}
