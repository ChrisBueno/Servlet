package br.com.alldirect.servlet.util;

import br.com.alldirect.servlet.dao.ProdutoDao;
import br.com.alldirect.servlet.model.Produto;

public class TestaConnection {

	public static void main(String[] args) {

		Produto produto = new Produto();
		produto.setNome("NOUTE AND BOOK");
		produto.setDescricao("eu estive aqui mais uma vez");
		produto.setPreco(82.38);

		ProdutoDao produtoDao = new ProdutoDao();
		produtoDao.adicionaProduto(produto);

	}

}
