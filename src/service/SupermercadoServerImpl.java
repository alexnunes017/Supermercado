package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import bean.Produto;
import util.DbUtils;

@WebService(endpointInterface = "service.SupermercadoServer")
public class SupermercadoServerImpl implements SupermercadoServer {

	public Produto findByFabricante(int id, int cod)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Connection connection = null;
		try {
			connection = DbUtils.getConnection();
			PreparedStatement preparedStatement = DbUtils.getPreparedStatement(connection,
					"SELECT * FROM Produto WHERE fabricante = ? and idProduto = ?");
			preparedStatement.setInt(1, id);
			preparedStatement.setInt(2, cod);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				Produto produto = new Produto();
				produto.setIdProduto(resultSet.getInt("idProduto"));
				produto.setNomeProduto(resultSet.getString("nomeProduto"));
				produto.setQuantidadeProduto(resultSet.getInt("quantidadeProduto"));
				produto.setValorProduto(resultSet.getFloat("valorProduto"));
				produto.setSupermercado(resultSet.getInt("supermercado"));
				produto.setFabricante(resultSet.getInt("fabricante"));
				return produto;
			} else {
				return null;
			}
		} finally {
			if (connection != null) {
				connection.close();
			}

		}
	}

	public Produto findBySupermercado(int id, int cod)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Connection connection = null;
		try {
			connection = DbUtils.getConnection();
			PreparedStatement preparedStatement = DbUtils.getPreparedStatement(connection,
					"SELECT * FROM Produto WHERE supermercado = ? and idProduto = ?");
			preparedStatement.setInt(1, id);
			preparedStatement.setInt(2, cod);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				Produto produto = new Produto();
				produto.setIdProduto(resultSet.getInt("idProduto"));
				produto.setNomeProduto(resultSet.getString("nomeProduto"));
				produto.setQuantidadeProduto(resultSet.getInt("quantidadeProduto"));
				produto.setValorProduto(resultSet.getFloat("valorProduto"));
				produto.setSupermercado(resultSet.getInt("supermercado"));
				produto.setFabricante(resultSet.getInt("fabricante"));
				return produto;
			} else {
				return null;
			}
		} finally {
			if (connection != null) {
				connection.close();
			}

		}
	}

	public List<Produto> allFabricante(int id)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Connection connection = null;
		try {
			connection = util.DbUtils.getConnection();
			PreparedStatement preparedStatement = DbUtils.getPreparedStatement(connection,
					"SELECT * FROM Produto WHERE fabricante = ?");
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			List<Produto> produtos = new ArrayList<Produto>();
			while (resultSet.next()) {
				Produto produto = new Produto();
				produto.setIdProduto(resultSet.getInt("idProduto"));
				produto.setNomeProduto(resultSet.getString("nomeProduto"));
				produto.setQuantidadeProduto(resultSet.getInt("quantidadeProduto"));
				produto.setValorProduto(resultSet.getFloat("valorProduto"));
				produto.setSupermercado(resultSet.getInt("supermercado"));
				produto.setFabricante(resultSet.getInt("fabricante"));

				produtos.add(produto);
			}
			return produtos;
		} finally {
			if (connection != null) {
				connection.close();
			}
		}
	}

	public List<Produto> allSupermercado(int id)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Connection connection = null;
		try {
			connection = util.DbUtils.getConnection();
			PreparedStatement preparedStatement = DbUtils.getPreparedStatement(connection,
					"SELECT * FROM Produto WHERE supermercado = ?");
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			List<Produto> produtos = new ArrayList<Produto>();
			while (resultSet.next()) {
				Produto produto = new Produto();
				produto.setIdProduto(resultSet.getInt("idProduto"));
				produto.setNomeProduto(resultSet.getString("nomeProduto"));
				produto.setQuantidadeProduto(resultSet.getInt("quantidadeProduto"));
				produto.setValorProduto(resultSet.getFloat("valorProduto"));
				produto.setSupermercado(resultSet.getInt("supermercado"));
				produto.setFabricante(resultSet.getInt("fabricante"));

				produtos.add(produto);
			}
			return produtos;
		} finally {
			if (connection != null) {
				connection.close();
			}
		}
	}

	@Override
	public ArrayList<Produto> all()
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Connection connection = null;
		try {
			connection = util.DbUtils.getConnection();
			ResultSet resultSet = DbUtils.getResultSet(connection, "SELECT * FROM Produto");
			ArrayList<Produto> produtos = new ArrayList<Produto>();
			while (resultSet.next()) {
				Produto produto = new Produto();
				produto.setIdProduto(resultSet.getInt("idProduto"));
				produto.setNomeProduto(resultSet.getString("nomeProduto"));
				produto.setQuantidadeProduto(resultSet.getInt("quantidadeProduto"));
				produto.setValorProduto(resultSet.getFloat("valorProduto"));
				produto.setSupermercado(resultSet.getInt("supermercado"));
				produto.setFabricante(resultSet.getInt("fabricante"));

				produtos.add(produto);
			}
			return produtos;
		} finally {
			if (connection != null) {
				connection.close();
			}
		}
	}

}
