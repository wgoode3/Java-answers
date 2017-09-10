<!DOCTYPE html>
<html>
<head>
        <title>The Code</title>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
	<fieldset>
		<legend>The Code</legend>
		<form action="/submitCode" method="POST">
			<input type="text" name="code" placeholder="code"/>
			<input type="submit" value="Casino"/>
		</form>
	</fieldset>
	<p style="color: red;"><c:out value="${error}"/></p>
</body>