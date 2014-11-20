<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="2">
<tr><th>Title</th>
<th>Manager</th>
<th>Type</th>
<th>To</th>
<th>Status</th>
<th>Start Date</th>
<th>Version</th>
<th colspan="2">Action</th></tr>
<c:forEach var="r1" items="${List}">
<tr>
<td>${r1.title}</td>
<td>${r1.manager}</td>
<td>${r1.releaseType}</td>
<td>${r1.releasTo}</td>
<td>${r1.status}</td>
<td>${r1.startDate}</td>
<td>${r1.version}</td>
<td><a href="">Delete</a></td>
<td><a href="">edit</a></td>
</tr>
</c:forEach>
</table>


 <br/>
</body>
</html>