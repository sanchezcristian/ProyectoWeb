package comunidadIT.service;

import comunidadIT.DAO.SignUpDAO;

public class SignUpService {
	
	SignUpDAO suDAO = new SignUpDAO();
	
	public boolean existUser(String username, String password){
		return (suDAO.existUser(username, password));
	}
	
	public boolean addUser(String username, String password){
		return (suDAO.addUser(username, password));
	}
}
