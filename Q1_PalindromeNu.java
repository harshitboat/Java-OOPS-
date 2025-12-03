import java.util.*;
public class Q1_PalindromeNu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int temp = num ;
		int res = 0;
		while(temp > 0) {
			int rem = temp % 10;
			res = res*10 + rem;
			temp /= 10;
		}
		if(res == num) {
			System.out.print(2);
		}else {
			System.out.print(1);
		}

	}

}
