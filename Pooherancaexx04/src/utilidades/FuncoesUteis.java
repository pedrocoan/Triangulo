package utilidades;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//criando a classe para armazenar os metodos e funçoes para depois aplicar na main
public class FuncoesUteis {
	//criando o metodo de soma
	public static int Soma(int a, int b) {
        return a + b;
    }
	//criando o metodo do calculo da altura do triangulo
    public static void Triangulo(int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }

  //criando o metodo para ler o arquivo
    public static void printArquivo(String arquivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}


