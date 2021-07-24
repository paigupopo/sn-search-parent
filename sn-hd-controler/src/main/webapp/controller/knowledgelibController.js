 //控制层 
app.controller('knowledgelibController' ,function($scope,$controller ,knowledgelibService){
	
	$controller('baseController',{$scope:$scope});//继承

    $scope.searchMap={'str':''};
	
    //读取列表数据绑定到表单中  
	$scope.findAll=function(){
		knowledgelibService.findAll().success(
			function(response){
				$scope.list=response;
			}			
		);
	}    
	
	//分页
	$scope.findPage=function(page,rows){			
		knowledgelibService.findPage(page,rows).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	};
	
	//查询实体 
	$scope.findOne=function(id){				
		knowledgelibService.findOne(id).success(
			function(response){
				$scope.entity= response;


                if( $scope.entity.qaklState==0){
                    document.getElementById("name").innerHTML='';
                    var html='';
                    html+='<option  value="0" selected>无效</option >\n' +
                        '                                    <option  value="1">有效</option>\n';
                    document.getElementById("name").innerHTML+=html;
                    return;
                }
                if ($scope.entity.qaklState==1){
                    document.getElementById("name").innerHTML='';
                    var html='';
                    html+='<option  value="1" selected>有效</option >\n' +
                        '                                    <option  value="0">无效</option>\n';

                    document.getElementById("name").innerHTML+=html;
                    return;
                }


			}
		);				
	}

    $scope.saveupdate=function(){


        var serviceObject;//服务层对象

        var serviceObject;//服务层对象
        var options=$("#name option:selected");
        var name= options.text();



        if("无效"==name){
            $scope.entity.qaklState=0;
        }else{
            $scope.entity.qaklState=1;

        }

        //如果有ID
            serviceObject=knowledgelibService.update( $scope.entity ); //修改

        serviceObject.success(
            function(response){
                if(response.success){
                    //重新查询
                    $scope.reloadList();//重新加载
                    alert(response.message)
                }else{
                    alert(response.message);
                }
            }
        );
    };

	$scope.saveadd=function () {
        var serviceObject;//服务层对象
        var options=$("#status option:selected");
        var status= options.text();

        if("无效"==status){
            $scope.entity.qaklState=0;
        }else{
            $scope.entity.qaklState=1;

        }

        serviceObject=knowledgelibService.add( $scope.entity  );//增加
        serviceObject.success(
            function(response){
                if(response.success){
                    //重新查询
                    $scope.reloadList();//重新加载
                    alert(response.message)
                }else{
                    alert(response.message);
                }
            }
        );

    }


	
	 
	//批量删除 
	$scope.dele=function(){
        if(confirm("您确认删除吗")){
            //判断用户是否选择了id
            if($scope.selectIds==''){
               alert("请选择您要删除的数据")
            }else{
                //获取选中的复选框
                knowledgelibService.dele( $scope.selectIds ).success(
                    function(response){
                        if(response.success){
                            $scope.reloadList();//刷新列表
                            $scope.selectIds=[];
                            alert(response.message)
                        }else{
                            alert(response.message)
                        }
                    }
                );
            }

        }
        else {

            return;
        }

	};
	
	$scope.searchEntity={};//定义搜索对象 


    /**
     * 搜索
     * @param page
     * @param rows
     */

    $scope.Search=function (page,rows) {
       $scope.searchMap.str= document.getElementById("search").value;


        if($scope.searchMap.str!=''){
            knowledgelibService.knoSearch( $scope.searchMap).success(
                function (response) {
                    $scope.list=response;
                    $scope.paginationConf.totalItems=response.total;//更新总记录数

                    //格式化时间格式
                    for(var i=0;i<=response.length;i++){
                        var date0=response[i]['qaklRecordcreatetime'];

                        var curTime = new Date(date0).format("yyyy-MM-dd");
                       response[i]['qaklRecordcreatetime']=curTime;

                    }

                }
            )

        }else{
            knowledgelibService.search(page,rows,$scope.searchEntity).success(
                function(response){
                    $scope.list=response.rows;
                    $scope.paginationConf.totalItems=response.total;//更新总记录数

                    //格式化时间格式
                    for(var i=0;i<=response.rows.length;i++){
                        var date0=response.rows[i]['qaklRecordcreatetime'];

                        var curTime = new Date(date0).format("yyyy-MM-dd");
                        response.rows[i]['qaklRecordcreatetime']=curTime;

                    }
                }
            );
        }

    };

    $scope.chooseAll=function (){

        var checkall=document.getElementById("checkall");

        var checknames=document.getElementsByName("checkname");

        for(var i=0;i<checknames.length;i++){

            checknames[i].checked=checkall.checked;
        }

    }

    //更新solr数据
    $scope.updateSolr=function () {
        document.getElementById("loadingDiv").style.display="block";

        knowledgelibService.updatesolr().success(
            function (response) {
                if(response.success){
                    alert("同步成功")
                    //无论成功或者失败都移除效果
                    document.getElementById("loadingDiv").style.display="none";
                }else{
                    alert("同步失败")
                    document.getElementById("loadingDiv").style.display="none";
                }

            }
        )
    };





    
});	
