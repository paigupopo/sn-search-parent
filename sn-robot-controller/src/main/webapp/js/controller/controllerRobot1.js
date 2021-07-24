/*
app.controller("controllerRobot",function ($scope,robotService){



    $scope.searchMap={'keywords':""};
    $scope.robotSearch=function () {

        if($scope.searchMap.keywords!=''){

            robotService.robotService($scope.searchMap).success(

                function(response) {


                    var divmessage = document.getElementById("message");
                    var div1 = document.createElement("div");
                    var divwenTi = document.createElement("div");
                    var ul = document.createElement("ul");
                    var li = document.createElement("li");

                    ul.setAttribute("class", "dialog");
                    li.setAttribute("class", 'center');
                    li.innerHTML = "<a title=\"\">" +
                        $scope.searchMap.keywords +
                        "</a>";
                    ul.appendChild(li);

                    var whtml = divwenTi.innerHTML;
                    if (isEmpty(whtml.trim())) {
                        divwenTi.appendChild(ul);
                    }
                    else {
                        while (divwenTi.hasChildNodes()) {
                            divwenTi.removeChild(divwenTi.firstChild);
                        }
                        divwenTi.appendChild(ul);
                    }

                    var divzhuijia = document.createElement("div");
                    var divdialogtab = document.createElement("div");
                    divdialogtab.setAttribute("class","dialog_tab");
                    var divCont = document.createElement("div");
                    divCont.innerHTML = "<div class=\"right_arrow\"></div><span class=\"triangle\"></span>";

                    var divtab2_content1 = document.createElement("div");
                    divtab2_content1.setAttribute("class","tab2_content");
                    var strcont="";
                   for (var n=0;n< response.row.length;n++)
                   {
                       strcont+="<ul class=\"news\"><li><div><a href=";
                       strcont+=response.row[n]["url"];
                       strcont+="target=\"_blank\" >";
                       strcont+=response.row[n]["title"];
                       strcont+="</a><span class=\"bszn\">";
                      // strcont+=response.row[n]["gatype"];
                       strcont+="</span></div></li></ul>";
                   }
                    for (var j=0;j< response.jo.length;j++)
                    {
                        strcont+="<ul class=\"news\"><li><div><a href=";
                        strcont+=response.jo[j]["url"];
                        strcont+="target=\"_blank\" >";
                        strcont+=response.jo[j]["title"];
                        strcont+="</a><span class=\"bszn\">";
                        //strcont+=response.jo[j]["username"];
                        strcont+="</span></div></li></ul>";
                    }
                    for (var l=0;l< response.rows.length;l++)
                    {

                        strcont+="<ul class=\"news\"><li><div><a href=";
                        strcont+="javascript:void(0)  onclick=shuju(this,";
                        strcont+=response.rows[l]["qaklContent"];
                        strcont+=")>";
                        strcont+=response.rows[l]["qaklTitle"];

                        strcont+="</div></li></ul>";
                    }

                    if(response.qs!=null&&response.qs!=undefined&&response!=''){
                        for (var c=0;c< response.qs.length;c++)
                        {
                            strcont+="<ul class=\"news\"><li><div>";

                            strcont+="<span class=\"bszn\"></span>";
                            strcont+=response.qs[c]["qadContent"];
                            strcont+="</div></li></ul>";
                        }
                    }



                    divtab2_content1.innerHTML=strcont;

                    divCont.appendChild(divtab2_content1);
                    divdialogtab.appendChild(divCont);
                    divzhuijia.appendChild(divdialogtab);
                    div1.appendChild(divwenTi);
                    div1.appendChild(divzhuijia);
                    divmessage.appendChild(div1);
                }
            );
        }else{
           alert("请输入您要问的内容")
            return;
        }


    };



    //判断页面加载
 user=function (gatype,id,title,url) {
     this.gatype=gatype;
     this.id=id;
     this.title=title;
     this.url= url;
 }

    //常见问题
    $scope. show0=function(event,div,ul){

        document.getElementById(ul).value="";
         $scope.searchMap.keywords=event.target.innerText;

        $scope.robotSearch(div,ul);


    };


 isEmpty= function(obj){
        if(typeof obj == "undefined" || obj == null || obj == ""){
            return true;
        }else{
            return false;
        }
    }



//回车搜索
    $scope.enterEvent = function (event,div,ul) {
        var hc = event.keyCode;
        if(hc==13){

            $scope.robotSearch(div,ul);
            document.getElementById(ul).value="";
        }
    };


    //点击加载更多
   $scope.cleak=function (div) {
    document.getElementById(div).value="";

    }
    $scope.shuju=function (event,id) {

        Helper.ui.dialog({
            content: id,
            title:event.target.innerText,

            showButton: false
        });

    }


});*/
