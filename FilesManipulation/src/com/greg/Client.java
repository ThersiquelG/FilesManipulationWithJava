package com.greg;

public class Client {
	String nom;
	String prenom;
	String reference;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public Client(String nom, String prenom, String reference) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.reference = reference;
	}
	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", reference=" + reference + "]";
	}
	
	
	
	

}
