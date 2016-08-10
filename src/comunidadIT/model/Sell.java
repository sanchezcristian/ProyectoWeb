package comunidadIT.model;

public class Sell {

	private int cod;
	private int codUser;

	public Sell() {

	}

	public Sell(int cod, int codUser) {
		this.cod = cod;
		this.codUser = codUser;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public int getCodUser() {
		return codUser;
	}

	public void setCodUser(int codUser) {
		this.codUser = codUser;
	}

}
