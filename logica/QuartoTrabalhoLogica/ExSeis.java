package QuartoTrabalhoLogica;
import java.util.Scanner;

public class ExSeis {

	public static void main(String[]args) {
		Scanner t = new Scanner(System.in);
		double salario = 3800;
		print("quantas horas extra voc�s trabalhou?");
		double horaExtra = t.nextDouble();
		print("qual o seu cargo na empresa?");
		String cargo = t.next();
		if (cargo.equalsIgnoreCase("Gerente")) {
			print("voc� recebe 15 reais por hora extra");
			print("no final do m�s, seu sal�rio ser� de R$" +(salario+(horaExtra*15)));
		} else if (cargo.equalsIgnoreCase("Desenvolvedor") || cargo.equalsIgnoreCase("Testador") ) {
			print("voc� ganha 8 reais por hora extra");
			print("no final do m�s, seu sal�rio ser� de R$" +(salario+(horaExtra*8)));
		} else if (cargo.equalsIgnoreCase("Analista")) {
			print("voc� ganha 12 reais por hora exta");
			print("no final do m�s, seu sal�rio ser� de R$" +(salario+(horaExtra*12)));
		} else {
			print("voc� ganha 5 reais por hora extra");
			print("no final do m�s, seu sal�rio ser� de R$" +(salario+(horaExtra*5)));
		}
		
		
		
	}
	private static void print(String message) { 
	System.out.println(message);
	}
	
}
