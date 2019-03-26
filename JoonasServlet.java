package helloWorld.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JoonasServlet
 */
@WebServlet("/Joonas")
public class JoonasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public JoonasServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("<h1>Tähän tulee ehkä pelin otsikko</h1>");
		response.getWriter().append("Tämä on placeholder tekstiä</br>");
		response.getWriter().append("Lisää tekstiä</br>");
		response.getWriter().append("Tekstiä");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
