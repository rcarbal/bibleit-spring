<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Bibleit Search</title>
	</head>
	
	<body>
	
	<a href="wordSearch">Bible-it</a>
		<h1>Bible-it Word Search</h1>
		
		<form:form action="processSearch" modelAttribute="search" method="GET">
			<form:input type="text" path="search" placeholder="Search bible for word" />
			<form:select path="searchType">
				<form:options items="${search.searchOptions}"/>
			</form:select>
			<input type="submit" value="Submit"/>
		</form:form>
		
		<script src="${pageContext.request.contextPath}/resources/js/wordSearch.js" charset="utf-8"></script>
	</body>

</html>