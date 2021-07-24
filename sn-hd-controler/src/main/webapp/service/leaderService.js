//服务层
app.service('leaderService',function($http){

    //读取列表数据绑定到表单中
    this.findAll=function(){
        return $http.get('../leader/findAll.do');
    }
    /**
     * 分页展示数据
     * @param page
     * @param rows
     */
    this.findPage=function(page,rows){
        return $http.get('../leader/findPage.do?page='+page+'&rows='+rows);
    }
    /**
     * 根据id查询实体
     * @param id
     */
    this.findOne=function(id){
        return $http.get('../leader/findOne.do?id='+id);
    }
    /**
     * 添加实体数据
     * @param entity
     */
    this.add=function(entity){
        return  $http.post('../leader/add.do',entity );
    }
    /**
     * 修改数据
     * @param entity
     */
    this.update=function(entity){
        return  $http.post('../leader/update.do',entity );
    }

    /**
     * 根据id删除数据或批量删除数据
     * @param ids
     */
    this.delete=function(ids){
        return $http.get('../leader/delete.do?ids='+ids);
    }
    /**
     * 搜索数据
     * @param page
     * @param rows
     * @param searchEntity
     */
    //搜索
    this.search=function(page,rows,searchEntity){
        return $http.post('../leader/search.do?page='+page+"&rows="+rows, searchEntity);
    }
    /**
     * 同步数据到solr
     */
    this.updateSolr=function(){
        return $http.post('../leader/solrUpdate.do');
    }
});
