package QuartoTrabalhoLogica;
import java.util.Scanner;

public class ExCinco {

	public static void main(String[]args) {
		Scanner t = new Scanner(System.in);
	double salario = 1000;
	print("qual o pre�o do carro?");
	double precoDoCarro = t.nextDouble();
	double  comissao = precoDoCarro*0.01;
	print("quantos carros desse tipo voc� vendeu?");
	double totalDeCarros = t.nextDouble();
	double valorTotalDeVendas = totalDeCarros*precoDoCarro;
	double comissaoDasVendas = valorTotalDeVendas*0.05;
	print("voc� vendeu " + totalDeCarros + " carros, o valor total de suas vendas foi de R$" + valorTotalDeVendas);
	print("seu salario fixo � de R$" +salario + ", e o dinheiro que voc� recebe por carro vendido � de R$" + comissao);	
	print("com isso, seu pr�ximo sal�rio ser� de R$" + (salario+comissao+comissaoDasVendas));	
	
	
	}
	private static void print(String message) { 
	System.out.println(message);
	}
	
}
