
public class Main12OperadoresBitwise {

	public static void main(String[] args) {
		// Operadores Bitwise
		
		int n1 = 89; // 0101 1001     & 0001 1000
		int n2 = 60; // 0011 1100     | 0111 1101
		             //               ^ 0110 0101
		
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
	}

}
