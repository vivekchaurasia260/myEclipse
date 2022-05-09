<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page import="java.util.*, com.vivek.tagDemo.Student" %>

<%

	// just create some sample data ... noramlly provided by MVC
	List<Student> data = new ArrayList<Student>();

	data.add(new Student("Manohar", "Lal", false));
	data.add(new Student("Ajeet", "Dubey", false));
	data.add(new Student("Kishore", "Reddy", false));
	data.add(new Student("Surbhi", "Jha", true));
	
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
	
	<c:forEach var="tempStudent" items="${myStudents}">
		<tr>
			<td>${tempStudent.firstName}</td>
			<td>${tempStudent.lastName}</td>
			<td>${tempStudent.goldCustomer}</td>
		</tr>
	
	</c:forEach>
	
	</table>

</body>

</html>