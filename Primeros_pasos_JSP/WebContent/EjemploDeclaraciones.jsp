<html>

<body>

	<h1 style="text-alinge:center"> Ejemplo declaraciones</h1>
	
	
	<%!
	
	private int resultado;
	
	public int metodoSuma(int num1, int num2){
		
		resultado=num1+num2;
		
		return resultado;
	}
	
	public int metodoResta(int num1, int num2){
		
		resultado=num1-num2;
		
		return resultado;
	}
	
	public int metodoMultiplica(int num1, int num2){
		
		resultado=num1*num2;
		
		return resultado;
	}
	
	
	%>
	
	
	el resultado de la suma es: <%= metodoSuma(5,7) %>
	
	<br>
	
		el resultado de la resta es: <%= metodoResta(5,7) %>
	
	<br>
	
		el resultado de la multiplicacion es: <%= metodoMultiplica(5,7) %>
	
	<br>
	

</body>

</html>