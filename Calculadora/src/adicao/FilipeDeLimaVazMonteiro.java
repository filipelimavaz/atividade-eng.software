package adicao;

public class FilipeDeLimaVazMonteiro {
	
	public static int Somar(int num1, int num2) {
		int resultado = num1 + num2;
		return resultado;
	}

	public static void main(String[] args) {
		
		int numero1 = 2;
		int numero2 = 2;
		int resultado = 0;
		
		resultado = Somar(numero1, numero2);
		System.out.println(resultado);
	}

}
