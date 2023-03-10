package primeiraProva;
import java.util.Scanner;

public class terceiroEx {

	
	public static void main (String[]args) {
	Scanner t = new Scanner(System.in);
	System.out.println("qual é o primeiro valor?");
    int valor1 = t.nextInt();
    System.out.println("qual o segundo valor?");
    int valor2 = t.nextInt();
    System.out.println("qual o terceiro valor?");
    int valor3 = t.nextInt();
    System.out.println("os valores são " + valor1 + ", " + valor2 + " e " + valor3);
	if (valor3 > (valor2+valor3)) {
		System.out.println("o primeiro valor é maior que a soma dos outros 2");
	} else if(valor2 < (valor3-1)) {
		System.out.println("o segundo valor é menor que o antecessor do terceiro");
	} else if (valor3 == valor1*valor1) {
		System.out.println("o terceiro valor é igual ao quadrado do primeiro");
	} else if (valor1 % 2  == 0) {
		System.out.println("o primeiro valor é par");
	} else if (valor1 % 2 == 1) {
		System.out.println("o primeiro valor é impar");
	} else if (valor2 > (valor3*2)) {
		System.out.println("o segundo valor é maior que o dobro do terceiro");
	}
	
	
	
	
	
	
	}
}


//3. Faça um algoritmo que leia os valores A, B e C. Após verifique os passos abaixo.
//a. Verifique se o valor A é maior que a soma de B e C
//b. Verifique se o valor B é menor que o antecessor de C
//c. Verifique se o valor C é igual ao quadrado de A
//d. Verifique se o valor A é par ou ímpar
//e. Verifique se o valor B é maior que o dobro de C