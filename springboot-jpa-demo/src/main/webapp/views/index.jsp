<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JPA Spring-Boot</title>
</head>
<body>
	Welcome to Java-Spring World.
	<hr>
	<form action="showCodersFromDB">
		<input type="submit" value="Show Coder Table">
	</form>
	
		<hr><br>
	<form action="addCoderInfo" method="post">
		Enter cid: <input type="text" name="cid" required><br><br>
		Enter name: <input type="text" name="cname" required><br><br>
		<input type="submit" value="Add Coder Info">
	</form>
	
		<hr><br>
	<form action="getById">
		Enter cid: <input type="text" name="cid" required><br><br>
		<input type="submit" value="Get Coder By Id">
	</form>
	
			<hr><br>
	<form action="getByNameOrderByIdDesc" method="post">
		Enter cname: <input type="text" name="cname" required><br><br>
		<input type="submit" value="Get Coder By Name Order By Id Desc (Query DSL)">
	</form>
	
			<hr><br>
	<form action="getByNameOrderByIdDescQueryAnnotation" method="post">
		Enter cname: <input type="text" name="cname" required><br><br>
		<input type="submit" value="Get Coder By Name Order By Id Desc (Query Annotation)">
	</form>

</body>
</html>