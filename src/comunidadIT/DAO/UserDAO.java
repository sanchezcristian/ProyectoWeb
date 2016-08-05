package comunidadIT.DAO;

import comunidadIT.DB.DataBase;
import comunidadIT.model.Registered;
import comunidadIT.DAO.ConnectionDB;

public class UserDAO {
	
	private static DataBase db = new DataBase();
	private static ConnectionDB connectionDB = new ConnectionDB();
	
	public boolean addUser (Registered registered){
		return (db.addUser(registered));
	}
	
	public boolean existUser (Registered registered){;
		return (db.existUser(registered));
	}

}
