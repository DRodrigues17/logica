package primeiraProva;
import java.util.Scanner;

public class primeiroEx {

	public static void main (String[]args) {
	Scanner t = new Scanner(System.in);
	System.out.println("qual o primeiro valor?");
	double primeiroValor = t.nextDouble();
	System.out.println("qual o segundo valor?");
	double segundoValor = t.nextDouble();
	System.out.println("escolha uma das op��es abaixo");
	System.out.println("a. O primeiro n�mero mais o quadrado do segundo n�mero");
	System.out.println("b. Informar 45% do primeiro valor informado");
	System.out.println("c. Aumentar em 30% o segundo valor informado");
	System.out.println("d. O segundo vezes o quadrado do primeiro");
	System.out.println("e. Verificar se o primeiro n�mero � m�ltiplo de 5");
	System.out.println("qual o��o voc� escolhe?");
	String op��o = t.next();
	if (op��o.equalsIgnoreCase("A")) {
		System.out.println("ok");
		System.out.println("o resultado � " + (primeiroValor+(segundoValor*segundoValor)));
	}else if (op��o.equalsIgnoreCase("B")) {
		System.out.println("ok");
		System.out.println("o resultado � " + (primeiroValor*0.45));
	}else if (op��o.equalsIgnoreCase("C")) {
		System.out.println("ok");
		System.out.println("o resultado � " + (segundoValor+ (segundoValor*0.3)) );
	}else if (op��o.equalsIgnoreCase("D")) {
		System.out.println("ok");
		System.out.println("o resultado � " + (segundoValor*(primeiroValor*primeiroValor)));
	}else if (op��o.equalsIgnoreCase("E")){
		System.out.println("ok");
		if (primeiroValor % 5 == 0 ) {
		System.out.println("sim, � multiplo de 5" );
		} else {
			System.out.println("n�o n�o � multiplo de 5");
		}
 	}else {
		System.out.println("op��o inexistente");
	}
	

	
	}
}

//1. Fa�a um programa que receba dois n�meros e pe�a pro usu�rio informar uma das
//op��es abaixo (a,b,c,d,e). Se for digitada uma op��o inv�lida, mostre mensagem
//informando que a op��o � inv�lida e termine a execu��o do programa. As op��es
//s�o:
//a. O primeiro n�mero mais o quadrado do segundo n�mero.
//b. Informar 45% do primeiro valor informado.
//c. Aumentar em 30% o segundo valor informado
//d. O segundo vezes o quadrado do primeiro.
//e. Verificar se o primeiro n�mero � m�ltiplo de 5.