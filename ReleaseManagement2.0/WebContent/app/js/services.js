'use strict';

angular.module('release.services', []).service('release', function($resource) {

	return $resource('', {}, {
		showAllRelease : {
			method : 'GET',
			url : 'rest/release/showRelease',
			isArray : true
		},
		deleteRelease : {
			method : 'DELETE',
			params : {
				rId : "@relId"
			},
			url : 'rest/release/deleteRelease' + ':rId'
		},
		addRelease : {
			method : 'POST',
			url : 'rest/release/addRelease'
		},
		updateRelease : {
			method : 'PUT',
			url : 'rest/release/editRelease'
		},
		searchRelease : {
			method : 'GET',
			url : 'rest/release/hisearch',
			isArray : true
		}
	});
}).service('iteration', function($resource) {
	return $resource('', {}, {
		showAllIteration : {
			method : 'GET',
			url : 'rest/iteration/showIteration',
			isArray : true
		},
		deleteIteration : {
			method : 'DELETE',
			params : {
				iid : "@iteId"
			},
			url : 'rest/iteration/deleteIteration' + ':iid'
		},
		addIteration : {
			method : 'POST',
			url : 'rest/iteration/addIteration'
		},
		updateIteration : {
			method : 'PUT',
			url : 'rest/iteration/editIteration'
		},
		searchIteration : {
			method : 'GET',
			url : 'rest/iteration/hisearch',
			isArray : true
		}

	});
});