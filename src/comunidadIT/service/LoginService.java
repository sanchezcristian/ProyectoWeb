package comunidadIT.service;

import comunidadIT.DAO.SignUpDAO;
import comunidadIT.model.Registered;

public class LoginService {
	
	private static SignUpDAO suDAO = new SignUpDAO();
	
	private Registered createRegistered(String username, String password){
		Registered registered = new Registered();
		registered.setUsername(username);
		registered.setPassword(password);
		return registered;
	}
	
	public boolean existUser(String username, String password){
		Registered registered = createRegistered(username, password);
		return (suDAO.existUser(registered));
	}
	
}
