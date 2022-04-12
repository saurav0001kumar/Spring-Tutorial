<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MVC Spring</title>
</head>
<body>
	Welcome to Java-Spring World.
	<hr>
	<form action="add" method="get">
		Enter 1st Number: <input type="text" name="num1" required><br><br>
		Enter 2nd Number: <input type="text" name="num2" required><br><br>
		<input type="submit" value="Calulate Sum">
	</form>
	
		<hr><br>
	<form action="addCoderInfo" method="post">
		Enter cid: <input type="text" name="cid" required><br><br>
		Enter name: <input type="text" name="cname" required><br><br>
		<input type="submit" value="Add Coder Info">
	</form>

</body>
</html>