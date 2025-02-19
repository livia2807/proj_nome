package Projetos_LPA.aula04;

import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		//Variáveis 
		double horatrab, valorhora, salbruto, salliquido, inss;
		//Classe scanner
		Scanner ler = new Scanner(System.in);
		
		//Entrada de dados
		System.out.println("Informe hora de trabalho:");
		horatrab = ler.nextDouble();
		
		System.out.println("Informe valor da hora:");
		valorhora = ler.nextDouble();
		
		
		//Processamento
		salbruto = horatrab * valorhora; 
		inss = salbruto * 0.12;
		salliquido = salbruto - inss;
				
				//saída
				System.out.println("O valor do salário bruto é:"+ salbruto);
		System.out.println("O valor do salário liquido é:"+ salliquido);
	}

}
