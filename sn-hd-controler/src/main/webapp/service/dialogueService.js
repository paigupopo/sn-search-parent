//服务层
app.service('dialogueService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../dialogue/findAll.do');		
	};
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../dialogue/findPage.do?page='+page+'&rows='+rows);
	};
	//查询实体
	this.findOne=function(id){
		return $http.get('../dialogue/findOne.do?id='+id);
	};
	//增加 
	this.add=function(entity){
		return  $http.post('../dialogue/add.do',entity );
	};
	//修改 
	this.update=function(entity){
		return  $http.post('../dialogue/update.do',entity );
	};
	//删除
	this.delete=function(ids){
		return $http.get('../dialogue/delete.do?ids='+ids);
	};
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('../dialogue/search.do?page='+page+"&rows="+rows, searchEntity);
	};
	//更新solr 数据
    this.solrupdate=function(){
        return $http.post('../dialogue/updatesolr.do');
    }
});
