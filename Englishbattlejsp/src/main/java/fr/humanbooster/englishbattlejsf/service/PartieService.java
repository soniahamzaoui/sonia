package fr.humanbooster.englishbattlejsf.service;


import java.util.List;

import fr.humanbooster.englishbattlejsf.business.Partie;

public interface PartieService {
	
	public Partie ajoutePartie(Partie partie);
	public Partie recuperePartie(Partie partie);
	public List<Partie> recupererParties();

}
