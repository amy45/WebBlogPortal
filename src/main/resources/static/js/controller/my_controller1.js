'use strict';

define(function () {
    return ['$scope','$http', function ($scope,$http) {
    	
    	
    	 $http.get("http://localhost:9000/greeting")
    	    .then(function(response) {
    	        $scope.myWelcome = response.data;
    	    });

    	
    	
    	
    }];
});
