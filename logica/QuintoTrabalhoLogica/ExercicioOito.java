package QuintoTrabalhoLogica;
import java.util.Scanner;

public class ExercicioOito {
    public static void main (String[]args){
        Scanner t = new Scanner(System.in);
        System.out.println("diga um número");
        double valor = t.nextDouble();
        int divisores = 0;
        int NaoDivisores = 0;
        for (int i = 0; i <=valor ; i++) {
            if (valor%i == 0){
                divisores++;
            } else{
                NaoDivisores++;
            }
        }
        if (divisores == 2) {
            System.out.println("o número é primo");
        } else {
            System.out.println("o número não é primo");
        }

    }
}

// 8. Desenvolva um algoritmo que leia um número fornecido pelo usuário e diga que o
// mesmo é primo ou não. (Números primos são divididos por ele mesmo e por 1)
