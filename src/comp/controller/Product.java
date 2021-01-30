package comp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Jan4Hw
 */
@WebServlet("/jan4hw")
public class Product extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String productname = request.getParameter("txtProductName");
		String productPrice = request.getParameter("txtProductPrice");
		int pPrice = 0;

		if (productPrice != null && !productPrice.equals("")) {
			pPrice = Integer.parseInt(productPrice);

		}

		String productQty = request.getParameter("txtProductQty");
		int pQty = 0;

		if (productQty != null && !productQty.equals("")) {
			pQty = Integer.parseInt(productQty);

		}

		String category= request.getParameter("rdoCategort");
		
		
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		
		out.print("<html> <head> <title> bill </title> <body>");
		out.print("<table border = "+"5px"+ " border-color="+"green"+">");
	
		out.print("<tr> <td> <font color="+"green"+">Product Name : </font></td> <td> "+productname+"</td></tr> ");
		
		out.print("<tr> <td> <font color="+"green"+">Product price : </font></td> <td color="+"red"+"> "+productPrice+"</td></tr> ");
		out.print("</body></html>");
		out.print("<tr> <td> <font color="+"green"+">Product Qty : </font></td> <td> "+productQty+"</td></tr> ");
		out.print("<tr> <td> <font color="+"green"+">Product Category : </font></td> <td> "+category+"</td></tr> ");
		int total=pPrice*pQty;
		out.print("<tr> <td> <b style="+"color : red"+">Product Total : </b></td> <td><b style="+"color : blue"+" > "+total+"</b></td></tr> ");
		
		
	}

}
