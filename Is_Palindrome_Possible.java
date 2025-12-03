import java.util.*;

public class Is_Palindrome_Possible {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int temp = n;
		int[] freq = new int[10];   //store freq 0 - 9 
		while(temp > 0) {
			int rem = temp % 10 ;
			freq[rem]++;
			temp /= 10;
		}
		int oddcount = 0;
		for(int i = 0 ; i < 10 ; i++) {
			if(freq[i] % 2 != 0) {
				oddcount++;
			}
		}
		System.out.print((oddcount <= 1 ) ? 2 : 1); 
	}
