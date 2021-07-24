app.service('robotService',function($http){
    //遂宁
    this.robotService=function(searchMap){

        return $http.post('robot/search.do',searchMap);
    };

});