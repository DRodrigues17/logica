import java.util.Scanner;
import java.time.YearMonth;
import java.util.Random;
import java.util.Arrays;

public class PrinmeiroTrabalhoLógica {

	public static void main(String[] args) {

        System.out.println("questão 1");
        Scanner t = new Scanner (System.in);
        System.out.println("quantas maçãs você vai comprar?");
        int maça = t.nextInt();
        if (maça < 12) {
        	System.out.println("o total será " + (maça*1.3));
        } else if (maça >= 12) {
            System.out.println("como o preço é menor caso você compre pelo menos 12 maçãs, o total será " + (maça*1) );
        } 
        
        
        System.out.println("questão 2");
        int year = YearMonth.now().getYear();
        System.out.println("qual seu ano de nascimento");
        double ano1 = t.nextDouble();
        double age = (2021-ano1);
        if(age>16 && year==2022) {
        	System.out.println("você pode votar na próxima eleição");
        } else if (age<16 && year!= 2022) { 
        	
        } System.out.println("você não pode votar ainda");
        
        
        System.out.println("questão 3");
        System.out.println("qual é o primeiro valor?");
        int valor1 = t.nextInt();
        System.out.println("qual o segundo valor?");
        int valor2 = t.nextInt();
        System.out.println("qual o terceiro valor?");
        int valor3 = t.nextInt();
        if ( valor1<valor2 && valor2<valor3) {
        	System.out.println("a ordem é " +valor1+ ", " +valor2+ ", " +valor3);
        } else if (valor1<valor3 && valor3<valor2) {
        	System.out.println("a ordem é "+valor1+", " +valor3+", "+valor2);
        } else if (valor2<valor1 && valor1<valor3){
        	System.out.println("a ordem é "+valor2+", " +valor1+", "+valor3);
        } else if (valor2<valor3 && valor3<valor1){
        	System.out.println("a ordem é "+valor2+", " +valor3+", "+valor1);
        } else if (valor3<valor1 && valor1<valor2){
        	System.out.println("a ordem é "+valor3+", " +valor1+", "+valor2);
        } else if (valor3<valor2 && valor2<valor1) {
            System.out.println("a ordem é "+valor3+", " +valor2+", "+valor1);
        }
        
        System.out.println("questão 4");  
        System.out.println("qual seu salário fixo?");
        double salario = t.nextDouble();
        System.out.println("qual o valor das vendas efetuadas?");
        double vendas = t.nextDouble();
        
        if (vendas <= 1500) {
        	System.out.println("seu salário receberá 3% a mais, então será " + (salario+ (vendas*3)/100));
        } else if (vendas > 1500) {
        	System.out.println("seu salário receberá 5% a mais, logo será " + (salario +(vendas*5)/100));
        }
        
        
        System.out.println("questão 5");
        System.out.println("qual o número da conta?");
        int conta = t.nextInt();
        switch(conta) {
        case 17: System.out.println("qual seu saldo");
        double saldo = t.nextDouble();
        System.out.println("procurando dados...");
        double debito = 2000;
        double credito = 1000;
        double saldoatual = saldo-debito+credito;
          if (saldoatual == 0) {
        	System.out.println(saldoatual + " reais você não tem dinheiro");
          } else if (saldoatual < 0) {
        	System.out.print("voce nos deve " + saldoatual + " reais");
        	} else {
        		System.out.println("você ainda tem " + saldoatual);
        	}break;
            
        default: System.out.println("usuário não encontrado");
	   }	
        
        
        System.out.println("questão 6");
        System.out.println("qual é o estoque atual?");
        double estoqueatual = t.nextDouble();
        double estoquemaximo = 500;
        double estoqueminimo = 100;
        double estoquemedio = (estoquemaximo + estoqueminimo)/2;
        if (estoqueatual >= estoquemedio) {
        	System.out.println("não é necessario comprar mais");
        } else {
        	System.out.println("seria melhor comprar mais");
        }
        
        
        System.out.println("questão 7");
        System.out.println("qual o valor?");
        double valor7 = t.nextDouble();
        if(valor7<=10) {
        	System.out.println("valor de classe 1");
        } else if (valor7>10 && valor7<=100) {
        	System.out.println("valor de classe 2");
        } else if (valor7 > 100) {
        	System.out.println("valor de classe 3");
        }
        
        
        System.out.println("questão 8");
        System.out.println("qual o nome do candidato?");
        String nomecandidato = t.next();
        System.out.println("qual foi sua nota em matemática?");
        double notamath = t.nextDouble();
        System.out.println("qual foi sua nota em português?");
        double notapt = t.nextDouble();
        System.out.println("qual foi sua média em conhecimentos gerais?");
        double notacgerais = t.nextDouble();
        double media = (notamath+notapt+notacgerais)/3;
        System.out.println("sua média é " + media);
        if(media > 7 && notamath>5 &&  notapt>5 && notacgerais>5) {
        	System.out.println("candidato " + nomecandidato + " foi aprovado");
        }else {
        	System.out.println("candidato não " +nomecandidato+ " foi aprovado, pois em uma das provas tirou menos que 5");
        }
        
        
        System.out.println("questão 9");
        System.out.println("qual o valor de A?");
        int valora = t.nextInt();
        System.out.println("qual o valor de B?");
        int valorb = t.nextInt();
        System.out.println("qual o valor de C?");
        int valorc = t.nextInt();
        double soma = valora+valorb;
        System.out.println("s soma é igual a " + soma);
        if (soma >valorc) {
        	System.out.println("A soma é maior que C");
	    }else if (soma == valorc) {
	    	System.out.println("A soma na verdade é igual a C");
	    } else {
	    	System.out.println("Asoma é menor que C");
	    }
        
        
        System.out.println("questão 10");
        System.out.println("qual seu nome?");
        String nome = t.next();
        System.out.println("quantos parafusos você vai comprar");
        double parafuso = t.nextDouble();
        double precoparafuso = 38*parafuso;
        double descontoparafuso = (precoparafuso*20)/100;
        double precocomdescontoparafuso = precoparafuso-descontoparafuso;
        // desconto de 20% para parafusos
        System.out.println("quantas porcas você vai comprar");
        double porca = t.nextDouble();
        double precoporca = 20*parafuso;
        double descontoporca = (precoporca*10)/100;
        double precocomdescontoporca= precoporca-descontoporca;
        // desconto de 10% para porcas
        System.out.println("quantas arruelas você vai comprar");
        double arruela = t.nextDouble();
        double precoarruela = 39*parafuso;
        double descontoarruela = (precoarruela*30)/100;
        double precocomdescontoarruela = precoarruela-descontoarruela;
        // desconto de 30% para arruelas
        System.out.println("caro " + nome);
        System.out.println("você vai comprar " +parafuso+ " parafusos, " +porca+" porcas, e " +arruela);
        double total = parafuso+porca+arruela;
        System.out.println("isso totaliza " +total+ " peças");
        if (parafuso>10 && porca>15 && arruela>7){
        	System.out.println("você vai ter um desconto de 20% para parafusos, 10% para porcas e 30% para arruelas");
        	System.out.println("e isso vai dar um total de " + (precocomdescontoparafuso+precocomdescontoporca+precocomdescontoarruela));
        } else {
        	System.out.println("Você vai pagar " + (precoparafuso+precoporca+precoarruela));
        	}
       
        
        System.out.println("questão 11");
        System.out.println("qual o teu nome?");
        String nomedele = t.next();
        System.out.println("qual seu salário?");
        double salariodooperario = t.nextDouble();
        System.out.println("qual a sua categoria?");
        String categoria = t.next();
        if (categoria.equals("a") || categoria.equals("c") || categoria.equals("f") || categoria.equals("h")) {
            System.out.println("prezado "+nomedele+  ",sua categoria é " +categoria+ " e seu novo salário será " + (salariodooperario+(salariodooperario*10)/100));
        } else if (categoria.equals("b") || categoria.equals("d") ||categoria.equals("e") || categoria.equals("i") || categoria.equals("j") || categoria.equals("t")) {
            System.out.println("prezado "+nomedele+  ",sua categoria é " +categoria+ " e seu novo salário será " + (salariodooperario+(salariodooperario*15)/100));
        } else if (categoria.equals("k") || categoria.equals("r")) {
        	System.out.println("prezado "+nomedele+  ",sua categoria é " +categoria+ " e seu novo salário será " + (salariodooperario+(salariodooperario*25)/100));
        } else if (categoria.equals("l") || categoria.equals("m") || categoria.equals("n") || categoria.equals("o") || categoria.equals("p") || categoria.equals("q") || categoria.equals("s")) {
        	System.out.println("prezado "+nomedele+  ",sua categoria é " +categoria+ " e seu novo salário será " + (salariodooperario+(salariodooperario*35)/100));
        } else if (categoria.equals("u") || categoria.equals("v") || categoria.equals("x") || categoria.equals("y") || categoria.equals("w") || categoria.equals("z")) {
        	System.out.println("prezado "+nomedele+  ",sua categoria é " +categoria+ " e seu novo salário será " + (salariodooperario+(salariodooperario*50)/100));
        }
        
        
        System.out.println("questão 12");
        System.out.println("quantos dias você vai ficar aqui?");
        int estadia = t.nextInt();
        if (estadia>15) {
        	System.out.println("Ok, o preço da sua estadia será de R$" + (estadia*5.5));
        } else if (estadia==15) {
        	System.out.println("ok, o preço da sua estadia será de R$" + (estadia*6));
        } else {
        	System.out.println("Ok, o preço da sua estadia será de R$" +(estadia*8));
        }
        
	}    
}