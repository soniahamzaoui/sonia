package fr.humanbooster.englishbattlejsf.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.humanbooster.englishbattlejsf.business.Joueur;
import fr.humanbooster.englishbattlejsf.service.JoueurService;
import fr.humanbooster.englishbattlejsf.serviceImpl.JouerServceImpl;

/**
 * Servlet implementation class InscriptionServlet
 */
@WebServlet("/InscriptionServlet")
public class InscriptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	private JoueurService js;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InscriptionServlet() {
    	super();
    	js = new JouerServceImpl();
        
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nom = request.getParameter("NOM");
		String prenom = request.getParameter("PRENOM");
		String email = request.getParameter("EMAIL");
		String motDePasse = request.getParameter("MOT_DE_PASSE");
		Joueur joueur1 = js.ajouteJoueur(email, nom, prenom, motDePasse);
		
		System.out.println(joueur1);
		request.setAttribute("joueur1", joueur1);
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
		
	}

}
