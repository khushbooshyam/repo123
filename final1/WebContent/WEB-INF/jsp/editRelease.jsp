<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

	<div class="container-fluid">
		<div class="row">
			<div class="col-xs-4 col-md-4"></div>
			<div class="col-xs-4 col-md-4 text-center">
				<h3>
					Edit <small>Release</small>
				</h3><hr>
			</div>
			<div class="col-xs-4 col-md-4"></div>
		</div>
		<div class="row">
			<div class="col-xs-12 col-md-12">
						<!-- -------------------------your code should be here-------------------------- -->
				        <form id="form2" name="form2" action="" method="post" class="form-horizontal" data-role="form">
							<div class="form-group">
								<label for="inputTitle" class="col-sm-2 control-label">Title</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="inputTitle_"
										placeholder="Title" required="required" maxlength="20" pattern="[A-Za-z][A-Za-z0-9]{5,20}" title="Title (mininum 5 and maximum 20 characters) must start with a letter, and contain letters &amp; numbers only">
								</div>
							</div>
							<div class="form-group">
								<label for="inputDescription" class="col-sm-2 control-label">Description</label>
								<div class="col-sm-10">
									<textarea class="form-control" rows="3" id="inputDescription_" placeholder="Description" required="required"  maxlength="100"  data-pattern="[A-Za-z][A-Za-z0-9]{20,100}" title="Description (mininum 20 and maximum 100 characters) must start with a letter, and contain letters &amp; numbers only"></textarea>
								</div>
							</div>
							<div class="form-group">
								<label for="inputSDate" class="col-sm-2 control-label">Start Date</label>
								<div class="col-sm-10">
									<input type="date" class="form-control" id="inputSDate"
										placeholder="Start Date" required="required">
								</div>
							</div>
							<div class="form-group">
								<label for="inputPDate" class="col-sm-2 control-label">Planned Date</label>
								<div class="col-sm-10">
									<input type="date" class="form-control" id="inputPDate"
										placeholder="Planned Date" required="required">
								</div>
							</div>
							<div class="form-group">
								<label for="inputRDate" class="col-sm-2 control-label">Release Date</label>
								<div class="col-sm-10">
									<input type="date" class="form-control" id="inputRDate"
										placeholder="Release Date" required="required">
								</div>
							</div>
							<div class="form-group">
								<label for="inputType" class="col-sm-2 control-label">Type</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="inputType"
										placeholder="Type" required="required" maxlength="40">
								</div>
							</div>
							<div class="form-group">
								<label for="inputTo" class="col-sm-2 control-label">To</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="inputTo"
										placeholder="To" required="required" maxlength="40">
								</div>
							</div>
							<div class="form-group">
								<label for="inputItems" class="col-sm-2 control-label">Items</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="inputItems"
										placeholder="Items" required="required" maxlength="400" pattern="[A-Za-z][A-Za-z0-9]{0,400}" title="Items must start with a letter, and contain letters &amp; numbers only">
								</div>
							</div>
							<div class="form-group">
								<label for="inputStatus" class="col-sm-2 control-label">Status</label>
								<div class="col-sm-10">
									<select class="form-control" id="inputStatus">
										<option>Active</option>
										<option>Pending</option>
										<option>Done</option>
									</select>
								</div>
							</div>
							<div class="form-group">
								<label for="inputManager" class="col-sm-2 control-label">Manager</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="inputManager"
										placeholder="Manager" required="required" maxlength="40" pattern="[A-Za-z][A-Za-z0-9]{0,40}" title="Manager name must start with a letter, and contain letters &amp; numbers only">
								</div>
							</div>
							<div class="form-group">
								<label for="inputVersion" class="col-sm-2 control-label">Version</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="inputVersion"
										placeholder="Version" required="required" pattern=".{3,30}" title="minimum 3 characters" maxlength="30">
								</div>
							</div>
							<div class="form-group">
								<div class="col-sm-offset-2 col-sm-10">
									<button type="submit" class="btn btn-primary">Update Release</button>
								</div>
							</div>
						</form>
						<!-- --------------------------------------------------------------------------- -->
					</div>
	  		</div>
	  <div class="col-xs-1 col-md-1"></div>
	</div>