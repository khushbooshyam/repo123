'use strict';
var i = {};
var r = {};
var itr = {};
var rel = {};
angular
		.module('release.controllers', [])
		.controller(
				'ManageReleaseController',
				[
						'$scope',
						"release",
						'$location',
						function($scope, release, $location) {
							$('input').bind('change', function() {

								this.value = this.value.toLocaleUpperCase();
							});
							$('textarea').bind('change', function() {

								this.value = this.value.toLocaleUpperCase();
							});
							$("#box1").hide();
							$("#link").show();
							$("#box2").show();
							var oriRelease = angular.copy($scope.newrelease);

							$scope.resetForm = function() {

								$scope.newrelease = angular.copy(oriRelease);
								$scope.newReleaseForm.$setPristine();
							};

							$scope.isReleaseChanged = function() {

								return !angular.equals($scope.newrelease,
										oriRelease);
							};
							$scope.submitForm = function(isValid) {

								// check to make sure the form is completely valid
								if (isValid) {

									var startDate = $("#startDate").val();
									var plannedDate = $("#plannedDate").val();
									var releaseDate = $("#releaseDate").val();
									if ((startDate > releaseDate)
											|| (startDate > plannedDate)) {
										alert("Invalid Date Range! \n \"Start Date\" cannot be after \"Release Date!\" or \"Planned Date\" ");
									} else {

										if (!$scope.newrelease.type
												|| !$scope.newrelease.too
												|| !$scope.newrelease.status) {
											alert("Please COMPLETE the form!!");
										} else if ($scope.newrelease.version < 0) {
											alert("Version cannot be negative");

										} else if (!$scope.newrelease.description
												|| !$scope.newrelease.title
												|| !$scope.newrelease.items) {
											alert("Please fill the form correctly !!");
										} else {
											release
													.addRelease(
															$scope.newrelease,
															function(response) {

																if (response.status === 400
																		|| response.status === 500) {
																	$scope.testingresult2 = 1;
																	$scope.releases = "404 BAD REQUEST ...... No data found";
																}
															}

													);

											$location.path("/success");
										}

									}
									;

								} else {
									alert("Please COMPLETE the form!!");
								}

							};

						} ])
		.controller(
				'ManageIterationController',
				[
						'$scope',
						'iteration',
						'$location',
						function($scope, iteration, $location) {
							$("#box1").hide();
							$("#link").show();
							$("#box2").show();
							$('input').bind('change', function() {
								this.value = this.value.toLocaleUpperCase();
							});

							var oriIteration = angular
									.copy($scope.newiteration);

							$scope.resetForm = function() {

								$scope.newiteration = angular
										.copy(oriIteration);
								$scope.iterationForm.$setPristine();
							};

							$scope.isIterationChanged = function() {

								return !angular.equals($scope.newiteration,
										oriIteration);
							};

							$("form")
									.submit(
											function() {
												var startDate = $("#startDate")
														.val();
												var endDate = $("#endDate")
														.val();
												if (startDate > endDate) {
													alert("Invalid Date Range! \n \"Start Date\" cannot be after \"Release Date!\"");
												} else {
													$scope.addIteration = function(
															newiteration) {

														if (!newiteration.status
																|| !newiteration.type) {
															alert("Please COMPLETE the form!!");
														} else {

															$scope.message = iteration
																	.addIteration(newiteration);
															newiteration = {};

															$location
																	.path("/success");
														}
													};

												}
												return true;
											});

						} ])
		.controller(
				'ListReleaseController',
				[
						'$scope',
						'release',
						function($scope, release) {
							$("#box1").hide();
							$("#link").show();
							$("#box2").show();
							$scope.testingresult1 = 0;
							$scope.newrelease = {};
							//for fetching all releases.
							release
									.showAllRelease(
											function(result) {

												$scope.releases = result;
											},
											function(response) {
												// error handler
												if (response.status === 400) {
													$scope.testingresult1 = 1;
													$scope.releases = "404 BAD REQUEST ...... No data found";
												}
											});

							var ri = {};
							//for deleting a particular release.
							$scope.deleteRelease = function(relId) {

								for (ri in $scope.releases) {

									if ($scope.releases[ri].relId == relId) {

										$scope.releases.splice(ri, 1);
										release.deleteRelease({
											relId : relId
										});

									}
								}
							};

							//Updating a particular Release.
							$scope.edit = function(id) {

								for (release in $scope.releases) {
									if ($scope.releases[release].relId == id) {
										$scope.newrelease = angular
												.copy($scope.releases[release]);
										rel = $scope.newrelease;
										r = id;
									}
								}
							};
						} ])
		.controller(
				'ListIterationController',
				[
						'$scope',
						'iteration',
						'$location',
						function($scope, iteration, $location) {
							$("#box1").hide();
							$("#link").show();
							$("#box2").show();
							$scope.testingresult = 0;

							$('input').bind('change', function() {
								this.value = this.value.toLocaleUpperCase();
							});

							$scope.newiteration = {};

							iteration
									.showAllIteration(
											{},
											function(result) {

												$scope.iterations = result;

											},
											function(response) {
												// error handler
												if (response.status === 400) {
													$scope.testingresult = 1;
													$scope.iterations = "404 BAD REQUEST ...... No data found";
												}
											});

							var it = {};
							$scope.deleteIteration = function(iteId) {
								for (it in $scope.iterations) {
									if ($scope.iterations[it].iteId == iteId) {
										$scope.iterations.splice(it, 1);

										iteration.deleteIteration({
											iteId : iteId
										});

									}

								}
							};

							$scope.edit = function(id) {
								for (iteration in $scope.iterations) {
									if ($scope.iterations[iteration].iteId == id) {
										$scope.newiteration = angular
												.copy($scope.iterations[iteration]);
										itr = $scope.newiteration;
										i = id;

									}
								}
							};

						} ])
		.controller(
				'EditIterationController',
				[
						'$scope',
						'iteration',
						'$location',
						function($scope, iteration, $location) {
							$("#box1").hide();
							$("#link").show();
							$("#box2").show();
							var oriIteration = angular
									.copy($scope.newiteration);

							$scope.resetForm = function() {

								$scope.newiteration = angular
										.copy(oriIteration);
								$scope.iterationForm.$setPristine();
							};

							$scope.isIterationChanged = function() {

								return !angular.equals($scope.newiteration,
										oriIteration);
							};

							$('input').bind('change', function() {
								this.value = this.value.toLocaleUpperCase();
							});

							$scope.newiteration = itr;

							console.log($scope.newiteration);

							$("form")
									.submit(
											function() {

												var startDate = $("#startDate")
														.val();
												var endDate = $("#endDate")
														.val();

												if (startDate > endDate) {
													alert("Invalid Date Range! \n \"Start Date\" cannot be after \"Release Date!\"");
												}

												else {
													$scope.newiteration.iteId = i;
													$scope.updateIteration = function(
															newiteration) {
														$scope.newiteration.iteId = i;

														iteration
																.updateIteration($scope.newiteration);

														$location
																.path("/success");
													};
												}
												;

												return false;
											});

						} ])
		.controller(
				'EditReleaseController',
				[
						'$scope',
						'release',
						'$location',
						function($scope, release, $location) {

							var oriRelease = angular.copy($scope.newrelease);
							$("#box1").hide();
							$("#link").show();
							$("#box2").show();
							$scope.resetForm = function() {

								$scope.newrelease = angular.copy(oriRelease);
								$scope.newReleaseForm.$setPristine();
							};

							$scope.isReleaseChanged = function() {

								return !angular.equals($scope.newrelease,
										oriRelease);
							};

							$('input').bind('change', function() {
								this.value = this.value.toLocaleUpperCase();
							});

							$scope.newrelease = rel;
							$("form")
									.submit(
											function() {

												var startDate = $("#startDate")
														.val();
												var plannedDate = $(
														"#plannedDate").val();
												var releaseDate = $(
														"#releaseDate").val();

												if ((startDate > releaseDate)
														|| (startDate > plannedDate)) {
													alert("Invalid Date Range! \n \"Start Date\" cannot be after \"Release Date!\" or \"Planned Date\" ");
												} else {
													$scope.newrelease.relId = r;
													$scope.updateRelease = function(
															newrelease) {
														if (!$scope.newrelease.status
																|| !$scope.newrelease.type) {

															alert("Please fill the form correctly !!");
														} else {
															release
																	.updateRelease($scope.newrelease);

															$location
																	.path("/success");
														}
													};
												}
												;

												return false;
											});
						} ])

		.controller(
				'SearchReleaseController',
				[
						'$scope',
						'$compile',
						'release',
						function($scope, $compile, release)

						{
							$("#box1").hide();
							$("#link").show();
							$("#box2").show();
							release.searchRelease({
								searchType : $scope.button_type
							}, {
								searchKey : $scope.typeme
							}, function(result) {

								$scope.releasesearch = result;

							});

							$scope.first = "hello";

							$scope.killer = 1;

							$scope.select_calendar, $scope.f1 = 0,
									$scope.f2 = 0, $scope.f3 = 0,
									$scope.f4 = 0, $scope.validate = false;

							$scope.validate = function() {
								if ($scope.f1 === 0 & $scope.f2 === 0
										& $scope.f3 === 0 & $scope.f4 === 0) {
									alert("please select search type");
									$scope.validatevalue = false;
									return false;
								} else {
									$scope.searchme = $scope.inputme.value;
									$scope.validatevalue = true;

									return true;
								}
							};
							$scope.by_title1 = function() {
								if (($scope.f2 === 0 & ($scope.f1 === 1
										| $scope.f3 === 1 | $scope.f4 === 1))
										| ($scope.f2 === 0 & ($scope.f1 === 0
												| $scope.f3 === 0 | $scope.f4 === 0))) {
									$scope.a = undefined;
									$scope.button_type = "title";
									var yy = document.getElementById("third");
									yy.parentNode.removeChild(yy);

									var newme = document.createElement("div");
									newme.id = "third";
									var secondme = document
											.getElementById("second");
									secondme.appendChild(newme);
									$("#third")
											.append(
													$compile(
															"<div class='col-xs-1'>Title</div><div class='col-xs-11'><input type='text' ng-model='a.title' class='form-control' placeholder='Title'   /></div>")
															($scope));
									$scope.search_by = $scope.titleme;

									$scope.f2 = 1;
								}
								if ($scope.f2 === 1
										& ($scope.f1 === 1 | $scope.f3 === 1 | $scope.f4 === 1)) {
									$scope.a = undefined;
									$scope.button_type = "title";
									var yy = document.getElementById("third");
									yy.parentNode.removeChild(yy);

									var newme = document.createElement("div");
									newme.id = "third";
									var secondme = document
											.getElementById("second");
									secondme.appendChild(newme);
									$("#third")
											.append(
													$compile(
															"<div class='col-xs-1'>Title</div><div class='col-xs-11'><input type='text' ng-model='a.title' class='form-control' placeholder='title'/></div>")
															($scope));
									$scope.search_by = $scope.titleme;

								}
							};

							$scope.by_type1 = function() {
								if ($scope.f3 === 0
										& ($scope.f1 === 1 | $scope.f2 === 1 | $scope.f4 === 1)
										| $scope.f3 === 0
										& ($scope.f1 === 0 | $scope.f2 === 0 | $scope.f4 === 0)) {
									$scope.a = undefined;
									$scope.button_type = "type";
									var yy = document.getElementById("third");
									yy.parentNode.removeChild(yy);

									var newme = document.createElement("div");
									newme.id = "third";
									var secondme = document
											.getElementById("second");
									secondme.appendChild(newme);
									$("#third")
											.append(
													$compile(
															"<div class='col-xs-1'>Type</div><div class='col-xs-11'><select ng-model='a.type' class='form-control' placeholder='type'><option value='SELECT TYPE'>select_type</option><option value='QA'>QA</option><option value='DEV'>DEV</option><option value='Planning'>Planning</option><option value='Release'>Release</option><option value='Regression'>Regression</option></select></div>")
															($scope));
									$scope.search_by = $scope.typeme;
									$scope.f3 = 1;

								}
								if ($scope.f3 === 1
										& ($scope.f1 === 1 | $scope.f2 === 1 | $scope.f4 === 1)) {
									$scope.a = undefined;
									$scope.button_type = "type";
									var yy = document.getElementById("third");
									yy.parentNode.removeChild(yy);
									var newme = document.createElement("div");
									newme.id = "third";
									var secondme = document
											.getElementById("second");
									secondme.appendChild(newme);
									$("#third")
											.append(
													$compile(
															"<div class='col-xs-1'>Type</div><div class='col-xs-11'><select ng-model='a.type' class='form-control' placeholder='type'><option value='SELECT TYPE'>select_type</option><option value='QA'>QA</option><option value='DEV'>DEV</option><option value='Planning'>Planning</option><option value='Release'>Release</option><option value='Regression'>Regression</option></select></div>")
															($scope));
									$scope.search_by = $scope.typeme;

								}

							};

							$scope.by_status1 = function() {
								$scope.a = undefined;
								if ($scope.f4 === 0
										& ($scope.f1 === 1 | $scope.f2 === 1 | $scope.f3 === 1)
										| $scope.f4 === 0
										& ($scope.f1 === 0 | $scope.f2 === 0 | $scope.f3 === 0)) {
									$scope.button_type = "status";
									var yy = document.getElementById("third");
									yy.parentNode.removeChild(yy);

									var newme = document.createElement("div");
									newme.id = "third";
									var secondme = document
											.getElementById("second");
									secondme.appendChild(newme);
									$("#third")
											.append(
													$compile(
															"<div class='col-xs-1'>Status</div><div class='col-xs-11'><select ng-model='a.status' class='form-control' placeholder='status'><option value='SELECT STATUS'>select type</option><option value='Planned'>Planned</option><option value='Working'>Working</option><option value='Completed'>Completed</option>  </select></div>")
															($scope));
									$scope.search_by = $scope.typeme;
									$scope.f4 = 1;

								}
								if ($scope.f4 === 1
										& ($scope.f1 === 1 | $scope.f2 === 1 | $scope.f3 === 1)) {
									$scope.a = undefined;
									$scope.button_type = "status";
									var yy = document.getElementById("third");
									yy.parentNode.removeChild(yy);
									var newme = document.createElement("div");
									newme.id = "third";
									var secondme = document
											.getElementById("second");
									secondme.appendChild(newme);
									$("#third")
											.append(
													$compile(
															"<div class='col-xs-1'>Status</div><div class='col-xs-11'><select ng-model='a.status' class='form-control' placeholder='status'><option value='SELECT STATUS'>select type</option><option value='Planned'>Planned</option><option value='Working'>Working</option><option value='Completed'>Completed</option>  </select></div>")
															($scope));
									$scope.search_by = $scope.typeme;

								}
							};

							$("form").submit(function() {
								return true;
							});

						} ])

		.controller(
				'SearchIterationController',
				[
						'$scope',
						'$compile',
						'iteration',
						function($scope, $compile, iteration)

						{

							iteration.searchIteration({
								searchType : $scope.button_type
							}, {
								searchKey : $scope.typeme
							}, function(result) {

								$scope.iterationsearch = result;
								$scope.y = $scope.a;
								$scope.saveresult = angular.copy(result);

							});
							$("#box1").hide();
							$("#link").show();
							$("#box2").show();
							$scope.first = "hello";

							$scope.killer = 1;

							$scope.select_calendar, $scope.f1 = 0,
									$scope.f2 = 0, $scope.f3 = 0, $scope.f4 = 0;

							$scope.validate = function() {
								if ($scope.f1 === 0 & $scope.f2 === 0
										& $scope.f3 === 0 & $scope.f4 === 0) {
									alert("please select search type");
									$scope.validatevalue = true;
									return false;
								} else {
									$scope.searchme = $scope.inputme.value;

									return true;
								}
							};
							$scope.by_title1 = function() {
								if (($scope.f2 === 0 & ($scope.f1 === 1
										| $scope.f3 === 1 | $scope.f4 === 1))
										| ($scope.f2 === 0 & ($scope.f1 === 0
												| $scope.f3 === 0 | $scope.f4 === 0))) {
									$scope.a = undefined;
									$scope.button_type = "title";
									var yy = document.getElementById("third");
									yy.parentNode.removeChild(yy);

									var newme = document.createElement("div");
									newme.id = "third";
									var secondme = document
											.getElementById("second");
									secondme.appendChild(newme);
									$("#third")
											.append(
													$compile(
															"<div class='col-xs-1'>Title</div><div class='col-xs-11'><input type='text' ng-model='a.title' class='form-control' placeholder='Title' /></div>")
															($scope));
									$scope.search_by = $scope.titleme;

									$scope.f2 = 1;
								}
								if ($scope.f2 === 1
										& ($scope.f1 === 1 | $scope.f3 === 1 | $scope.f4 === 1)) {
									$scope.a = undefined;
									$scope.button_type = "title";
									var yy = document.getElementById("third");
									yy.parentNode.removeChild(yy);

									var newme = document.createElement("div");
									newme.id = "third";
									var secondme = document
											.getElementById("second");
									secondme.appendChild(newme);
									$("#third")
											.append(
													$compile(
															"<div class='col-xs-1'>Title</div><div class='col-xs-11'><input type='text' ng-model='a.title' class='form-control' placeholder='Title'/></div>")
															($scope));
									$scope.search_by = $scope.titleme;
								}
							};

							$scope.by_type1 = function() {
								if ($scope.f3 === 0
										& ($scope.f1 === 1 | $scope.f2 === 1 | $scope.f4 === 1)
										| $scope.f3 === 0
										& ($scope.f1 === 0 | $scope.f2 === 0 | $scope.f4 === 0)) {
									$scope.a = undefined;
									$scope.button_type = "type";
									var yy = document.getElementById("third");
									yy.parentNode.removeChild(yy);

									var newme = document.createElement("div");
									newme.id = "third";
									var secondme = document
											.getElementById("second");
									secondme.appendChild(newme);
									$("#third")
											.append(
													$compile(
															"<div class='col-xs-1'>Type</div><div class='col-xs-11'><select ng-model='a.type' class='form-control' placeholder='Type'><option value='QA'>QA</option><option value='DEV'>DEV</option><option value='Planning'>Planning</option><option value='Release'>Release</option><option value='Regression'>Regression</option><option value=''></option></select></div>")
															($scope));
									$scope.search_by = $scope.typeme;
									$scope.f3 = 1;

								}
								if ($scope.f3 === 1
										& ($scope.f1 === 1 | $scope.f2 === 1 | $scope.f4 === 1)) {
									$scope.a = undefined;
									$scope.button_type = "type";
									var yy = document.getElementById("third");
									yy.parentNode.removeChild(yy);
									var newme = document.createElement("div");
									newme.id = "third";
									var secondme = document
											.getElementById("second");
									secondme.appendChild(newme);
									$("#third")
											.append(
													$compile(
															"<div class='col-xs-1'>Type</div><div class='col-xs-11'><select ng-model='a.type' class='form-control' placeholder='Type'><option value='QA'>QA</option><option value='DEV'>DEV</option><option value='Planning'>Planning</option><option value='Release'>Release</option><option value='Regression'>Regression</option><option value=''></option></select></div>")
															($scope));
									$scope.search_by = $scope.typeme;

								}

							};

							$scope.by_status1 = function() {
								if ($scope.f4 === 0
										& ($scope.f1 === 1 | $scope.f2 === 1 | $scope.f3 === 1)
										| $scope.f4 === 0
										& ($scope.f1 === 0 | $scope.f2 === 0 | $scope.f3 === 0)) {
									$scope.a = undefined;
									$scope.button_type = "status";
									var yy = document.getElementById("third");
									yy.parentNode.removeChild(yy);

									var newme = document.createElement("div");
									newme.id = "third";
									var secondme = document
											.getElementById("second");
									secondme.appendChild(newme);
									$("#third")
											.append(
													$compile(
															"<div class='col-xs-1'>Status</div><div class='col-xs-11'><select ng-model='a.status' class='form-control' placeholder='Status'><option value='Planned'>Planned</option><option value='Working'>Working</option><option value='Completed'>Completed</option>  </select></div>")
															($scope));
									$scope.search_by = $scope.typeme;
									$scope.f4 = 1;

								}
								if ($scope.f4 === 1
										& ($scope.f1 === 1 | $scope.f2 === 1 | $scope.f3 === 1)) {
									$scope.a = undefined;
									$scope.button_type = "status";
									var yy = document.getElementById("third");
									yy.parentNode.removeChild(yy);
									var newme = document.createElement("div");
									newme.id = "third";
									var secondme = document
											.getElementById("second");
									secondme.appendChild(newme);
									$("#third")
											.append(
													$compile(
															"<div class='col-xs-1'>Status</div><div class='col-xs-11'><select ng-model='a.status' class='form-control' placeholder='Status'><option value='Planned'>Planned</option><option value='Working'>Working</option><option value='Completed'>Completed</option>  </select></div>")
															($scope));
									$scope.search_by = $scope.typeme;

								}
							};

							$scope.reset = function() {
								alert("dsfdsg");
								alert($scope.iterationsearch);

							};

							$("form").submit(function() {
								return true;
							});

						} ])

		.controller('ContactController', [ '$scope', function($scope) {
			$scope.message = "rseacrc]eleaase";
		} ]).controller('ProjectList', [ '$scope', function($scope) {
			$("#box2").hide();
			$("#box1").show();
			$("#link").hide();
		} ]).controller('SuccessController', [ '$scope', function($scope) {
			$("#box1").hide();
			$("#link").show();
			$("#box2").show();
		} ]);
;
