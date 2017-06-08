package fr.humanbooster.englishbattlejsf.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import fr.humanbooster.englishbattlejsf.business.Partie;
import fr.humanbooster.englishbattlejsf.business.Question;
import fr.humanbooster.englishbattlejsf.business.Verbe;
import fr.humanbooster.englishbattlejsf.service.QuestionService;
import fr.humanbooster.englishbattlejsf.service.VerbeService;

public class QuestionServiceImpl implements QuestionService {

	public List<Question> maListe1 = new ArrayList<>();

	VerbeService verbeo = new VerbeServiceImpl();

	@Override
	public Question ajouteQuestion(Partie partie, Verbe verbe) {

		Question question1 = new Question(partie, verbe);
		this.maListe1.add(question1);
		return question1;
	}

	@Override
	public List<Question> ajouterListeQuestion() {
		return this.maListe1;
	}

	@Override
	public boolean verifierQuestion(String baseVerbale, String preterit, String participePasse) {
		return verbeo.obtenirTousLesVerbes().contains(new Verbe(baseVerbale, preterit, participePasse));

	}
	
	
	
	
	public static void main(String[] args) {
		
		QuestionService qs = new QuestionServiceImpl();
		
		Partie p1 = new Partie();
		Verbe vs = new Verbe("bear", "bore", "born");
		
		System.out.println(qs.ajouteQuestion(p1, vs));
	}

}
