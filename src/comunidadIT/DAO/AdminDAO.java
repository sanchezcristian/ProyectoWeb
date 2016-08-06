package comunidadIT.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import comunidadIT.model.Admin;

public class AdminDAO {

	private ConnectionDB connDB = new ConnectionDB();

	public boolean exist(Admin admin) {
		String consul = "SELECT * FROM admin";
		ResultSet rs = connDB.getQuery(consul);
		try {
			while (rs.next()) {
				if (admin.getUsername().equals(rs.getString("name")))
					return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
