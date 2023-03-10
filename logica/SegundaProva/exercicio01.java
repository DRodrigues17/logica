package SegundaProva;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[]args){
        Scanner t = new Scanner(System.in);
        System.out.println("qual o tamanho de ambas listas?");
        int[] arrayA = new int[t.nextInt()];
		int[] arrayB = new int[arrayA.length];
		int[] arrayC = new int[arrayA.length];
        int[] arrayD = new int[arrayA.length];
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("fale os numeros da lista A");
            arrayA[i] = t.nextInt();
        }
        for (int i = 0; i < arrayB.length; i++) {
            System.out.println("fale os numeros da lista B");
            arrayB[i] = t.nextInt();
        }
        for (int i = 0; i < arrayC.length; i++) {
			arrayC[i] = arrayA[i] * arrayB[i];
			System.out.println(arrayA[i] + " vezes " + arrayB[i] + " = " + arrayC[i]);
		}
        for (int i = 0; i < arrayD.length; i++) {
            arrayD[i] = arrayC[i] *5;
            System.out.println(arrayC[i] + " vezes 5 " + " = " + arrayD [i]);

        }


    }
}
//1. Crie e preencha, do teclado, dois arrays (A e B) com 20 posições cada. E então:
//a. Crie um array C, que armazenará o produto dos elementos de A e B
//b. Crie um array D, que armazenará os elementos de C multiplicados por 5
//c. Para finalizar, imprima para cada posição, os valores de A, B, C e D.