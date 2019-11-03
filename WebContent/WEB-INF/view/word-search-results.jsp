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
		
		<br/>
		Result for: ${ param.search }
		<br/>
		${ result }
		</br>
		<h2>Exact Search Result</h2>
		<h2>In-exact Search Results</h2>
	</body>

</html>