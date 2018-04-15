<!DOCTYPE html>
<html>
<head>
	<title>Hello World!</title>
	<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
	<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>     
</head>
<body>
	
	<h1>Hello <c:out value="${test}"/>!</h1>
	
	<% if(session.getAttribute("name") != null) { %>
		<h4>Welcome back <%= session.getAttribute("name") %></h4>
	<% } %>
	
	<p><c:out value="${msg}"/></p>
	
	<p>You have viewed this page <%= session.getAttribute("count") %> time(s) <a href="/reset">[reset]</a></p>
	<p>Retrieving <%= request.getAttribute("test") %></p>
	
	<p>Date: <fmt:formatDate pattern = "EEEE', the' dd 'of' MMMM',' yyyy" value ="${date}"/></p>
	<p>Time: <fmt:formatDate pattern = "h:mm:ss a" value ="${date}"/></p>
	
	<form action="/survey" method="post">
		<input type="text" name="name" placeholde="name"/>
		<button type="submit">Submit</button>
	</form>
	
</body>
</html>