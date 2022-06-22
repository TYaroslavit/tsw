package Model;

import java.sql.SQLException;
import java.util.Collection;

public interface GameModel {
	public void doSave ( GameCard game) throws SQLException;
	
	public boolean doDelete(int id) throws SQLException;
	
	public GameCard doRetrieveByKey (int id) throws SQLException;
	
	public GameCard doRetrieveByNome (String nome) throws SQLException;
	
	public Collection<GameCard> doRetrieveAll(String order) throws SQLException;
}
