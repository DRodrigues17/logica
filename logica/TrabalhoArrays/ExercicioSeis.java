package TrabalhoArrays;
import java.util.Scanner;

public class ExercicioSeis {
    public static void main (String[]args){
        Scanner t = new Scanner(System.in);
        System.out.println("digite alguma palavra e veja a magia acontecer");
        String palavra = t.next();
        String saida = "";
        for (int i = palavra.length() -1; i>=0; i--) {
            saida = saida + palavra.charAt(i);
        }
        System.out.println(saida);
    }
}
//6. Dado uma String qualquer, inverta e mostre seu valor invertido.
//