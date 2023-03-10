package primeiraProva;

import java.util.Scanner;

public class segundoEx {

	public static void main (String[]args) {
	Scanner t = new Scanner(System.in);
	
    System.out.println("qual é o primeiro valor?");
    int valor1 = t.nextInt();
    System.out.println("qual o segundo valor?");
    int valor2 = t.nextInt();
    System.out.println("qual o terceiro valor?");
    int valor3 = t.nextInt();
    if ( valor1<valor2 && valor1<valor3  && valor2>valor3) {
    	System.out.println("o terceiro valor se encontra no intervalo entre o primeiro e o segundo valor");
    } else {
    	System.out.println("o terceiro valor não se encontra no intervalo do primeiro e o segundo valor");
    } 
	
	}
	
}


// 2.Desenvolva um algoritmo que efetue a leitura de 3 números, o primeiro número deve
//ser o início da comparação, o segundo número deve ser o final da comparação, o
//terceiro número deve verificar se o mesmo se encontra no intervalo do primeiro com
//o segundo número. Caso não esteja, o programa deve mostrar a mensagem que o
//mesmo não se encontra em tal intervalo