package comunidadIT.DB;

import java.util.HashSet;
import java.util.Set;

import comunidadIT.model.Registered;
import comunidadIT.model.User;

public class DataBase {
	
	private Set<User> user = new HashSet<User>();
	
	public Set<User> getUser() {
		return user;
	}

	public void setUser(Set<User> user) {
		this.user = user;
	}
	
	public boolean addUser (Registered registered){
		return (this.user.add(registered));
	}
	
	public boolean existUser(Registered registered){
		return (this.user.contains(registered));
	}

}
