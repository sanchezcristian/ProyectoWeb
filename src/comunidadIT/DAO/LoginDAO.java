package comunidadIT.DAO;

public class LoginDAO {
	
	public boolean checkUser (String username, String password){
		return (("cristian".equalsIgnoreCase(username)) &&
				("1234".equalsIgnoreCase(password)));
	}
}
