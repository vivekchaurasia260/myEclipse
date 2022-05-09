<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>

<%
String[] cities = {"Varanasi", "Lucknow", "Gorakhpur", "Agra", "Bareilly", "Amethi"};

pageContext.setAttribute("myCities", cities);

%>

<body>

	<c:forEach var="tempCities" items="${myCities}">
		${tempCities} <br/>
		
	</c:forEach>

</body>

</html>