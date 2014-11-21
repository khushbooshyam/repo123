<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

	<div class="container-fluid">
		<div class="row">
			<div class="col-xs-4 col-md-4"></div>
			<div class="col-xs-4 col-md-4 text-center">
				<h3>
					New <small>Release</small>
				</h3><hr>
			</div>
			<div class="col-xs-4 col-md-4"></div>
		</div>
		<div class="row">
			<div class="col-xs-12 col-md-12">
				<!-- -------------------------your code should be here-------------------------- -->

				<form id="form1" class="form-horizontal" data-role="form">
					<div class="form-group">
						<label for="inputTitle" class="col-sm-2 control-label">Title</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="inputTitle" placeholder="Title" required="required" maxlength="20">
						</div>
					</div>
					<div class="form-group">
						<label for="inputDescription" class="col-sm-2 control-label">Description</label>
						<div class="col-sm-10">
							<textarea class="form-control" rows="3" id="inputDescription" placeholder="Description" required="required"  maxlength="100"></textarea>
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button id="ok" type="button" class="btn btn-primary" onclick="validate();">OK</button>
							<button id="continue" type="button" class="btn btn-primary" data-toggle="modal" data-target="#Modal" onclick="flowData();">Continue...</button>
							<input id="reset" type="reset" class="btn btn-default" onclick="return resetData();">
						</div>
					</div>
					<div id="errorTitle1" class="alert alert-danger relative" data-role="alert">Title must have 5 to 20 characters</div>
					<div id="errorTitle2" class="alert alert-danger relative" data-role="alert">Title must start with a letter, and contain letters &amp; numbers only</div>
					<div id="errorDescription1" class="alert alert-danger relative" data-role="alert">Description must have 20 to 100 characters</div>
					<div id="errorDescription2" class="alert alert-danger relative" data-role="alert">Description must start with a letter, and contain letters &amp; numbers only</div>
				</form>
				<div class="modal fade" id="Modal" tabindex="-1" data-role="dialog" data-aria-labelledby="myModalLabel" data-aria-hidden="true">
				  <div class="modal-dialog modal-lg">
				    <div class="modal-content">
				      <div class="modal-header">
				        <button type="button" class="close" data-dismiss="modal"><span data-aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
				        <h4 class="modal-title" id="myModalLabel">New Release Information</h4>
				      </div>
				      <div class="modal-body">
				        <form name="form2" action="save" method="post" class="form-horizontal" data-role="form" novalidate>
							<div class="form-group">
								<label for="title" class="col-sm-2 control-label">Title</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="title" name="title" data-ng-model="title" 
										placeholder="Title" required="required" readonly="readonly" maxlength="20">
								</div>
							</div>
							<div class="form-group">
								<label for="description" class="col-sm-2 control-label">Description</label>
								<div class="col-sm-10">
									<textarea class="form-control" rows="3" id="description" name="description" data-ng-model="description"  placeholder="Description" required="required"  maxlength="100" readonly="readonly"></textarea>
								</div>
							</div>
							<div class="form-group">
								<label for="startDate" class="col-sm-2 control-label">Start Date</label>
								<div class="col-sm-10">
									<input type="date" class="form-control" id="startDate" name="startDate" data-ng-model="startDate" 
										placeholder="Start Date" required="required">
								</div>
							</div>
							<div class="form-group">
								<label for="plannedDate" class="col-sm-2 control-label">Planned Date</label>
								<div class="col-sm-10">
									<input type="date" class="form-control" id="plannedDate" name="plannedDate" data-ng-model="plannedDate" 
										placeholder="Planned Date" required="required">
								</div>
							</div>
							<div class="form-group">
								<label for="releaseDate" class="col-sm-2 control-label">Release Date</label>
								<div class="col-sm-10">
									<input type="date" class="form-control" id="releaseDate" name="releaseDate" data-ng-model="releaseDate" 
										placeholder="Release Date" required="required">
								</div>
							</div>
							<div class="form-group">
								<label for="releaseType" class="col-sm-2 control-label">Type</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="releaseType" name="releaseType" data-ng-model="releaseType"  placeholder="Type" maxlength="40" required="required">
								</div>
							</div>
							<div class="form-group">
								<label for="releaseTo" class="col-sm-2 control-label">To</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="releaseTo" name="releaseTo" data-ng-model="releaseTo" 
										placeholder="To" required="required" maxlength="40">
								</div>
							</div>
							<div class="form-group">
								<label for="items" class="col-sm-2 control-label">Items</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="items" name="items" data-ng-model="items" data-ng-minlength=10 data-ng-maxlength=400 data-ng-pattern="/^[a-zA-Z]+$/"
										placeholder="Items" required="required" maxlength="400" pattern="[A-Za-z][A-Za-z0-9]{0,400}" title="Items must start with a letter, and contain letters &amp; numbers only">
									<div class="alert alert-danger relative" data-ng-show="form2.items.$error.minlength">more than 10 characters are required</div>
									<div class="alert alert-danger relative" data-ng-show="form2.items.$error.maxlength">Less than 400 characters are required</div>
									<div class="alert alert-danger relative" data-ng-show="form2.items.$error.pattern">Wrong pattern! Should start with a alphabet</div>	
								</div>
							</div>
							<div class="form-group">
								<label for="status" class="col-sm-2 control-label">Status</label>
								<div class="col-sm-10">
									<select class="form-control" id="status" name="status" data-ng-model="status" >
										<option>Active</option>
										<option>Pending</option>
										<option>Done</option>
									</select>
								</div>
							</div>
							<div class="form-group">
								<label for="manager" class="col-sm-2 control-label">Manager</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="manager" name="manager" data-ng-model="manager" data-ng-maxlength=40 data-ng-pattern="/^[a-zA-Z]+$/"
										placeholder="Manager" required="required" maxlength="40" pattern="[A-Za-z][A-Za-z0-9]{0,40}" title="Manager name must start with a letter, and contain letters &amp; numbers only">
									<div class="alert alert-danger relative" data-ng-show="form2.manager.$error.maxlength">Less than 40 characters are required</div>
									<div class="alert alert-danger relative" data-ng-show="form2.manager.$error.pattern">Wrong pattern! Should start with a alphabet</div>	
								</div>
							</div>
							<div class="form-group">
								<label for="version" class="col-sm-2 control-label">Version</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="version" name="version" data-ng-model="version" 
										placeholder="Version" required="required" pattern=".{3,30}" title="minimum 3 characters" maxlength="30">
								</div>
							</div>
							<div class="form-group">
								<div class="col-sm-offset-2 col-sm-10">
									<input type="submit" class="btn btn-primary" value="Create New Release" />
								</div>
							</div>
						</form>
				      </div>
				      <div class="modal-footer">
				        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				      </div>
				    </div>
				  </div>
				</div>
				<!-- --------------------------------------------------------------------------- -->
	  	</div>
	  <div class="col-xs-1 col-md-1"></div>
	</div>
	</div>
	
	<script type="text/javascript">
