import java.util.Scanner;

public class Main10For {

	public static void main(String[] args) {
		// For
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int soma = 0;
		
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt(); 
			soma += x;
		}
		
		System.out.println("Soma = " + soma);
	}

}
