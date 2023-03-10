package QuartoTrabalhoLogica;
import java.util.Scanner;

public class ExTres {

	public static void main(String[]args) {
		Scanner t = new Scanner(System.in);
		print("qual o numero do consumidor?");
		int number = t.nextInt();
		print("quantos KWH ele consumiu?");
		double KWH = t.nextDouble();
		print("qual o tipo de consumidor?");
		String consumidor = t.next();
		if (consumidor.equalsIgnoreCase("residencial")) {
			print("o preço que o consumidor " + number + " terá que pagar é de R$" + (KWH*0.30));
		} else if (consumidor.equalsIgnoreCase("comercial")) {
			print("o preço que o consumidor " + number + " terá que pagar é de R$" + (KWH*0.50));
		} else if (consumidor.equalsIgnoreCase("industrial")) {
			print("o preço que o consumidor " + number + " terá que pagar é de R$" + (KWH*0.70));
		}
		
	}	
	private static void print(String message) { 
		System.out.println(message);
	}
	
}
