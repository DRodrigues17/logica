package QuintoTrabalhoLogica;

import java.util.Scanner;

public class ExercicioDois {
    public static void main (String[]args){
        Scanner t = new Scanner(System.in);
        double media = 0;
        double MediaDaTurma = 0;
        double MaiorMedia = 0;
        double MenorMedia = 10;
        int TotalDeMedias = 0;

        while (media>=0){
            System.out.println("qual a média do aluno?");
            media = t.nextDouble();
            TotalDeMedias = TotalDeMedias +1;
            MediaDaTurma = media/TotalDeMedias;
            if (media>MaiorMedia){
                MaiorMedia = media;
            }else if (media<MenorMedia){
                MenorMedia = media;
            }
        }
        System.out.println("a média aritmetica da turma é " + MediaDaTurma);
        System.out.println("a maior média é " + MaiorMedia );
        System.out.println("a menor média é " + MenorMedia);
    }
}

// 2. Faça um programa que leia as médias finais de vários alunos de uma turma e
// mostre a maior média, a menor média e a média aritmética da turma. O programa
// parar quando o usuário digitar uma média negativa.