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
<script type="text/javascript" src="<c:url value="/resources/js/script.js"/>"></script>
</head>
<body data-ng-app="releaseManagementApp">

<!-- ---------------Angular JS Script------------------ -->
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.0.7/angular.min.js"></script> 
<script type="text/ng-template" id="Home">
	<%@include file="Home.jsp" %>
</script>
<script type="text/javascript">
	var releaseManagementApp = angular.module('releaseManagementApp', []);
	releaseManagementApp.config(['$routeProvider',
	function($routeProvider) {
	  $routeProvider.
	    when('/Home', {
	      templateUrl: 'Home',
	      controller: 'AddOrderController'
	    })
	}]);
	releaseManagementApp.controller('AddOrderController', function($scope) {
	    $scope.message = 'This is Add new order screen';
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
	  <div class="col-xs-2 col-md-2"></div>
	  <div id="box1" class="col-xs-8 col-md-8 loginBox alignCenter">
	  	<img alt="Resource Management" src="<c:url value="/resources/css/img.png"/>">
	  		<h2>Hello <small> user</small></h2>
	  		Welcome to Release Management Project.<br><br>
	  	<a href="#Home" onclick="showBox();" class="btn btn-danger btn-lg">	
	   		<span class="glyphicon glyphicon-play"></span>&nbsp;&nbsp;&nbsp;Let's Start...
		</a>
	  </div>
	  <!-- ---------------Here comes views----------------- -->
	  <div id="box2" data-ng-view class="col-xs-8 col-md-8 loginBox" style="display:none"></div>
	  <div class="col-xs-2 col-md-2"></div>
	</div>
</div>
<br><br><div class="dullest" style="width: 100%; text-align: center;">Project By - Group 4 [ Atin, Harshita, Khushboo, Nishu, Pankaj, Prateek &amp; Shrasti ]</div>
</body>
</html>