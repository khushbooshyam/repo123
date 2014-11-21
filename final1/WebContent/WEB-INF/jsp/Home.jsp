<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<div class="row">
		<div class="col-md-1"></div>
		<div class="col-md-5 text-center">
			<button id="releaseButton" class="btn btn-default btn-lg">
				<span class="glyphicon glyphicon-align-justify"></span>&nbsp;&nbsp;&nbsp;
				Releases
			</button>
		</div>
		<div class="col-md-5 text-center">
			<button id="iterationButton" class="btn btn-default btn-lg">
				<span class="glyphicon glyphicon-list"></span>&nbsp;&nbsp;&nbsp;
				Iterations
			</button>
		</div>
		<div class="col-md-1"></div>
	</div>
	<div class="row">
		<div class="col-md-12">
			<hr>
			<div id="screen1" class="row screens">
				<div class="col-md-12 text-center dull">Welcome to Release
					Management Portal. Select the option as you required</div>
			</div>
			<div id="screen2" class="row screens">
				<div class="col-md-12">
					<div class="row">
						<div class="col-md-2"></div>
						<div class="col-md-10">
							<a href="release" class="btn btn-primary btn-lg"> <span
								class="glyphicon glyphicon-play"></span>&nbsp;&nbsp;&nbsp; New
								Release
							</a> &nbsp;&nbsp;&nbsp;<span class="dull">Register a new
								release</span>
						</div>
					</div>
					<br>
					<div class="row">
						<div class="col-md-2"></div>
						<div class="col-md-10">
							<button class="btn btn-primary btn-lg">
								<span class="glyphicon glyphicon-play"></span>&nbsp;&nbsp;&nbsp;
								Edit Release
							</button>
							&nbsp;&nbsp;&nbsp;<span class="dull">Edit a release
								details that has been registered</span>
						</div>
					</div>
					<br>
					<div class="row">
						<div class="col-md-2"></div>
						<div class="col-md-10">
							<button class="btn btn-primary btn-lg">
								<span class="glyphicon glyphicon-play"></span>&nbsp;&nbsp;&nbsp;
								All Releases
							</button>
							&nbsp;&nbsp;&nbsp;<span class="dull">Details of all
								releases to edit or delete</span>
						</div>
					</div>
					<br>
					<div class="row">
						<div class="col-md-2"></div>
						<div class="col-md-10">
							<button class="btn btn-primary btn-lg">
								<span class="glyphicon glyphicon-play"></span>&nbsp;&nbsp;&nbsp;
								Search Release
							</button>
							&nbsp;&nbsp;&nbsp;<span class="dull">Search a specific
								release to edit or delete</span>
						</div>
					</div>
				</div>
			</div>
			<div id="screen3" class="row screens">
				<div class="col-md-12 rightAlign">
					<div class="row">
						<div class="col-md-2"></div>
						<div class="col-md-10">
							<button class="btn btn-info btn-lg">
								<span class="glyphicon glyphicon-play"></span>&nbsp;&nbsp;&nbsp;
								New Iteration
							</button>
							&nbsp;&nbsp;&nbsp;<span class="dull">Register a new
								iteration</span>
						</div>
					</div>
					<br>
					<div class="row">
						<div class="col-md-2"></div>
						<div class="col-md-10">
							<button class="btn btn-info btn-lg">
								<span class="glyphicon glyphicon-play"></span>&nbsp;&nbsp;&nbsp;
								Edit Iteration
							</button>
							&nbsp;&nbsp;&nbsp;<span class="dull">Edit a iteration
								details that has been registered</span>
						</div>
					</div>
					<br>
					<div class="row">
						<div class="col-md-2"></div>
						<div class="col-md-10">
							<button class="btn btn-info btn-lg">
								<span class="glyphicon glyphicon-play"></span>&nbsp;&nbsp;&nbsp;
								All Iterations
							</button>
							&nbsp;&nbsp;&nbsp;<span class="dull">Details of all
								iterations to edit or delete</span>
						</div>
					</div>
					<br>
					<div class="row">
						<div class="col-md-2"></div>
						<div class="col-md-10">
							<button class="btn btn-info btn-lg">
								<span class="glyphicon glyphicon-play"></span>&nbsp;&nbsp;&nbsp;
								Search Iteration
							</button>
							&nbsp;&nbsp;&nbsp;<span class="dull">Search a specific
								iteration to edit or delete</span>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
<script type="text/javascript" src="<c:url value="/resources/js/script.js"/>"></script>