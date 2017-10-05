<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
	<title>Cálculo Maior/Menor - JSP</title>
</head>
<body>
<h2>Cálculo Maior/Menor - JSP</h2>
<form>
	Idade <input type="number" name="idade">
	<button>Calcular</button>
</form>
<%
//Inicio do Scriptlet.
String idadeString = request.getParameter("idade");

int idade = idadeString == null ? 0 : Integer.parseInt(idadeString);

if (idade != 0) {
	if (idade < 18) {
%>
  <h3><%=idade%> é de menor! Mano.</h3>
<%		
	} else {
%>
  <h3><%out.print(idade);%> é de maior! Mano.</h3>
<%				
	}
}
%>
</body>
</html>
