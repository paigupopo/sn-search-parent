app.service('logoService',function($http){

    /**
     * 获取全部数据
     */
    this.findAllLogo=function () {
        return $http.get("../logo/findAll.do")
    }
    //分页
    this.findPage=function(page,rows){
        return $http.get('../logo/findPage.do?page='+page+'&rows='+rows);
    }
    //增加
    this.add=function(entity){
        return  $http.post('../logo/add.do',entity );
    }

    //查询实体
    this.findOne=function(id){
        return $http.get('../logo/findOne.do?id='+id);
    }

    //修改
    this.update=function(entity){
        return  $http.post('../logo/update.do',entity );
    }
    //删除
    this.dele=function(ids){
        return $http.get('../logo/delete.do?ids='+ids);
    }
    //搜索
    this.search=function(page,rows,searchEntity){
        return $http.post('../logo/search.do?page='+page+"&rows="+rows, searchEntity);
    }
    //更新solr数据
    this.updatesolr=function(){
        return $http.post('../logo/solrupdate.do');
    }


});