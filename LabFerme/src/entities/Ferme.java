package entities;

public class Ferme {
	private int id;
	private String nom;
	private String pays;
	private String fermierNom;
	
	public Ferme() {
		// TODO Auto-generated constructor stub
	}	
	
	public Ferme(int id, String nom, String pays, String fermierNom) {
		super();
		this.id = id;
		this.nom = nom;
		this.pays = pays;
		this.fermierNom = fermierNom;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getFermierNom() {
		return fermierNom;
	}

	public void setFermierNom(String fermierNom) {
		this.fermierNom = fermierNom;
	}
	
	
	
}
