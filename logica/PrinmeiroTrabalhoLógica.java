import java.util.Scanner;
import java.time.YearMonth;
import java.util.Random;
import java.util.Arrays;

public class PrinmeiroTrabalhoL�gica {

	public static void main(String[] args) {

        System.out.println("quest�o 1");
        Scanner t = new Scanner (System.in);
        System.out.println("quantas ma��s voc� vai comprar?");
        int ma�a = t.nextInt();
        if (ma�a < 12) {
        	System.out.println("o total ser� " + (ma�a*1.3));
        } else if (ma�a >= 12) {
            System.out.println("como o pre�o � menor caso voc� compre pelo menos 12 ma��s, o total ser� " + (ma�a*1) );
        } 
        
        
        System.out.println("quest�o 2");
        int year = YearMonth.now().getYear();
        System.out.println("qual seu ano de nascimento");
        double ano1 = t.nextDouble();
        double age = (2021-ano1);
        if(age>16 && year==2022) {
        	System.out.println("voc� pode votar na pr�xima elei��o");
        } else if (age<16 && year!= 2022) { 
        	
        } System.out.println("voc� n�o pode votar ainda");
        
        
        System.out.println("quest�o 3");
        System.out.println("qual � o primeiro valor?");
        int valor1 = t.nextInt();
        System.out.println("qual o segundo valor?");
        int valor2 = t.nextInt();
        System.out.println("qual o terceiro valor?");
        int valor3 = t.nextInt();
        if ( valor1<valor2 && valor2<valor3) {
        	System.out.println("a ordem � " +valor1+ ", " +valor2+ ", " +valor3);
        } else if (valor1<valor3 && valor3<valor2) {
        	System.out.println("a ordem � "+valor1+", " +valor3+", "+valor2);
        } else if (valor2<valor1 && valor1<valor3){
        	System.out.println("a ordem � "+valor2+", " +valor1+", "+valor3);
        } else if (valor2<valor3 && valor3<valor1){
        	System.out.println("a ordem � "+valor2+", " +valor3+", "+valor1);
        } else if (valor3<valor1 && valor1<valor2){
        	System.out.println("a ordem � "+valor3+", " +valor1+", "+valor2);
        } else if (valor3<valor2 && valor2<valor1) {
            System.out.println("a ordem � "+valor3+", " +valor2+", "+valor1);
        }
        
        System.out.println("quest�o 4");  
        System.out.println("qual seu sal�rio fixo?");
        double salario = t.nextDouble();
        System.out.println("qual o valor das vendas efetuadas?");
        double vendas = t.nextDouble();
        
        if (vendas <= 1500) {
        	System.out.println("seu sal�rio receber� 3% a mais, ent�o ser� " + (salario+ (vendas*3)/100));
        } else if (vendas > 1500) {
        	System.out.println("seu sal�rio receber� 5% a mais, logo ser� " + (salario +(vendas*5)/100));
        }
        
        
        System.out.println("quest�o 5");
        System.out.println("qual o n�mero da conta?");
        int conta = t.nextInt();
        switch(conta) {
        case 17: System.out.println("qual seu saldo");
        double saldo = t.nextDouble();
        System.out.println("procurando dados...");
        double debito = 2000;
        double credito = 1000;
        double saldoatual = saldo-debito+credito;
          if (saldoatual == 0) {
        	System.out.println(saldoatual + " reais voc� n�o tem dinheiro");
          } else if (saldoatual < 0) {
        	System.out.print("voce nos deve " + saldoatual + " reais");
        	} else {
        		System.out.println("voc� ainda tem " + saldoatual);
        	}break;
            
        default: System.out.println("usu�rio n�o encontrado");
	   }	
        
        
        System.out.println("quest�o 6");
        System.out.println("qual � o estoque atual?");
        double estoqueatual = t.nextDouble();
        double estoquemaximo = 500;
        double estoqueminimo = 100;
        double estoquemedio = (estoquemaximo + estoqueminimo)/2;
        if (estoqueatual >= estoquemedio) {
        	System.out.println("n�o � necessario comprar mais");
        } else {
        	System.out.println("seria melhor comprar mais");
        }
        
        
        System.out.println("quest�o 7");
        System.out.println("qual o valor?");
        double valor7 = t.nextDouble();
        if(valor7<=10) {
        	System.out.println("valor de classe 1");
        } else if (valor7>10 && valor7<=100) {
        	System.out.println("valor de classe 2");
        } else if (valor7 > 100) {
        	System.out.println("valor de classe 3");
        }
        
        
        System.out.println("quest�o 8");
        System.out.println("qual o nome do candidato?");
        String nomecandidato = t.next();
        System.out.println("qual foi sua nota em matem�tica?");
        double notamath = t.nextDouble();
        System.out.println("qual foi sua nota em portugu�s?");
        double notapt = t.nextDouble();
        System.out.println("qual foi sua m�dia em conhecimentos gerais?");
        double notacgerais = t.nextDouble();
        double media = (notamath+notapt+notacgerais)/3;
        System.out.println("sua m�dia � " + media);
        if(media > 7 && notamath>5 &&  notapt>5 && notacgerais>5) {
        	System.out.println("candidato " + nomecandidato + " foi aprovado");
        }else {
        	System.out.println("candidato n�o " +nomecandidato+ " foi aprovado, pois em uma das provas tirou menos que 5");
        }
        
        
        System.out.println("quest�o 9");
        System.out.println("qual o valor de A?");
        int valora = t.nextInt();
        System.out.println("qual o valor de B?");
        int valorb = t.nextInt();
        System.out.println("qual o valor de C?");
        int valorc = t.nextInt();
        double soma = valora+valorb;
        System.out.println("s soma � igual a " + soma);
        if (soma >valorc) {
        	System.out.println("A soma � maior que C");
	    }else if (soma == valorc) {
	    	System.out.println("A soma na verdade � igual a C");
	    } else {
	    	System.out.println("Asoma � menor que C");
	    }
        
        
        System.out.println("quest�o 10");
        System.out.println("qual seu nome?");
        String nome = t.next();
        System.out.println("quantos parafusos voc� vai comprar");
        double parafuso = t.nextDouble();
        double precoparafuso = 38*parafuso;
        double descontoparafuso = (precoparafuso*20)/100;
        double precocomdescontoparafuso = precoparafuso-descontoparafuso;
        // desconto de 20% para parafusos
        System.out.println("quantas porcas voc� vai comprar");
        double porca = t.nextDouble();
        double precoporca = 20*parafuso;
        double descontoporca = (precoporca*10)/100;
        double precocomdescontoporca= precoporca-descontoporca;
        // desconto de 10% para porcas
        System.out.println("quantas arruelas voc� vai comprar");
        double arruela = t.nextDouble();
        double precoarruela = 39*parafuso;
        double descontoarruela = (precoarruela*30)/100;
        double precocomdescontoarruela = precoarruela-descontoarruela;
        // desconto de 30% para arruelas
        System.out.println("caro " + nome);
        System.out.println("voc� vai comprar " +parafuso+ " parafusos, " +porca+" porcas, e " +arruela);
        double total = parafuso+porca+arruela;
        System.out.println("isso totaliza " +total+ " pe�as");
        if (parafuso>10 && porca>15 && arruela>7){
        	System.out.println("voc� vai ter um desconto de 20% para parafusos, 10% para porcas e 30% para arruelas");
        	System.out.println("e isso vai dar um total de " + (precocomdescontoparafuso+precocomdescontoporca+precocomdescontoarruela));
        } else {
        	System.out.println("Voc� vai pagar " + (precoparafuso+precoporca+precoarruela));
        	}
       
        
        System.out.println("quest�o 11");
        System.out.println("qual o teu nome?");
        String nomedele = t.next();
        System.out.println("qual seu sal�rio?");
        double salariodooperario = t.nextDouble();
        System.out.println("qual a sua categoria?");
        String categoria = t.next();
        if (categoria.equals("a") || categoria.equals("c") || categoria.equals("f") || categoria.equals("h")) {
            System.out.println("prezado "+nomedele+  ",sua categoria � " +categoria+ " e seu novo sal�rio ser� " + (salariodooperario+(salariodooperario*10)/100));
        } else if (categoria.equals("b") || categoria.equals("d") ||categoria.equals("e") || categoria.equals("i") || categoria.equals("j") || categoria.equals("t")) {
            System.out.println("prezado "+nomedele+  ",sua categoria � " +categoria+ " e seu novo sal�rio ser� " + (salariodooperario+(salariodooperario*15)/100));
        } else if (categoria.equals("k") || categoria.equals("r")) {
        	System.out.println("prezado "+nomedele+  ",sua categoria � " +categoria+ " e seu novo sal�rio ser� " + (salariodooperario+(salariodooperario*25)/100));
        } else if (categoria.equals("l") || categoria.equals("m") || categoria.equals("n") || categoria.equals("o") || categoria.equals("p") || categoria.equals("q") || categoria.equals("s")) {
        	System.out.println("prezado "+nomedele+  ",sua categoria � " +categoria+ " e seu novo sal�rio ser� " + (salariodooperario+(salariodooperario*35)/100));
        } else if (categoria.equals("u") || categoria.equals("v") || categoria.equals("x") || categoria.equals("y") || categoria.equals("w") || categoria.equals("z")) {
        	System.out.println("prezado "+nomedele+  ",sua categoria � " +categoria+ " e seu novo sal�rio ser� " + (salariodooperario+(salariodooperario*50)/100));
        }
        
        
        System.out.println("quest�o 12");
        System.out.println("quantos dias voc� vai ficar aqui?");
        int estadia = t.nextInt();
        if (estadia>15) {
        	System.out.println("Ok, o pre�o da sua estadia ser� de R$" + (estadia*5.5));
        } else if (estadia==15) {
        	System.out.println("ok, o pre�o da sua estadia ser� de R$" + (estadia*6));
        } else {
        	System.out.println("Ok, o pre�o da sua estadia ser� de R$" +(estadia*8));
        }
        
	}    
}