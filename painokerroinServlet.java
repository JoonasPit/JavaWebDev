package poststuff;
import java.text.DecimalFormat;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;


@WebServlet("/painokerroin")
public class painokerroinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public painokerroinServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String jsp = "/view/painokerroinlomake.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(jsp);
		dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String strWeight = request.getParameter("paino");
		double weight = Double.parseDouble(strWeight);
		String strHeight = request.getParameter("pituus");
		
		double height = Double.parseDouble(strHeight);
		double bmi = weight/(height*height);
		DecimalFormat f = new DecimalFormat("0.00");
		
		String strBmi = f.format(bmi);
		request.setAttribute("painokerroin", strBmi);
		String jsp ="/view/painokerroinraportti.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(jsp);	
		dispatcher.forward(request, response);
	}

}
