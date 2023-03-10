package QuartoTrabalhoLogica;
import java.util.Scanner;

public class ExCinco {

	public static void main(String[]args) {
		Scanner t = new Scanner(System.in);
	double salario = 1000;
	print("qual o preço do carro?");
	double precoDoCarro = t.nextDouble();
	double  comissao = precoDoCarro*0.01;
	print("quantos carros desse tipo você vendeu?");
	double totalDeCarros = t.nextDouble();
	double valorTotalDeVendas = totalDeCarros*precoDoCarro;
	double comissaoDasVendas = valorTotalDeVendas*0.05;
	print("você vendeu " + totalDeCarros + " carros, o valor total de suas vendas foi de R$" + valorTotalDeVendas);
	print("seu salario fixo é de R$" +salario + ", e o dinheiro que você recebe por carro vendido é de R$" + comissao);	
	print("com isso, seu próximo salário será de R$" + (salario+comissao+comissaoDasVendas));	
	
	
	}
	private static void print(String message) { 
	System.out.println(message);
	}
	
}
