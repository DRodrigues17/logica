package TrabalhoArrays;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class ExercicioQuatro {
    public static void main (String[]args){
        Scanner t = new Scanner(System.in);
        int Array[] = {6,7,4,8,3,8,5,0,1,8,3,8,10,7,3,4,7,8,9,9};
        int soma = 0;
        int numerosAcimaDaMedia = 0;
        for (int i = 0; i < Array.length; i++) {
            soma = soma + Array[i];
        }
        double media = soma/Array.length;
        for (int i = 0; i < Array.length; i++) {
            if (media < Array[i]){
                numerosAcimaDaMedia++;
            }
        }

        System.out.println("a media é " + media + " e a quantidade de números acima da média é " + numerosAcimaDaMedia);
    }
}
// 4. Escreva um algoritmo que possua um array de números inteiros de 20 posições.
// Após calcule a média dos valores e conte quantos valores estão acima da média.