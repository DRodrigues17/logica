import java.util.Scanner;


public class TerceiroTrabalhoLogica {

	public static void main(String[] args) {
	System.out.println("exercício 1");
	Scanner t = new Scanner (System.in);
	System.out.println("qual o produto?");
	String produto = t.next();
		if (produto.equals ("arroz") || produto.equals("feijão") || produto.equals("açucar") || produto.equals("café") || produto.equals ("massa")){
			System.out.println("seu produto é um alimento não perecível");
		} else if (produto.equals ("carne") || produto.equals("leite") || produto.equals("salgado") || produto.equals("vegetal") || produto.equals ("fruta")) {
			System.out.println("seu produto é um alimento perecivel");
		} else if (produto.equals ("casaco") || produto.equals("camisa") || produto.equals("calça") || produto.equals("vestido") || produto.equals ("saia")) {
			System.out.println("seu produto é uma roupa");
		} else if (produto.equals("sapólio") || produto.equals("desinfetante") || produto.equals("detergente") || produto.equals ("clorofina")) {
			System.out.println("seu produto é um produto de limpeza");
	}
	
	
	System.out.println("exercício 2");
	System.out.println("qual a letra?");
	String letra = t.next();
		if ( letra.equalsIgnoreCase ("a") || letra.equalsIgnoreCase ("e") || letra.equalsIgnoreCase ("i") || letra.equalsIgnoreCase ("o") || letra.equalsIgnoreCase ("u") ){
			System.out.println("a letra é uma vogal");
		} else if (letra.equalsIgnoreCase ("b") || letra.equalsIgnoreCase ("c") || letra.equalsIgnoreCase ("d") || letra.equalsIgnoreCase ("f") || letra.equalsIgnoreCase ("g") || letra.equalsIgnoreCase ("h") || letra.equalsIgnoreCase ("j") || letra.equalsIgnoreCase ("k") || letra.equalsIgnoreCase ("l") || letra.equalsIgnoreCase ("m") || letra.equalsIgnoreCase ("n") || letra.equalsIgnoreCase ("p") || letra.equalsIgnoreCase ("q") || letra.equalsIgnoreCase ("r") || letra.equalsIgnoreCase ("s") || letra.equalsIgnoreCase ("t") || letra.equalsIgnoreCase ("v") || letra.equalsIgnoreCase ("w") || letra.equalsIgnoreCase ("x") || letra.equalsIgnoreCase ("y") || letra.equalsIgnoreCase ("z")) {
			System.out.println("a letra é uma consoante");
	}
	
	
	System.out.println("exercício 3");
	System.out.println("qual o mês?");
	int mes = t.nextInt();
		if ( mes == 2 ){
			System.out.println("seu mês tem 28 dias em anos normais e 29 em anos bisextos");
		} else if ( mes == 4 || mes == 6 || mes == 9 || mes == 11){
			System.out.println("seu mês tem 30 dias");
		} else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 2){
			System.out.println("seu mês tem 31 dias");
		} else if (mes > 12 || mes < 1) {
			System.out.println("esse mês não existe");
		}
	
	
	
