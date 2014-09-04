<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<html>
<body>
	<h1>All Persons</h1>
	<c:forEach var="p" items="${persons}">
    Id: ${p.id} Name: ${p.name}<br />
	</c:forEach>

	<h1>Add New</h1>
	<form method="post" action="addPerson">
		Name: <input type="text" name="name" />
		<button>Add</button>
	</form>
</body>
</html>
