package States;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class KarnatakaStateServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String color=req.getParameter("color");
		
		
		ServletContext con=getServletContext();
		String cgst=con.getInitParameter("cgst");
		int cgst1=Integer.parseInt(cgst);
		
	   System.out.println("The Karnataka CGST IS ::"+cgst1);
	   
	   
	   ServletConfig conf=getServletConfig();
	   String sgstkar=conf.getInitParameter("sgstkar");
	   double sgstkar1=Double.parseDouble(sgstkar);
	   
	   System.out.println("The Kartaka Sgst value is::"+sgstkar);
	   
	  	}

	
}
