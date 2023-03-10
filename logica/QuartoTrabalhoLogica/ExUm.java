package QuartoTrabalhoLogica;
import java.util.Scanner;

public class ExUm {

	public static void main(String[]args) {
		Scanner t = new Scanner(System.in);
		int code;
		double total = 0;
		double totalP = 0;
		String resposta = "sim";
		int quantidade = 0;
		
		while (resposta.equalsIgnoreCase("Sim")) {
			print("qual o código do produto? as opções são 1001, 1002, 1003 e 1004");
			code = t.nextInt();
			if (code!= 1001 && code!= 1002 && code != 1003 && code != 1004) {
				print("esse coódigo não existe");
			} else if (code == 1001) {
				print("quanto você quer desse produto?");
				quantidade = t.nextInt();
				totalP = 5.32*quantidade;
				print("o preço a se pagar é $" + totalP);
				total = total + totalP;
			} else if (code == 1002) {
				print("quanto você quer desse produto?");
				totalP = 63.89*quantidade;
				print("o preço a se pagar é $" + totalP);
				total = total + totalP;
			} else if (code == 1003) {
				print("quanto você quer desse produto?");
				quantidade = t.nextInt();
				totalP = 9.87*quantidade;
				print("o preço a se pagar é $" + totalP);
				total = total + totalP;
			} else {
				print("quanto você quer desse produto?");
				quantidade = t.nextInt();
				totalP = 53.00*quantidade;
				print("o preço a se pagar é $" + totalP);
				total = total + totalP;
			}
			print("voce quer mais alguma coisa? se voê responder qualquer coisa diferente de sim, o código entenderá que não");
			resposta = t.next();
			
		}
		print("O preço total é de $" + total);
	}
	private static void print(String message) { 
		System.out.println(message);
		}
	
}