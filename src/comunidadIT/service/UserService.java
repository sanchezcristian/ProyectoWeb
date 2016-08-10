package comunidadIT.service;

import comunidadIT.DAO.UserDAO;
import comunidadIT.model.User;

public class UserService {

	UserDAO userDAO = new UserDAO();

	private User createUser(String username, String password) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		return user;
	}

	public boolean existUser(String username, String password) {
		return (userDAO.exist(createUser(username, password)));
	}

	public boolean isAdmin(String username) {
		User user = new User();
		user.setUsername(username);
		return (userDAO.isAdmin(user));
	}

	public boolean addUser(String username, String password) {
		return (userDAO.add(createUser(username, password)));
	}

}
