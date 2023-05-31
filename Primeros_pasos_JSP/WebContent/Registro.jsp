<html>
<meta charset="UTF-8">
<body>

<h2> Usuario Registrados</h2>


Usuario confirmado:<br/> <br/>

Nombre: <%= request.getParameter("nombre") %> &nbsp; Apellido:<%= request.getParameter("apellido") %>

<br/><br/>

<jsp:include page="Fecha.jsp"></jsp:include>

</body>

</html>