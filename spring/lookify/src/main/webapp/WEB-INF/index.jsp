<!DOCTYPE html>
<html>
<head>
	<title>Lookify</title>
	<meta charset="UTF-8">
	<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>       
</head>
<body>
    <h1>Lookify</h1>
    
    <fieldset>
    	<legend>Search by Artist</legend>
	    <form action="/" method="get">
	    	<% if(request.getParameter("q") != null) { %>
	    		<input type="text" name="q" placeholder="artist" value='<%= request.getParameter("q") %>'>
	    	<% } else { %>
	    		<input type="text" name="q" placeholder="artist">
	    	<% } %>
	    	<button type="submit">Search</button>
	    </form>
    </fieldset>
    
    <fieldset>
    	<legend>New Song</legend>
	    	<form:form method="POST" action="/song/new" modelAttribute="song">
			    <form:label path="title">Title
			    <form:input path="title" placeholder="title"/>
			    <form:errors path="title"/></form:label><br>
			    
			    <form:label path="artist">Artist
			    <form:input path="artist" placeholder="artist"/>
			    <form:errors path="artist"/></form:label><br>
			    
			    <form:label path="rating">Rating
			    <form:input type="number" min="1" max="10" path="rating"/>
			    <form:errors path="rating"/></form:label><br>
			    
			    <!-- This does not display correctly for some reason -->
			    <!-- Rating <select>
			    	<option value="5">★★★★★</option>
			    	<option value="4">★★★★☆</option>
			    	<option value="3" selected>★★★☆☆</option>
			    	<option value="2">★★☆☆☆</option>
			    	<option value="1">★☆☆☆☆</option>
			    </select><br> -->
		    	    
			    <input type="submit" value="Submit"/>
			</form:form>
    </fieldset>
    
    <fieldset>
    	<legend>Songs</legend>
    	<table border=1>
    		<tr>
    			<td>Title</td>
    			<td>Artist</td>
    			<td>Rating</td>
    		</tr>	
	    	<c:forEach items="${songs}" var="song">
	    		<tr>
	    			<td><c:out value="${song.title}"></c:out></td>
	    			<td><c:out value="${song.artist}"></c:out></td>
	    			<td><c:out value="${song.rating}"></c:out></td>
	    		</tr>
	    	</c:forEach>
    	</table>
    </fieldset>
    
    <fieldset>
    	<legend>Top 10</legend>
    	<table border=1>
    		<tr>
    			<td>Title</td>
    			<td>Artist</td>
    			<td>Rating</td>
    		</tr>	
	    	<c:forEach items="${top10}" var="song">
	    		<tr>
	    			<td><c:out value="${song.title}"></c:out></td>
	    			<td><c:out value="${song.artist}"></c:out></td>
	    			<td><c:out value="${song.rating}"></c:out></td>
	    		</tr>
	    	</c:forEach>
    	</table>
    </fieldset>
    
</body>
</html>