<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Release Management</title>
<link rel="stylesheet" type="text/css" href="app/css/style.css">
<link rel="stylesheet" href="<c:url value="app/bootstrap/css/bootstrap.min.css"/>">
<script type="text/javascript" src="<c:url value="app/bootstrap/js/jquery-2.1.1.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="app/bootstrap/js/bootstrap.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="app/js/script.js"/>"></script>

<script type="text/javascript" src="<c:url value="app/lib/angular/angular.js"/>"></script>
<script type="text/javascript" src="<c:url value="app/lib/angular/angular-route.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="app/lib/angular/angular-resource.js"/>"></script>
<script type="text/javascript" src="<c:url value="app/js/app.js"/>"></script>
<script type="text/javascript" src="<c:url value="app/js/factory.js"/>"></script>
<script type="text/javascript" src="<c:url value="app/js/services.js"/>"></script>
<script type="text/javascript" src="<c:url value="app/js/controllers.js"/>"></script>
</head>
<body data-ng-app="release">
<div class="container-fluid">
	<div class="row">
		<div class="col-xs-12 col-md-12 header">Cybage Training Project
			<a href="#" class="btn btn-danger btn-lg header_button">
	   			<span class="glyphicon glyphicon-home"></span>&nbsp;&nbsp;&nbsp;Home
			</a>
		</div>
	</div>
	<div class="row">
	  <div class="col-xs-4 col-md-4"></div>
	  <div class="col-xs-4 col-md-4 text-center">
	  	<h1>Release <small>Management</small></h1>
	  </div>
	  <div class="col-xs-4 col-md-4"></div>
	</div><hr>
	<div id="link" class="row">
	  <div class="col-xs-1 col-md-1"></div>
	  <div class="col-xs-10 col-md-10">
	  	<div class="row">
	  		<div class="col-md-2">
	  			<a href="#ManageRelease" class="btn btn-primary col-xs-12 col-md-12">
	   				<span class="glyphicon glyphicon-send" data-aria-hidden="true"></span>&nbsp;&nbsp;New Release
				</a>
	  		</div>
	  		<div class="col-md-2">
	  			<a href="#ListRelease" class="btn btn-primary col-xs-12 col-md-12">
	   				<span class="glyphicon glyphicon-wrench" data-aria-hidden="true"></span>&nbsp;&nbsp;Manage Releases
				</a>
	  		</div>
	  		<div class="col-md-2">
	  			<a href="#SearchRelease" class="btn btn-primary col-xs-12 col-md-12">
	   				<span class="glyphicon glyphicon-search" data-aria-hidden="true"></span>&nbsp;&nbsp;Search Release
				</a>
	  		</div>
	  		<div class="col-md-2">
	  			<a href="#ManageIteration" class="btn btn-info col-xs-12 col-md-12">
	   				<span class="glyphicon glyphicon-send" data-aria-hidden="true"></span>&nbsp;&nbsp;New Iteration
				</a>
	  		</div>
	  		<div class="col-md-2">
	  			<a href="#ListIteration" class="btn btn-info col-xs-12 col-md-12">
	   				<span class="glyphicon glyphicon-wrench" data-aria-hidden="true"></span>&nbsp;&nbsp;Manage Iterations
				</a>
	  		</div>
	  		<div class="col-md-2">
	  			<a href="#SearchIteration" class="btn btn-info col-xs-12 col-md-12">
	   				<span class="glyphicon glyphicon-search" data-aria-hidden="true"></span>&nbsp;&nbsp;Search Iteration
				</a>
	  		</div>
	  	</div>
	  </div>
	  <div class="col-xs-1 col-md-1"></div>
	</div>

	<div class="row">
	  <div class="col-xs-1 col-md-1"></div>
	  <div id="box1" class="col-xs-10 col-md-10 contentBox alignCenter">
	  	<img alt="Resource Management" src="app/css/img.png">
	  		<h2>Hello <small> user</small></h2>
	  		Welcome to Release Management Project.<br><br>
	  	<button id="startButton" onclick="showBox();" class="btn btn-danger btn-lg">	
	   		<span class="glyphicon glyphicon-play"></span>&nbsp;&nbsp;&nbsp;Let's Start...
		</button>
	  </div>
	  <!-- ---------------Here comes views----------------- -->
	  <div id="box2" data-ng-view class="col-xs-10 col-md-10 contentBox"></div>
	  <div class="col-xs-1 col-md-1"></div>
	</div>
</div>
<br><br><div class="dullest" style="width: 100%; text-align: center;">Project By - Group 4 [ Atin, Harshita, Khushboo, Nishu, Pankaj, Prateek &amp; Shrasti ]</div>
</body>
</html>