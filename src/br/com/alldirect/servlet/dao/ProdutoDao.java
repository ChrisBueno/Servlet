package br.com.alldirect.servlet.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import br.com.alldirect.servlet.connection.Conexao;
import br.com.alldirect.servlet.model.Produto;;

public class ProdutoDao {

	private Connection conecta;

	public ProdutoDao() {
		this.conecta = new Conexao().getConnection();
	}

	public void adicionaProduto(Produto produto) {
		String sql = "INSERT INTO PRODUTOS(NOME, DESCRICAO, PRECO) VALUES (?,?,?)";
		try {
			PreparedStatement stmt = conecta.prepareStatement(sql);
			stmt.setString(1, produto.getNome());
			stmt.setString(2, produto.getDescricao());
			stmt.setDouble(3, produto.getPreco());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			System.out.println("Erro ao adicionar produto: " + e);
		}
	}

	public void removeProduto() {

	}

	public void listaProduto() {

	}

	public void alteraProduto() {

	}

}
