package Model;

import java.sql.SQLException;
import java.util.Collection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.LinkedList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


public class GameModelDS implements GameModel{
	
	private static DataSource ds;

	static {
		try {
			Context initCtx = new InitialContext();
			Context envCtx = (Context) initCtx.lookup("java:comp/env");

			ds = (DataSource) envCtx.lookup("jdbc/storage");

		} catch (NamingException e) {
			System.out.println("Error:" + e.getMessage());
		}
	}

	private static final String TABLE_NAME = "product";
	@Override
	public void doSave(GameCard game) throws SQLException {
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		String insertSQL = "INSERT INTO " + GameModelDS.TABLE_NAME
				+ " (NAME, DESCRIPTION, PRICE, QUANTITY) VALUES (?, ?, ?, ?)";
		
		try {
			connection = ds.getConnection();
			preparedStatement = connection.prepareStatement(insertSQL);
			preparedStatement.setString(1, game.getNome());
			preparedStatement.setString(2, game.getDsc());
			preparedStatement.setFloat(3, game.getPrice());
			preparedStatement.setDate(4, (Date) game.dataRelease);

			preparedStatement.executeUpdate();

			connection.commit();
		} finally {
			try {
				if (preparedStatement != null)
					preparedStatement.close();
			} finally {
				if (connection != null)
					connection.close();
			}
		}
	}
		
	

	@Override
	public boolean doDelete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public GameCard doRetrieveByKey(int id) throws SQLException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		GameCard bean = new GameCard();

		String selectSQL = "SELECT * FROM " + GameModelDS.TABLE_NAME + " WHERE CODE = ?";

		try {
			connection = ds.getConnection();
			preparedStatement = connection.prepareStatement(selectSQL);
			preparedStatement.setInt(1, id);

			ResultSet rs = preparedStatement.executeQuery();

			/*
			 * while (rs.next()) { bean.set(rs.getInt("id"));
			 * bean.setName(rs.getString("NAME"));
			 * bean.setDescription(rs.getString("DESCRIPTION"));
			 * bean.setPrice(rs.getInt("PRICE")); bean.setQuantity(rs.getInt("Release")); }
			 */

		} finally {
			try {
				if (preparedStatement != null)
					preparedStatement.close();
			} finally {
				if (connection != null)
					connection.close();
			}
		}
		return bean;
	}

	@Override
	public Collection<GameCard> doRetrieveAll(String order) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GameCard doRetrieveByNome(String nome) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
