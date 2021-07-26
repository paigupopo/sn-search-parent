app.service('searchService',function($http){

    //遂宁搜索
	this.snSearch=function(searchMap){

		return $http.post('../sn/search.do',searchMap);
	};

	//推荐数据展示
    this.searchName=function (searchMap) {
        return $http.post('../sn/searchName.do',searchMap)

    }

    this.selectLogo=function (groupId) {
        return $http.post('../sn/selectLogo.do',groupId);

    }



    //读取列表数据绑定到表单中
    this.find=function(searchMap){
        return $http.post('../layout/findAll.do',searchMap);
    }
    //分页
    this.findPage=function(page,rows){
        return $http.get('../Governmenthots/findPage.do?page='+page+'&rows='+rows);
    }
    //查询实体
    this.findOne=function(id){
        return $http.get('../Governmenthots/findOne.do?id='+id);
    }
    //增加
    this.add=function(entity){
        return  $http.post('../Governmenthots/add.do',entity );
    }

    //删除
    this.dele=function(ids){
        return $http.get('../Governmenthots/delete.do?ids='+ids);
    };
    this.findAll=function(){
        return $http.get('../governmenthotsiterm/findAll.do');
    };
    //分页
    this.findPage=function(page,rows){
        return $http.get('../governmenthotsiterm/findPage.do?page='+page+'&rows='+rows);
    }
    //查询实体
    this.findOne=function(id){
        return $http.get('../governmenthotsiterm/findOne.do?id='+id);
    }
    //增加
    this.addAll=function(entity){
        return  $http.post('../governmenthotsiterm/add.do',entity );
    }

    //删除
    this.dele=function(ids){
        return $http.get('../governmenthotsiterm/delete.do?ids='+ids);
    }

    this.findByParentId=function (searchMap) {

        return $http.post('../layout/layoutList.do',searchMap);

    }

    this.getCategoryName = function(cateGoryFlag) {
        return $http.get('../sn/getCategoryName.do?cateGoryFlag=' + cateGoryFlag);
    }

    this.getTop = function() {
        return $http.get('../sn/getTop.do');
    }


});