'use strict';

angular.module('release',
		[ 'ngRoute', 'ngResource', 'release.controllers', 'release.services' ])
		.config([ '$routeProvider', function($routeProvider) {

			$routeProvider.when('/ManageRelease', {
				templateUrl : 'app/partials/manage_release.html',
				controller : 'ManageReleaseController'
			}).when('/', {
				templateUrl : 'app/partials/home.html',
				controller : 'ProjectList'
			}).when('/ManageIteration', {
				templateUrl : 'app/partials/manage_iteration.html',
				controller : 'ManageIterationController'
			}).when('/listIteration1', {
				templateUrl : 'app/partials/manage_iteration1.html',
				controller : 'ManageIterationController1'
			}).when('/success', {
				templateUrl : 'app/partials/success.html',
				controller : 'SuccessController'
			}).when('/ListRelease', {
				templateUrl : 'app/partials/list_release.html',
				controller : 'ListReleaseController'
			}).when('/ListIteration', {
				templateUrl : 'app/partials/list_iteration.html',
				controller : 'ListIterationController'
			}).when('/SearchRelease', {
				templateUrl : 'app/partials/search_release.html',
				controller : 'SearchReleaseController'
			}).when('/SearchIteration', {
				templateUrl : 'app/partials/search_iteration.html',
				controller : 'SearchIterationController'
			}).when('/Contact', {
				templateUrl : 'app/partials/contact.html',
				controller : 'ContactController'
			}).when('/EditIteration', {
				templateUrl : 'app/partials/edit_iteration.html',
				controller : 'EditIterationController'
			}).when('/EditRelease', {
				templateUrl : 'app/partials/edit_release.html',
				controller : 'EditReleaseController'
			});

		} ]);