//服务层
app.service('knowledgelibService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../knowledgelib/findAll.do');		
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../knowledgelib/findPage.do?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../knowledgelib/findOne.do?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../knowledgelib/add.do',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../knowledgelib/update.do',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../knowledgelib/delete.do?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('../knowledgelib/search.do?page='+page+"&rows="+rows, searchEntity);
	}
	//更新solr数据
    this.updatesolr=function(){
        return $http.post('../knowledgelib/solrupdate.do');
    }
    this.knoSearch=function(searchMap){
        return $http.post('../knowledgelib/knoSearch.do',searchMap);
    }

});
