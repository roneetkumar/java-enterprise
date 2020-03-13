package action;

import javax.servlet.http.HttpServletRequest;

import manager.AnimalManager;

public class AnimalAction {

	public static void afficherAnimalParFerme(HttpServletRequest req, int idFerme){
		req.setAttribute("listeAnimals", AnimalManager.getByIdFermer(idFerme));
		
	} 
	
}
