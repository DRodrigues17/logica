package SegundaProva;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class exercicio04 {
    public static void main(String[]args){
        Scanner t = new Scanner(System.in);
        System.out.println("qual o nome do jogador 1?");
        String jogador1 = t.next();
        System.out.println("qual o nome do jogador 2?");
        String jogador2 = t.next();
        String resposta = "sim";
        while (resposta.equalsIgnoreCase("sim")){
            System.out.println("as opções são pedra, papel e tesoura");
            System.out.println("qual a escolha do jogador 1?");
            String jogada1 = t.next();
            System.out.println("qual a escolha do jogador 2?");
            String jogada2 = t.next();
            if (jogada1.equalsIgnoreCase("pedra") && jogada2.equalsIgnoreCase("tesoura")){
                System.out.println("o vencedor é " + jogador1 +" e o perdedor é " +jogador2);
            } else if (jogada1.equalsIgnoreCase("tesoura") && jogada2.equalsIgnoreCase("papel")){
                System.out.println("o vencedor é " + jogador1 +" e o perdedor é " +jogador2);
            } else if (jogada1.equalsIgnoreCase("papel") && jogada2.equalsIgnoreCase("pedra")){
                System.out.println("o vencedor é " + jogador1 +" e o perdedor é " +jogador2);
            } else if (jogada2.equalsIgnoreCase("pedra") && jogada1.equalsIgnoreCase("tesoura")){
                System.out.println("o vencedor é " + jogador2 +" e o perdedor é " +jogador1);
            } else if (jogada2.equalsIgnoreCase("tesoura") && jogada1.equalsIgnoreCase("papel")){
                System.out.println("o vencedor é " + jogador2 +" e o perdedor é " +jogador1);
            } else if (jogada2.equalsIgnoreCase("papel") && jogada1.equalsIgnoreCase("pedra")){
                System.out.println("o vencedor é " + jogador2 +" e o perdedor é " +jogador1);
            } else {
                System.out.println("deu empate");
            }

            System.out.println("o jogo continua? diga SIM caso queira que continue");
            resposta = t.next();
        }

    }
}
//4. Vamos jogar jonkenpo.
//Leia o nome do jogador 1 e do jogador 2. E então devemos iniciar o jogo onde, a
//cada rodada, leia a jogada escolhida por cada jogador (pedra, papel ou tesoura) e
//imprima:
//a. Ou o nome do vencedor e o nome do perdedor da rodada
//b. Ou se a rodada deu empate
//No final de cada rodada deve-se perguntar aos usuários se o jogo continua ou não.