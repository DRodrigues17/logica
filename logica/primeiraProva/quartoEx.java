package primeiraProva;
import java.util.Scanner;

public class quartoEx {

	
	public static void main (String[]args) {
	Scanner t = new Scanner(System.in);
    System.out.println("qual � o primeiro valor?");
    int valor1 = t.nextInt();
    System.out.println("qual o segundo valor?");
    int valor2 = t.nextInt();
    System.out.println("qual o terceiro valor?");
    int valor3 = t.nextInt();
    if ( valor1<valor2 && valor2<valor3) {
    	System.out.println("o maior valor � " + valor3 + ", o menor valor � " +valor1 + " e a m�dia deles � " + ((valor1+valor2+valor3)/3));
    } else if (valor1<valor3 && valor3<valor2) {
    	System.out.println("o maior valor � " + valor2 + ", o menor valor � " +valor1 + " e a m�dia deles � " + ((valor1+valor2+valor3)/3));
    } else if (valor2<valor1 && valor1<valor3){
    	System.out.println("o maior valor � " + valor3 + ", o menor valor � " +valor2 + " e a m�dia deles � " + ((valor1+valor2+valor3)/3));
    } else if (valor2<valor3 && valor3<valor1){
    	System.out.println("o maior valor � " + valor1 + ", o menor valor � " +valor2 + " e a m�dia deles � " + ((valor1+valor2+valor3)/3));
    } else if (valor3<valor1 && valor1<valor2){
    	System.out.println("o maior valor � " + valor2+ ", o menor valor � " +valor3 + " e a m�dia deles � " + ((valor1+valor2+valor3)/3));
    } else if (valor3<valor2 && valor2<valor1) {
        System.out.println("o maior valor � " + valor1 + ", o menor valor � " +valor3 + " e a m�dia deles � " + ((valor1+valor2+valor3)/3));
    }
	
	}
}

//Ler 3 valores (considere que n�o ser�o informados valores iguais) e escreva o
//menor, o maior e a m�dia dos valores.