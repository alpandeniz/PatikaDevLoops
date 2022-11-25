import java.util.Scanner;

public class OddNumberFinder {

	public static void main(String[] args) {
		
		int total = 0;
		
		Scanner scanner = new Scanner(System.in);
		boolean isOddNumber = false;
		while(!isOddNumber) {
			
			System.out.print("Lütfen sayı giriniz: ");
			int n = scanner.nextInt();
			if(!(n%2 == 0)) {
				isOddNumber = true;
			}else if(n%4==0) {
				total += n;
			}
			
		}
		System.out.println("4'e bölünen sayıların toplamı = " + total);
		
		}

}
