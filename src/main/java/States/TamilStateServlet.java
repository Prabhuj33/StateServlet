package States;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TamilStateServlet  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String color=req.getParameter("color");
		
		
		ServletContext con=getServletContext();
		String cgst=con.getInitParameter("cgst");
	
		int cgst1=Integer.parseInt(cgst);
		
		
		System.out.println("The Tamilnadu cgst price is::"+cgst1);
		
		
	  ServletConfig conf=getServletConfig();
	  String sgsttn=conf.getInitParameter("sgsttn");
	  double sgsttn1=Double.parseDouble(sgsttn);
		
	  System.out.println("Tamil nadu state SGST value is::"+sgsttn);
	  	
		
		
	}

	
}
