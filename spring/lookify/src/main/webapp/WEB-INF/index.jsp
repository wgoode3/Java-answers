<!DOCTYPE html>
<html>
<head>
	<title>Lookify</title>
	<meta charset="UTF-8">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<style>
		table {
			font-family: arial, sans-serif;
			border-collapse: collapse;
			width: 100%;
		}
		
		td, th {
			border: 1px solid #ddd;
			text-align: left;
			padding: 8px;
		}
		
		tr:nth-child(even) {
			background-color: #ddd;
		}

		.tabs {
			list-style-type: none;
		}

		.tabs > li {
			display: inline;
		}

		button {
			padding: 3px;
			border-radius: 0px;
			border: 0px solid transparent;
			background-color: #36f;
			color: #fff; 
			cursor: pointer;
			margin: 5px;
		}

		.active {
			background-color: #999;
		}
	</style>       
</head>
<body>
	<h1>Lookify</h1>

	<ul class="tabs">
		<li><button data-toggle="new">New Song</button></li>
		<li><button data-toggle="all" class="active">All Songs</button></li>
		<li><button data-toggle="top10">Top 10</button></li>
	</ul>
    
    <fieldset data-function="new">
    	<legend>New Song</legend>
		<form:form method="POST" action="/song/new" modelAttribute="song">
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
				
			<input type="submit" value="Submit"/>
		</form:form>
    </fieldset>
	
	<fieldset data-function="all">
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

    <fieldset data-function="all">
    	<legend>Songs</legend>
    	<table border=1>
    		<tr>
    			<td>Title</td>
    			<td>Artist</td>
				<td>Rating</td>
				<td>Actions</td>
    		</tr>	
	    	<c:forEach items="${songs}" var="song">
	    		<tr>
	    			<td><c:out value="${song.title}"></c:out></td>
	    			<td><c:out value="${song.artist}"></c:out></td>
					<td><c:out value="${stars[5-song.rating]}"></c:out></td>
					<td>
						<a href='/song/<c:out value="${song.id}"></c:out>/edit'><button>View</button></a>
					</td>
	    		</tr>
	    	</c:forEach>
    	</table>
    </fieldset>
    
    <fieldset data-function="top10">
    	<legend>Top 10</legend>
    	<table border=1>
    		<tr>
    			<td>Title</td>
    			<td>Artist</td>
				<td>Rating</td>
				<td>Actions</td>
    		</tr>	
	    	<c:forEach items="${top10}" var="song">
	    		<tr>
					<td><c:out value="${song.title}"></c:out></td>
					<td><c:out value="${song.artist}"></c:out></td>
					<td><c:out value="${stars[5-song.rating]}"></c:out></td>
					<td>
						<a href="/song/${song.id}/edit"><button>View</button></a>
					</td>
	    		</tr>
	    	</c:forEach>
    	</table>
	</fieldset>
	
	<script>

		const top10 = document.querySelectorAll(`[data-function="top10"]`);
		const all= document.querySelectorAll(`[data-function="all"]`);
		const newSong = document.querySelectorAll(`[data-function="new"]`);
		
		function hideTop10(){
			for(let t of top10){
				t.style.display = "none";
			}
		}
		function hideNew(){
			for(let n of newSong){
				n.style.display = "none";
			}
		}
		function hideAll(){
			for(let a of all){
				a.style.display = "none";
			}
		}
		function showTop10(){
			hideAll();
			hideNew();
			for(let t of top10){
				t.style.display = "";
			}
		}
		function showNew(){
			hideAll();
			hideTop10();
			for(let n of newSong){
				n.style.display = "";
			}
		}
		function showAll(){
			hideTop10();
			hideNew();
			for(let a of all){
				a.style.display = "";
			}
		}

		const toggleTop = document.querySelector(`[data-toggle="top10"]`);
		const toggleAll = document.querySelector(`[data-toggle="all"]`);
		const toggleNew = document.querySelector(`[data-toggle="new"]`);

		toggleTop.addEventListener("click", function(e){
			showTop10();
			toggleTop.classList.add("active");
			toggleAll.classList.remove("active");
			toggleNew.classList.remove("active");
		});

		toggleAll.addEventListener("click", function(e){
			showAll();
			toggleTop.classList.remove("active");
			toggleAll.classList.add("active");
			toggleNew.classList.remove("active");
		});

		toggleNew.addEventListener("click", function(e){
			showNew();
			toggleTop.classList.remove("active");
			toggleAll.classList.remove("active");
			toggleNew.classList.add("active");
		});

		showAll();

	</script>
    
</body>
</html>