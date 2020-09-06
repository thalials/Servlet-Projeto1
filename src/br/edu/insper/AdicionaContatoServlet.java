package br.edu.insper;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdicionaContatoServlet
 */
@WebServlet("/adicionaNome")
public class AdicionaContatoServlet extends HttpServlet {
	protected void service(HttpServletRequest request,
						HttpServletResponse response)
	throws IOException, ServletException {
		String nome = request.getParameter("nome");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("Nome: " + nome);
		out.println("</body>");
		out.println("</html>");
	}

}
