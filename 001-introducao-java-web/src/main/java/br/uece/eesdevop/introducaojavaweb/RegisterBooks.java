package br.uece.eesdevop.introducaojavaweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.uece.eesdevop.introducaojavaweb.dao.Banco;

/**
 * Servlet implementation class RegisterBooks
 */
@WebServlet("/registerBooks")
public class RegisterBooks extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando livros");
		String titulo = request.getParameter("title");
		String autor = request.getParameter("author");
		String ano = request.getParameter("launchYear");
		
		Book book = new Book(titulo, autor, ano);
		
		Banco banco = new Banco();
		banco.adiciona(book);
		
		response.sendRedirect("listbooks.jsp");
		
//	    RequestDispatcher rd = request.getRequestDispatcher("/listbooks.jsp");
//	    rd.forward(request, response);
	}

}
