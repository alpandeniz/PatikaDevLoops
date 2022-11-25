import java.util.Scanner;

public class Two {public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.print("Bir sayı gir: ");
	int number = scanner.nextInt();
	for (int i = 1; i <= number; i*=4) {
		System.out.println("4'ün kuvvetleri: " + i);
	}for (int j = 1; j <= number; j*=5) {
		System.out.println("5'in kuvvetleri: " + j);
	}
}

}
