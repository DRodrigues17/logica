package primeiraProva;
import java.util.Scanner;

public class quintoEx {

	public static void main (String[]args) {
	Scanner t = new Scanner(System.in);
    System.out.println("quantos dias voc� vai ficar aqui?");
    int estadia = t.nextInt();
    if (estadia<7) {
    	System.out.println("Ok, o pre�o da sua estadia ser� de R$" + (120+(estadia*10)));
    } else if (estadia==7) {
    	System.out.println("ok, o pre�o da sua estadia ser� de R$" + (120+(estadia*7)));
    } else  if (estadia > 7){
    	System.out.println("Ok, o pre�o da sua estadia ser� de R$" + (120+(estadia*4)));
    }
    
}    

}

//5. Um hotel cobra R$ 120,00 a di�ria e mais um valor de servi�os, sendo que o valor
//de servi�os corresponde � tabela abaixo:
//a. R$ 10,00 por dia, se o n�mero de di�rias for menor que 7
//b. R$ 7,00 por dia, se o n�mero de di�rias for igual � 7
//c. R$ 4,00 por dia, se o n�mero de di�rias for maior que 7
//Construa um algoritmo que receba o n�mero de di�rias e retorne o valor da conta de
//hospedagem.
