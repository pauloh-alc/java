import java.util.Scanner;

public class Main13OperadorBitwiseAplicacao {

	public static void main(String[] args) {
		// Aplicação do operador bitwise
		
		Scanner sc = new Scanner(System.in);
		
		int mask = 0b100000;
		int n = sc.nextInt();
		
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		} else {
			System.out.println("6th bit is false!");
		}

	}

}
