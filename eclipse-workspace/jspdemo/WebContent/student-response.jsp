<html>

<head><title>Student Confirmation Title</title></head>

<body>

The Student is confirmed: ${param.firstName} ${param.lastName}
<br><br>

The Student's Country is: ${param.Country}

<br><br>

Student's favourite programming language is: ${param.favouriteLanguage}

<br><br>

Student other interest is: 
<ul>

<%

String[] interests = request.getParameterValues("Other");

if(interests!=null) {
	for(String temp:interests) {
		out.println("<li>" + temp + "</li>");
	}
}
%>
</ul>

</body>

</html>


<!-- Note: We can use request.getParameter(args). but ${param.var_name} is shorter -->
