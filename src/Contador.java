import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = consistirInteiro(sc);
		
		System.out.print("Digite o segundo parâmetro: ");
		int parametroDois = consistirInteiro(sc);
		
		try {
			contar(parametroUm, parametroDois);
		}catch (ParametrosInvalidosException exception) {
			System.err.println("\nErro! "+exception.getMessage());
		}

		sc.close();
		
	}
	
	private static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

		if (parametroDois <= parametroUm){
			throw new ParametrosInvalidosException();
		}
		
		int contagem = parametroDois - parametroUm;

		System.out.println("\nIniciando contagem...\n");
		for (int i = 0; i < contagem; i++){
			System.out.println("Imprimindo o número "+(i+1));
		}

	}

	private static int consistirInteiro(Scanner sc){
		do {
			try {
				return Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e){
				System.out.print("Insira um número válido: ");
			}
		}
		while (true);
		
	}
}