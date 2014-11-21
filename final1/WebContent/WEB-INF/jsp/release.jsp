<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Release Management</title>
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/style.css"/>">
<link rel="stylesheet" href="<c:url value="/resources/bootstrap/css/bootstrap.min.css"/>">
<script type="text/javascript" src="<c:url value="/resources/bootstrap/js/jquery-2.1.1.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>
</head>
<body data-ng-app="releaseApp">

<!-- ---------------Angular JS Script------------------ -->
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.0.7/angular.min.js"></script> 
<script type="text/ng-template" id="newRelease">
	<%@include file="newRelease.jsp" %>
</script>
<script type="text/ng-template" id="editRelease">
	<%@include file="editRelease.jsp" %>
</script>
<script type="text/ng-template" id="listAllRelease">
	<%@include file="listAllRelease.jsp" %>
</script>
<script type="text/ng-template" id="searchRelease">
	<%@include file="searchRelease.jsp" %>
</script>
<script type="text/javascript">
	var releaseManagementApp = angular.module('releaseApp', []);
	releaseManagementApp.config(['$routeProvider',
	function($routeProvider) {
	  $routeProvider.
	    when('/newRelease', {
		      templateUrl: 'newRelease',
		      controller: 'NewController'
		}).
		when('/editRelease', {     
			templateUrl : 'editRelease',
			controller : 'EditController'
		}).when('/searchRelease', {
			templateUrl : 'searchRelease',
			controller : 'SearchController'
		}).when('/listAllRelease', {
			templateUrl : 'listAllRelease',
			controller : 'listController'
		});
	} ]);
	releaseManagementApp.controller('listController', function($scope) {
		$scope.message = 'This is List screen';
	});
	releaseManagementApp.controller('NewController', function($scope) {
		$scope.message = 'This is Add new screen';
	});
	releaseManagementApp.controller('EditController', function($scope) {
		$scope.message = 'This is Edit screen';
	});
	releaseManagementApp.controller('SearchController', function($scope) {
		$scope.message = 'This is Search screen';
	});
</script>

<!-- -------------------------------------------------- -->

<div class="container-fluid">
	<div class="row">
		<div class="col-xs-12 col-md-12 header">Cybage Training Project
			<a href="home" class="btn btn-danger btn-lg header_button">
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
	</div>
	<div class="row">
	  <div class="col-xs-1 col-md-1"></div>
	  <div class="col-xs-10 col-md-10 contentBox">
	  	<div class="row alignCenter">
	  		<div class="col-md-3">
	  			<a href="#newRelease" class="btn btn-primary btn-lg">
	   				<span class="glyphicon glyphicon-play"></span>&nbsp;&nbsp;&nbsp;New Release
				</a>
	  		</div>
	  		<div class="col-md-3">
	  			<a href="#editRelease" class="btn btn-primary btn-lg">
	   				<span class="glyphicon glyphicon-play"></span>&nbsp;&nbsp;&nbsp;Edit Release
				</a>
	  		</div>
	  		<div class="col-md-3">
	  			<a href="#listAllRelease" class="btn btn-primary btn-lg">
	   				<span class="glyphicon glyphicon-play"></span>&nbsp;&nbsp;&nbsp;All Releases
				</a>
	  		</div>
	  		<div class="col-md-3">
	  			<a href="#searchRelease" class="btn btn-primary btn-lg">
	   				<span class="glyphicon glyphicon-play"></span>&nbsp;&nbsp;&nbsp;Search Release
				</a>
	  		</div>
	  	</div>
	  	<hr>
	  	<div class="row">
	  		<!-- ---------------Here comes views----------------- -->
	  		<div data-ng-view class="col-xs-12 col-md-12"></div>
	  	</div>
	  </div>
	  <div class="col-xs-1 col-md-1"></div>
	</div>
</div>
<br><br><div class="dullest" style="width: 100%; text-align: center;">Project By - Group 4 [ Atin, Harshita, Khushboo, Nishu, Pankaj, Prateek &amp; Shrasti ]</div>
</body>
</html>