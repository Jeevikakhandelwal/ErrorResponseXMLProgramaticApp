

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Setting MIME Type
		response.setContentType("text/html");
		
		//Getting PrintWriter Stream to write response object
		PrintWriter out= response.getWriter();
		
		//Collecting REquest Pararameter data from request Object
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		out.println("<html><head><titel>Response</tite></head>");
		out.println("<body>");
		
		if(username.equalsIgnoreCase(username) && password.equals(password)) {
			out.println("<h1 style='color:green; text-align:center;'>Hello user, Authontication sucessfull, Get all the benifits</h1>");
		}else {
			response.sendError(410);
		}
		out.println("</body></html>");
		//Closing stream
		out.println();
	}

}
