package QuintoTrabalhoLogica;

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main (String[]args){
        Scanner t = new Scanner(System.in);
        double MenorDE21 = 0;
        double MaiorDe50 = 0;
        double idade = 0;
        while ( idade>=0){
            System.out.println("qual sua idade?");
            idade = t.nextDouble();
            if (idade<21 && idade>0){
                MenorDE21 = MenorDE21 +1;
            } else if (idade>50){
                MaiorDe50 = MaiorDe50 +1;
            }
        }
        System.out.println("o numero de pessoas menor de 21 é " + MenorDE21);
        System.out.println(("o numero de pessoas maior de 50 é " + MaiorDe50));
    }
}

// 4. Desenvolva um programa que leia a idade de várias pessoas e imprimir:
// a. Total de pessoas com menos de 21 anos;
// b. Total de pessoas com mais de 50 anos
// Parar o programa quando o usuário informar uma idade negativa
