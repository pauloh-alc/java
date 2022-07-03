import java.util.Scanner;

public class Main03 {

	public static void main(String[] args) {
		// 03 - Entrada de dados 1
		Scanner sc = new Scanner(System.in);

		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);

		int y;
		y = sc.nextInt();
		System.out.println(y);

		double z;
		z = sc.nextDouble();
		System.out.println(z);

		char c;
		c = sc.next().charAt(0);
		System.out.println(c);

		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Os dados digitados: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		sc.close();
	}

}
