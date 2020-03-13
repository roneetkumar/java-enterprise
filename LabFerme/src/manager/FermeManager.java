package manager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entities.Ferme;
import services.ConnectionBDD;

public class FermeManager {

	private static final String queryGetAll = "select ferme_id, nom_ferme, pays, (select name from Fermier as fi where fi.fermier_id = fe.fermier_id  ) as fermierNom from Ferme as fe";
	private static final String queryGetPays = "select distinct pays from Ferme"; 
	private static final String queryGetByFermierId = "select ferme_id, nom_ferme, pays, (select name from Fermier as fi where fi.fermier_id = fe.fermier_id  ) as fermierNom from Ferme as fe where fe.fermier_id = ?";
	private static final String queryGetByPays = "select ferme_id, nom_ferme, pays, (select name from Fermier as fi where fi.fermier_id = fe.fermier_id  ) as fermierNom from Ferme as fe where fe.pays like ?";
	
	public static ArrayList<Ferme> getAll() {
		ArrayList<Ferme> retour = null;

		try {
			PreparedStatement ps = ConnectionBDD.getPs(queryGetAll);
			ResultSet result = ps.executeQuery();

			if (result.isBeforeFirst())
				retour = new ArrayList<>();

			while (result.next()) {
				retour.add(new Ferme(result.getInt("ferme_id"), result.getString("nom_ferme"), result.getString("pays"),
						result.getString("fermierNom")));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retour;
	}
	
	public static ArrayList<String> getPays() {
		ArrayList<String> retour = null;

		try {
			PreparedStatement ps = ConnectionBDD.getPs(queryGetPays);
			ResultSet result = ps.executeQuery();

			if (result.isBeforeFirst())
				retour = new ArrayList<>();

			while (result.next()) {
				retour.add(result.getString("pays"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retour;
	}
	
	public static ArrayList<Ferme> getByIdFermier(int id) {
		ArrayList<Ferme> retour = null;

		try {
			PreparedStatement ps = ConnectionBDD.getPs(queryGetByFermierId);
			ps.setInt(1, id);
			ResultSet result = ps.executeQuery();

			if (result.isBeforeFirst())
				retour = new ArrayList<>();

			while (result.next()) {
				retour.add(new Ferme(result.getInt("ferme_id"), result.getString("nom_ferme"), result.getString("pays"),
						result.getString("fermierNom")));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retour;
	}
	
	public static ArrayList<Ferme> getByPqys(String pays) {
		ArrayList<Ferme> retour = null;

		try {
			PreparedStatement ps = ConnectionBDD.getPs(queryGetByPays);
			ps.setString(1, pays);
			ResultSet result = ps.executeQuery();

			if (result.isBeforeFirst())
				retour = new ArrayList<>();

			while (result.next()) {
				retour.add(new Ferme(result.getInt("ferme_id"), result.getString("nom_ferme"), result.getString("pays"),
				result.getString("fermierNom")));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retour;
	}
}
