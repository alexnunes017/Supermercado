package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.Supermercado;

import util.DbUtils;

public class SupermercadoDAO implements IAbstractDao<Supermercado> {

	@Override
	public List<Supermercado> all()
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		System.err.println("Método List");
		Connection connection = null;
		try {
			connection = util.DbUtils.getConnection();
			ResultSet resultSet = DbUtils.getResultSet(connection, "SELECT * FROM Supermercado");
			List<Supermercado> supermercados = new ArrayList<Supermercado>();
			while (resultSet.next()) {
				Supermercado supermercado = new Supermercado();
				supermercado.setIdSupermercado(resultSet.getInt("idSupermercado"));
				supermercado.setNomeSupermercado(resultSet.getString("nomeSupermercado"));

				supermercados.add(supermercado);
			}
			return supermercados;
		} finally {
			if (connection != null) {
				connection.close();
			}
		}

	}

	@Override
	public Supermercado findById(int id)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Connection connection = null;
		try {
			connection = DbUtils.getConnection();
			PreparedStatement preparedStatement = DbUtils.getPreparedStatement(connection,
					"SELECT * FROM Supermercado WHERE idSupermercado = ?");
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				Supermercado supermercado = new Supermercado();
				supermercado.setIdSupermercado(resultSet.getInt("idSupermercado"));
				supermercado.setNomeSupermercado(resultSet.getString("nomeSupermercado"));
				return supermercado;
			} else {
				return null;
			}
		} finally {
			if (connection != null) {
				connection.close();
			}

		}
	}

	@Override
	public void insert(Supermercado entidade)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Connection connection = null;
		try {
			connection = util.DbUtils.getConnection();
			PreparedStatement preparedStatement = DbUtils.getPreparedStatement(connection,
					"INSERT INTO Supermercado (nomeSupermercado)VALUES(?) ");

			preparedStatement.setString(1, entidade.getNomeSupermercado());

			preparedStatement.execute();
		} finally {
			if (connection != null) {
				connection.close();
			}
		}

	}

	@Override
	public void update(Supermercado entidade)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Supermercado entidade)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

	}

}
