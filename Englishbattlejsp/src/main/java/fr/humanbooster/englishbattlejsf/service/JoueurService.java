package fr.humanbooster.englishbattlejsf.service;



import java.util.List;


import fr.humanbooster.englishbattlejsf.business.Joueur;

public interface JoueurService {
	
	public Joueur ajouteJoueur(Joueur joueur);
	public Joueur recupereJoueurParId(int idJoueur);
	public Joueur ajouteJoueur(String email, String nom, String prenom, String motDePasse);
	public Joueur recupereJoueurParEmailEtMotDePasse(String email, String motDePasse);
	public List<Joueur> recupereJoueurs();
	

}
