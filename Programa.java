import java.util.Scanner;

public class Programa {

	public static void main(String[] args){
		Scanner scanner = new Scanner (System.in);
		System.out.println("Digite uma placa");
		String placa = scanner.next();
		System.out.println("Digite um modelo");
		String modelo = scanner.next();
		System.out.println("Digite um ano de fabricacao");
		int anoFabricacao = scanner.nextInt();
		if (modelo.equals("BMW")) {
			System.out.println("\nO veiculo placa " + placa
									+ " modelo " + modelo
									+ " ano " + anoFabricacao +
									" foi cadastrado");
		} else if (anoFabricacao>=2000) {


			System.out.println("\nO veiculo placa " + placa
									+ " modelo " + modelo
									+ " ano " + anoFabricacao +
									" foi cadastrado");
		} else {
			System.out.println("\nO veiculo nao pode ser cadastrado");
		}
	}
}