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
			print("qual o c�digo do produto? as op��es s�o 1001, 1002, 1003 e 1004");
			code = t.nextInt();
			if (code!= 1001 && code!= 1002 && code != 1003 && code != 1004) {
				print("esse co�digo n�o existe");
			} else if (code == 1001) {
				print("quanto voc� quer desse produto?");
				quantidade = t.nextInt();
				totalP = 5.32*quantidade;
				print("o pre�o a se pagar � $" + totalP);
				total = total + totalP;
			} else if (code == 1002) {
				print("quanto voc� quer desse produto?");
				totalP = 63.89*quantidade;
				print("o pre�o a se pagar � $" + totalP);
				total = total + totalP;
			} else if (code == 1003) {
				print("quanto voc� quer desse produto?");
				quantidade = t.nextInt();
				totalP = 9.87*quantidade;
				print("o pre�o a se pagar � $" + totalP);
				total = total + totalP;
			} else {
				print("quanto voc� quer desse produto?");
				quantidade = t.nextInt();
				totalP = 53.00*quantidade;
				print("o pre�o a se pagar � $" + totalP);
				total = total + totalP;
			}
			print("voce quer mais alguma coisa? se vo� responder qualquer coisa diferente de sim, o c�digo entender� que n�o");
			resposta = t.next();
			
		}
		print("O pre�o total � de $" + total);
	}
	private static void print(String message) { 
		System.out.println(message);
		}
	
}