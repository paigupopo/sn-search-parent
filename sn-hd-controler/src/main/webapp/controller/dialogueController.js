 //控制层 
app.controller('dialogueController' ,function($scope,$controller,$filter,dialogueService){
	
	$controller('baseController',{$scope:$scope});//继承


    //读取列表数据绑定到表单中  
	$scope.findAll=function(){
		dialogueService.findAll().success(
			function(response){
				$scope.list=response;
			}			
		);
	}    
	
	//分页
	$scope.findPage=function(page,rows){			
		dialogueService.findPage(page,rows).success(
			function(response){
				$scope.list=response.rows;

				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	};
	
	//查询实体 
	$scope.findOne=function(id){				
		dialogueService.findOne(id).success(
			function(response){
				$scope.entity= response;


                if( $scope.entity.qadState==0){
                    document.getElementById("name").innerHTML='';
                    var html='';
                    html+='<option  value="0" selected>无效</option >\n' +
                        '                                    <option  value="1">有效</option>\n';
                    document.getElementById("name").innerHTML+=html;
                    return;
                }
                if ($scope.entity.qadState==1){
                    document.getElementById("name").innerHTML='';
                    var html='';
                    html+='<option  value="1" selected>有效</option >\n' +
                        '                                    <option  value="0">无效</option>\n';

                    document.getElementById("name").innerHTML+=html;
                    return;
                }
			}
		);				
	};
	
	//保存 
	$scope.save=function(){				
		var serviceObject;//服务层对象  				
		if($scope.entity.id!=null){//如果有ID

            var options=$("#name option:selected");
            var name= options.text();

            if("无效"==name){
                $scope.entity.qadState=0;
            }else{
                $scope.entity.qadState=1;

            }
			serviceObject=dialogueService.update( $scope.entity ); //修改  
		}else{
            var options=$("#status option:selected");
            var status= options.text();

            if("无效"==status){
                $scope.entity.qadState=0;
            }else{
                $scope.entity.qadState=1;

            }
			serviceObject=dialogueService.add( $scope.entity);//增加
		}				
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
        	//判断用户是否选择id
			if($scope.selectIds==''){
				alert("请您选择您要删除的数据")
			}else{
                //获取选中的复选框
                dialogueService.delete( $scope.selectIds ).success(
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

	}
	
	$scope.searchEntity={};//定义搜索对象 
	
	//搜索
	$scope.Search=function(page,rows){

		dialogueService.search(page,rows,$scope.searchEntity).success(
			function(response){
				$scope.list=response.rows;
				$scope.paginationConf.totalItems=response.total;//更新总记录数

                for(var i=0;i<=response.rows.length;i++){
                    var date0=response.rows[i]['qadCreatetime'];
                    var date=response.rows[i]['qadUpdatetime'];
                    if(date!=null){
                        var updTime = new Date(date).format("yyyy-MM-dd");
                    }

                    var curTime = new Date(date0).format("yyyy-MM-dd");
                    response.rows[i]['qadCreatetime']=curTime;
                    response.rows[i]['qadUpdatetime']=updTime;

                }
			}			
		);
	};

    $scope.selectIds=[];//选中的 ID 集合
//更新复选
    $scope.updateSelection = function($event, id) {
        if($event.target.checked){//如果是被选中,则增加到数组
            $scope.selectIds.push( id);
        }else{
            var idx = $scope.selectIds.indexOf(id);
            $scope.selectIds.splice(idx, 1);//删除
        }
    }

//获取选中的ID
    $scope.selectIds=[];  //定义一个数组

    $scope.updateSelection=function($event,id){  //实现获取勾选框ID的方法
        if($event.target.checked){ //判断是否勾选了数据
            $scope.selectIds.push(id); //勾选了的haul则就把id  push到数组中
        }else{
            $scope.selectIds.splice($scope.selectIds.indexOf(id), 1);  //如果取消则就删除勾选时存的id，后面的1代表删除几个，固定写法默认为1，因为就算取消勾选也只能一个一个的取消
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

        dialogueService.solrupdate().success(

        	function (response) {
        		if(response.success){
					alert("同步成功");
					//无论成功或者失败都移除效果
                    document.getElementById("loadingDiv").style.display="none";
				}else{
        			alert("同步失败");
                    document.getElementById("loadingDiv").style.display="none";

                }

            }
		)
    }






});	
