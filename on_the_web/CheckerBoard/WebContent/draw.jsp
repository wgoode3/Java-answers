<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Demo JSP</title>
        <link rel='stylesheet' type='text/css' href='style.css'>
    </head>
<body>
    
    <% if(request.getParameter("width") != null && request.getParameter("height") != null){ %>
    	<% int width = Integer.parseInt(request.getParameter("width")); %>
    	<% int height = Integer.parseInt(request.getParameter("height")); %>

    	<h1>Checkerboard: <%= width %>w <%= height %>h</h1>

	    <% for (int h = 0, num = 0; h < height; h++, num++){ %>
    		<% for (int w = 0; w < width; w++, num++){ %>
    			<% if(num%2==0){ %>
	    			<div class="box red"></div>
	   			<% } else { %>
	   				<div class="box blue"></div>
		   		<% } %>
    		<% } %>
    		<br>
    	<% } %>
    <% } else { %>
    	<h1>Checkerboard</h1>
    <% } %>

</body>
</html>