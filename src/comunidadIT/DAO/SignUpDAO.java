package comunidadIT.DAO;

import comunidadIT.DB.DataBase;
import comunidadIT.model.Registered;

public class SignUpDAO {
	
	DataBase db = new DataBase();
	
	public boolean addUser (String username, String password){
		Registered registered = new Registered();
		registered.setUsername(username);
		registered.setPassword(password);
		return (db.addUser(registered));
	}
	
	public boolean existUser (String username, String password){
		Registered registered = new Registered();
		registered.setUsername(username);
		registered.setPassword(password);
		return (db.existUser(registered));
	}
	
}
