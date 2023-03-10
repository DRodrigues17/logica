package QuintoTrabalhoLogica;

import java.util.Scanner;

public class ExercicioSeis {
    public static void main (String[]args){
        Scanner t = new Scanner(System.in);
        double SomaDosFilhos = 0;
        double MédiaDosFilhos = 0;
        double QuantidadeDeFamiliasComMaisDe3Filhos = 0;
        double SomaDosSalarios = 0;
        double MédiaSalarial = 0;
        double QuantidadeDeFamiliasComRendaMaiorQue1800 = 0;
        double QuantidadeDeSalarios = 0;
        double NúmeroDeFamilias = 0;
        String resposta = "S";

        while (resposta.equalsIgnoreCase("S")){
            System.out.println("quantos filhos essa familia tem?");
            int filhos = t.nextInt();
            SomaDosFilhos = SomaDosFilhos + filhos;
            NúmeroDeFamilias = NúmeroDeFamilias+1;
            MédiaDosFilhos = SomaDosFilhos/NúmeroDeFamilias;
            if (filhos>3){
                QuantidadeDeFamiliasComMaisDe3Filhos= QuantidadeDeFamiliasComMaisDe3Filhos + 1;
            }

            System.out.println("qual a renda bruta dessa familia?");
            double RendaBruta = t.nextDouble();
            QuantidadeDeSalarios = QuantidadeDeSalarios + 1;
            SomaDosSalarios = SomaDosSalarios + RendaBruta;
            MédiaSalarial = SomaDosSalarios/QuantidadeDeSalarios;
            if (RendaBruta>1800){
                QuantidadeDeFamiliasComRendaMaiorQue1800 = QuantidadeDeFamiliasComRendaMaiorQue1800 + 1;
            }
            System.out.println("deseja coletar mais informações? S ou N?");
            resposta = t.next();
        }
        System.out.println("a média de filhos é " + MédiaDosFilhos);
        System.out.println("a média salarial é " + MédiaSalarial);
        System.out.println("a quantidade de familias com renda maior que R$1800,00 é " + QuantidadeDeFamiliasComRendaMaiorQue1800);
        System.out.println("a quantidade de familias com mais de 3 filhos é " + QuantidadeDeFamiliasComMaisDe3Filhos);
        System.out.println("o número de familias consultadas é " + NúmeroDeFamilias);
    }
}

// 6. A prefeitura de Porto Alegre está realizando uma pesquisa que descobre o número
// de filhos de uma família e a renda bruta da família. Desenvolva um algoritmo que calcule:
// a. A média do número de filhos das famílias;
// b. A média dos salários;
// c. A quantidade de famílias com salário superior a R$ 1800,00;
// d. A quantidade de famílias com mais de 3 filhos;
// O usuário deve informar N ou S para coletar mais informações.