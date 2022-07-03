import java.util.Locale;

public class Main01 {

	public static void main(String[] args) {
		// 01 - Saida de dados em Java
		Locale.setDefault(Locale.US);
		double x = 10.456789;
		System.out.printf("%.2f %n", x);
		System.out.printf("%.4f%n", x);
		System.out.println("RESULTADO = " + x + " METROS");

		String nome = "Paulo";
		System.out.printf("Meu nome é %s e eu tenho %.4f reais%n", nome, x);
	}

}
