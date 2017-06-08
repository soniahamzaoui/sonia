package fr.humanbooster.englishbattlejsf.serviceImpl;

import java.util.ArrayList;
import java.util.List;


import fr.humanbooster.englishbattlejsf.business.Joueur;
import fr.humanbooster.englishbattlejsf.service.JoueurService;

public class JouerServceImpl implements JoueurService {

	
	
	public static int count = 0;

	private static List<Joueur> ListeJoueurs = new ArrayList<>();
	
	public JouerServceImpl() {
		super();
		ListeJoueurs.add(new Joueur ("dsingou@humanbooster.com", "davier", "davier", "1234"));
	}
	
	
	

	@Override
	public Joueur ajouteJoueur(Joueur joueur) {
		ListeJoueurs.add(joueur);
		return joueur;
	}

	@Override
	public Joueur recupereJoueurParId(int idJoueur) {
		for (Joueur Joueur : ListeJoueurs) {
			if (Joueur.getIdJoueur() == idJoueur)
				return Joueur;
		}
		return null;// TODO Auto-generated method stub
		
	}

	@Override
	public Joueur ajouteJoueur(String email, String nom, String prenom, String motDePasse) {
		// On cree un objet Joueur
		Joueur joueur = new Joueur();
		joueur.setNom(nom);
		joueur.setMotDePasse(motDePasse);
		joueur.setPrenom(prenom);
		joueur.setEmail(email);
		count++;
		joueur.setIdJoueur(count);
		
	
		
		// On ajoute l'objet joeur a la collection 
		
		ListeJoueurs.add(joueur);
		
		return joueur;
	}

	@Override
	public Joueur recupereJoueurParEmailEtMotDePasse(String email, String motDePasse) {
		for (Joueur joueur : ListeJoueurs) {
			if (joueur.getEmail().equals(email) && joueur.getMotDePasse().equals(motDePasse))
				return joueur;
		}
		return null;
	}

	@Override
	public List<Joueur> recupereJoueurs() {
		// TODO Auto-generated method stub
		return ListeJoueurs;
	}



}
