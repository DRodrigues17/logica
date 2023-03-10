package QuintoTrabalhoLogica;

import java.util.Scanner;

public class ExercicioTres {
    public static void main (String[]args){
        Scanner t = new Scanner(System.in);
        double SomaDosPares = 0;
        double SomaDosImpares = 0;
        double SomaDeTodosOsValores = 0;
        double Numero = 0;
        while (Numero>=0){
            System.out.println("digite algum numero positivo");
            Numero = t.nextDouble();
            SomaDeTodosOsValores = SomaDeTodosOsValores +Numero;
            if (Numero % 2 == 0){
                SomaDosPares = SomaDosPares +Numero;
            } else if (Numero % 2 == 1){
                SomaDosImpares = SomaDosImpares + Numero;
            }
        }
        System.out.println("a soma de todos os valores é " + SomaDeTodosOsValores);
        System.out.println("a soma dos pares é " + SomaDosPares);
        System.out.println("a soma dos impares é " + SomaDosImpares);


    }
}

// 3. Desenvolva um algoritmo que leia números enquanto forem positivos. No final imprima
// a. A quantidade de números digitados;
// b. A soma de todos os valores;
// c. A soma dos pares;
// d. A soma dos ímpares;
