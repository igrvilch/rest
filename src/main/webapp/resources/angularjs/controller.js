angular.module('coursesApp', []).controller(
		'CoursesController',
		function($scope, $http, $window) {
			$scope.description = {
				text : ""
			};
			$http.get("http://localhost:8080/courses2/rest/api/courses")
					.success(function(response) {
						$scope.courses = response.course;
					});
			$scope.submitMyForm = function() {
				var data = $scope.coursesPost;
				$http.post("http://localhost:8080/courses2/rest/api/addcourse",
						data).success(function(response) {
					$scope.courses.push(response);
				});
			}
		});