<!DOCTYPE html>
<html>

<head>



<style type="text/css">
h3{font-family: Calibri; font-size: 22pt; font-style: normal; font-weight: bold; color:SlateBlue;
text-align: center; text-decoration: underline }
table{font-family: Calibri; color:white; font-size: 11pt; font-style: normal;
text-align:; background-color: SlateBlue; border-collapse: collapse; border: 2px solid blue}
table.inner{border: 0px}
</style>

<script src= "http://ajax.googleapis.com/ajax/libs/angularjs/1.2.26/angular.min.js"></script>
</head>
    
<body>
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

<script>
function validateCtrl($scope) {
    $scope.user = 'John ';
    $scope.email = 'john.doe@gmail.com';
}
</script>

</body>
</html>
