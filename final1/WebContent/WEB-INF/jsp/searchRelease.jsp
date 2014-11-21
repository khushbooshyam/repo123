<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<div class="container-fluid">
		<div class="row">
			<div class="col-xs-4 col-md-4"></div>
			<div class="col-xs-4 col-md-4 text-center">
				<h3>
					Search <small>Release</small>
				</h3><hr>
			</div>
			<div class="col-xs-4 col-md-4"></div>
		</div>
		<div class="row">
			<div class="col-xs-12 col-md-12">
				<!-- -------------------------your code should be here-------------------------- -->
				
				<form id="form1" class="form-horizontal" data-role="form">
					<div class="form-group">
						<label for="inputTitle" class="col-sm-2 control-label">Enter Release Title</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="title" name="title" placeholder="Title" required="required" onkeyup="showList(this)">
						</div>
					</div>
				</form>
				<div id="p"></div>
				
				<!-- --------------------------------------------------------------------------- -->
	  	</div>
	  <div class="col-xs-1 col-md-1"></div>
	</div>
	</div>
<script type="text/javascript">
function showList(str)
{
var xmlhttp;
if (str.length==0)
  { 
  document.getElementById("txtHint").innerHTML="";
  return;
  }
if (window.XMLHttpRequest)
  {
  xmlhttp=new XMLHttpRequest();
  }
else
  {
  xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
  }

xmlhttp.onreadystatechange=function()
  {
  if (xmlhttp.readyState==4 && xmlhttp.status==200)
    {
    document.getElementById("p").innerHTML=xmlhttp.responseText;
    }
  }
xmlhttp.open("GET","listAllByName?title="+str.value,true);
xmlhttp.send();

}
</script>