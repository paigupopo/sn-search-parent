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
                    var flag=true;
                    if(response.row!=null&&response.row!=undefined&&response.row!=''){
                        for (var n=0;n< response.row.length;n++)
                        {
                            strcont+="<ul class=\"news\"><li><div><a href=";
                            strcont+=response.row[n]["url"];
                            strcont+=" target=\"_blank\"";
                            strcont+=" >";
                            strcont+=response.row[n]["title"];
                            strcont+="</a><span class=\"bszn\">";
                           // strcont+=response.row[n]["gatype"];
                            strcont+="</span></div></li></ul>";
                        }
                        flag=false;
                    }
                    if( response.jo!=null&& response.jo!=undefined&& response.jo!=''){
                      for (var j=0;j< response.jo.length;j++)
                      {
                          strcont+="<ul class=\"news\"><li><div><a href=";
                          strcont+=response.jo[j]["url"];
                          strcont+="  target=\"_blank\"";
                          strcont+=">";
                          strcont+=response.jo[j]["title"];
                          strcont+="</a><span class=\"bszn\">";
                          //strcont+=response.jo[j]["username"];
                          strcont+="</span></div></li></ul>";
                      }
                        flag=false;
                  }
                    if(response.rows!=null&&response.rows!=undefined&&response.rows!=''){
                        for (var l=0;l< response.rows.length;l++)
                        {
                            strcont+="<ul class=\"news\"><li><div id='ll'><a href=\"javascript:void(0)\"";
                            strcont+="onclick=shuju(this,'";
                            strcont+=response.rows[l]["qaklContent"];
                            strcont+="')>";
                            strcont+=response.rows[l]["qaklTitle"];

                            strcont+="</div></li></ul>";
                        }
                        flag=false;
                    }
                    if (response.leader!=null&&response.leader!=undefined&&response.leader!=''){

                        for (var d = 0; d < response.leader.length; d++) {
                            strcont+="<span>";
                            strcont += response.leader[d]["qalName"];
                            strcont+="</span>";
                            strcont+="<div class=\"c_text\" id=\"c_text\">";
                            strcont+="<img  height=\"459\"";
                            strcont+="src=\"";
                            strcont+=response.leader[d]["qalImg"];
                            strcont+="\" width=\"400\">";
                            strcont+=response.leader[d]["qalSynopsis"];
                            strcont+="<br>";
                            strcont+=response.leader[d]["qalResume"];
                            strcont+="</div>";
                            strcont+="<a href=\"";
                            strcont+=response.leader[d]["qalUrl"];
                            strcont+="\" target=\"_blank\" class=\"adwz\">";
                            strcont+="????????????????????????";
                            strcont+="</a>";
                            strcont+="<p class=\"more-dan\" id=\"jjj\"";
                            strcont+="onclick=\"leader();\">";
                            strcont+="[????????????]"+"</p>"
                        }
                        flag=false;
                    }



                    if(response.qs!=null&&response.qs!=undefined&&response!='') {
                        for (var c = 0; c < response.qs.length; c++) {
                            strcont+="<div>";
                            strcont += response.qs[c]["qadContent"];
                            strcont+="</div>"
                        }
                        flag=false;
                    }
                    if(response.min!=null&&response.min!=undefined&&response.min!=''){
                        strcont+="<div>";
                        strcont+="????????????????????????????????????";
                        strcont+="<em style=\"color: #ce2b2b\">?????????</em>";
                        strcont+="???????????????????????????";
                        flag=false
                    }
                    if(flag){
                        strcont+="<div>";
                        strcont+="?????????????????????????????????????????????????????????12345???????????????";
                        strcont+="</div>"
                    }
                    divtab2_content1.innerHTML=strcont;
                    divCont.appendChild(divtab2_content1);
                    divdialogtab.appendChild(divCont);
                    divzhuijia.appendChild(divdialogtab);
                    div1.appendChild(divwenTi);
                    div1.appendChild(divzhuijia);
                    divmessage.appendChild(div1);

                    $('.c_text').css({
                        'overflow' : 'hidden',
                        'height' : '134px'
                    });
                    $('#jjj').html("[????????????]");
                    divmessage.scrollTop = divmessage.scrollHeight;
                }
            );
        }else{
           alert("???????????????????????????");
            return;
        }


    };



    $scope.welcomeTime=function () {
        var  time=new Date();
      var hours=time.getHours();
      alert(222)

    var id=document.getElementById("huanying").innerText;

    $("huanying").innerText
        alert(111)

      var str="??????????????????????????????????????????????????????????????????";
        if(hours < 6){
            document.getElementById("huanying").innerText+= "?????????"+str;
        }else if (hours < 9){
            document.getElementById("huanying").innerText+="????????????"+str;
        }else if (hours < 12){
            document.getElementById("huanying").innerText+="????????????"+str;
        }else if (hours < 14){
            document.getElementById("huanying").innerText+= "????????????"+str;
        }else if (hours < 17){
            document.getElementById("huanying").innerText+= "????????????"+str;
        }else if (hours < 19){
            document.getElementById("huanying").innerText+="????????????"+str;
        }else {
            document.getElementById("huanying").innerText+="????????????"+str;
        }
    }

    //??????????????????
 user=function (gatype,id,title,url) {
     this.gatype=gatype;
     this.id=id;
     this.title=title;
     this.url= url;
 }

    //????????????
    $scope. show0=function(event,div,ul){

        document.getElementById(ul).value='';
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



//????????????
    $scope.enterEvent = function (event,div,ul) {
        var hc = event.keyCode;
        if(hc==13){

            $scope.robotSearch(div,ul);
            document.getElementById(ul).value="";
        }
    };


    //??????????????????
   $scope.cleak=function (div) {
    document.getElementById(div).value="";

    }
    shuju=function (ev,id) {

        Helper.ui.dialog({
            content: id,
            title:ev.innerText,

            showButton: false
        });

    }

    var flag = true;
    leader= function() {

        if (flag) {
            $('.c_text').css({
                "overflow" : "visible",
                "height" : "auto"

            });

            $('#jjj').html("[??????]");

            flag = false;
        } else {

            $('.c_text').css({
                'overflow' : 'hidden',
                'height' : '134px'
            });
            $('#jjj').html("[????????????]");

            flag = true;
        }


    }



});*/
