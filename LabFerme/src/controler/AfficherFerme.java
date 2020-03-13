package controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.FermeAction;

/**
 * Servlet implementation class AfficherFerme
 */
@WebServlet("/afficherFerme")
public class AfficherFerme extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AfficherFerme() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		FermeAction.displayAll(request);
		
		request.getRequestDispatcher("afficherFerme.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pays = request.getParameter("pays");
		String fermierId = request.getParameter("fermier");
		
		FermeAction.displayFermeByKey(request, fermierId, pays);
		request.getRequestDispatcher("afficherFerme.jsp").forward(request, response);
		
	}

}
