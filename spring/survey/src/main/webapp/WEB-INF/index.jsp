<!DOCTYPE html>
<html>
<head>
        <title>Dojo Survey</title>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
	<fieldset>
		<legend>Dojo Survey</legend>
		<form action="/process" method="POST">
			Name: <input type="text" name="name" placeholder="name"/><br>
			Location: <select name="location">
				<option>Seattle</option>
				<option>San Jose</option>
				<option>Los Angeles</option>
				<option>Dallas</option>
				<option>Chicago</option>
				<option>Washington DC</option>
			</select><br>
			Language: <select name="language">
				<option>Python</option>
				<option>PHP</option>
				<option>JavaScript</option>
				<option>C#</option>
				<option>Ruby</option>
				<option>Java</option>
			</select><br>
			Comment (optional):<br><textarea name="comment" placeholder="comment"></textarea><br>
			<input type="submit" value="Submit"/>
		</form>
	</fieldset>
</body>