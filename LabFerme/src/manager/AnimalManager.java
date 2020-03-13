package manager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entities.Animal;
import entities.AnimalType;
import services.ConnectionBDD;

public class AnimalManager {
	
	private static final String queryGetById = "select * from Animal where ferme_id = ?"; 
	public static ArrayList<Animal> getByIdFermer(int id) {
		ArrayList<Animal> retour = null;

		try {
			PreparedStatement ps = ConnectionBDD.getPs(queryGetById);
			ps.setInt(1, id);
			ResultSet result = ps.executeQuery();

			if (result.isBeforeFirst())
				retour = new ArrayList<>();

			while (result.next()) {
				Animal a = new Animal();
				a.setId(result.getInt("animal_id"));
				a.setNom(result.getString("nom"));
				a.setPrix(result.getDouble("prix"));
				a.setType(result.getString("type"));
				
				retour.add(a);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retour;
	}
}
