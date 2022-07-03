
public class Main02 {

	public static void main(String[] args) {
		// 02 - Realizando casting

		int a = 5;
		int b = 2;
		double resultado = a / b;
		System.out.println(resultado);

		resultado = (double) a / b;
		System.out.println(resultado);

		double valor = 3.8;
		double novoValor = (int) valor;
		System.out.println(novoValor);
	}

}
