package fr.humanbooster.englishbattlejsf.service;

import java.util.List;

import fr.humanbooster.englishbattlejsf.business.Partie;
import fr.humanbooster.englishbattlejsf.business.Question;
import fr.humanbooster.englishbattlejsf.business.Verbe;

public interface QuestionService {
	
	
	
	public List<Question> ajouterListeQuestion();
	
	public Question ajouteQuestion(Partie partie , Verbe verbe);
	
	public boolean verifierQuestion(String baseVerbale, String preterit, String participePasse);
	


}
