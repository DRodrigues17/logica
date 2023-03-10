package primeiraProva;
import java.util.Scanner;

public class primeiroEx {

	public static void main (String[]args) {
	Scanner t = new Scanner(System.in);
	System.out.println("qual o primeiro valor?");
	double primeiroValor = t.nextDouble();
	System.out.println("qual o segundo valor?");
	double segundoValor = t.nextDouble();
	System.out.println("escolha uma das opções abaixo");
	System.out.println("a. O primeiro número mais o quadrado do segundo número");
	System.out.println("b. Informar 45% do primeiro valor informado");
	System.out.println("c. Aumentar em 30% o segundo valor informado");
	System.out.println("d. O segundo vezes o quadrado do primeiro");
	System.out.println("e. Verificar se o primeiro número é múltiplo de 5");
	System.out.println("qual oção você escolhe?");
	String opção = t.next();
	if (opção.equalsIgnoreCase("A")) {
		System.out.println("ok");
		System.out.println("o resultado é " + (primeiroValor+(segundoValor*segundoValor)));
	}else if (opção.equalsIgnoreCase("B")) {
		System.out.println("ok");
		System.out.println("o resultado é " + (primeiroValor*0.45));
	}else if (opção.equalsIgnoreCase("C")) {
		System.out.println("ok");
		System.out.println("o resultado é " + (segundoValor+ (segundoValor*0.3)) );
	}else if (opção.equalsIgnoreCase("D")) {
		System.out.println("ok");
		System.out.println("o resultado é " + (segundoValor*(primeiroValor*primeiroValor)));
	}else if (opção.equalsIgnoreCase("E")){
		System.out.println("ok");
		if (primeiroValor % 5 == 0 ) {
		System.out.println("sim, é multiplo de 5" );
		} else {
			System.out.println("não não é multiplo de 5");
		}
 	}else {
		System.out.println("opção inexistente");
	}
	

	
	}
}

//1. Faça um programa que receba dois números e peça pro usuário informar uma das
//opções abaixo (a,b,c,d,e). Se for digitada uma opção inválida, mostre mensagem
//informando que a opção é inválida e termine a execução do programa. As opções
//são:
//a. O primeiro número mais o quadrado do segundo número.
//b. Informar 45% do primeiro valor informado.
//c. Aumentar em 30% o segundo valor informado
//d. O segundo vezes o quadrado do primeiro.
//e. Verificar se o primeiro número é múltiplo de 5.