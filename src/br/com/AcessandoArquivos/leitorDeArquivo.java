package br.com.AcessandoArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class leitorDeArquivo {
	public static void lerEstoque(String caminho) {
		try {
			//abre o arquivo
			FileReader stream = new FileReader(caminho);
			
			//bufferredReader possui o metodo readline()
			//le uma linha do arquivo e retorna uma string com o valor lido ou null
			BufferedReader reader = new BufferedReader(stream);
			
			//le uma linha do arquivo
			String linha = reader.readLine();
			
			//enquanto linha for diferente de null
			while (linha != null) {
				
				System.out.println(linha);
				//le a proxima linha do arquivo
				linha = reader.readLine();
				
			}
			reader.close();
			//fecha o arquivo
			stream.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
