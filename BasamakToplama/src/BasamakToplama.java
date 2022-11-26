import java.util.Scanner;

public class BasamakToplama {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number, basamak, basamakTop = 0;
		System.out.print("Sayı giriniz: ");
		number = scanner.nextInt();
		while (number != 0) {
			basamak = number%10;
			basamakTop +=basamak;
			number/=10;
		}System.out.print(basamakTop);
	}

}
