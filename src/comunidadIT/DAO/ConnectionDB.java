package comunidadIT.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDB {

	private final String userName = "root";
	private final String password = "root";
	private final String dbName = "proyectowebdb";
	private final String driver = "com.mysql.jdbc.Driver";
	private final String url = "jdbc:mysql://localhost:3306/";
	private Connection connection = null;

	public ConnectionDB() {

		try {
			Class.forName(driver).newInstance();
			connection = (Connection) DriverManager.getConnection(url + dbName, userName, password);
			if (connection != null) {
				System.out.println("Data base connection working using TCP/IP: " + url);
			}
		} catch (Exception e) {
			System.out.println("ERROR: Exeption " + e);
		} 
		//FIXME Cuando cierro la conexcion????
	}

	public ResultSet getQuery(String query) {
		Statement state = null;
		ResultSet result = null;
		try {
			state = (Statement) connection.createStatement();
			result = state.executeQuery(query);
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		return result;
	}

	public void setQuery(String query) {

		Statement state = null;

		try {
			state = (Statement) connection.createStatement();
			state.execute(query);

		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}
}
