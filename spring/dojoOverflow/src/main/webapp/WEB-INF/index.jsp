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
		
		<fieldset>
			<legend>All Questions</legend>
			<table border=1>
				<tr>
					<th>Question</th>
					<th>Tags</th>
				</tr>
				<c:forEach items="${questions}" var="question">		
					<tr>
						<td><a href="/question/${question.id}">${question.question}</a></td>
						<td><c:forEach items="${question.getTags()}" var="tag" varStatus="loop">
							${tag.subject}<c:if test="${loop.index+1 < question.getTags().size()}">,</c:if>
						</c:forEach></td>
					</tr>
				</c:forEach>
			</table>
		</fieldset>
		
		<p><a href="/question/new"><button>Ask a question</button></a></p>
	</div>
	
</body>
</html>