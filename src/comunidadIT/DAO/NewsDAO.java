package comunidadIT.DAO;

import comunidadIT.model.News;

public class NewsDAO {

	private ConnectionDB connDB = new ConnectionDB();

	public void add(News news) {
		String consul = "INSERT INTO news (name, description) " + "VALUES (" + news.getTitle() + "; "
				+ news.getDescription() + ")";
		connDB.setQuery(consul);
	}

}
