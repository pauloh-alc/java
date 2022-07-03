import java.util.Scanner;

public class Main09While {

	public static void main(String[] args) {
		// While
		
		Scanner sc = new Scanner(System.in);
		int x, soma = 0;
		
		x = sc.nextInt();
		while (x != 0) {
			soma += x; 
			x = sc.nextInt();
		}
		
		System.out.println("Soma = " + soma);
		sc.close();
	}

}
