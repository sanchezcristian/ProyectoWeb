package comunidadIT.DAO;

import comunidadIT.DB.DataBase;
import comunidadIT.model.Registered;

public class LoginDAO {
	
	private static DataBase db = new DataBase();

	public boolean existUser (Registered registered){;
	return (db.existUser(registered));
	}
}
