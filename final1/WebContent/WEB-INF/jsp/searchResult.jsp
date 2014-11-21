<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<div class="container-fluid"><br><br>
		<div class="row">
			<div class="col-xs-12 col-md-12">
				<!-- -------------------------your code should be here-------------------------- -->
					<table class="table table-striped">
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
					<td>${r1.releaseTo}</td>
					<td>${r1.status}</td>
					<td>${r1.startDate}</td>
					<td>${r1.version}</td>
					<td><a class="btn btn-primary btn-xs" href="">Edit</a></td>
					<td><a class="btn btn-danger btn-xs" href="delete?id=+${r1.id}" onclick="return deleteRelease()">Delete</a></td>
					</tr>
					</c:forEach>
					</table>
				<!-- --------------------------------------------------------------------------- -->
	  	</div>
	  <div class="col-xs-1 col-md-1"></div>
	</div>
	</div>
<script type="text/javascript">
function deleteRelease()
{
	var x=window.confirm("Are you really want to delete this entry?");
	if(x==true)
		{return true;}
	else
		{return false;}
	};
</script>