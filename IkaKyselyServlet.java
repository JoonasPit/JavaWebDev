package web1projekti.control;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ikakysely")
public class IkaKyselyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public IkaKyselyServlet() {
        super();
 
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String jsp = "/view/ikakysely.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(jsp);
		dispatcher.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName = request.getParameter("userName");
		String strUsrAge = request.getParameter("userAge");
		String ofAge = "";
		
		int usrAge = Integer.parseInt(strUsrAge);
		if(usrAge >= 18) {
			ofAge = "täysi-ikäinen";
		}
		else {
			ofAge = "alaikäinen";
		}
		
		request.setAttribute("username", userName);
		
		request.setAttribute("userage", strUsrAge);
		request.setAttribute("ofAge", ofAge);
		String jsp = "/view/ikatervehdys.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(jsp);
		dispatcher.forward(request, response);
	}

}
