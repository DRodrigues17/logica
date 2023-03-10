package TrabalhoArrays;

import java.util.Scanner;

public class ExercicioCinco {
    public static void main (String[]args){
        Scanner t = new Scanner(System.in);
        System.out.println("digite alguma palavra e veja a magia acontecer");
        String palavra = t.next();
        String saida = "";
        for (int i = palavra.length() -1; i>=0; i--) {
            saida = saida + palavra.charAt(i);
        }
        if (saida.equalsIgnoreCase(palavra)){
            System.out.println("é um palidromo");
        } else if (saida != palavra){
            System.out.println("não é um palidromo");
        }


    }
}
// 5. Dado uma String qualquer, diga se a mesma é um palidromo.
