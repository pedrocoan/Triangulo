package main;

import utilidades.FuncoesUteis;

public class Main {

	public static void main(String[] args) {
	
		//testando a funçao de soma
		int resultadoSoma = FuncoesUteis.Soma(5, 10);
		System.out.println("Resultado da soma: " + resultadoSoma);
		
		// testando a função de calculo do triangulo
		System.out.println("Triângulo com altura 5:");
		FuncoesUteis.Triangulo(5);

		// testando a funçao pra ler o arquivo
		System.out.println("Conteúdo do arquivo:");
		FuncoesUteis.printArquivo("caminho/do/seu/arquivo.txt");

	    }
	
	}
	