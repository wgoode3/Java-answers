<!DOCTYPE html>
<html>
<head>
	<title>Lookify</title>
	<meta charset="UTF-8">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <style>
        form {
            display: inline;
        }
    </style>
</head>
<body>
    <h1>${song.title}</h1>

    <iframe width="560" height="315" src="https://www.youtube.com/embed/${yt_id}" frameborder="0" allow="autoplay; encrypted-media" allowfullscreen></iframe>

    <fieldset>
            <legend>Edit Song</legend>
                <form:form method="POST" action="/song/${song.id}/update" modelAttribute="song">
                    <form:label path="title">Title
                    <form:input path="title" placeholder="title"/>
                    <form:errors path="title"/></form:label><br>
                    
                    <form:label path="artist">Artist
                    <form:input path="artist" placeholder="artist"/>
                    <form:errors path="artist"/></form:label><br>
                    
                    <form:label path="url">Url
                    <form:input path="url" placeholder="url"/>
                    <form:errors path="url"/></form:label><br>
    
                    <form:label path="rating">Rating
                        <form:select path="rating">
                            <c:forEach items="${stars}" var="star" varStatus="loop">
                                <form:option value="${5-loop.index}">${star}</form:option>
                            </c:forEach>
                        </form:select>
                    <form:errors path="rating"/></form:label><br>
                        
                    <input type="submit" value="Edit"/>
                </form:form>
                <a href="/"><button>Back</button></a>
                <form action="/song/${song.id}/delete" methods="post">
                    <input type="submit" value="Delete"/>
                </form>
        </fieldset>
    
</body>
</html>