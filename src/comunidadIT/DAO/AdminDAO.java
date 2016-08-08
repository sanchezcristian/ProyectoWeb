package comunidadIT.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import comunidadIT.model.Admin;
import comunidadIT.model.User;

public class AdminDAO {

	private ConnectionDB connDB = new ConnectionDB();

	public boolean exist(User user) {
		String consul = "SELECT * FROM user";
		ResultSet rs = connDB.getQuery(consul);
		try {
			while (rs.next()) {
				if (user.getUsername().equals(rs.getString("name")) &&
						user.getPassword().equals(rs.getString("pass")))
					return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean isAdmin(Admin admin){
		String query = "SELECT * FROM user";
		ResultSet rs = connDB.getQuery(query);
		try {
			while (rs.next()) {
				if (admin.getUsername().equals(rs.getString("name")))
					if(rs.getString("role").equals("admin"))
						return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
