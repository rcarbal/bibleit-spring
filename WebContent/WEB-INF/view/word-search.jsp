<!DOCTYPE html>
<html>
	<head>
		<title>Bibleit Search</title>
	</head>
	
	<body>
	
	<a href="wordSearch">Bible-it</a>
		<h1>Bible-it Word Search</h1>
		
		<form action="processSearch" method="GET">
			<input type="text" name="search" placeholder="Search bible for word" />
			<input type="submit"/>
		</form>
		
		<script src="${pageContext.request.contextPath}/resources/js/wordSearch.js" charset="utf-8"></script>
	</body>

</html>