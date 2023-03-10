package QuintoTrabalhoLogica;
import java.util.Scanner;

public class ExercicioUm {
    public static void main (String[]args){
    Scanner t = new Scanner(System.in);
    double Numero = 0;
    double SomaDosImpares = 0;
    double SomaDosPares = 0;
        while (Numero<=1000){
            System.out.println("digite algum Numero menor que 1000");
            Numero = t.nextDouble();
            if (Numero % 2 == 0){
                SomaDosPares = SomaDosPares +Numero;
            } else {
                SomaDosImpares = SomaDosImpares + Numero;
            }

        }
        System.out.println("a soma dos pares é " + SomaDosPares);
        System.out.println("a soma dos impares é " + SomaDosImpares);
    }
}

// 1. Faça um programa que leia vários inteiros positivos e mostre, no final, a soma dos
// números pares e a soma dos números ímpares. O programa para quando entrar um
// número maior que 1000.
