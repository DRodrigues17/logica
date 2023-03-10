package SegundaProva;
import java.util.Scanner;

public class exercicio03 {
    public static void main(String[]args){
        Scanner t = new Scanner(System.in);
        double media = 0;
        double MediaDaTurma = 0;
        double MaiorMedia = 0;
        double MenorMedia = 10;
        int TotalDeMedias = 0;

        String alunoComMaiorMedia = "";
        String alunoComMenorMedia = "";
        String aluno = "";
        String resposta = "sim";
        while (resposta.equalsIgnoreCase("sim")){
            System.out.println("qual o nome do aluno");
            aluno = t.next();
            System.out.println("e qual a média dele?");
            media = t.nextDouble();
            MediaDaTurma = media/TotalDeMedias;
            if (media>MaiorMedia && alunoComMaiorMedia.equalsIgnoreCase("")){
                MaiorMedia = media;
                alunoComMaiorMedia = aluno;
            }else if (media<MenorMedia && alunoComMenorMedia.equalsIgnoreCase("")){
                MenorMedia = media;
                alunoComMenorMedia = aluno;
            }
            TotalDeMedias++;
            System.out.println("que falar a média de mais algum aluno?");
            resposta = t.next();
        }
        System.out.println("a média aritmetica da turma é " + MediaDaTurma);
        System.out.println("a maior média é " + MaiorMedia + " e o dono dela é " + alunoComMaiorMedia );
        System.out.println("a menor média é " + MenorMedia + " e o dono dela é " + alunoComMenorMedia );
    }
}
//3. Faça um programa que leia o nome e 3 notas de vários alunos. Para cada aluno,
//deve ser impresso:
//a. Seu nome
//b. Sua média
//Além disso, o programa deve mostrar:
//c. A maior média e o nome do aluno com tal média
//d. A menor média e o nome do aluno com tal média
//e. A média aritmética da turma
//O programa deve parar quando o usuário informar que não deseja mais ler as
//médias dos alunos, por exemplo, com a opção S/N.
//Obs: Se houverem dois ou mais alunos empatados com a maior ou menor média,
//mostrar o nome do primeiro aluno encontrado.