	System.out.println("exercício 4");
	System.out.println("qual o conceito do aluno?");
	String conceito = t.next();
		if (conceito.equalsIgnoreCase("A")){
			System.out.println("ótimo conceito meu consagrado");
		} else if (conceito.equalsIgnoreCase("B")) {
			System.out.println("Um bom conceito, parabéns");
		} else if (conceito.equalsIgnoreCase("C")) {
			System.out.println("tá na média, quase que não passa hein");
		} else if (conceito.equalsIgnoreCase("D")){
			System.out.println("Infelizmente, você terá que fazer a recuperação");
		} else if (conceito.equalsIgnoreCase("E")){
			System.out.println("talvez, nem o provão final te salve");
		} else if (conceito.equalsIgnoreCase("F")) {
			System.out.println("Nos vemos ano que vem, na mesma série no caso");
		} else {
			System.out.println("conceito não encontrado");
		}
		
		
		System.out.println("exercício 5");
		System.out.println("qual o primeiro valor?");
		double v1 = t.nextDouble();
		System.out.println("qual o segundo valor?");
		double v2 = t.nextDouble();
		System.out.println("qual a operação a ser feita?");
		System.out.println("se quer divisão, digite /");
		System.out.println("se quer adição dogote +");
		System.out.println("se quer subtração, digite -");
		System.out.println("se quer multiplicação digite *");
		String operacao = t.next();
			if (operacao.equals("/")) {
				System.out.println("o resultado é " + (v1 / v2));
			} else if (operacao.equals("+") ) {
				System.out.println("o resultado é " + (v1+v2));
			} else if (operacao.equals("-")) {
				System.out.println("o resultado é " + (v1 - v2)); 
			} else if (operacao.equals("*")) {
				System.out.println("o resultado é " + (v1*v2));
			} else {
				System.out.println("operador inválido");
			}			
	
	
	System.out.println("exercício 6");
	System.out.println("qual o ano?");
	double ano = t.nextDouble();
		if  ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
			System.out.println("esse ano é bisexto");
		} else {
			System.out.println("é um ano normal");
		}
	
	
	System.out.println("exercício 7");
	System.out.println("qual o número?");
	 Double numero = t.nextDouble();
	 	if (numero % 3 == 0) {
	 		System.out.println("é um múltiplo de 3");
	 	} else {
	 		System.out.println("não é um múltiplo de 3");
	 	}
	
	
	System.out.println("exercício 8");
	System.out.println("qual o valor?");
	Double valor = t.nextDouble();
		if (valor >100) {
			System.out.println("o valor é maior que 100");
		} else if (valor < 100) {
			System.out.println("o valor é menor que 100");
		} else if (valor == 100) {
			System.out.println("o valor é igual a 100");
		}
	
	
	System.out.println("exercício 9");
	System.out.println("qual sua idade?");
	int idade = t.nextInt();
	if (idade == 18 || idade > 18) {
		System.out.println("você pode tirar a carteira");
	} else {
		System.out.println("você não pode tirar carteira");
	} 
	
	
	System.out.println("exercício 10");
	System.out.println("qual o número a ser calculado?");
	Double number = t.nextDouble();
	double antecessor = number - 1;
	System.out.println("seu antecessor " + antecessor);
		if (antecessor >0 &&  antecessor % 2 == 0) {
			System.out.println("o antecessor é positivo e par ");
		} else if (antecessor >0 &&  antecessor % 2 == 1) {
			System.out.println("o antecessor é positivo e ímpar ");
		}else if (antecessor <0) {
			System.out.println("o antecessor é negativo ");
		} 
	
	
	System.out.println("questão 11");
	System.out.println("qual o primeiro valor?");
	int algarismo1 = t.nextInt();
	System.out.println("qual o segundo valor?");
	int algarismo2 = t.nextInt();
	System.out.println("qual o terceiro valor?");
	int algarismo3 = t.nextInt();
		if (algarismo1>algarismo2 && algarismo1 > algarismo3) {
			System.out.println("O maior número é " +algarismo1); 
		} else if(algarismo2>algarismo1 && algarismo2 > algarismo3) {
			System.out.println("O maior número é " +algarismo2);
		}else if (algarismo3>algarismo1 && algarismo3 > algarismo2) {
			System.out.println("O maior número é " + algarismo3);
		}
	
	
	
	System.out.println("exercício 12");
	System.out.println("qual o nome do primeiro time ?");
	String time1 = t.next();
	System.out.println("qual o nome do segundo time ?");
	String time2 = t.next();
	System.out.println("quantos pontos o primeiro time marcou?");
	int pontosdotime1 = t.nextInt();
	System.out.println("quantos pontos o segundo time marcou?");
	int pontosdotime2 = t.nextInt();
		if (pontosdotime1 > pontosdotime2) {
			System.out.println("com " + pontosdotime1 + ", o time " + time1 + " venceu");
		} else if (pontosdotime1 < pontosdotime2) {
			System.out.println("com " + pontosdotime2 + ", o time " + time2 + " venceu");
		} else if (pontosdotime1 == pontosdotime2) {
			System.out.println("deu empate");
		}
	
	
	System.out.println("exercício 13");
	int limite = 50;
	System.out.println("qual a velocidade do motorista?");	
	double velocidade = t.nextInt();
	double multa = velocidade - limite;
		if (multa < 0) {
			System.out.println("não há multa a se pagar");
		} else if (multa <= 10) {
				System.out.println("a multa é de 50 reais");
		} else if (multa > 11 && multa< 50) {
			System.out.println("a multa é de 100 reais");
		} else if (multa > 51) {
			System.out.println("a multa é de 300 reais");
		}
	
	
	System.out.println("exercíco 14");
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
	System.out.println("a soma deles é " + (valor1 + valor2 + valor3));
	System.out.println("a subtração deles é " + (valor1 - valor2 - valor3));
	
	
	System.out.println("exercíco 15");
	System.out.println("qual o primeiro valor?");
	double primeirovalor = t.nextDouble();
	System.out.println("qual o segundo valor?");
	double segundovalor = t.nextDouble();
	System.out.println("a multiplicação destes valores é " + (primeirovalor*segundovalor));
	
			
	System.out.println("exercício 16");
	System.out.println("exercíco 15");
	System.out.println("qual o primeiro valor?");
	double numero1 = t.nextDouble();
	System.out.println("qual o segundo valor?");
	double numero2 = t.nextDouble();
	System.out.println("a divisão so primeiro pelo segundo é " + (numero1/numero2));
	System.out.println("a divisão so segundo pelo primeiro é " + (numero2/numero1));
	
	
	
	
}
}
