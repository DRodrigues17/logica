package primeiraProva;
import java.util.Scanner;

public class quintoEx {

	public static void main (String[]args) {
	Scanner t = new Scanner(System.in);
    System.out.println("quantos dias você vai ficar aqui?");
    int estadia = t.nextInt();
    if (estadia<7) {
    	System.out.println("Ok, o preço da sua estadia será de R$" + (120+(estadia*10)));
    } else if (estadia==7) {
    	System.out.println("ok, o preço da sua estadia será de R$" + (120+(estadia*7)));
    } else  if (estadia > 7){
    	System.out.println("Ok, o preço da sua estadia será de R$" + (120+(estadia*4)));
    }
    
}    

}

//5. Um hotel cobra R$ 120,00 a diária e mais um valor de serviços, sendo que o valor
//de serviços corresponde à tabela abaixo:
//a. R$ 10,00 por dia, se o número de diárias for menor que 7
//b. R$ 7,00 por dia, se o número de diárias for igual à 7
//c. R$ 4,00 por dia, se o número de diárias for maior que 7
//Construa um algoritmo que receba o número de diárias e retorne o valor da conta de
//hospedagem.
