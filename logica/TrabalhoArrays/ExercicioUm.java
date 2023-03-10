package TrabalhoArrays;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class ExercicioUm {
    public static void main (String[]args){
        int Array[] = {6,7,4,8,3,7,5,0,1,7,12,7,10,7,30,45,7,80,7,9};
        int repetido = 0;
        Scanner t = new Scanner(System.in);
        System.out.println("digite o número que você quer saber quantas vezes é repetido");
        int numero = t.nextInt();
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] == numero){
                repetido++;
            }
        }
        System.out.println("o número digitado é repetido " + repetido + " vezes");
    }

}
// 1. Crie um array de inteiros A e um valor inteiro X e encontre a quantidade de vezes que X aparece no Array A.