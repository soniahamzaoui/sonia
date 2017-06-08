package fr.humanbooster.englishbattlejsf.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.humanbooster.englishbattlejsf.business.Joueur;
import fr.humanbooster.englishbattlejsf.business.Partie;
import fr.humanbooster.englishbattlejsf.business.Question;
import fr.humanbooster.englishbattlejsf.business.Verbe;
import fr.humanbooster.englishbattlejsf.service.JoueurService;
import fr.humanbooster.englishbattlejsf.service.PartieService;
import fr.humanbooster.englishbattlejsf.service.QuestionService;
import fr.humanbooster.englishbattlejsf.service.VerbeService;
import fr.humanbooster.englishbattlejsf.serviceImpl.JouerServceImpl;
import fr.humanbooster.englishbattlejsf.serviceImpl.PartieServiceImpl;
import fr.humanbooster.englishbattlejsf.serviceImpl.QuestionServiceImpl;
import fr.humanbooster.englishbattlejsf.serviceImpl.VerbeServiceImpl;

/**
 * Servlet implementation class PartieServlet
 */
@WebServlet("/PartieServlet")
public class PartieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private JoueurService utilisateur;
	private VerbeService verbe1;
	private QuestionService question1;
	private PartieService ps;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PartieServlet() {
		super();

		question1 = new QuestionServiceImpl();
		verbe1 = new VerbeServiceImpl();
		ps = new PartieServiceImpl();
		utilisateur = new JouerServceImpl();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Objet partie
		Partie partie = null;

		// Je récupère un verbe
		Verbe verbe = verbe = verbe1.recupereVerbe();
		// Je crée une nouvelle partie
		partie = ps.ajoutePartie(partie);

		// je set "le nom" pour l'objet dans ma JSP
		request.setAttribute("partie", partie);
		// je set le verbe sur ma JSP
		request.setAttribute("verbe", verbe);
	

		// création d'une nouvelle question qui comporte une partie et un verbe
		Question question = question1.ajouteQuestion(partie, verbe);
		
		// Je set la question sur ma JSP
		request.setAttribute("question", question);

		// Je recupère les paramètre de ma JSP dans mon <form></form>
		String preterit = request.getParameter("preterit");
		String participePasse = request.getParameter("participePasse");

		// Question question1 = question1.verifierQuestion(baseVerbale, toto,
		// tata);

		//1) Je n'arrive pas à récupérer le verbe
		//2)Comment je fais pour récupérer la base verbale qui est mans ma JSP
		//3) faire le comparatif pour générer un nouveau verbe
		//4)

	}

}
