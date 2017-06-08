package fr.humanbooster.englishbattlejsf.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import fr.humanbooster.englishbattlejsf.business.Verbe;
import fr.humanbooster.englishbattlejsf.service.VerbeService;

public class VerbeServiceImpl implements VerbeService {

	static Random random = new Random();

	public static List<Verbe> maListe = new ArrayList<>();

	@Override
	public List<Verbe> obtenirTousLesVerbes() {

		maListe.add(new Verbe("bear", "bore", "born"));
		maListe.add(new Verbe("become", "became", "become"));
		maListe.add(new Verbe("break", "broke", "broken"));
		maListe.add(new Verbe("breed", "bred", "bred"));
		maListe.add(new Verbe("cast", "cast", "cast"));
		maListe.add(new Verbe("cling", "clung", "clung"));
		maListe.add(new Verbe("drive", "drove", "driven"));
		maListe.add(new Verbe("find", "found", "found"));
		maListe.add(new Verbe("go", "went", "gone"));
		maListe.add(new Verbe("hear", "heard", "heard"));

		return maListe;
	}

	@Override
	public Verbe recupereVerbe() {
		maListe.add(new Verbe("bear", "bore", "born"));
		maListe.add(new Verbe("become", "became", "become"));
		maListe.add(new Verbe("break", "broke", "broken"));
		maListe.add(new Verbe("breed", "bred", "bred"));
		maListe.add(new Verbe("cast", "cast", "cast"));
		maListe.add(new Verbe("cling", "clung", "clung"));
		maListe.add(new Verbe("drive", "drove", "driven"));
		maListe.add(new Verbe("find", "found", "found"));
		maListe.add(new Verbe("go", "went", "gone"));
		maListe.add(new Verbe("hear", "heard", "heard"));
		
		// je retourne ma liste et je passe en paramètre de ma liste
		// l'objet random.nextInt(la taille de ma liste soit maListe.size()
		return maListe.get(random.nextInt(maListe.size()));
	}

	
	
	
	
	
	public static void main(String[] args) {
		
		VerbeService vs = new VerbeServiceImpl();
		System.out.println(vs.recupereVerbe());
	}

}
