package services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionBDD {
	private static final String url = "jdbc:mysql://localhost:3306/ferme_bd?useSSL=false";
	private static final String identifiant = "root";
	private static final String pwd = "qwerty.";
	private static Connection connection = null;

	private static void getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, identifiant, pwd);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void closeConnection() {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static PreparedStatement getPs(String query) {
		PreparedStatement retour = null;

		try {
			if (connection == null || connection.isClosed())
				getConnection();

			retour = connection.prepareStatement(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return retour;
	}

}
