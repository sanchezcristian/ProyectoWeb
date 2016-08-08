package comunidadIT.service;

import comunidadIT.DAO.AdminDAO;
import comunidadIT.DAO.RegisteredDAO;
import comunidadIT.model.Admin;
import comunidadIT.model.Registered;

public class UserService {
	
	private static AdminDAO adminDAO = new AdminDAO();
	private static RegisteredDAO registeredDAO = new RegisteredDAO();
	
	private Registered createRegistered(String username, String password){
		Registered registered = new Registered();
		registered.setUsername(username);
		registered.setPassword(password);
		return registered;
	}
		
	public boolean existUser(String username, String password){
		Admin admin = new Admin();
		admin.setUsername(username);
		admin.setPassword(password);
		return (adminDAO.exist(admin));
	}
	
	public boolean isAdmin(String username){
		Admin admin = new Admin();
		admin.setUsername(username);
		return (adminDAO.isAdmin(admin));
	}
	
	public boolean addUser(String username, String password){
		Registered registered = createRegistered(username, password);
		return (registeredDAO.add(registered));
	}

}
