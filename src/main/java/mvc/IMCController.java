package mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/mvc/maior-menor-mvc")
public class MaiorMenorController extends HttpServlet {
	@Override
	protected void doGet(
			HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
            
                //Obter os parâmetros da requisicao
                String pesoString = request.getParameter("peso");
                String alturaString = request.getParameter("altura");
                String sexo = request.getParameter("sexo");
                float peso = pesoString == null ? 0 : Float.parseFloat(pesoString);
                float altura = alturaString == null ? 0 : Float.parseFloat(alturaString);

		//Obt�m os par�metros da requisi��o.
		String idadeString = request.getParameter("idade");
		int idade = idadeString == null ? 0 : Integer.parseInt(idadeString);
                
                //Executa a regra de negocio
                String resultado = MaiorMenorModel.resultado(MaiorMenorModel.calcularImc(peso, altura), sexo);
		
		//Executa a regra de neg�cio.
                
		/*String resultado =
				MaiorMenorModel.descricaoDaMaioridade(idade);*/
		
		//Chama a view.
		//Mandar mensagem para o JSP mostrar.
		request.setAttribute("resultado", resultado);
		request.getRequestDispatcher("MaiorMenorView.jsp").forward(request, response);
	}
}
