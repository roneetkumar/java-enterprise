package manager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entities.Fermier;
import services.ConnectionBDD;

public class FermierManager {

	private static final String queryGetPays = "select * from Fermier"; 
	
	public static ArrayList<Fermier> getAll() {
		ArrayList<Fermier> retour = null;

		try {
			PreparedStatement ps = ConnectionBDD.getPs(queryGetPays);
			ResultSet result = ps.executeQuery();

			if (result.isBeforeFirst())
				retour = new ArrayList<>();

			while (result.next()) {
				retour.add(new Fermier(result.getInt("fermier_id"), result.getString("name")));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retour;
	}
	
}
