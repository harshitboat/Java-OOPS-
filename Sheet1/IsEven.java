import java.util.*;
public class IsEven{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if(num < 0) {
			num*=(-1);
		}
		if(num % 2 == 0) {
			System.out.print(2);
		}else {
			System.out.print(1);
		}

}
}