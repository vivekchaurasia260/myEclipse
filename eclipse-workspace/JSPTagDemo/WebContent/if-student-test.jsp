<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page import="java.util.*, com.vivek.tagDemo.Student" %>

<%
	List<Student> data = new ArrayList<>();
	data.add(new Student("Elon", "Musk", false));
	data.add(new Student("Andrew", "Patel", true));
	data.add(new Student("Jeff", "Vladmir", false));

	pageContext.setAttribute("myStudents", data);
%>

<html>

<body>

	<table border=1>
	<tr>
	<th>First Name</th>
	<th>Last Name</th>
	<th>Gold Customer</th>
	</tr>
	
	<c:forEach var="tempStudents" items="${myStudents}">
		<tr>
		<td>${tempStudents.firstName}</td>
		<td>${tempStudents.lastName}</td>
		<td>		
		<c:if test="${tempStudents.goldCustomer}">
			Special Discount for Gold Member.
		</c:if>
		<c:if test="${not tempStudents.goldCustomer}">
			No Discount!!
		</c:if>
		
		
		</td>
		</tr>
		
	</c:forEach>
	
	</table>


</body>

</html>
