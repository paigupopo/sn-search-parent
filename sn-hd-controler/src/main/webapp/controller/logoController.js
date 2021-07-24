
app.controller('logoController',function ($scope,$controller,logoService){


    $controller('baseController',{$scope:$scope});//继承

    /**
     * 查询全部
     */
    $scope.searchAll=function () {
        logoService.findAllLogo().success(
            function (response) {
                $scope.list=response
            }
        )
    }
    //分页
    $scope.findPage=function(page,rows){
        logoService.findPage(page,rows).success(
            function(response){
                $scope.list=response.rows;
                $scope.paginationConf.totalItems=response.total;//更新总记录数
            }
        );
    };
    $scope.searchEntity={};//定义搜索对象

    //搜索
    $scope.Search=function(page,rows){
        logoService.search(page,rows,$scope.searchEntity).success(
            function(response){
                $scope.list=response.rows;
                $scope.paginationConf.totalItems=response.total;//更新总记录数
            }
        );
    };


    //查询实体
    $scope.findOne=function(id){

        logoService.findOne(id).success(
            function(response){
                $scope.entity= response;
                var logo=$scope.entity.logoimg;
                var img=document.getElementById("img");
                img.src=logo;

            }
        );
    }


    //保存修改对象
    $scope.saveupdate=function(){
        var serviceObject;//服务层对象
        var options=$("#name option:selected");
       var name= options.text();

       if("无效"==name){
           $scope.entity.start=0;
       }else{
           $scope.entity.start=1;

       }

        //如果有ID
        serviceObject=logoService.update( $scope.entity ); //修改

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

    //保存添加数据
    $scope.saveadd=function (id) {
        var serviceObject;//服务层对象

        var options=$("#status option:selected");
        var status= options.text();

        if("无效"==status){
            $scope.entity.start=0;
        }else{
            $scope.entity.start=1;

        }
        serviceObject=logoService.add( $scope.entity  );//增加
        serviceObject.success(
            function(response){
                if(response.success){
                    //重新查询
                    $scope.reloadList();//重新加载
                    $scope.findOne(id);
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

            if ($scope.selectIds==''){
                alert("请选择您要删除的数据")
            }else{
                //获取选中的复选框
                logoService.dele( $scope.selectIds ).success(
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

});

