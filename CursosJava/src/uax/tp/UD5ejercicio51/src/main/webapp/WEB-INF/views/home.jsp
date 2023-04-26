<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>

<head>
	<title>Ejercicio 5.1 - Calculadora JSP</title>
</head>
<body>
<h1>
	Calculadora JSP
</h1>
Inserte sus valores a continuación:
 
<form action="calculadora" method="POST">
<label>valor 1:</label><input name="value1" type="text" /></br>
<label>valor 2:</label><input name="value2" type="text" />
</br>
Operaciones:
</br>
<input name="suma" type="submit" value="+" />
<input name="resta" type="submit" value="-" />
</br>
<input name="division" type="submit" value="/" />
<input name="multiplicacion" type="submit" value="*" />
</br>
Resultado:
</br>
<input name="result" readonly="readonly" type="text" value="${result}" />
 
</form>
</body>
</html>
