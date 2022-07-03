import java.util.Locale;
import java.util.Scanner;

import org.w3c.dom.UserDataHandler;

public class Main11DoWhile {

	public static void main(String[] args) {
		// do-while
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double C, F;
		
		do {
			System.out.print("Digite a temperatura em Celcius: ");
			C = sc.nextDouble();
			F = 9.0 * C / 5.0 + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			System.out.print("Deseja repetir (s/n)? ");
		} while (sc.next().charAt(0) != 'n');
	}

}
