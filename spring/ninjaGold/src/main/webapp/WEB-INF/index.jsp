<!DOCTYPE html>
<html>
<head>
        <title>Ninja Gold</title>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
        <%@ page import="java.util.*" %>
</head>
<body>
	<fieldset>
		<legend>Gold</legend>
		<p><%= session.getAttribute("gold") %></p>
		<a href="/reset">Reset</a>
	</fieldset>
	<fieldset>
		<legend>Farm</legend>
		<form action="/rpg/farm" method="POST">
			<input type="submit" value="Farm"/>
		</form>
	</fieldset>
	<fieldset>
		<legend>Cave</legend>
		<form action="/rpg/cave" method="POST">
			<input type="submit" value="Cave"/>
		</form>
	</fieldset>
	<fieldset>
		<legend>House</legend>
		<form action="/rpg/house" method="POST">
			<input type="submit" value="House"/>
		</form>
	</fieldset>
	<fieldset>
		<legend>Casino</legend>
		<form action="/rpg/casino" method="POST">
			<input type="submit" value="Casino"/>
		</form>
	</fieldset>
	<fieldset>
		<legend>Activities</legend>
		<% ArrayList<String> activities = (ArrayList<String>) session.getAttribute("activities"); %>
		<% for(int i = 0; i < activities.size(); i++){ %>
			<% if(activities.get(i).substring(25, 29).equals("lost")){ %>
				<p style="color: red;"><%= activities.get(i) %></p>
			<% } else { %>
				<p style="color: green;"><%= activities.get(i) %></p>
			<% } %>
		<% } %>
	</fieldset>
</body>