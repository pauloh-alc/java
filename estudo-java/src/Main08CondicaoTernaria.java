
public class Main08CondicaoTernaria {
	
	public static void main(String[] args) {
		// Condição ternária
		
		// Anatomia: (condição) ? valor_se_verdadeiro : valor_se_falso
		
		double preco = 34.5;
		double desconto = (preco < 20.0)? preco * 0.1 : preco * 0.05;
		System.out.println(desconto);
	}
}
