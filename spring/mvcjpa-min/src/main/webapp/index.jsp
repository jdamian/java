<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<body>
<h2>Hello World!</h2>
<p/>
<c:out value="prueba"/>
<p/>
${"prueba"}
${1<2}
${1+2+3}

<c:set var="testing" value="blah"/>
<c:out value="${testing}"/>

</body>
</html>
