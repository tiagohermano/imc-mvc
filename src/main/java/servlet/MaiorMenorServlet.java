package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/servlet/maior-menor-servlet")
public class MaiorMenorServlet extends HttpServlet {

	@Override
	protected void doGet(
			HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {

		resp.getOutputStream().print("<html>");
		resp.getOutputStream().print("<head>");
		resp.getOutputStream().print("	<title>Cálculo Maior/Menor - Servlet</title>");
		resp.getOutputStream().print("</head>");
		resp.getOutputStream().print("<body>");
		resp.getOutputStream().print("<h2>Cálculo Maior/Menor - Servlet</h2>");
		resp.getOutputStream().print("<form>");
		resp.getOutputStream().print("	Idade <input type=\"number\" name=\"idade\">");
		resp.getOutputStream().print("	<button>Calcular</button>");
		resp.getOutputStream().print("</form>");
		resp.getOutputStream().print("<h3>");

		String idadeString = req.getParameter("idade");
		int idade = idadeString == null ? 0 : Integer.parseInt(idadeString);
		if (idade != 0) {
			if (idade >= 18) {
				resp.getOutputStream().print("De maior mano!");			
			} else {
				resp.getOutputStream().print("De menor mano!");			
			}
		} 
		resp.getOutputStream().print("</h3>");
		resp.getOutputStream().print("</body>");
        resp.getOutputStream().print("</html>");

	}

}
