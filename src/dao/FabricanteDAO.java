package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import bean.Fabricante;
import bean.Supermercado;
import util.DbUtils;

public class FabricanteDAO implements IAbstractDao<Fabricante> {

	@Override
	public List<Fabricante> all()
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Fabricante findById(int id)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Connection connection = null;
		try {
			connection = DbUtils.getConnection();
			PreparedStatement preparedStatement = DbUtils.getPreparedStatement(connection,
					"SELECT * FROM Fabricante WHERE idFabricante = ?");
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				Fabricante fabricante = new Fabricante();
				fabricante.setIdFabricante(resultSet.getInt("idFabricante"));
				fabricante.setNomeFabricante(resultSet.getString("nomeFabricante"));
				return fabricante;
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
	public void insert(Fabricante entidade)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Connection connection = null;
		try {
			connection = util.DbUtils.getConnection();
			PreparedStatement preparedStatement = DbUtils.getPreparedStatement(connection,
					"INSERT INTO Fabricante (nomeFabricante)VALUES(?) ");

			preparedStatement.setString(1, entidade.getNomeFabricante());

			preparedStatement.execute();
		} finally {
			if (connection != null) {
				connection.close();
			}
		}

	}

	@Override
	public void update(Fabricante entidade)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Fabricante entidade)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

	}

}
