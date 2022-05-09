<html>

<body>

<%!
	String makeItLower(String data) {
		return data.toLowerCase();	
	}

%>

Lower case "Hello World": <%= makeItLower("Hello World") %>


</body>

</html>


<!-- Note: Here we define how to declare in jsp file but we need to minimize our declaration in jsp file -->