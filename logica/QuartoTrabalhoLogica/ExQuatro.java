package QuartoTrabalhoLogica;
import java.util.Scanner;

public class ExQuatro {

	public static void main(String[]args) {
		Scanner t = new Scanner(System.in);
		print("quantas horas tem sua jornada de trabalho?");
		double jornadaDeTrabalho = t.nextDouble();
		print("e quantas horas a mais que isso você trabalhou?");
		double horaExtra = t.nextDouble();
		double salarioPorHora = 40;
		print("então hoje você fez R$" + (jornadaDeTrabalho*40) +" em horas normais e R$" + (horaExtra*20) + " em horas extra");
		print("isso totaliza R$" +((jornadaDeTrabalho*40) + (horaExtra*20)));
		
	}
	private static void print(String message) { 
	System.out.println(message);
	}
}	