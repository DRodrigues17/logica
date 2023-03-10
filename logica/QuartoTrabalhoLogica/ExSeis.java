package QuartoTrabalhoLogica;
import java.util.Scanner;

public class ExSeis {

	public static void main(String[]args) {
		Scanner t = new Scanner(System.in);
		double salario = 3800;
		print("quantas horas extra vocês trabalhou?");
		double horaExtra = t.nextDouble();
		print("qual o seu cargo na empresa?");
		String cargo = t.next();
		if (cargo.equalsIgnoreCase("Gerente")) {
			print("você recebe 15 reais por hora extra");
			print("no final do mês, seu salário será de R$" +(salario+(horaExtra*15)));
		} else if (cargo.equalsIgnoreCase("Desenvolvedor") || cargo.equalsIgnoreCase("Testador") ) {
			print("você ganha 8 reais por hora extra");
			print("no final do mês, seu salário será de R$" +(salario+(horaExtra*8)));
		} else if (cargo.equalsIgnoreCase("Analista")) {
			print("você ganha 12 reais por hora exta");
			print("no final do mês, seu salário será de R$" +(salario+(horaExtra*12)));
		} else {
			print("você ganha 5 reais por hora extra");
			print("no final do mês, seu salário será de R$" +(salario+(horaExtra*5)));
		}
		
		
		
	}
	private static void print(String message) { 
	System.out.println(message);
	}
	
}