$(document).ready(function () {
    $('#ok').show();
    $('#continue').hide();
    $('#reset').hide();
    $('#errorDescription1').hide();
    $('#errorDescription2').hide();
    $('#errorTitle1').hide();
    $('#errorTitle2').hide();
});

   function validate() {
	var expr=/^[A-Za-z][A-Za-z0-9]/;
	var x=document.getElementById("inputTitle").value;
	var y=document.getElementById("inputDescription").value;
    if (x.length<5 || x.length>20 || !expr.test(x))
	{
    	$('#errorDescription1').hide(); 
    	$('#errorDescription2').hide();
	    if(x.length<5||x.length>20) {
	    	$('#errorTitle1').fadeIn(300); 
	    	$('#errorTitle2').hide();
	    }
        else {
        	$('#errorTitle1').hide(); 
	    	$('#errorTitle2').fadeIn(300);
        }
	    $('#ok').show();
	    $('#continue').hide();
	    $('#reset').hide();
		return false;
	}
    if (y.length<20 || y.length>100 || !expr.test(y))
	{
    	$('#errorTitle1').hide(); 
    	$('#errorTitle2').hide();
	    if(y.length<20||y.length>100) {
	    	$('#errorDescription1').fadeIn(300); 
	    	$('#errorDescription2').hide();
	    }
        else {
        	$('#errorDescription1').hide(); 
	    	$('#errorDescription2').fadeIn(300);
        }
	    $('#ok').show();
	    $('#continue').hide();
	    $('#reset').hide();
		return false;
	}
    else {
    	alert("Thankyou, Please Continue to complete required information...");
    	$('#errorTitle1').fadeOut(300); 
    	$('#errorTitle2').fadeOut(300);
    	$('#errorDescription1').fadeOut(300); 
    	$('#errorDescription2').fadeOut(300);
		$("#inputTitle").attr("readonly", true);
		$("#inputDescription").attr("readonly", true);
		$('#ok').hide();
	    $('#continue').show();
	    $('#reset').show();
    }
	return true;
}

function resetData() {
	var decision = confirm("Are you sure? you want to reset the entries");
	if(decision == true) {
		$("#inputTitle").attr("readonly", false);
		$("#inputDescription").attr("readonly", false);
		$('#ok').show();
	    $('#continue').hide();
	    $('#reset').hide();
	    return true;
	}
	else {
		return false;
	}
}

function flowData() {
	document.getElementById("title").value = document.getElementById("inputTitle").value;
	document.getElementById("description").value = document.getElementById("inputDescription").value;
}
</script>
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.0.7/angular.min.js"></script> 