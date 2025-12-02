import java.util.*;
class Q13 {

	public static int NthPrime(int input1) {
		int count = 0;
	    int num = 2;

	    while (true) {
	    	if (isPrime(num)) {
	            count++;
	            if (count == input1) {
	                return num;
                  }
	          }
	        num++;
	        }
	    }

	    private static boolean isPrime(int n) {
	        if (n < 2) return false;
	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) return false;
	        }
	        return true;
	        }


	}
