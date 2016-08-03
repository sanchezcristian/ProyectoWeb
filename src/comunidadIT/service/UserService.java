package comunidadIT.service;

import comunidadIT.DAO.UserDAO;
import comunidadIT.model.Registered;

public class UserService {
	
	private static UserDAO userDAO = new UserDAO();
	
	
	private Registered createRegistered(String username, String password){
		Registered registered = new Registered();
		registered.setUsername(username);
		registered.setPassword(password);
		return registered;
	}
	
	public boolean existUser(String username, String password){
		Registered registered = createRegistered(username, password);
		return (userDAO.existUser(registered));
	}
	
	public boolean addUser(String username, String password){
		Registered registered = createRegistered(username, password);
		return (userDAO.addUser(registered));
	}

}
