<!DOCTYPE html>
<html>
<head>
	<title>Dojo Overflow</title>
	<meta charset="UTF-8">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<link type="text/css" rel="stylesheet" href="/css/style.css">
</head>
<body>

	<div class="container">
		<h1>Dojo Overflow</h1>
		
		<fieldset class="col">
			<legend>New Question</legend>
			<form action="/question" method="post" style="display:inline;">
				<p>
					<span style="display:block;">Question:</span>
					<textarea name="question" rows=8 cols=60></textarea>
				</p>
				<p>
					<span style="display:block;">Tags:</span>
					<textarea name="tags" rows=1 cols=60></textarea>
				</p>
				<button type="submit">Submit Question</button>
			</form>
			<a href="/"><button>Cancel</button></a>
		</fieldset>
		
		<ul class="col">
			<c:forEach items="${errors}" var="error">
				<li>${error}</li>
			</c:forEach>
		</ul>
		
	</div>
	
</body>
</html>