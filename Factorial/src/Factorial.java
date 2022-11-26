import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		 long n, r, total0 = 1, total1 = 1, total2 = 1;
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Give number n: ");
	        n = scanner.nextInt();
	        System.out.print("Give number r: ");
	        r = scanner.nextInt();
	        for (int i = 1; i <= n; i++) {
	            total0 *= i;
	        }
	        for (int j = 1; j <= r; j++) {
	            total1 *= j;
	        }
	        for (int k = 1; k <= (n-r); k++){
	            total2 *= k;
	        }
	        long combination = total0 / (total1 * total2);
	        System.out.println("Result of combination = " + combination);

	}

}
