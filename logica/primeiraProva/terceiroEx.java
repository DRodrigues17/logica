package primeiraProva;
import java.util.Scanner;

public class terceiroEx {

	
	public static void main (String[]args) {
	Scanner t = new Scanner(System.in);
	System.out.println("qual � o primeiro valor?");
    int valor1 = t.nextInt();
    System.out.println("qual o segundo valor?");
    int valor2 = t.nextInt();
    System.out.println("qual o terceiro valor?");
    int valor3 = t.nextInt();
    System.out.println("os valores s�o " + valor1 + ", " + valor2 + " e " + valor3);
	if (valor3 > (valor2+valor3)) {
		System.out.println("o primeiro valor � maior que a soma dos outros 2");
	} else if(valor2 < (valor3-1)) {
		System.out.println("o segundo valor � menor que o antecessor do terceiro");
	} else if (valor3 == valor1*valor1) {
		System.out.println("o terceiro valor � igual ao quadrado do primeiro");
	} else if (valor1 % 2  == 0) {
		System.out.println("o primeiro valor � par");
	} else if (valor1 % 2 == 1) {
		System.out.println("o primeiro valor � impar");
	} else if (valor2 > (valor3*2)) {
		System.out.println("o segundo valor � maior que o dobro do terceiro");
	}
	
	
	
	
	
	
	}
}


//3. Fa�a um algoritmo que leia os valores A, B e C. Ap�s verifique os passos abaixo.
//a. Verifique se o valor A � maior que a soma de B e C
//b. Verifique se o valor B � menor que o antecessor de C
//c. Verifique se o valor C � igual ao quadrado de A
//d. Verifique se o valor A � par ou �mpar
//e. Verifique se o valor B � maior que o dobro de C