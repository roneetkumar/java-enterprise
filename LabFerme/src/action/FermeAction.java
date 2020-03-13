package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import entities.Ferme;
import manager.FermeManager;
import manager.FermierManager;

public class FermeAction {
	
	public static void displayAll(HttpServletRequest req){		
		req.setAttribute("listFermes", FermeManager.getAll());
		req.setAttribute("listPays", FermeManager.getPays());
		req.setAttribute("listFermiers", FermierManager.getAll());
	}
	
	public static void displayFermeByKey(HttpServletRequest req, String fermier, String pays){
		req.setAttribute("listPays", FermeManager.getPays());
		req.setAttribute("listFermiers", FermierManager.getAll());
		ArrayList<Ferme> fermes = null;
		
		if(fermier != null)
			fermes = FermeManager.getByIdFermier(Integer.parseInt(fermier));
		if(pays != null)
			fermes = FermeManager.getByPqys(pays);
		
		
		req.setAttribute("listFermes", fermes);
	}
	
}
