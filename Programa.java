import java.util.Scanner;

public class Programa {

	public static void main(String[] args){
		Scanner scanner = new Scanner (System.in);
		System.out.println("Digite uma placa");
		String placa = scanner.next();
		System.out.println("Digite um modelo");
		String modelo = scanner.next();
		System.out.println("Digite um ano de fabricacao");
		String anoFabricacao = scanner.next();
		if (modelo.equals("BMW")) {
			System.out.println("\nO veiculo placa " + placa
									+ " modelo " + modelo
									+ " ano " + anoFabricacao +
									" foi cadastrado");
		} else {
			System.out.println("\nNão pode ser cadastrado");
		}

	}
}