<!DOCTYPE html>
<html>
<head>
        <title>Dojo Survey</title>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
	<fieldset>
		<legend>Survey Result</legend>
		<p>Name: <%= session.getAttribute("name") %></p>
		<p>Location: <%= session.getAttribute("location") %></p>
		<p>Language: <%= session.getAttribute("language") %></p>
		<p>Comment: <%= session.getAttribute("comment") %></p>
		<a href="/">Back</a>
	</fieldset>
</body>