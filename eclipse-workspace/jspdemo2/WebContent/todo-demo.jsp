<%@ page import="java.util.*" %>
<html>

<body>

<!-- Step 1: Create a HTML form -->
<form action = "todo-demo.jsp">

Add new item: <input type="text" name="theItem">

<input type="submit" value="Submit" />

</form>


<!-- Step 2: Add  new items to "To Do" list -->

<%
// If the TO DO items doesn't exist, then create a new one....

List<String> items = (List<String>) session.getAttribute("myToDoList");

if(items==null) {
	items = new ArrayList<String>();
	session.setAttribute("myToDoList", items);
}

String theItem = request.getParameter("theItem");

boolean isItemNotEmpty = theItem != null && theItem.trim().length() > 0;
boolean isItemNotDuplicate = theItem != null && items.contains(theItem.trim());


if(isItemNotEmpty && isItemNotDuplicate) {
	items.add(theItem.trim());
}

%>

<!-- Step 3: Display all "To Do" item for session -->

<hr>
<b>To Do List Items: </b> <br/>

<ol>

<%

for(String temp: items) {
	out.println("<li>" + temp + "</li>");
}

%>

</ol>

</body>

</html>