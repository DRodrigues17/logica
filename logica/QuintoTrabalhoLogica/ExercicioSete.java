package QuintoTrabalhoLogica;

import java.util.Scanner;

public class ExercicioSete {
    public static void main (String[]args){
        Scanner t = new Scanner(System.in);
        double SomaDosPositivos = 0;
        double SomaDosNegativos = 0;
        double QuantidadeDePares = 0;
        double QuantidadeDePositivos = 0;
        double QuantidadeDeNegativos = 0;
        double Numero = 1;
        do {
            System.out.println("digite algum numero diferente de zero");
            Numero = t.nextDouble();
            if (Numero>0){
                QuantidadeDePositivos = QuantidadeDePositivos +1;
                SomaDosPositivos = SomaDosPositivos + Numero;
            } else if (Numero<0) {
                QuantidadeDeNegativos = QuantidadeDeNegativos +1;
                SomaDosNegativos = SomaDosNegativos +Numero;
            } else if (Numero % 2 == 0){
                QuantidadeDePares = QuantidadeDePares + 1;
            }
        } while (Numero!=0);
        System.out.println("a soma dos positivos é " + SomaDosPositivos);
        System.out.println("a soma dos negativos é " + SomaDosNegativos);
        System.out.println("a média dos positivos é " + (SomaDosPositivos/QuantidadeDePositivos));
        System.out.println("a média dos negativos é " + (SomaDosNegativos/QuantidadeDeNegativos));
        System.out.println("a quantidade de números pares é " + QuantidadeDePares);
    }
}

// 7. Desenvolva um algoritmo que leia números positivos e negativos, o programa deve
// encerrar a execução quando o usuário informar ZERO. No final imprima:
// a. A soma dos positivos;
// b. A soma dos negativos;
// c. A média dos positivos;
// d. A média dos negativos;
// e. A quantidade de números pares (apenas para os positivos).