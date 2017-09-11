<!DOCTYPE html>
<html>
<head>
        <title>Languages</title>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>       
</head>
<body>
	
	<h3>Languages</h3>

	<table border=1>
		<tr>
			<th>Name</th>
			<th>Creator</th>
			<th>Version</th>
			<th>Actions</th>
		</tr>
	<c:forEach items="${languages}" var="language" varStatus="loop">
	    <tr>    
	    <td><a href="/languages/${loop.index}"><c:out value="${language.name}"/></a></td>
	    <td><c:out value="${language.creator}"/></td>
	    <td><c:out value="${language.version}"/></td>
	    <td><a href="#">Edit</a><a href="#">Delete</a></td>
	    </tr>
	</c:forEach>
	</table>
	
	<br>
	
	<fieldset>
		<legend>Add a Language</legend>
		<form:form method="POST" action="/languages/new" modelAttribute="language">
		    <form:label path="name">Name
		    <form:input path="name"/></form:label>
		    <form:errors path="name"/><br>
		    
		    <form:label path="creator">Creator
		    <br><form:input path="creator"/></form:label>
		    <form:errors path="creator"/><br>
		    
		    <form:label path="version">Version
		    <form:input path="version"/></form:label>
		    <form:errors path="version"/><br>
		    
		    <input type="submit" value="Submit"/>
		</form:form>
	</fieldset>
	
</body>