package primeiraProva;
import java.util.Scanner;

public class quartoEx {

	
	public static void main (String[]args) {
	Scanner t = new Scanner(System.in);
    System.out.println("qual é o primeiro valor?");
    int valor1 = t.nextInt();
    System.out.println("qual o segundo valor?");
    int valor2 = t.nextInt();
    System.out.println("qual o terceiro valor?");
    int valor3 = t.nextInt();
    if ( valor1<valor2 && valor2<valor3) {
    	System.out.println("o maior valor é " + valor3 + ", o menor valor é " +valor1 + " e a média deles é " + ((valor1+valor2+valor3)/3));
    } else if (valor1<valor3 && valor3<valor2) {
    	System.out.println("o maior valor é " + valor2 + ", o menor valor é " +valor1 + " e a média deles é " + ((valor1+valor2+valor3)/3));
    } else if (valor2<valor1 && valor1<valor3){
    	System.out.println("o maior valor é " + valor3 + ", o menor valor é " +valor2 + " e a média deles é " + ((valor1+valor2+valor3)/3));
    } else if (valor2<valor3 && valor3<valor1){
    	System.out.println("o maior valor é " + valor1 + ", o menor valor é " +valor2 + " e a média deles é " + ((valor1+valor2+valor3)/3));
    } else if (valor3<valor1 && valor1<valor2){
    	System.out.println("o maior valor é " + valor2+ ", o menor valor é " +valor3 + " e a média deles é " + ((valor1+valor2+valor3)/3));
    } else if (valor3<valor2 && valor2<valor1) {
        System.out.println("o maior valor é " + valor1 + ", o menor valor é " +valor3 + " e a média deles é " + ((valor1+valor2+valor3)/3));
    }
	
	}
}

//Ler 3 valores (considere que não serão informados valores iguais) e escreva o
//menor, o maior e a média dos valores.