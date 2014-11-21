<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<head>
 <title>AngularJS Routing example</title>
    <link href="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body ng-app="sampleApp">
hello from jsp page
<a href="#createNew">Create New release</a><br>
<a href="editview">Edit Release</a>
<a href="listAll">list all</a><br><br>
<a href="listByName">List using name</a><br>
<a href="deleteReleasePage">Delete Release</a>


  <div ng-view></div>
  
  
  <script type="text/ng-template" id="add_order.html">
 
          <h2>Validation Example</h2>

<form ng-app="" action="save" ng-controller="validateCtrl" 
name="myForm" novalidate>

<p>Title:<br>
<input type="text" name="title" ng-model="title" ng-minlength=5 ng-maxlength=20 ng-pattern="/^[a-zA-Z]+$/" >
Field Required!!! Must start with a letter, and contain letters & numbers only. Must
have 5 to 20 characters.
<span style="color:red" ng-show="myForm.title.$error.minlength">Less Length.</span>
</span>
<span style="color:red" ng-show="myForm.title.$error.maxlength">More Length.</span>
<span style="color:red" ng-show="myForm.title.$error.pattern">Wrong pattern</span>
</span>
</p>


<p>Description:<br>
<input type="text" name="description" ng-model="description" ng-minlength=5 ng-maxlength=20 ng-pattern="/^[a-zA-Z]+$/" >
Field Required!!! Must start with a letter, and contain letters & numbers only. Must
have 5 to 20 characters.
<span style="color:red" ng-show="myForm.description.$error.minlength">Less Length.</span>
</span>
<span style="color:red" ng-show="myForm.description.$error.maxlength">More Length.</span>
<span style="color:red" ng-show="myForm.description.$error.pattern">Wrong pattern</span>
</span>
</p>






<p>Start Date:<br>
<input type="text" name="startDate" ng-model="startDate"  ng-pattern="/(?:[1-9][1-9]|[1-9][0-9]|3[01])\/(?:0[1-9]|1[0-2])\/(?:19|20\d{2})/" >

<span style="color:red" ng-show="myForm.startDate.$error.pattern">Wrong pattern</span>
</span>
</p>

<p>Planned Date:<br>
<input type="text" name="plannedDate" ng-model="plannedDate"  ng-pattern="/(?:0[1-9]|[12][0-9]|3[01])\/(?:0[1-9]|1[0-2])\/(?:19|20\d{2})/" >

<span style="color:red" ng-show="myForm.plannedDate.$error.pattern">Wrong pattern</span>
</span>
</p>

<p>End Date:<br>
<input type="text" name="releaseDate" ng-model="releaseDate"  ng-pattern="/(?:0[1-9]|[12][0-9]|3[01])\/(?:0[1-9]|1[0-2])\/(?:19|20\d{2})/" >
<span style="color:red" ng-show="myForm.releaseDate.$error.pattern">Wrong pattern</span>
</span>
</p>

<p>type:<br>
<input type="text" name="releaseType" ng-model="releaseType" required>
<span ng-show="myForm.releaseType.$error.required">This Field is required</span>
</p>

<p>to:<br>
<input type="text" name="releaseTo" ng-model="releaseTo" required>
<span ng-show="myForm.releaseTo.$error.required">This Field is required</span>
</p>


<p>Items:<br>
<input type="text" name="items" ng-model="items" ng-minlength=10 ng-maxlength=25  ng-pattern="/^[a-zA-Z]+$/" required>
Field Required!!! Must start with a letter, and contain letters & numbers only.
Must have 10 to 25 characters.
<span style="color:red" ng-show="myForm.items.$error.minlength">Less Length.</span>
</span>
<span style="color:red" ng-show="myForm.items.$error.maxlength">More Length.</span>
<span style="color:red" ng-show="myForm.items.$error.pattern">Wrong pattern</span>
</p>

<p>Status:<br>
<input type="text" name="status" ng-model="status" required>
<span style="color:red" ng-show="myForm.status.$error.required">This field is requiredn</span>
</span>
</p>


<p>Manager:<br>
<input type="text" name="manager" ng-model="manager"  ng-pattern="/^[a-zA-Z]+$/" required>
Field Required!!! Must start with a letter, and contain letters & numbers only
<span style="color:red" ng-show="myForm.manager.$error.pattern">Wrong pattern</span>
</p>


<p>Version:<br>
<input type="text" name="version" ng-model="version" required>
<span style="color:red" ng-show="myForm.status.$error.required">This field is requiredn</span>
</span>
</p>


<p>
<input type="submit" value="submit">



</form>

 
    </script>
    
  <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.0.7/angular.min.js"></script>   
    
     <script>
var sampleApp = angular.module('sampleApp', []);
 
//Define Routing for app
//Uri /AddNewOrder -> template add_order.html and Controller AddOrderController
//Uri /ShowOrders -> template show_orders.html and Controller AddOrderController
sampleApp.config(['$routeProvider',
  function($routeProvider) {
    $routeProvider.
      when('/createNew', {
        templateUrl: 'add_order.html',
        controller: 'AddOrderController'
    
      });
}]);
 
 
sampleApp.controller('AddOrderController', function($scope) {
     
    $scope.message = 'This is Add new order screen';
     
});
 
 


</script>
    
</body>
</html>