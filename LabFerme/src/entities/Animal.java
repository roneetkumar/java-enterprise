package entities;

public class Animal {
private int id;
private String nom;
private String type;
private double prix;
private ContaminationType contamination;

public Animal() {
	// TODO Auto-generated constructor stub
}

public Animal(int id, String nom, String type, double prix) {
	super();
	this.id = id;
	this.nom = nom;
	this.type = type;
	this.prix = prix;
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
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}



}
