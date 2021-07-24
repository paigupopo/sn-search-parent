app.controller('indexController', function ($scope, $controller, loginService) {


    $scope.searchMap = {'password': '', 'loginName': ''}
//读取当前登录人
    $scope.showLoginName = function () {
        loginService.loginName().success(
            function (response) {
                $scope.loginName = response.loginName;

                $scope.searchMap.loginName = response.loginName;


            }
        );
    }


});