package SegundaProva;
import java.util.Scanner;
import java.util.Arrays;

public class exercicio05 {
    public static void main(String[]args){
        Scanner t = new Scanner(System.in);
        int contador = 0;
        System.out.println("qual o tamanho da lista?");
        int [] array = new int[t.nextInt()];
        String[]nomes = new String[array.length];
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("fale um nome");
            nomes[i] = t.next();
        }
        System.out.println("diga mais um nome");
        String nomeForaDoArray = t.next();
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(nomeForaDoArray)) {
                contador++;
            }
        }
        if (contador>0){
            System.out.println("este nome está na lista");
        } else{
            System.out.println("este nome não está na lista");
        }
    }
}
//5. Peça para o usuário informar o tamanho do array que deseja criar. Ou seja, se o
//usuário digitar 10, o array deve ter tamanho 10, se o usuário digitar 20, o array deve
//ter tamanho 20.
//Após, popule o array com nome de pessoas. Os nomes devem ser lidos do teclado e
//armazenados no array.
//Então, leia mais um nome (a partir do teclado) e informe se este nome está ou não
//dentro do array.