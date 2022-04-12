<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MVC Spring-Boot</title>
</head>
<body>
	Welcome to Spring ORM.
	<hr>	
	<br>
	<form action="addCoderInfo" method="post">
		Enter cid: <input type="text" name="cid" required><br><br>
		Enter name: <input type="text" name="cname" required><br><br>
		<input type="submit" value="Add Coder Info">
	</form>
	
	<hr>
	<form action="getCoderInfo" method="get">
	<input type="submit" value="Get Coder Info from Database">
	</form>
	<br>
	<hr>
	
	<form action="displaySelectedRowByCid" method="post">
		Enter cid: <input type="text" name="cid" required><br><br>
		<input type="submit" value="Find Coder by Coder-ID">
	</form>
	

</body>
</html>