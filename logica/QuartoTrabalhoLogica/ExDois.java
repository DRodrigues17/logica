package QuartoTrabalhoLogica;
import java.util.Scanner;

public class ExDois {

	public static void main(String[]args) {
		Scanner t = new Scanner(System.in);
		print("qual tipo de oper�rio voc� �?");
		String operario = t.next();
//		m seria de mulher e 10 seria de tempo na empresa
		if (operario.equalsIgnoreCase("m10")) {
			print("seu bonus de natal ser� de 25%");
			print("qual o seu sal�rio?");
			double salario = t.nextDouble();
			print("seu bonus ser� de R$" + (salario*0.25));
			
		} else if (operario.equalsIgnoreCase("h15")) {
			print("seu bonus ser� de 20%");
			print("qual o seu sal�rio?");
			double salario1 = t.nextDouble();
			print("seu bonus ser� de R$" + (salario1*0.20));
			
		} else 
			print("seu bonus ser� de R$5.000");
		
	}
	private static void print(String message) { 
	System.out.println(message);
	}

}
