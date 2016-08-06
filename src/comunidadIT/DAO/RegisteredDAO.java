package comunidadIT.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import comunidadIT.model.Registered;

public class RegisteredDAO {
	
	private static ConnectionDB connDB = new ConnectionDB();

	public boolean exist(Registered registered){
		String consult = "SELECT * FROM admin";
		ResultSet rs = connDB.getQuery(consult);
		try {
			while (rs.next()){
				if (registered.getUsername().equals(rs.getString("name")))
					return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean add(Registered registered){
		if (!exist(registered)){
			String consult = "INSERT INTO registered (name,pass) VALUE ('"
					+ registered.getUsername() + "','" + registered.getPassword() + "')";
			connDB.setQuery(consult);
			return true;
		}else return false;
	}
}
