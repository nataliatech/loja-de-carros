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

		System.out.println("O veiculo placa " + placa
								+ " modelo " + modelo
								+ " ano " + anoFabricacao +
								" foi cadastrado";
	}
}