package primeiraProva;
import java.util.Scanner;

public class sextoEx {

	public static void main (String[]args) {
	Scanner t = new Scanner(System.in);
	System.out.println("qual o valor?");
	double valor = t.nextDouble();
	double antecessor = valor-1;
	double sucessor = valor + 1 ;
	System.out.println("o quadrado de seu antecessor � " + (antecessor*antecessor));
	System.out.println("o cubo de seu sucessor � " + (sucessor*sucessor*sucessor));
		
		
	}
	
}

//6. Escreva um algoritmo que leia um n�mero e escreva:
//a. o quadrado de seu antecessor
//b. o cubo de seu sucessor