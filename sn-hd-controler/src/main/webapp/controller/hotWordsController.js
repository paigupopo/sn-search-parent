app.controller('hotWordsController' ,function($scope,hotWordsService){


    /**
     * 热词
     */
    $scope.selectname=function () {
        hotWordsService.selectName().success(
            function (response) {
                $scope.listName=response;
            }
        )
    }


   window.onload=function () {


            var year=new Date().getFullYear(); //获取当前年份

            var sel = document.getElementById ('sel');//获取select下拉列表
            for ( var i =0; i <3; i++)//循环添加2010到当前年份,每个年份依次添加到下拉列表
            {
                var option = document.createElement ('option');
                option.value = i;
                option.innerHTML = (year-i);
                sel.appendChild (option);

            }

/*
       if(navigator.appName == "Microsoft Internet Explorer"&&parseInt(navigator.appVersion.split(";")[1].replace(/[ ]/g, "").replace("MSIE",""))==9){

           var url=document.location.href;  //获取浏览器访问栏里的地址
           if( url.indexOf("times=")==-1 ){    //判断地址后面是否多了某些值，没有就进方法里进行刷新
               var times = new Date();
               if( url.indexOf("?")==-1 ){
                   window.location.href = url+"?times="+times.getTime();
               }else{
                   window.location.href = url+"&times="+times.getTime();
               }
           }
       }
*/

    }

    /**
     * 总搜索数量
     */

    $scope.selectcount=function () {

        hotWordsService.selectcount().success(
            function (response) {
                $scope.countList=response;

            }
        );
        $scope.selectname();
        $scope.jourCount();
        $scope.selectItem();
        $scope.thisMonth();
        $scope.thisMonthCount();
        $scope.selectCount();
        $scope.selectCity();


    }
    /**
     * 访问量
     */
    $scope.selectItem=function () {
        hotWordsService.selectItem().success(
            function (response) {
                $scope.itemCount=response;
            }
        )
    }


    $scope.selectAddress=function () {
        hotWordsService.selectAddress().success(
            function (response) {
                $scope.addressList=response;

            }
        )
    }
    /**
     * 文章总数
     */
    $scope.jourCount=function () {
        hotWordsService.jourCount().success(
            function (response) {
                $scope.jourCountList=response;
            }
        )
    }

    /**
     * 查询搜索次数的月增长率
     */
    $scope.thisMonth=function () {
        hotWordsService.thisMonth().success(
            function (response) {
                $scope.monthList=response;
            }
        )

    } /**
     * 查询访问次数的月增长率
     */
    $scope.thisMonthCount=function () {
        hotWordsService.thisMonthCount().success(
            function (response) {
                $scope.monthCountList=response;
            }
        )

    }
    /**
     * 查询每个月的数据
     */
    $scope.selectMonth=function () {
        hotWordsService.selectMonth().success(
            function (response) {
                $scope.monthmap = response;

            }
        )
    } /**
     * 查询每个省份的数据
     */
    $scope.selectCity=function () {
        hotWordsService.selectCity().success(
            function (response) {
                $scope.citymap = response;

            }
        )
    }

    $scope.selectCityAddress=function () {
        hotWordsService.selectCityAddress().success(
            function (response) {
                $scope.cityAddress = response;


            }
        )
    }
    /**
     * 知识库数据
     */
    $scope.selectCount=function () {
        hotWordsService.selectCount().success(
            function (response) {
                $scope.knoCount = response;


            }
        )
    }




});