package fr.humanbooster.englishbattlejsf.business;

public class Joueur {
	


	private int idJoueur;
	private String email;
	private String nom;
	private String prenom;
	private String motDePasse;
	
	public Joueur(String email, String nom, String prenom, String motDePasse) {
		super();
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
		this.motDePasse = motDePasse;
	}
	public Joueur(){
		
	}
	
	public Joueur(int idJoueur, String email, String nom, String prenom, String motDePasse) {
		super();
		this.idJoueur = idJoueur;
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
		this.motDePasse = motDePasse;
	}
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

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

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public int getIdJoueur() {
		return idJoueur;
	}

	public void setIdJoueur(int idJoueur) {
		this.idJoueur = idJoueur;
	}

	@Override
	public String toString() {
		return "Joueur [idJoueur=" + idJoueur + ", email=" + email + ", nom=" + nom + ", prenom=" + prenom
				+ ", motDePasse=" + motDePasse + "]";
	}

	
	
}
