package comunidadIT.service;

import comunidadIT.DAO.LoginDAO;

public class LoginService {
	
	public boolean checkUser (String username, String password){
		LoginDAO loginDao = new LoginDAO();
		return loginDao.checkUser(username, password);

	}

}
