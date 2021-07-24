//服务层
app.service('GovernmentHotsItem',function($http){

    //读取列表数据绑定到表单中
    this.findAll=function(){
        return $http.get('../Governmenthotsiterm/findAll.do');
    }
    //分页
    this.findPage=function(page,rows){
        return $http.get('../Governmenthotsiterm/findPage.do?page='+page+'&rows='+rows);
    }
    //查询实体
    this.findOne=function(id){
        return $http.get('../Governmenthotsiterm/findOne.do?id='+id);
    }
    //增加
    this.add=function(entity){
        return  $http.post('../Governmenthotsiterm/add.do',entity );
    }

    //删除
    this.dele=function(ids){
        return $http.get('../Governmenthotsiterm/delete.do?ids='+ids);
    }
    /*//搜索
    this.search=function(page,rows,searchEntity){
        return $http.post('../Governmenthots/search.do?page='+page+"&rows="+rows, searchEntity);
    }*/

});
