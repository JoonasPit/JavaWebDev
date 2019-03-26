package helloWorld.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/tervesulle")
public class TerveSulleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public TerveSulleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String strUsername = request.getParameter("username");
		String strUserBirth = request.getParameter("userbirthyear");
		int userBirth = new Integer(strUserBirth);
		int userAge = 2018 - userBirth;
		response.getWriter().append("Hei sinä " + strUsername + " " + userAge +"! Olet kiva kaveri!");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
