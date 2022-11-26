import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number, basNumber = 0, tempNumber, basValue, result = 0, basPow;
		System.out.print("Sayı girin: ");
		number = scanner.nextInt();
		tempNumber = number;
		while (tempNumber != 0) {
			tempNumber /= 10;
			basNumber++;
		}

		tempNumber = number;
		while (tempNumber != 0) {
			basValue = tempNumber % 10;
			basPow = 1;
			for (int i = 1; i <= basNumber; i++) {
				basPow *= basValue;
			}
			result += basPow;
			tempNumber /= 10;
		}	
		
		if (result == number) {
			System.out.println("Bu bir Amstrong sayıdır. " + "'" + result + "'");
		} else {
			System.out.println("Bu bir Amstrong sayı değildir. " + number + "'");
		}

		
		
		
		
	}

}
