
app.service('loginService',function($http){
//读取登录人名称

      this.loginName=function(){
        return $http.get('../login/name.do');
    };

    this.updatepassword=function (searchMap) {
        return $http.post("../login/update.do",searchMap)
    };



});