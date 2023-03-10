package TrabalhoArrays;
import java.util.Arrays;

public class ExercicioTres {
    public static void main (String[]args) {
        int []Array = {17, 45, 365, 90,3, 70, 400, 43, 75, 400, 365, 35, 17, 35};
        int Maior = buscarMaior(Array);

        System.out.println("a posição do maior valor é " + Maior);
    }
    private  static int buscarMaior(int[] Array){
        int MaiorValor = 0;

        for (int i = 1; i < Array.length; i++) {
            if (Array[i] > Array[MaiorValor]){
                MaiorValor = i;
            }
        }
        return MaiorValor;
    }
}
// 3. Escreva um algoritmo que possua um array de números e encontre o maior valor do array.
// Se houver mais de um valor maior, devolver a posição da primeira ocorrencia.