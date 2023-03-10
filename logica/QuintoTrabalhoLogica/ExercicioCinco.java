package QuintoTrabalhoLogica;

import java.util.Scanner;

public class ExercicioCinco {
    public static void main (String[]args){
        Scanner t = new Scanner(System.in);
        int pessoas = 0;
        double MediasDasIdades = 0;
        double TotalDasIdades = 0;
        double MediaDosPesos = 0;
        double TotalDosPesos = 0;
        while(pessoas < 20){
            System.out.println("qual a idade dessa pessoa?");
            double idade = t.nextDouble();
            TotalDasIdades = TotalDasIdades+ idade;
            MediasDasIdades = TotalDasIdades/pessoas;
            System.out.println("qual o peso dessa mesma pessoa?");
            double peso = t.nextDouble();
            TotalDosPesos = TotalDosPesos + peso;
            MediaDosPesos = TotalDosPesos/pessoas;

            pessoas = pessoas +1;
        }
        System.out.println("a média das idades é " + MediasDasIdades);
        System.out.println("o total das idades é " + TotalDasIdades);
        System.out.println("a média dos pesos é " + MediaDosPesos);
        System.out.println("o total dos pesos é " + TotalDosPesos);
    }
}

// 5. Desenvolva um algoritmo que leia o peso e a idade de 20 pessoas. Calcule e mostre:
// a. A média da idade das pessoas;
// b. O Total das idades;
// c. A média do peso;
// d. O total dos pesos;
