<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>welcome to edit page</h1>
<form>
Title:<input type="text" name="title" value="${releasePojo.title}"><br/>
Description:<input type="text" name="desc" value="${releasePojo.description}"><br/>
Start Date:<input type="text" name="startDate" value="${releasePojo.startDate}"><br/>
Planned Date:<input type="text" name="plannedDate" value="${releasePojo.plannedDate}"><br/>
End Date:<input type="text" name="endDate" value="${releasePojo.releaseDate}"><br/>
Type:<input type="text" name="type" value="${releasePojo.releaseType}"><br/>
To:<input type="text" name="to" value="${releasePojo.releasTo}"><br/>
Items:<input type="text" name="items" value="${releasePojo.items}"><br/>
Manager:<input type="text" name="manager" value="${releasePojo.manager}"><br/>
Version:<input type="text" name="version" value="${releasePojo.version}"><br/>
<input type="submit"  value="update">
</form>
</body>
</html>