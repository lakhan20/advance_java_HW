package comp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Servlet implementation class SendRedirectHW
 */
@WebServlet("/sendRedirectHW")
public class SendRedirectHW extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/*
	 * public void init(ServletConfig config) throws ServletException {
	 * 
	 * 
	 * }
	 */

	/*
	 * public SendRedirectHW() { ArrayList<String> p = new ArrayList<String>(); }
	 */

	static ArrayList<String> p = null;

	public static ArrayList getInstance(ArrayList p) {

		ArrayList<String> p2 = new ArrayList<String>();
		if (p == null)
			p = new ArrayList<String>();

		return p;
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String pName = request.getParameter("txtpName");
		p = getInstance(p);

		if (p.size() != 10) {
			if (p.size() != 10) {
				p.add(pName);
				response.sendRedirect("sendredirect.html");
			}
			System.out.println(pName + "--" + p.indexOf(pName));
		}

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		out.print("<html> <head> <title> send redirect </title></head><body>");
		out.print("<h1>");
		for (String a : p) {
			out.print(a + "<br>");
		}

		out.print("</h1>");
		out.print("</body></html>");
		out.close();
	}

}
