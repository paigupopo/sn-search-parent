//服务层
app.service('Governmenthots',function($http){

    //读取列表数据绑定到表单中
    this.findAll=function(){
        return $http.get('../Governmenthots/findAll.do');
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
    }
    /*//搜索
    this.search=function(page,rows,searchEntity){
        return $http.post('../Governmenthots/search.do?page='+page+"&rows="+rows, searchEntity);
    }*/

});
