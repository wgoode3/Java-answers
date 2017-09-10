<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Homepage</title>
</head>
<body>
	<h1>Pet Creation</h1>
	
	<fieldset>
	<legend>Dog</legend>
	<form action="dog" method="get">
		<input type="text" name="name" placeholder="name"><br>
		<input type="text" name="breed" placeholder="breed"><br>
		<input type="number" name="weight" placeholder="weight"><br>
		<input type="submit" value="New Dog">
	</form>
	</fieldset>
	
	<br>
	
	<fieldset>
	<legend>Cat</legend>
	<form action="cat" method="get">
		<input type="text" name="name" placeholder="name"><br>
		<input type="text" name="breed" placeholder="breed"><br>
		<input type="number" name="weight" placeholder="weight"><br>
		<input type="submit" value="New Cat">
	</form>
	</fieldset>
		
</body>
</html>