package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUtils {

	public static Connection getConnection()
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		String stringConexao = "jdbc:mysql://127.0.0.1:3306/supermercado?autoReconnect=true&useSSL=false";
		Connection connection = DriverManager.getConnection(stringConexao, "root", "linux");
		return connection;

	}

	public static ResultSet getResultSet(Connection connection, String sql) throws SQLException {
		Statement statement = connection.createStatement();
		return statement.executeQuery(sql);
	}

	public static PreparedStatement getPreparedStatement(Connection connection, String sql) throws SQLException {

		return connection.prepareStatement(sql);

	}

}
