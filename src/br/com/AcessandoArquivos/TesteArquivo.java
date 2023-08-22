package br.com.AcessandoArquivos;

import java.util.ArrayList;
import java.util.List;

public class TesteArquivo {

	public static void main(String[] args) {
		String nomeDoArquivo = "estoque.csv";
		String diretorio = System.getProperty("user.home");
		String caminho = diretorio + "//" + nomeDoArquivo;;
		
		List<String> conteudo = new ArrayList<>();
		conteudo.add("Produto; Quantidade; Unidade de Medida; Valor da Unidade;");
		conteudo.add("Peraa; 200; pct; R$ 5,40;");
		conteudo.add("Morando; 400; cx; R$ 6,50;");
		conteudo.add("Abacaaxi; 280; un; R$ 5,00;");
		
				
		criadorDeArquivo.gravarEstoque(nomeDoArquivo, caminho, conteudo);
		
		leitorDeArquivo.lerEstoque(caminho);

	}

}
