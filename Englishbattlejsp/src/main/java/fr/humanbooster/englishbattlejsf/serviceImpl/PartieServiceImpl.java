package fr.humanbooster.englishbattlejsf.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import fr.humanbooster.englishbattlejsf.business.Joueur;
import fr.humanbooster.englishbattlejsf.business.Partie;
import fr.humanbooster.englishbattlejsf.service.PartieService;

public class PartieServiceImpl implements PartieService {

	private List<Partie> maListe2 = new ArrayList<Partie>();

	@Override
	public Partie ajoutePartie(Partie partie) {

		this.maListe2.add(partie);

		return partie;
	}

	@Override
	public Partie recuperePartie(Partie partie) {
		for (Partie partie1 : maListe2) {
			if (partie.equals(partie))
				return partie1;
		}
		return null;
	}

	@Override
	public List<Partie> recupererParties() {
		// TODO Auto-generated method stub
		return maListe2;
	}

}
