package primeiraProva;

import java.util.Scanner;

public class segundoEx {

	public static void main (String[]args) {
	Scanner t = new Scanner(System.in);
	
    System.out.println("qual � o primeiro valor?");
    int valor1 = t.nextInt();
    System.out.println("qual o segundo valor?");
    int valor2 = t.nextInt();
    System.out.println("qual o terceiro valor?");
    int valor3 = t.nextInt();
    if ( valor1<valor2 && valor1<valor3  && valor2>valor3) {
    	System.out.println("o terceiro valor se encontra no intervalo entre o primeiro e o segundo valor");
    } else {
    	System.out.println("o terceiro valor n�o se encontra no intervalo do primeiro e o segundo valor");
    } 
	
	}
	
}


// 2.Desenvolva um algoritmo que efetue a leitura de 3 n�meros, o primeiro n�mero deve
//ser o in�cio da compara��o, o segundo n�mero deve ser o final da compara��o, o
//terceiro n�mero deve verificar se o mesmo se encontra no intervalo do primeiro com
//o segundo n�mero. Caso n�o esteja, o programa deve mostrar a mensagem que o
//mesmo n�o se encontra em tal intervalo