package comunidadIT.DAO;

import comunidadIT.DB.DataBase;
import comunidadIT.model.Registered;

public class UserDAO {
	
	private static DataBase db = new DataBase();
	
	public boolean addUser (Registered registered){
		return (db.addUser(registered));
	}
	
	public boolean existUser (Registered registered){;
		return (db.existUser(registered));
	}

}
