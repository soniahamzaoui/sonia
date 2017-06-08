package fr.humanbooster.englishbattlejsf.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.humanbooster.englishbattlejsf.business.Joueur;
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
 * Servlet implementation class ConnectionServlet
 */
@WebServlet("/ConnexionServlet")
public class ConnexionServlet extends HttpServlet {

	private JoueurService js;
	private VerbeService verbe1;
	private QuestionService question1;
	private PartieService part1;

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ConnexionServlet() {
		super();

		js = new JouerServceImpl();
		part1 = new PartieServiceImpl();

		// TODO Auto-generated constructor stub
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
        //Je récupère le mot de passe et Email avec un request.getParamater dans ma jsp <form></form>
		System.out.println(request.getParameter("EMAIL"));
		System.out.println(request.getParameter("MOT_DE_PASSE"));
        //J'ajoute un nouveau Joeur en reprenant les paramètres de ma mon request.getParameter
		Joueur jojo = js.recupereJoueurParEmailEtMotDePasse(request.getParameter("EMAIL"),
				request.getParameter("MOT_DE_PASSE"));
		System.out.println(jojo);
		if (jojo != null) {

			request.setAttribute("jojo", jojo);

			request.getRequestDispatcher("humanbooster.jsp").forward(request, response);

		} else

		{

			response.sendRedirect("erreur.jsp");

		}

	}

}
