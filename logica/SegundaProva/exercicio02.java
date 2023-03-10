package SegundaProva;
import java.util.Scanner;

public class exercicio02 {
    public static void main(String[]args){
        Scanner t = new Scanner(System.in);
        double somaPositivos = 0;
        double produtoNegativos = 1;
        double contadorMultiplosDeCinco = 0;
        double contadorPositivos = 0;
        double contadorNegativos = 0;
        double numero = 1;
        while (numero!=0){
            System.out.println("digite algum numero diferente de zero");
            numero = t.nextDouble();
            if (numero>0){
                contadorPositivos++;
                somaPositivos = somaPositivos + numero;
            } else if (numero<0) {
                contadorNegativos++;
                produtoNegativos = produtoNegativos *numero;
            }
            if (numero % 5 == 0){
                contadorMultiplosDeCinco++;
            }
        }
        System.out.println("a soma dos positivos é " + somaPositivos);
        System.out.println("o produto dos negativos é " + produtoNegativos);
        System.out.println("a média dos positivos é " + (somaPositivos/contadorPositivos));
        System.out.println("a quantidade de negativos é " + contadorNegativos);
        System.out.println("a quantidade de multiplos de cinco é " + contadorMultiplosDeCinco);
    }
}
//2. Desenvolva um algoritmo que leia vários números positivos e negativos. O programa
//deve encerrar, a execução, quando o usuário informar 0 (zero). No final imprima:
//a. A soma dos números positivos
//b. O produto dos números negativos
//c. A média dos positivos
//d. A quantidade dos negativos
//e. A quantidade de números múltiplos de 5