package br.com.AcessandoArquivos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class criadorDeArquivo {
	
	public static void gravarEstoque(String nomeDoArquivo, String caminho, List<String> conteudo) {
		
		FileWriter stream;
		PrintWriter print;
		
		try {
			//stream é uma conexao de escrita paara o arquivo
			stream = new FileWriter(caminho);
			//a classe PrintWriter escrevera no arquivo
			print = new PrintWriter(stream);
			
			for(String linha: conteudo) {
				print.println(linha); //o metodo println escreve uma linha no arquivo
			}
			
			print.close(); // close fecha o arquivo
			stream.close();
			
			System.out.println("O arquivo " + nomeDoArquivo + " foi salvo em "+ caminho);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
