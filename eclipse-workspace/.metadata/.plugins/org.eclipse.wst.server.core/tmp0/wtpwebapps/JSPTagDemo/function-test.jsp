<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>

<body>

<c:set var="data" value="Hello JSP" />

Length of the String <b>${data}</b>: ${fn:length(data)}

<br/><br/>

Uppercase of the String <b>${data}</b>: ${fn:toUpperCase(data)}

<br/><br/>

Does the String <b>${data}</b> starts with <b>Hel</b>?: ${fn:startsWith(data, "Hel")}

</body>

</html>
