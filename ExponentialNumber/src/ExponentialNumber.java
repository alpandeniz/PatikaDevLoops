import java.util.Scanner;

public class ExponentialNumber {public static void main(String[] args) {
	
	int n,k;
	Scanner scanner = new Scanner(System.in);
	System.out.print("Üssü alınacak sayı: ");
	n=scanner.nextInt();
	
	System.out.print("Üs olacak sayı: ");
	k = scanner.nextInt();
	int total = 1;
	
	
	for(int i=1; i<=k; i++) {
		total *= n;
		
	}System.out.println("Cevap: "+ total);
	
	
	
}

}
