import java.util.Scanner;


public class SegundoTrabalhoLogica {
	public static void main(String[] args) {
		
	Scanner t = new Scanner (System.in);	
	System.out.println("primeira questão");	
	System.out.println("qual o primeiro valor?");
	int valor1 = t.nextInt();
	System.out.println("qual o segundo valor?");
	int valor2 = t.nextInt();
	System.out.println("A soma dos valores é " + (valor1+valor2));
		
	
	System.out.println("questão 2");
	System.out.println("qual o primeiro valor?");
	double primeirovalor = t.nextDouble();
	System.out.println("qual o segundo valor?");
	double segundovalor = t.nextDouble();
	double resultado = primeirovalor*segundovalor;
	System.out.println("O resultado da muliplicação é " + resultado);
		if (resultado>100) {
			System.out.println("O resultado é maior que 100");
			
		} else if (resultado == 100) {
			System.out.println("O resultado é igual a 100");
		} else {
			System.out.println("o resultado é menor que 100");
		}
		
	System.out.println("questão 3");
	System.out.println("qual seu nome?");
	String nome = t.next();
	System.out.println("qual seu sobrenome?");
	String sobrenome = t.next();
	System.out.println("seu nome é " +nome+ " e seu sobrenome é "+sobrenome);
	
	
	System.out.println("questão 4");
	System.out.println("qual o primeiro número?");
	int primeironumero = t.nextInt();
	System.out.println("qual o segundo número?");
	int segundonumero = t.nextInt();
		if (primeironumero % 2 == 0 && segundonumero % 2 == 0) {
			System.out.println("ambos são pares");
		} else if (primeironumero % 2 == 0 && segundonumero % 2 == 1) {
			System.out.println("apenas o primeiro número é par");
		} else if (primeironumero % 2 == 1 && segundonumero % 2 == 0) {
			System.out.println("apenas o segundo número é par");
		} else {
			System.out.println("nenhum deles é par");
		}
	
	
	System.out.println("questão 5 ");
	System.out.println("qual a primeira nota?");
	double nota1 = t.nextDouble();
	System.out.println("qual a segunda nota?");
	double nota2 = t.nextDouble();
	System.out.println("qual a terceira nota?");
	double nota3 = t.nextDouble();
	System.out.println("qual a quarta nota?");
	double nota4 = t.nextDouble();
	Double mediadasnotas = (nota1+nota2+nota3+nota4)/4;
	System.out.println("a média é " +mediadasnotas);
		if (mediadasnotas>7) {
			System.out.println("O aluno está aprovado");
		} else {
			System.out.println("O aluno está reprovado");
		}
	
	
	System.out.println("questão 6");
	System.out.println("qual o primeiro valor?");
	int algarismo1 = t.nextInt();
	System.out.println("qual o segundo valor?");
	int algarismo2 = t.nextInt();
	System.out.println("qual o terceiro valor?");
	int algarismo3 = t.nextInt();
		if (algarismo1>algarismo2 && algarismo1 > algarismo3) {
			System.out.println("O maior número é " +algarismo1); 
		} else if(algarismo2>algarismo1 && algarismo2 > algarismo3) {
			System.out.println("O maior número é " +algarismo2);
		}else if (algarismo3>algarismo1 && algarismo3 > algarismo2) {
			System.out.println("O maior número é " + algarismo3);
		}
		
		
		System.out.println("questão 7");
		System.out.println("qual o número?");
		double numero = t.nextDouble(); 
		double antecessor = numero +1;
		double sucessor = numero -1;
		System.out.println("O antecessor do número é " +antecessor+ " e o sucessor é " +sucessor);
		
		
		System.out.println("questão 8");
		System.out.println("qual o número a ser multiplicado?");
		double m = t.nextDouble();
		double x0 = m*0;
		double x1 = m*1;
		double x2 = m*2;
		double x3 = m*3;
		double x4 = m*4;
		double x5 = m*5;
		double x6 = m*6;
		double x7 = m*7;
		double x8 = m*8;
		double x9 = m*9;
		double x10 = m*10;
		System.out.println("a tabuada do número é: " +x0+", "+x1+", "+x2+", "+x3+", "+x4+", "+x5+", "+x6+", "+x7+", "+x8+", "+x9+", "+x10);
		
		System.out.println("questão 9");
		System.out.println("Qual a temperatura?");
		int Celsius = t.nextInt();
		int Fahrenheit = (9 * Celsius + 160) / 5;
		System.out.println("a temperatura em Fahrenheit é " + Fahrenheit);
		
		
		System.out.println("questaço 10");
		System.out.println("qual o primeiro valor?");
		double primeiroalgarismo = t.nextDouble();
		System.out.println("qual o segundo valor?");
		double segundoalgarismo = t.nextDouble();
			if (primeiroalgarismo>100 && segundoalgarismo>100 ) {
				System.out.println("ambos são maiores que 100");
		   }else if (primeiroalgarismo<100 && segundoalgarismo<100) {
			   System.out.println("ambos são maenores que 100");
		   }else if (primeiroalgarismo>100 && segundoalgarismo<100) {
			   System.out.println("o primeiro é maior que 100 e o segundo é menor");
		   }else if (primeiroalgarismo<100 && segundoalgarismo>100) {
			   System.out.println("o primeiro é menor que 100 e o segundo é maior");
		   }
		
		
	}
}
