<%@ page language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
</head>
<table>
<tr>
	<th>Description</th>
</tr>
<c:forEach var="question" items="${questions}">
<tr>
	<td><c:out value="${question.description}" /></td>
</tr>
</c:forEach>
</table>
</html>