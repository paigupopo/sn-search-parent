//控制层
app.controller('leaderController' ,function($scope,$controller   ,leaderService){

    $controller('baseController',{$scope:$scope});//继承

    //读取列表数据绑定到表单中
    $scope.findAll=function(){
        leaderService.findAll().success(
            function(response){
                $scope.list=response;
            }
        );
    }



    //分页
    $scope.findPage=function(page,rows){
        leaderService.findPage(page,rows).success(
            function(response){
                $scope.list=response.rows;
                $scope.paginationConf.totalItems=response.total;//更新总记录数
            }
        );
    };

    //查询实体
    $scope.findOne=function(id){
        leaderService.findOne(id).success(
            function(response){
                $scope.entity= response;
               var imgUrl = $scope.entity.qalImg
               var img=document.getElementById("img");
               img.src="http://www.suining.gov.cn"+imgUrl

            }
        );

    }

    $scope.saveupdate=function(){
        var serviceObject;//服务层对象
        //如果有ID
        serviceObject=leaderService.update( $scope.entity ); //修改

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

        serviceObject=leaderService.add( $scope.entity  );//增加
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

            //获取选中的复选框
            leaderService.delete( $scope.selectIds ).success(
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
        else {

            return;
        }

    }

    $scope.searchEntity={};//定义搜索对象

    //搜索
    $scope.Search=function(page,rows){
        leaderService.search(page,rows,$scope.searchEntity).success(
            function(response){
                $scope.list=response.rows;
                $scope.paginationConf.totalItems=response.total;//更新总记录数
            }
        );
    }

    $scope.chooseAll=function (){

        var checkall=document.getElementById("checkall");

        var checknames=document.getElementsByName("checkname");

        for(var i=0;i<checknames.length;i++){

            checknames[i].checked=checkall.checked;
        }

    }

    //同步数据到solr
    //更新solr数据
    $scope.updateSolr=function () {

        document.getElementById("loadingDiv").style.display="block";

        leaderService.updateSolr().success(

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
