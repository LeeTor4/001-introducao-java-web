package br.uece.eesdevop.introducaojavaweb;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.uece.eesdevop.introducaojavaweb.dao.Banco;

@WebServlet("/listBooks")
public class ListBooks extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
	
	    Banco banco = new Banco();
	    List<Book> lista =  banco.getLista();
	
	    PrintWriter out = response.getWriter();
	    
	    out.println("<html><body>");
	    out.println("<ul>");
	    for (Book book : lista) {
		    	
	    	 out.println("<li>" + book.getTitle() + "</li>");
		} 
	    
	    out.println("</ul>");
	    out.println("</body></html>");
	}

}
