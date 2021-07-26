app.controller("searchController",function ($scope,searchService) {

    $scope.searchMap={'keywords':'','gao':'','gao1':'','gao2':'','gao3':'',
        'time':'','group':'','groupId':'','pageNo':1,'pageSize':10,'sortField':''
        ,'sort':'','title':'','title1':'','layoutname':'','groupIp':'' , 'serviceType':''
        , 'categoryName' : ''};


    $scope.shuju=function() {
        //var url="http://192.168.2.102:8088/?groupId=15003&fromAnother=true&keywords=再见";

        //获取当前来源路径
        var url = window.location.href;
        var ip =returnCitySN['cid'];
        $scope.searchMap.groupIp=ip;
        //解析获取的路径
        var url2 = decodeURI(url);

        //将路径拆分获取需要的字段站点id groupId 和 关键字 keywords
        var uResult= url2.substring(url2.indexOf("?")+1);
        //获取当前用户来源的ip,根据IP来检索搜索记录词语
        var uResult1= url2.substring(0,url2.indexOf("?")-1);
        $scope.groupIp=uResult1;

        var arr= uResult.split("&");

        for(var n=0;n<arr.length;n++){
            var temp= arr[n];
            var arrTemp= temp.split("=");

            if ("keywords"==arrTemp[0]){
                var word=arrTemp[1];
                var index=word.lastIndexOf("#");
                if(index>0){
                    word=word.substring(0,index)

                }
                $scope.searchMap.keywords=word;

            }
            if ("groupId"==arrTemp[0]){
                var id=arrTemp[1];
                var groupid= id.split("?");

                $scope.searchMap.groupId=groupid[0]

            }
            var ref= document.referrer;
            if(ref.indexOf(".cn")!=-1){
                var Ausr=ref.split(".cn");
                for(var i=0;i<Ausr.length;i++){
                    var Busr=Ausr[0];
                    Busr+=".cn";
                    var logourl= document.getElementById("logourl");

                    logourl.href=Busr

                }
            }else{
                var logourl= document.getElementById("logourl");
                logourl.href=ref;
            }
            var groupId=$scope.searchMap.groupId;
            if(groupId==10184){

                var cont=document.getElementById("biao");
                cont.innerText="中共遂宁市委   遂宁市人民政府版权所有   Copyright 2018 www.suining.gov.cn All Rights Reserved\n" +
                    "承办：遂宁市人民政府办公室 (0825-2312860) 网站维护：遂宁市大数据中心 (0825-2689313)\n" +
                    "蜀ICP备：05028878号 网站标识码：5109000015";

                var ha= document.getElementById("bian");
                ha. innerText="川公网安备 51099102000041号";
                ha.href='http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=51099102000041'

                var footimages=document.getElementById("footimages");
                footimages.innerHTML="" +
                    "<li><a href=\"http://www.12377.cn/ \" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_03.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li> " +
                    "<li><a href=\"http://www.scjb.gov.cn/guide\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_05.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"http://www.12377.cn/node_548446.htm\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_09.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"https://zfwzxx.www.gov.cn/check_web/errorInfo/jcInfo/d9697d5c-1568-4fed-be0f-b7825a899fbe-902709118\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_10.png\" width=\"102\" height=\"52\" border=\"0\" align=\"top\"></a> </li> <li class=\"dzjg\"> <script type=\"text/javascript\"></script> <a href=\"http://bszs.conac.cn/sitename?method=show&amp;id=97AE1FDDA5AF0E97E05310291AAC6A64\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_12.png\" width=\"45\" height=\"52\" border=\"0\" align=\"top\"></a> </li>" +
                    "";
            }
            if(groupId==15165){
                var cont=document.getElementById("biao");
                cont.innerText="安居区人民政府版权所有   Copyright 2019 www.scanju.gov.cn All Rights Reserved\n" +
                    "电话：0825-8663368 网站维护：安居区电子政务管理中心    电子邮箱：ajqwg@126.com\n" +
                    "网站识别码：5109040003     蜀ICP备12003430号";

                var ha= document.getElementById("bian");
                ha. innerText=" 川公网安备 51090402000008号 ";
                ha.href='http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=51090402000008'
                var footimages=document.getElementById("footimages");
                footimages.innerHTML="" +
                    "<li><a href=\"http://www.12377.cn/ \" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_03.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li> " +
                    "<li><a href=\"http://www.scjb.gov.cn/guide\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_05.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"http://www.12377.cn/node_548446.htm\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_09.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"https://zfwzgl.www.gov.cn/exposure/jiucuo.html?site_code=5109040003&url=http%3A%2F%2Fwww.scanju.gov.cn%2F\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_10.png\" width=\"102\" height=\"52\" border=\"0\" align=\"top\"></a> <!--a href=\"https://zfwzxx.www.gov.cn/check_web/errorInfo/jcInfo/d9697d5c-1568-4fed-be0f-b7825a899fbe-902709118\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_10.png\" width=\"102\" height=\"52\" border=\"0\" align=\"top\"></a--> </li> <li class=\"dzjg\"> <script type=\"text/javascript\"></script> <a href=\"http://bszs.conac.cn/sitename?method=show&id=0B0039620EF30FDBE053022819AC4C5D\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_12.png\" width=\"45\" height=\"52\" border=\"0\" align=\"top\"></a> </li>" +
                "";

            }
            if(groupId==11463106){
                var cont=document.getElementById("biao");
                cont.innerText="Copyright 2017 www.chuanshan.gov.cn All Rights Reserved\n" +
                    "\n" +
                    "主办：中共船山区委 船山区人民政府　 承办: 船山区人民政府办公室 (0825-2224737)\n" +
                    "\n" +
                    "蜀ICP备10014763号    政府网站标识码:5109030018  ";

                var ha= document.getElementById("bian");
                ha. innerText=" 川公网安备51090302000210号 ";
                ha.href='http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=51090302000210'
                var footimages=document.getElementById("footimages");
                footimages.innerHTML="" +
                    "<li><a href=\"http://www.12377.cn/ \" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_03.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li> " +
                    "<li><a href=\"http://www.scjb.gov.cn/guide\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_05.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"http://www.12377.cn/node_548446.htm\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_09.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"https://zfwzgl.www.gov.cn/exposure/jiucuo.html?site_code=5109030018&url=http%3A%2F%2Fsnssfw.suining.gov.cn%2F\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_10.png\" width=\"102\" height=\"52\" border=\"0\" align=\"top\"></a> <!--a href=\"https://zfwzxx.www.gov.cn/check_web/errorInfo/jcInfo/d9697d5c-1568-4fed-be0f-b7825a899fbe-902709118\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_10.png\" width=\"102\" height=\"52\" border=\"0\" align=\"top\"></a--> </li> <li class=\"dzjg\"> <script type=\"text/javascript\"></script> <a href=\"http://bszs.conac.cn/sitename?method=show&id=13A78F80FED7254EE053022819AC0B13\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_12.png\" width=\"45\" height=\"52\" border=\"0\" align=\"top\"></a> </li>" +
                "";


            }
            if(groupId==15177){
                var cont=document.getElementById("biao");
                cont.innerText="网站标识码：5109220007　蜀ICP备12013223号　  \n" +
                    "版权所有：射洪市人民政府　主办：中共射洪市委 射洪市人民政府　承办：射洪市人民政府办公室 \n" +
                    "市县互联网不良与违法信息举报中心联系电话：0825-2988759 0825-6836262";

                var ha= document.getElementById("bian");
                ha. innerText=" 川公网安备 51092202000001号 ";
                ha.href='http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=51092202000001'
                var footimages=document.getElementById("footimages");
                footimages.innerHTML="" +
                    "<li><a href=\"http://www.12377.cn/ \" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_03.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li> " +
                    "<li><a href=\"http://www.scjb.gov.cn/guide\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_05.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"http://www.12377.cn/node_548446.htm\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_09.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"https://zfwzgl.www.gov.cn/exposure/jiucuo.html?site_code=5109030018&url=http%3A%2F%2Fsnssfw.suining.gov.cn%2F\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_10.png\" width=\"102\" height=\"52\" border=\"0\" align=\"top\"></a> </li> <li class=\"dzjg\"> <script type=\"text/javascript\"></script> <a href=\"http://bszs.conac.cn/sitename?method=show&id=1290DBEB7EB11427E053022819AC9EFD\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_12.png\" width=\"45\" height=\"52\" border=\"0\" align=\"top\"></a> </li>" +
                    "";

            }
            if(groupId==15171){
                var cont=document.getElementById("biao");
                cont.innerText="蓬溪县人民政府网 版权所有 蓬溪县人民政府   Copyright 2019 www.pengxi.gov.cn All Rights Reserved\n" +
                    "主办单位：中共蓬溪县县委办公室  蓬溪县人民政府办公室   承办单位：蓬溪县行政审批局    电话：0825-5425637  \n" +
                    "   蜀ICP备05003399号     网站标识码:5109210007";

                var ha= document.getElementById("bian");
                ha. innerText=" 川公网安备 51092102510943 号  ";
                ha.href='http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=51092102510943'
                var footimages=document.getElementById("footimages");
                footimages.innerHTML="" +
                    "<li><a href=\"http://www.12377.cn/ \" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_03.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li> " +
                    "<li><a href=\"http://www.scjb.gov.cn/guide\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_05.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"http://www.12377.cn/node_548446.htm\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_09.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"https://zfwzgl.www.gov.cn/exposure/jiucuo.html?site_code=51092102510943&url=http%3A%2F%2Fsnssfw.suining.gov.cn%2F\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_10.png\" width=\"102\" height=\"52\" border=\"0\" align=\"top\"></a> </li> <li class=\"dzjg\"> <script type=\"text/javascript\"></script> <a href=\"http://bszs.conac.cn/sitename?method=show&id=1094B99180ED7472E053022819AC7DE8\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_12.png\" width=\"45\" height=\"52\" border=\"0\" align=\"top\"></a> </li>" +
                    "";
            }
            if(groupId==15183){
                var cont=document.getElementById("biao");
                cont.innerText="主办：大英县人民政府   联系电话：0825-7823136\n" +
                    "网站维护：大英县人民政府电子政务外网中心   \n" +
                    "蜀ICP备06016105号 网站标识码：5109230008 ";

                var ha= document.getElementById("bian");
                ha. innerText=" 川公网安备51092302000240  ";
                ha.href='http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=51092302000240'

                var footimages=document.getElementById("footimages");
                footimages.innerHTML="" +
                    "<li><a href=\"http://www.12377.cn/ \" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_03.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li> " +
                    "<li><a href=\"http://www.scjb.gov.cn/guide\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_05.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"http://www.12377.cn/node_548446.htm\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_09.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"https://zfwzgl.www.gov.cn/exposure/jiucuo.html?site_code=5109230008&url=http%3A%2F%2Fsnssfw.suining.gov.cn%2F\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_10.png\" width=\"102\" height=\"52\" border=\"0\" align=\"top\"></a> </li> <li class=\"dzjg\"> <script type=\"text/javascript\"></script> <a href=\"http://bszs.conac.cn/sitename?method=show&id=100A4F2C337576DFE053012819ACF2AF\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_12.png\" width=\"45\" height=\"52\" border=\"0\" align=\"top\"></a> </li>" +
                    "";
            }
            if(groupId==5739126){
                var cont=document.getElementById("biao");
                cont.innerText="四川遂宁高新技术产业园区版权所有   Copyright 2018 http://gxq.suining.gov.cn All Rights Reserved\n" +
                    "承办：四川遂宁高新技术产业园区 (0825-2710005) 网站维护：四川遂宁高新技术产业园区 (0825-2710005)\n" +
                    "蜀ICP备：19038492号 网站标识码：5109000054 "
                var ha= document.getElementById("bian");
                ha. innerText=" 公安机关备案号：51090302000233  ";
                ha.href='http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=51090302000233'
                var footimages=document.getElementById("footimages");
                footimages.innerHTML="" +
                    "<li><a href=\"http://www.12377.cn/ \" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_03.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li> " +
                    "<li><a href=\"http://www.scjb.gov.cn/guide\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_05.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"http://www.12377.cn/node_548446.htm\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_09.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"https://zfwzgl.www.gov.cn/exposure/jiucuo.html?site_code=5109000054&url=http%3A%2F%2Fsnssfw.suining.gov.cn%2F\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_10.png\" width=\"102\" height=\"52\" border=\"0\" align=\"top\"></a> </li> <li class=\"dzjg\"> <script type=\"text/javascript\"></script> <a href=\"http://bszs.conac.cn/sitename?method=show&id=9694174AF819C70AE05310291AAC2AEA\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_12.png\" width=\"45\" height=\"52\" border=\"0\" align=\"top\"></a> </li>" +
                    "";

            }
            if(groupId==15189){
                var cont=document.getElementById("biao");
                cont.innerText="国家级遂宁经济技术开发区   Copyright 2018 http://snjkq.suining.gov.cn/ Rights Reserved\n" +
                    "承办：遂宁经济技术开发区管理委员会 ( 0825-2311986 ) 网站维护：遂宁经济技术开发区党政办公室 ( 0825-2311986 )\n" +
                    "蜀ICP备19039036号  网站标识码：5109000044 　";

                var ha= document.getElementById("bian");
                ha. innerText="川公网安备 51099002000165号  ";
                ha.href='http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=51099002000165'
                var footimages=document.getElementById("footimages");
                footimages.innerHTML="" +
                    "<li><a href=\"http://www.12377.cn/ \" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_03.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li> " +
                    "<li><a href=\"http://www.scjb.gov.cn/guide\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_05.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"http://www.12377.cn/node_548446.htm\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_09.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"https://zfwzgl.www.gov.cn/exposure/jiucuo.html?site_code=51099002000165&url=http%3A%2F%2Fsnssfw.suining.gov.cn%2F\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_10.png\" width=\"102\" height=\"52\" border=\"0\" align=\"top\"></a> </li> <li class=\"dzjg\"> <script type=\"text/javascript\"></script> <a href=\"http://bszs.conac.cn/sitename?method=show&id=0AF14100427F5E41E053012819ACAE53\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_12.png\" width=\"45\" height=\"52\" border=\"0\" align=\"top\"></a> </li>" +
                    "";

            }
            if(groupId==43914){
                var cont=document.getElementById("biao");
                cont.innerText="四川遂宁河东新区管委会版权所有   Copyright 2019 hdxq.suining.gov.cn All Rights Reserved\n" +
                    "电话：0825-2911011 网站维护：河东新区电子政务管理中心    \n" +
                    "网站识别码：5109000024      蜀ICP备19040380号";

                var ha= document.getElementById("bian");
                ha. innerText=" 川公网安备 51099102000052号   ";
                ha.href='http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=51099102000052'
                var footimages=document.getElementById("footimages");
                footimages.innerHTML="" +
                    "<li><a href=\"http://www.12377.cn/ \" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_03.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li> " +
                    "<li><a href=\"http://www.scjb.gov.cn/guide\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_05.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"http://www.12377.cn/node_548446.htm\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_09.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"https://zfwzgl.www.gov.cn/exposure/jiucuo.html?site_code=51099102000052&url=http%3A%2F%2Fsnssfw.suining.gov.cn%2F\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_10.png\" width=\"102\" height=\"52\" border=\"0\" align=\"top\"></a> </li> <li class=\"dzjg\"> <script type=\"text/javascript\"></script> <a href=\"http://bszs.conac.cn/sitename?method=show&id=6D3EEFB4C36D64A4E053022E1AAC4CF1\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_12.png\" width=\"45\" height=\"52\" border=\"0\" align=\"top\"></a> </li>" +
                    "";
            }
            if(groupId==14937){
                var cont=document.getElementById("biao");
                cont.innerText="遂宁市发展改革委员会 蜀ICP备19040649号 网站标识码：5109000013"
                var footimages=document.getElementById("footimages");
                footimages.innerHTML="" +
                    "<li><a href=\"http://www.12377.cn/ \" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_03.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li> " +
                    "<li><a href=\"http://www.scjb.gov.cn/guide\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_05.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"http://www.12377.cn/node_548446.htm\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_09.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"https://zfwzgl.www.gov.cn/exposure/jiucuo.html?site_code=5109000013&url=http%3A%2F%2Fsnssfw.suining.gov.cn%2F\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_10.png\" width=\"102\" height=\"52\" border=\"0\" align=\"top\"></a> </li> <li class=\"dzjg\"> <script type=\"text/javascript\"></script> <a href=\"http://bszs.conac.cn/sitename?method=show&id=0ADFDCE9F8923EF1E053022819ACDB78\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_12.png\" width=\"45\" height=\"52\" border=\"0\" align=\"top\"></a> </li>" +
                    "";
            }
            if(groupId==14943){
                var cont=document.getElementById("biao");
                cont.innerText="Copyright © 2019 sjxw.suining.gov.cn All Rights Reserved " +
                    "版权所有：遂宁市经济和信息化局蜀ICP备19038493号   网站标识码:5109000049"
                var footimages=document.getElementById("footimages");
                footimages.innerHTML="" +
                    "<li><a href=\"http://www.12377.cn/ \" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_03.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li> " +
                    "<li><a href=\"http://www.scjb.gov.cn/guide\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_05.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"http://www.12377.cn/node_548446.htm\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_09.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"https://zfwzgl.www.gov.cn/exposure/jiucuo.html?site_code=5109000049&url=http%3A%2F%2Fsnssfw.suining.gov.cn%2F\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_10.png\" width=\"102\" height=\"52\" border=\"0\" align=\"top\"></a> </li> <li class=\"dzjg\"> <script type=\"text/javascript\"></script> <a href=\"http://bszs.conac.cn/sitename?method=show&id=0B149B005EC01AF3E053022819ACF544\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_12.png\" width=\"45\" height=\"52\" border=\"0\" align=\"top\"></a> </li>" +
                    "";
            }
            if(groupId==2975180){
                var cont=document.getElementById("biao");
                cont.innerText="遂宁市教育体育局版权所有   Copyright 2018 sjyj.suining.gov.cn All Rights Reserved\n" +
                    "网站维护：遂宁市教育体育局 (0825-2280923) 承办：遂宁市教育体育局  (0825-2280419)\n" +
                    "蜀ICP备：10202229号-1 网站标识码：5109000050 "
                var ha= document.getElementById("bian");
                ha. innerText="公安机关备案号：51090302000229   ";
                ha.href='http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=51090302000229'
                var footimages=document.getElementById("footimages");
                footimages.innerHTML="" +
                    "<li><a href=\"http://www.12377.cn/ \" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_03.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li> " +
                    "<li><a href=\"http://www.scjb.gov.cn/guide\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_05.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"http://www.12377.cn/node_548446.htm\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_09.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"https://zfwzgl.www.gov.cn/exposure/jiucuo.html?site_code=5109000050&url=http%3A%2F%2Fsnssfw.suining.gov.cn%2F\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_10.png\" width=\"102\" height=\"52\" border=\"0\" align=\"top\"></a> </li> <li class=\"dzjg\"> <script type=\"text/javascript\"></script> <a href=\"http://bszs.conac.cn/sitename?method=show&id=0ADCC2E0B9920DA2E053012819ACECB2\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_12.png\" width=\"45\" height=\"52\" border=\"0\" align=\"top\"></a> </li>" +
                    "";

            }
            if(groupId==14955){
                var cont=document.getElementById("biao");
                cont.innerText="Copyright © 2010 遂宁市科学技术局蜀ICP备19038491号 网站标识码：5109000032 "
                var ha= document.getElementById("bian");
                ha. innerText="公安备案号：51099002000117   ";
                ha.href='http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=51099002000117'

                var footimages=document.getElementById("footimages");
                footimages.innerHTML="" +
                    "<li><a href=\"http://www.12377.cn/ \" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_03.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li> " +
                    "<li><a href=\"http://www.scjb.gov.cn/guide\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_05.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"http://www.12377.cn/node_548446.htm\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_09.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"https://zfwzgl.www.gov.cn/exposure/jiucuo.html?site_code=5109000032&url=http%3A%2F%2Fsnssfw.suining.gov.cn%2F\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_10.png\" width=\"102\" height=\"52\" border=\"0\" align=\"top\"></a> </li> <li class=\"dzjg\"> <script type=\"text/javascript\"></script> <a href=\"http://bszs.conac.cn/sitename?method=show&id=0ADBD326B701558AE053022819AC6EA7\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_12.png\" width=\"45\" height=\"52\" border=\"0\" align=\"top\"></a> </li>" +
                    "";
            }
            if(groupId==14961){
                var cont=document.getElementById("biao");
                cont.innerText="四川省遂宁市公安局 版权所有      \n" +
                    "网站标识码 5109000020     备案编号:蜀ICP备19038494号    "
                var ha= document.getElementById("bian");
                ha. innerText="川公网安备 51099102000053号   ";
                ha.href='http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=51099102000053'

                var footimages=document.getElementById("footimages");
                footimages.innerHTML="" +
                    "<li><a href=\"http://www.12377.cn/ \" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_03.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li> " +
                    "<li><a href=\"http://www.scjb.gov.cn/guide\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_05.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"http://www.12377.cn/node_548446.htm\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_09.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"https://zfwzgl.www.gov.cn/exposure/jiucuo.html?site_code=5109000020&url=http%3A%2F%2Fsnssfw.suining.gov.cn%2F\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_10.png\" width=\"102\" height=\"52\" border=\"0\" align=\"top\"></a> </li> <li class=\"dzjg\"> <script type=\"text/javascript\"></script> <a href=\"http://bszs.conac.cn/sitename?method=show&id=0B147BFDED35467BE053022819AC8BD0\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_12.png\" width=\"45\" height=\"52\" border=\"0\" align=\"top\"></a> </li>" +
                    "";
            }
            if(groupId==14967){
                var cont=document.getElementById("biao");
                cont.innerText="遂宁市扶贫开发局版权所有   Copyright 2018 sfpym.suining.gov.cn All Rights Reserved \n" +
                    "承办：遂宁市扶贫开发局  (0825-2318455) 网站维护：遂宁市扶贫开发局 (0825-2318455) \n" +
                    "蜀ICP备20003685号-1  网站标识码：5109000051 公安机关备案号：51099102000042"
                var ha= document.getElementById("bian");
                ha. innerText="公安机关备案号：51099102000042   ";
                ha.href='http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=51099102000042'

                var footimages=document.getElementById("footimages");
                footimages.innerHTML="" +
                    "<li><a href=\"http://www.12377.cn/ \" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_03.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li> " +
                    "<li><a href=\"http://www.scjb.gov.cn/guide\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_05.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"http://www.12377.cn/node_548446.htm\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_09.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"https://zfwzgl.www.gov.cn/exposure/jiucuo.html?site_code=5109000051&url=http%3A%2F%2Fsnssfw.suining.gov.cn%2F\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_10.png\" width=\"102\" height=\"52\" border=\"0\" align=\"top\"></a> </li> <li class=\"dzjg\"> <script type=\"text/javascript\"></script> <a href=\"http://bszs.conac.cn/sitename?method=show&id=97E6174E4EECB25CE05310291AACE850\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_12.png\" width=\"45\" height=\"52\" border=\"0\" align=\"top\"></a> </li>" +
                    "";
            }
            if(groupId==14973){
                var cont=document.getElementById("biao");
                cont.innerText=" 遂宁市民政局 Copyright (C) 2008-2010 地址：遂宁市河东新区环岛商务中心7502室 邮编：629000 电话：0825-2325678 邮箱:scsnmzj@126.com\n" +
                    "ICP备案:蜀ICP备19039865号 网站标识码:5109000027   "
                var footimages=document.getElementById("footimages");
                footimages.innerHTML="" +
                    "<li><a href=\"http://www.12377.cn/ \" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_03.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li> " +
                    "<li><a href=\"http://www.scjb.gov.cn/guide\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_05.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"http://www.12377.cn/node_548446.htm\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_09.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"https://zfwzgl.www.gov.cn/exposure/jiucuo.html?site_code=5109000027&url=http%3A%2F%2Fsnssfw.suining.gov.cn%2F\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_10.png\" width=\"102\" height=\"52\" border=\"0\" align=\"top\"></a> </li> <li class=\"dzjg\"> <script type=\"text/javascript\"></script> <a href=\"http://bszs.conac.cn/sitename?method=show&id=0B14B6378A5B2637E053012819ACF316\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_12.png\" width=\"45\" height=\"52\" border=\"0\" align=\"top\"></a> </li>" +
                    "";
            }
            if(groupId==14979){
                var cont=document.getElementById("biao");
                cont.innerText=" 遂宁市司法局\n" +
                    "                地址：四川省遂宁市和平西路177号     电话：0825-2224963     邮件:snssfj@163.com\n" +
                    "                蜀ICP备20000377号  网站标识码:5109000009 "
                var footimages=document.getElementById("footimages");
                footimages.innerHTML="" +
                    "<li><a href=\"http://www.12377.cn/ \" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_03.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li> " +
                    "<li><a href=\"http://www.scjb.gov.cn/guide\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_05.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"http://www.12377.cn/node_548446.htm\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_09.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"https://zfwzgl.www.gov.cn/exposure/jiucuo.html?site_code=5109000009&url=http%3A%2F%2Fsnssfw.suining.gov.cn%2F\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_10.png\" width=\"102\" height=\"52\" border=\"0\" align=\"top\"></a> </li> <li class=\"dzjg\"> <script type=\"text/javascript\"></script> <a href=\"http://bszs.conac.cn/sitename?method=show&id=14D829BB600902CCE053012819AC5CCB\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_12.png\" width=\"45\" height=\"52\" border=\"0\" align=\"top\"></a> </li>" +
                    "";
            }
            if(groupId==14985){
                var cont=document.getElementById("biao");
                cont.innerText=" 版权所有 遂宁市财政局 Copyright © 2013 http://sczj.suining.gov.cn All Rights Reserved\n" +
                    "遂宁市财政局联系电话：0825-2314666 \n" +
                    "蜀ICP备20006132号 网站标识码:5109000040";

                var ha= document.getElementById("bian");
                ha. innerText="川公网安备 51090302000215号   ";
                ha.href='http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=51090302000215'
                var footimages=document.getElementById("footimages");
                footimages.innerHTML="" +
                    "<li><a href=\"http://www.12377.cn/ \" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_03.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li> " +
                    "<li><a href=\"http://www.scjb.gov.cn/guide\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_05.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"http://www.12377.cn/node_548446.htm\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_09.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"https://zfwzgl.www.gov.cn/exposure/jiucuo.html?site_code=5109000040&url=http%3A%2F%2Fsnssfw.suining.gov.cn%2F\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_10.png\" width=\"102\" height=\"52\" border=\"0\" align=\"top\"></a> </li> <li class=\"dzjg\"> <script type=\"text/javascript\"></script> <a href=\"http://bszs.conac.cn/sitename?method=show&id=0AF154FBC36F6460E053022819ACB36A\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_12.png\" width=\"45\" height=\"52\" border=\"0\" align=\"top\"></a> </li>" +
                    "";

            }
            if(groupId==14991){
                var cont=document.getElementById("biao");
                cont.innerText=" 蜀ICP备19039527号 网站标识码：5109000011 \n" +
                    "遂宁市互联网不良与违法信息举报中心电话（传真）：0825-2988759　邮箱： sn_wgb@126.com \n" +
                    "版权所有：遂宁市人力资源和社会保障局 "
                var ha= document.getElementById("bian");
                ha. innerText="遂公网安备51090302000225    ";
                ha.href='http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=51090302000225 '
                var footimages=document.getElementById("footimages");
                footimages.innerHTML="" +
                    "<li><a href=\"http://www.12377.cn/ \" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_03.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li> " +
                    "<li><a href=\"http://www.scjb.gov.cn/guide\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_05.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"http://www.12377.cn/node_548446.htm\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_09.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"https://zfwzgl.www.gov.cn/exposure/jiucuo.html?site_code=5109000011&url=http%3A%2F%2Fsnssfw.suining.gov.cn%2F\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_10.png\" width=\"102\" height=\"52\" border=\"0\" align=\"top\"></a> </li> <li class=\"dzjg\"> <script type=\"text/javascript\"></script> <a href=\"http://bszs.conac.cn/sitename?method=show&id=0B021F00987F2141E053012819AC9CF3\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_12.png\" width=\"45\" height=\"52\" border=\"0\" align=\"top\"></a> </li>" +
                    "";

            }
            if(groupId==2971893){
                var cont=document.getElementById("biao");
                cont.innerText="  版权所有：遂宁市自然资源和规划局\n" +
                    "联系电话: 0825-2310976    电子信箱:gtzyj@suining.gov.cn\n" +
                    "网站标识码:5109000031 \n" +
                    "工信部备案号：蜀ICP备18008725号 "

                var ha= document.getElementById("bian");
                ha. innerText="   川公网安备 51090302000219号 ";
                ha.href='http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=51090302000219 '
                var footimages=document.getElementById("footimages");
                footimages.innerHTML="" +
                    "<li><a href=\"http://www.12377.cn/ \" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_03.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li> " +
                    "<li><a href=\"http://www.scjb.gov.cn/guide\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_05.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"http://www.12377.cn/node_548446.htm\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_09.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"https://zfwzgl.www.gov.cn/exposure/jiucuo.html?site_code=5109000031&url=http%3A%2F%2Fsnssfw.suining.gov.cn%2F\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_10.png\" width=\"102\" height=\"52\" border=\"0\" align=\"top\"></a> </li> <li class=\"dzjg\"> <script type=\"text/javascript\"></script> <a href=\"http://bszs.conac.cn/sitename?method=show&id=54A24443AC842C1FE053022819ACA28C\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_12.png\" width=\"45\" height=\"52\" border=\"0\" align=\"top\"></a> </li>" +
                    "";

            }
            if(groupId==15003){
                var cont=document.getElementById("biao");
                cont.innerText=" 遂宁市住房和城乡建设局 地址：遂宁市渠河中路999号 TEL：0825-2223571 邮政编码：629001\n" +
                    "蜀ICP备10035315号 网站标识码：5109000028"
                var ha= document.getElementById("bian");
                ha. innerText="  公安机关备案号：51090302000105  ";
                ha.href='http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=51090302000105 '
                var footimages=document.getElementById("footimages");
                footimages.innerHTML="" +
                    "<li><a href=\"http://www.12377.cn/ \" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_03.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li> " +
                    "<li><a href=\"http://www.scjb.gov.cn/guide\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_05.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"http://www.12377.cn/node_548446.htm\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_09.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"https://zfwzgl.www.gov.cn/exposure/jiucuo.html?site_code=5109000028&url=http%3A%2F%2Fsnssfw.suining.gov.cn%2F\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_10.png\" width=\"102\" height=\"52\" border=\"0\" align=\"top\"></a> </li> <li class=\"dzjg\"> <script type=\"text/javascript\"></script> <a href=\"http://bszs.conac.cn/sitename?method=show&id=0B08B4FBB2AA07F3E053022819AC2A4B\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_12.png\" width=\"45\" height=\"52\" border=\"0\" align=\"top\"></a> </li>" +
                    "";

            }
            if(groupId==15015){
                var cont=document.getElementById("biao");
                cont.innerText="遂宁市交通运输局 蜀ICP备19038498号-1   川公网安备 51099002000177号   网站标识码：5109000019 "
                var ha= document.getElementById("bian");
                ha. innerText="  川公网安备 51099002000177号";
                ha.href='http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=51099002000177 '
                var footimages=document.getElementById("footimages");
                footimages.innerHTML="" +
                    "<li><a href=\"http://www.12377.cn/ \" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_03.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li> " +
                    "<li><a href=\"http://www.scjb.gov.cn/guide\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_05.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"http://www.12377.cn/node_548446.htm\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_09.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"https://zfwzgl.www.gov.cn/exposure/jiucuo.html?site_code=5109000019&url=http%3A%2F%2Fsnssfw.suining.gov.cn%2F\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_10.png\" width=\"102\" height=\"52\" border=\"0\" align=\"top\"></a> </li> <li class=\"dzjg\"> <script type=\"text/javascript\"></script> <a href=\"http://bszs.conac.cn/sitename?method=show&id=0ADEEABE76B610FCE053012819ACEABA\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_12.png\" width=\"45\" height=\"52\" border=\"0\" align=\"top\"></a> </li>" +
                    "";
            }
            if(groupId==15129){
                var cont=document.getElementById("biao");
                cont.innerText="遂宁市水利局版权所有 Copyright 2019 swj.suining.gov.cn All Rights 承办：遂宁市水利局 网站维护：遂宁市水利局\n" +
                    "互联网不良与违法信息举报中心电话（传真）：0825-2988759  举报邮箱：sn_wgb@126.com \n" +
                    "本网站违法和不良信息举报电话:0825-2710053 电子邮箱：snsslj@163.com\n" +
                    "蜀ICP备20001452号  网站标识码：5109000025 "

                var ha= document.getElementById("bian");
                ha. innerText="遂公网安备51090302000234";
                ha.href='http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=51090302000234 '

                var footimages=document.getElementById("footimages");
                footimages.innerHTML="" +
                    "<li><a href=\"http://www.12377.cn/ \" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_03.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li> " +
                    "<li><a href=\"http://www.scjb.gov.cn/guide\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_05.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"http://www.12377.cn/node_548446.htm\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_09.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"https://zfwzgl.www.gov.cn/exposure/jiucuo.html?site_code=5109000025&url=http%3A%2F%2Fsnssfw.suining.gov.cn%2F\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_10.png\" width=\"102\" height=\"52\" border=\"0\" align=\"top\"></a> </li> <li class=\"dzjg\"> <script type=\"text/javascript\"></script> <a href=\"http://bszs.conac.cn/sitename?method=show&id=0ADECF7FCD0C054BE053022819AC452F\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_12.png\" width=\"45\" height=\"52\" border=\"0\" align=\"top\"></a> </li>" +
                    "";
            }
            if(groupId==1687591){
                var cont=document.getElementById("biao");
                cont.innerText="版权所有：遂宁市农业农村局  联系电话：0825-2665099\n" +
                    "效能投诉电话：0825-2370018    电子信箱：snsnyjbgs@163.com\n" +
                    "网站标识码:5109000022    公安机关备案号:51099002000166号\n" +
                    "工信部备案号：蜀ICP备19038499号 "
                var ha= document.getElementById("bian");
                ha. innerText="公安机关备案号:51099002000166号";
                ha.href='http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=51099002000166 '
                var footimages=document.getElementById("footimages");
                footimages.innerHTML="" +
                    "<li><a href=\"http://www.12377.cn/ \" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_03.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li> " +
                    "<li><a href=\"http://www.scjb.gov.cn/guide\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_05.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"http://www.12377.cn/node_548446.htm\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_09.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"https://zfwzgl.www.gov.cn/exposure/jiucuo.html?site_code=5109000022&url=http%3A%2F%2Fsnssfw.suining.gov.cn%2F\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_10.png\" width=\"102\" height=\"52\" border=\"0\" align=\"top\"></a> </li> <li class=\"dzjg\"> <script type=\"text/javascript\"></script> <a href=\"https://bszs.conac.cn/sitename?method=show&id=0B0206A28D875E00E053022819AC3380\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_12.png\" width=\"45\" height=\"52\" border=\"0\" align=\"top\"></a> </li>" +
                    "";

            }
            if(groupId==15027){
                var cont=document.getElementById("biao");
                cont.innerText="遂宁市林业局版权所有   Copyright 2018 slyj.suining.gov.cn All Rights Reserved\n" +
                    "承办：遂宁市林业局 (0825-2711836) 网站维护：遂宁市林业局(0825-2711836)\n" +
                    "蜀ICP备：19039866号 网站标识码：5109000005 "
                var ha= document.getElementById("bian");
                ha. innerText="公安机关备案号：51099002000176";
                ha.href='http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=51099002000176 '
                var footimages=document.getElementById("footimages");
                footimages.innerHTML="" +
                    "<li><a href=\"http://www.12377.cn/ \" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_03.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li> " +
                    "<li><a href=\"http://www.scjb.gov.cn/guide\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_05.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"http://www.12377.cn/node_548446.htm\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_09.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"https://zfwzgl.www.gov.cn/exposure/jiucuo.html?site_code=5109000005&url=http%3A%2F%2Fsnssfw.suining.gov.cn%2F\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_10.png\" width=\"102\" height=\"52\" border=\"0\" align=\"top\"></a> </li> <li class=\"dzjg\"> <script type=\"text/javascript\"></script> <a href=\"http://bszs.conac.cn/sitename?method=show&id=0B14836E3B484691E053022819ACC1B3\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_12.png\" width=\"45\" height=\"52\" border=\"0\" align=\"top\"></a> </li>" +
                    "";

            }
            if(groupId==15135){
                var cont=document.getElementById("biao");
                cont.innerText="Copyright © 2011 snswj.suining.gov.cn All Rights Reserved   版权所有：遂宁市商务局   \n" +
                    "蜀ICP备19039359号   网站标识码：5109000007 \n" +
                    ""
                var ha= document.getElementById("bian");
                ha. innerText="遂公网安备51099102000054";
                ha.href='http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=51099102000054 '

                var footimages=document.getElementById("footimages");
                footimages.innerHTML="" +
                    "<li><a href=\"http://www.12377.cn/ \" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_03.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li> " +
                    "<li><a href=\"http://www.scjb.gov.cn/guide\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_05.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"http://www.12377.cn/node_548446.htm\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_09.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"https://zfwzgl.www.gov.cn/exposure/jiucuo.html?site_code=5109000007&url=http%3A%2F%2Fsnssfw.suining.gov.cn%2F\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_10.png\" width=\"102\" height=\"52\" border=\"0\" align=\"top\"></a> </li> <li class=\"dzjg\"> <script type=\"text/javascript\"></script> <a href=\"http://bszs.conac.cn/sitename?method=show&id=0CA72347E7CB5E6EE053022819ACA20A\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_12.png\" width=\"45\" height=\"52\" border=\"0\" align=\"top\"></a> </li>" +
                    "";
            } if(groupId==15033){
                var cont=document.getElementById("biao");
                cont.innerText="Copyright @ 2019 stcw.suining.gov.cn All Rights Reserved\n" +
                    "\n" +
                    "版权所有：遂宁市经济合作局 蜀ICP备19038672号\n" +
                    "\n" +
                    "网站标识码：5109000047 "
                var ha= document.getElementById("bian");
                ha. innerText="遂公网安备51099102000057";
                ha.href='http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=51099102000057 '
                var footimages=document.getElementById("footimages");
                footimages.innerHTML="" +
                    "<li><a href=\"http://www.12377.cn/ \" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_03.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li> " +
                    "<li><a href=\"http://www.scjb.gov.cn/guide\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_05.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"http://www.12377.cn/node_548446.htm\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_09.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"https://zfwzgl.www.gov.cn/exposure/jiucuo.html?site_code=5109000047&url=http%3A%2F%2Fsnssfw.suining.gov.cn%2F\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_10.png\" width=\"102\" height=\"52\" border=\"0\" align=\"top\"></a> </li> <li class=\"dzjg\"> <script type=\"text/javascript\"></script> <a href=\"http://bszs.conac.cn/sitename?method=show&id=0ADC683D596057CEE053022819AC0AC6\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_12.png\" width=\"45\" height=\"52\" border=\"0\" align=\"top\"></a> </li>" +
                    "";

            }if(groupId==15039){
                var cont=document.getElementById("biao");
                cont.innerText="版权所有：遂宁市卫健委 电话：0825-2655006 \n" +
                    "我市互联网不良与违法信息举报中心电话（传真）：0825-2988759 举报邮箱：sn_wgb@126.com \n" +
                    "本网站违法和不良信息举报电话:0825-2655026；电子邮箱：snwsxx@163.com \n" +
                    "Copyriht © 2016 ALL Rights Reservd 蜀ICP备20009133号 网站标识 5109000045  "

                var ha= document.getElementById("bian");
                ha. innerText=" 遂公网安备51099002000178";
                ha.href='http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=51099002000178 '
                var footimages=document.getElementById("footimages");
                footimages.innerHTML="" +
                    "<li><a href=\"http://www.12377.cn/ \" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_03.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li> " +
                    "<li><a href=\"http://www.scjb.gov.cn/guide\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_05.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"http://www.12377.cn/node_548446.htm\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_09.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"https://zfwzgl.www.gov.cn/exposure/jiucuo.html?site_code=5109000045&url=http%3A%2F%2Fsnssfw.suining.gov.cn%2F\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_10.png\" width=\"102\" height=\"52\" border=\"0\" align=\"top\"></a> </li> <li class=\"dzjg\"> <script type=\"text/javascript\"></script> <a href=\"http://bszs.conac.cn/sitename?method=show&id=97C2787704BA47F0E05310291AAC7D0E\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_12.png\" width=\"45\" height=\"52\" border=\"0\" align=\"top\"></a> </li>" +
                    "";
            }if(groupId==15045){
                var cont=document.getElementById("biao");
                cont.innerText="遂宁市审计局 版权所有 未经书面授权 不得复制或建立镜像\n" +
                    "遂宁市互联网举报中心 电话：0825-2988759 邮箱：sn_wgb@126.com\n" +
                    "地址：渠河路663号17楼 电话（首问责任制度监督）：0825-2315588 邮箱：snssjj@163.com\n" +
                    "Copyright © 2012 - 2020 ssjj.suining.gov.cn All Rights Reserved\n" +
                    "备案号：蜀ICP备19040097号 网站标识码：5109000046";
                var ha= document.getElementById("bian");
                ha. innerText="川公网安备 51090302000224号";
                ha.href='http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=51090302000224 '
                var footimages=document.getElementById("footimages");
                footimages.innerHTML="" +
                    "<li><a href=\"http://www.12377.cn/ \" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_03.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li> " +
                    "<li><a href=\"http://www.scjb.gov.cn/guide\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_05.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"http://www.12377.cn/node_548446.htm\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_09.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"https://zfwzgl.www.gov.cn/exposure/jiucuo.html?site_code=5109000046&url=http%3A%2F%2Fsnssfw.suining.gov.cn%2F\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_10.png\" width=\"102\" height=\"52\" border=\"0\" align=\"top\"></a> </li> <li class=\"dzjg\"> <script type=\"text/javascript\"></script> <a href=\"http://bszs.conac.cn/sitename?method=show&id=0ADC683D59F557CEE053022819AC0AC6\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_12.png\" width=\"45\" height=\"52\" border=\"0\" align=\"top\"></a> </li>" +
                    "";
            }if(groupId==2970412){
                var cont=document.getElementById("biao");
                cont.innerText="版权所有：遂宁市生态环境局   电话：0825-2391005   传真：0825-2391769\n" +
                    "蜀ICP备：19039035号  网站标识码:5109000001    "
                var ha= document.getElementById("bian");
                ha. innerText="公安机关备案号:51099002000104";
                ha.href='http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=51099002000104 '
                var footimages=document.getElementById("footimages");
                footimages.innerHTML="" +
                    "<li><a href=\"http://www.12377.cn/ \" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_03.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li> " +
                    "<li><a href=\"http://www.scjb.gov.cn/guide\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_05.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"http://www.12377.cn/node_548446.htm\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_09.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"https://zfwzgl.www.gov.cn/exposure/jiucuo.html?site_code=5109030018&url=http%3A%2F%2Fsnssfw.suining.gov.cn%2F\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_10.png\" width=\"102\" height=\"52\" border=\"0\" align=\"top\"></a> </li> <li class=\"dzjg\"> <script type=\"text/javascript\"></script> <a href=\"https://bszs.conac.cn/sitename?method=show&id=0AF08D977A53579AE053022819AC454B\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_12.png\" width=\"45\" height=\"52\" border=\"0\" align=\"top\"></a> </li>" +
                    "";
            }if(groupId==2975806){
                var cont=document.getElementById("biao");
                cont.innerText="遂宁文化广播电视和旅游局版权所有   Copyright 2018 http://swglyj.suining.gov.cn All Rights Reserved\n" +
                    "承办：遂宁文化广播电视和旅游局 (0825-2710046) 网站维护：遂宁文化广播电视和旅游局 (0825-2710046)\n" +
                    "中共遂宁市纪委遂宁市监委驻局纪检监察组 举报电话：0825-2280602 举报邮箱：kjwtjjz@163.com\n" +
                    "蜀ICP备：19040098号 网站标识码：5109000039 "
                var ha= document.getElementById("bian");
                ha. innerText="公安机关备案号：51099102000040";
                ha.href='http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=51099102000040 '
                var footimages=document.getElementById("footimages");
                footimages.innerHTML="" +
                    "<li><a href=\"http://www.12377.cn/ \" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_03.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li> " +
                    "<li><a href=\"http://www.scjb.gov.cn/guide\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_05.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"http://www.12377.cn/node_548446.htm\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_09.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"https://zfwzgl.www.gov.cn/exposure/jiucuo.html?site_code=5109000039&url=http%3A%2F%2Fsnssfw.suining.gov.cn%2F\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_10.png\" width=\"102\" height=\"52\" border=\"0\" align=\"top\"></a> </li> <li class=\"dzjg\"> <script type=\"text/javascript\"></script> <a href=\"http://bszs.conac.cn/sitename?method=show&amp;id=97AE1FDDA5AF0E97E05310291AAC6A64\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_12.png\" width=\"45\" height=\"52\" border=\"0\" align=\"top\"></a> </li>" +
                    "";
            }if(groupId==15147){
                var cont=document.getElementById("biao");
                cont.innerText="主办单位：遂宁市统计局\n" +
                    "    地址：四川省遂宁市政府    电  话：0825-2310702    电子邮箱：snstjj@sina.cn\n" +
                    "备案号：蜀ICP19041197号   网站标识码：5109000038" ;
                var ha= document.getElementById("bian");
                ha. innerText="公安机关备案号：51099102000047";
                ha.href='http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=51099102000047 '
                var footimages=document.getElementById("footimages");
                footimages.innerHTML="" +
                    "<li><a href=\"http://www.12377.cn/ \" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_03.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li> " +
                    "<li><a href=\"http://www.scjb.gov.cn/guide\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_05.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"http://www.12377.cn/node_548446.htm\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_09.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"https://zfwzgl.www.gov.cn/exposure/jiucuo.html?site_code=5109000038&url=http%3A%2F%2Fsnssfw.suining.gov.cn%2F\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_10.png\" width=\"102\" height=\"52\" border=\"0\" align=\"top\"></a> </li> <li class=\"dzjg\"> <script type=\"text/javascript\"></script> <a href=\"http://bszs.conac.cn/sitename?method=show&id=16F86B8F241B7AA0E053012819ACB87D\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_12.png\" width=\"45\" height=\"52\" border=\"0\" align=\"top\"></a> </li>" +
                    "";

            }if(groupId==1420811){
                var cont=document.getElementById("biao");
                cont.innerText="主办单位：遂宁市应急管理局\n" +
                    "蜀ICP备19040381号      网站标识码：5109000034"

                var ha= document.getElementById("bian");
                ha. innerText="川公网安备 51099102000065号";
                ha.href='http://www.beian.gov.cn/portal/registerSystemInfo?recordcode= 51099102000065 '

                var footimages=document.getElementById("footimages");
                footimages.innerHTML="" +
                    "<li><a href=\"http://www.12377.cn/ \" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_03.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li> " +
                    "<li><a href=\"http://www.scjb.gov.cn/guide\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_05.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"http://www.12377.cn/node_548446.htm\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_09.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"https://zfwzgl.www.gov.cn/exposure/jiucuo.html?site_code=5109000034&url=http%3A%2F%2Fsnssfw.suining.gov.cn%2F\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_10.png\" width=\"102\" height=\"52\" border=\"0\" align=\"top\"></a> </li> <li class=\"dzjg\"> <script type=\"text/javascript\"></script> <a href=\"http://bszs.conac.cn/sitename?method=show&id=97ADD44D74170E89E05310291AAC7157\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_12.png\" width=\"45\" height=\"52\" border=\"0\" align=\"top\"></a> </li>" +
                    "";
            }if(groupId==15087){
                var cont=document.getElementById("biao");
                cont.innerText="Copyright © 2008-2018 版权所有：遂宁市城市管理行政执法局 电话：(0825)2319116 管理员信箱:snscgjbgs@126.com\n" +
                    "蜀ICP备19041124号   网站标识码:5109000033   "
                var ha= document.getElementById("bian");
                ha. innerText=" 遂公网安备 51090302000226 号";
                ha.href='http://www.beian.gov.cn/portal/registerSystemInfo?recordcode= 51090302000226 '

                var footimages=document.getElementById("footimages");
                footimages.innerHTML="" +
                    "<li><a href=\"http://www.12377.cn/ \" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_03.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li> " +
                    "<li><a href=\"http://www.scjb.gov.cn/guide\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_05.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"http://www.12377.cn/node_548446.htm\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_09.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"https://zfwzgl.www.gov.cn/exposure/jiucuo.html?site_code=5109000033&url=http%3A%2F%2Fsnssfw.suining.gov.cn%2F\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_10.png\" width=\"102\" height=\"52\" border=\"0\" align=\"top\"></a> </li> <li class=\"dzjg\"> <script type=\"text/javascript\"></script> <a href=\"http://bszs.conac.cn/sitename?method=show&id=0ADE6D9829A0377DE053022819AC10D7\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_12.png\" width=\"45\" height=\"52\" border=\"0\" align=\"top\"></a> </li>" +
                    "";
            }if(groupId==2974586){
                var cont=document.getElementById("biao");
                cont.innerText="版权所有 遂宁市市场监督管理局 Copyright @ 2019 http://sgsj.suining.gov.cn All Rights Reserved\n" +
                    "遂宁市互联网不良与违法信息举报中心电话(传真)0825-2988759 举报邮箱：sn_wgb@126.com\n" +
                    "遂宁市市场监督管理局网站违法和不良信息举报电话：0825-2321989    邮箱：snsgsjbgs@163.com     地址：遂宁市经济技术开发区明月路153号\n" +
                    "扫黑除恶举报电话：12315   机关纪委监督举报电话：2321819\n" +
                    "蜀ICP备19026869号  网站标识码：5109000043\n" +
                    ""
                var ha= document.getElementById("bian");
                ha. innerText=" 川公网安备 51099002000164号";
                ha.href='http://www.beian.gov.cn/portal/registerSystemInfo?recordcode= 51099002000164 '
                var footimages=document.getElementById("footimages");
                footimages.innerHTML="" +
                    "<li><a href=\"http://www.12377.cn/ \" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_03.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li> " +
                    "<li><a href=\"http://www.scjb.gov.cn/guide\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_05.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"http://www.12377.cn/node_548446.htm\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_09.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"https://zfwzgl.www.gov.cn/exposure/jiucuo.html?site_code=5109000043&url=http%3A%2F%2Fsnssfw.suining.gov.cn%2F\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_10.png\" width=\"102\" height=\"52\" border=\"0\" align=\"top\"></a> </li> <li class=\"dzjg\"> <script type=\"text/javascript\"></script> <a href=\"http://bszs.conac.cn/sitename?method=show&id=0B50FD4F7A2D6C0FE053022819AC7A22\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_12.png\" width=\"45\" height=\"52\" border=\"0\" align=\"top\"></a> </li>" +
                    "";
            }if(groupId==8120802){
                var cont=document.getElementById("biao");
                cont.innerText="版权所有：遂宁市住房公积金管理中心 \n" +
                    "网站标识码:5109000023      联系我们\n" +
                    "工信部备案号：蜀ICP备11006920号"

                var ha= document.getElementById("bian");
                ha. innerText="川公网安备 51090302000211号  ";
                ha.href='http://www.beian.gov.cn/portal/registerSystemInfo?recordcode= 51090302000211'
                var footimages=document.getElementById("footimages");
                footimages.innerHTML="" +
                    "<li><a href=\"http://www.12377.cn/ \" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_03.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li> " +
                    "<li><a href=\"http://www.scjb.gov.cn/guide\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_05.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"http://www.12377.cn/node_548446.htm\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_09.png\" width=\"177\" height=\"52\" border=\"0\" align=\"top\"></a></li>" +
                    " <li><a href=\"https://zfwzgl.www.gov.cn/exposure/jiucuo.html?site_code=5109000023&url=http%3A%2F%2Fsnssfw.suining.gov.cn%2F\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/suining-zhuzhan-theme/images/bg/snf_10.png\" width=\"102\" height=\"52\" border=\"0\" align=\"top\"></a> </li> <li class=\"dzjg\"> <script type=\"text/javascript\"></script> <a href=\"http://bszs.conac.cn/sitename?method=show&id=0B50FD4F78416C0FE053022819AC7A22\" target=\"_blank\"><img alt=\"\" src=\"http://www.suining.gov.cn/documents/10184/18936/20190823151707230ZADFQXAU.png\" width=\"45\" height=\"52\" border=\"0\" align=\"top\"></a> </li>" +
                    "";
            }

            $.ajax(
                {
                    url: '/sn/selectLogo.do',
                    type: 'post',
                    async: 'true',
                    dataType: 'json',
                    data: 'groupId='+groupId,
                    success :function (response) {
                        //根据站点id 修改 logo
                        var logo=document.getElementById("logo");
                        if(groupId=10184||response==null){
                            logo.src="imges/10184.png"
                        }else{
                            var imgsrc = "imges/"+groupId+".png";
                            //  logo.src="imges/10184.png";
                        }
                    }
                })


        }

        $scope.SNSearch();
        $scope.SnSearchName();

    };

    /**
     * 获取推荐词数据
     * @constructor
     */
    $scope.SnSearchName=function () {
        //调用服务层方法向后台获取数据
        searchService.searchName($scope.searchMap).success(
            function (response) {
                $scope.resultMapName = response;//搜索返回的结果

            }
        );

    }

    /**
     * 执行搜索获取数据
     * @param index1
     * @constructor
     */
    $scope.SNSearch = function (index1) {
        if ($scope.searchMap.keywords != '') {

            document.getElementById("loadingDiv").style.display='block';

            $scope.searchMap.pageNo = parseInt($scope.searchMap.pageNo);//转换为数字
            $scope.searchMap.groupId = parseInt($scope.searchMap.groupId);//转换为数字


            //调用服务层方法向后台获取数据
            searchService.snSearch($scope.searchMap).success(
                function (response) {

                    $scope.resultMap = response;//搜索返回的结果
                    lishiSearch();
                    buildPageLabel();
                    $scope.addkey();
                    pin();
                    document.getElementById("loadingDiv").style.display="none";

                }
            );
            document.getElementById("q1").value='';
            document.getElementById("q2").value='';
            document.getElementById("q3").value='';
            document.getElementById("q4").value='';
            document.getElementById("gaoji").style='display: none';
            document.getElementById("hei").style='display: none';


        }
        $scope.searchMap.group1=index1;

    };

//获取点击的区县的ip
    groupId =function (th) {
        var id = th.id;
        //将获取的区县的id赋值到搜索记录
        $scope.searchMap.groupId=id;
        $scope.groupName=th.innerText;
        $scope.closeSelect();
        // $scope.SNSearch();

    }
    window.onload=function () {
        if($scope.searchMap.keywords==null||$scope.searchMap.keywords==''){
            alert("请您输入要搜索的关键字")
        }
    }
    //向数据库存储搜索的关键字
    $scope.addkey=function () {
        //来源ip
        var id =returnCitySN['cid'];

        $scope.list={};
        var d = new Date();
        var time=d.getTime();
        var date1 = new Date(time);
        Date.prototype.toLocaleString = function() {
            function addZero(num) {
                if(num<10)
                    return "0" + num;
                return num;
            }
            // 按自定义拼接格式返回
            return this.getFullYear() + "-" + addZero(this.getMonth() + 1) + "-" + addZero(this.getDate()) + " " +
                addZero(this.getHours()) + ":" + addZero(this.getMinutes()) + ":" + addZero(this.getSeconds());
        };

        // 按重写的自定义格式，格式化日期
        var dateTime = date1.toLocaleString();

        //搜索时间
        $scope.list.hotDate=dateTime;

        //用户城市
        $scope.list.cityAddress=id;




        //数据来源 默认站内 为0
        $scope.list.hotResource=0;

        //站点id
        $scope.list.groupId=$scope.searchMap.groupId;

        $scope.list.govHotName=$scope.searchMap.keywords;



        //搜索数据id

        $scope.entity={};

        $scope.entity.govHotName=$scope.searchMap.keywords;

        var serviceObject;//服务层对象

        serviceObject=searchService.add( $scope.entity);//增加
        serviceObject.success(
            function(response){
                if(response.success){
                    serviceObject=searchService.addAll($scope.list);
                    serviceObject.success(
                        function (response) {

                            if(response.success){
                                //重新查询
                                return;
                            }
                        }
                    )
                }
            }
        );
    };



    //构建分页栏
    buildPageLabel=function(){
        //构建分页栏
        $scope.pageLabel=[];
        var firstPage=1;//开始页码
        var lastPage=$scope.resultMap.totalPages;//截止页码


        if($scope.resultMap.totalPages>10){  //如果页码数量大于10

            if($scope.searchMap.pageNo<=5){//如果当前页码小于等于5 ，显示前10页
                lastPage=10;
            }else if( $scope.searchMap.pageNo>= $scope.resultMap.totalPages-8 ){//显示后10页
                firstPage=$scope.resultMap.totalPages-9;
            }else{  //显示以当前页为中心的5页
                firstPage=$scope.searchMap.pageNo-4;
                lastPage=$scope.searchMap.pageNo+5;
            }
        }else{

        }


        //构建页码
        for(var i=firstPage;i<=lastPage;i++){
            $scope.pageLabel.push(i);


        }
    };


    //分页查询
    $scope.queryByPage=function(pageNo){


        if(pageNo<1 || pageNo>$scope.resultMap.totalPages){
            return ;
        }
        $scope.searchMap.pageNo=pageNo;
        $(pageNo).addClass("page-active");

        $scope.SNSearch();//查询


    };

    //回车搜索
    $scope.enterEvent = function (event) {

        var hc = event.keyCode;
        if(hc==13){
            $scope.SNSearch();


        }
    };



    //定义要聚焦的索引
    $scope.focusIndex=0; //默认显示推荐板块

    $scope.recHide = false;

    $scope.hotHide = true;

    $scope.titleClick = function(index){
        $scope.focusIndex=index; //点击切换样式

        if(index == 0){
            $scope.recHide = false;
            $scope.hotHide = true;
        }else if(index == 1){
            $scope.recHide = true;
            $scope.hotHide = false;
        }
    };

    $scope.focusIndex01=0; //默认显示推荐板块

    $scope.recHide01 = false;
    $scope.hotHide01 = true;
    $scope.titleClick01 = function(index0){
        $scope.focusIndex01=index0; //点击切换样式

        if(index0 == 0){
            $scope.recHide01 = false;
            $scope.hotHide01 = true;
        }else if(index0 == 1){
            $scope.recHide01 = true;
            $scope.hotHide01 = false;
        }
    };

    $scope.sfocusIndex01=2;
    $scope.srecHide01 = false;
    $scope.srecHide02 = true;
    $scope.srecHide03 = true;
    $scope.serverClick = function(index0){
        $scope.sfocusIndex01=index0; //点击切换样式

        if(index0 == 0){
            $scope.srecHide01 = false;
            $scope.srecHide02 = true;
            $scope.srecHide03 = true;
        }else if(index0 == 1){
            $scope.srecHide01 = true;
            $scope.srecHide02 = false;
            $scope.srecHide03 = true;
        } else if(index0 == 2){
        $scope.srecHide01 = true;
        $scope.srecHide02 = true;
        $scope.srecHide03 = false;
    }
    };

    $scope.cfocusIndex01 = -1;
    $scope.categoryClick = function(index0){
        $scope.cfocusIndex01=index0; //点击切换样式
    };

    $scope.groupIndex = 1;
    $scope.groupName = "全平台";
    $scope.groupIndexClick = function(index0){
        $scope.groupIndex=index0; //点击切换样式
    };




    $scope.focusInde=0; //默认显示推荐板块

    $scope.recHid = false;
    $scope.hotHid = false;
    $scope.hotHid1 = false;
    $scope.hotHid2 = false;
    $scope.titleCli = function(index1){
        $scope.focusInde=index1; //点击切换样式

        if(index1 == 0){
            $scope.recHid= true;
            $scope.hotHide = false;
            $scope.hotHid1 = false;
            $scope.hotHid2 = false;


        }else if(index1 == 1){
            $scope.recHide = false;
            $scope.hotHide = true;
            $scope.hotHid1 = false;
            $scope.hotHid2 = false;


        }else if(index1 == 2){
            $scope.recHide = false;
            $scope.hotHide = false;
            $scope.hotHid1 = true;
            $scope.hotHid2 = false;


        }else if(index1 == 3){
            $scope.recHide = false;
            $scope.hotHide = false;
            $scope.hotHid1 = false;
            $scope.hotHid2 = true;


        }

    };

    //时间排序,设置排序规则
    $scope.sortSearch=function(sortField,sort){
        $scope.searchMap.sortField=sortField;
        $scope.searchMap.sort=sort;
        $scope.SNSearch();
    };



    //清空搜索记录
    $scope.delSearch = function() {


        alert("您确定清空搜索历史吗?");
        $scope.searchItems.splice(0,$scope.searchItems.length);//清空数组
    };

    $scope.searchTop = [];
    getTop = function () {
        searchService.getTop().success(function (response) {
            if (response) {
                $scope.searchTop = response;

            }
        })
    }


    $scope.searchItems = [];//初始化历史列表数组

    $scope.categoryNames = [];

    $scope.getCategoryName = function (index1) {
        searchService.getCategoryName(index1).success(function (response){
            if (response) {
                $scope.categoryNames = response;

            }
        });
    }


//历史记录
    lishiSearch=function () {
        if($scope.searchItems.indexOf($scope.searchMap.keywords)==-1){
            $scope.searchItems.push($scope.searchMap.keywords)
        }

    };

    //热词,历史 搜索
    $scope. show0=function(event){
        $scope.searchMap.keywords= event.target.innerText;
        $scope.SNSearch();//查询

    };

    $scope.searchTitle=function (str) {
        $scope.searchMap.title=str;
        $scope.SNSearch();


    }





    $scope.government=function (event) {
        document.getElementById("search-tools").style='block';
        document.getElementById("tuijian1").style='block';
        $scope.searchMap.group= event.target.innerText;
        $scope.SNSearch();


    }
    $scope.governme=function (event) {

        document.getElementById("search-tools").style='display:none';
        document.getElementById("tuijian1").style='display:none';
        document.getElementById("picList").style='block';

        $scope.searchMap.group= event.target.innerText;

        $scope.SNSearch();
        if( document.getElementById("nnn").innerText!=''){

            document.getElementById("nnn").innerText=''
        }

    };
    pin=function () {
        var total=$scope.resultMap.total;
        if (total==undefined){
            total=0;
        }
        var str="为您找到相关结果约"+total+"个，您可以使用上方的搜索工具，精准查询您所需要的信息";



        document.getElementById("nnn").innerText=str;

    };
    $scope.quanbu=function () {

        document.getElementById("search-tools").style='block';
        document.getElementById("tuijian1").style='block';

        $scope.searchMap.group="全部";

        $scope.SNSearch();

    };

    $scope.selectTime=function (event) {

        $scope.searchMap.time=event.target.innerText;
        $scope.SNSearch();


    };

    $scope.selectService=function (event) {

        $scope.searchMap.serviceType=event.target.innerText;
        $scope.SNSearch();

    };

    $scope.selectCategoryName=function (event) {

        $scope.searchMap.selectCategoryName=event.target.innerText;
        $scope.SNSearch();

    };


    var flag=true;


    //高级搜索
    $scope.senior=function (index1,sortField,sort) {

        $scope.searchMap.gao=document.getElementById("q1").value;
        $scope.searchMap.gao1=document.getElementById("q2").value;
        $scope.searchMap.gao2=document.getElementById("q3").value;
        $scope.searchMap.gao3=document.getElementById("q4").value;
        $scope.searchMap.title1 = $("input[name='keyplace']:checked").val();
        $scope.searchMap.keywords=$scope.searchMap.gao+ $scope.searchMap.gao1+ $scope.searchMap.gao2;
        var day=document.getElementById("days");
        var index=day.selectedIndex;
        $scope.searchMap.time=day.options[index].text;
        $scope.searchMap.group1=index1;
        $scope.searchMap.sortField=sortField;
        $scope.searchMap.sort=sort;
        $scope.SNSearch(index1);


    };

    //获取一级栏目数据
    $scope.selectItemCat1List=function(){
        searchService.find($scope.searchMap).success(
            function(response){
                $scope.list=response;
                if($scope.list.length!=0){
                    document.getElementById("name").style='block'
                }else{
                    document.getElementById("name").style.display='none'
                }
            }
        );
    }

    //获取子栏目数据
    $scope.$watch("searMap", function () {
        searchService.findByParentId($scope.searchMap).success(
            function (response) {
                $scope.itemCat2List = response
                if($scope.itemCat2List.length!=0){
                    document.getElementById("layoutName").style='block'
                }else{
                    document.getElementById("layoutName").style.display='none';
                    document.getElementById("layoutName01").style.display='none';
                    document.getElementById("layoutName02").style.display='none';
                    document.getElementById("layoutName03").style.display='none';
                }
            }
        )
    });
    $scope.$watch("searMap01", function () {
        searchService.findByParentId($scope.searchMap).success(
            function (response) {
                $scope.itemCatList = response;
                if($scope.itemCatList.length!=0){
                    document.getElementById("layoutName01").style='block'
                }else{
                    document.getElementById("layoutName01").style.display='none'
                    document.getElementById("layoutName02").style.display='none'
                    document.getElementById("layoutName03").style.display='none'
                }
            }
        )
    });
    $scope.$watch("searMap02", function () {
        searchService.findByParentId($scope.searchMap).success(
            function (response) {
                $scope.itemList = response
                if( $scope.itemList.length!=0){
                    document.getElementById("layoutName02").style='block'
                }else{
                    document.getElementById("layoutName02").style.display='none'
                    document.getElementById("layoutName03").style.display='none'
                }
            }
        )

    });
    $scope.$watch("searMap03", function () {
        searchService.findByParentId($scope.searchMap).success(
            function (response) {
                $scope.layoutList = response
                if( $scope.layoutList.length!=0){
                    document.getElementById("layoutName03").style='block'
                }else{
                    document.getElementById("layoutName03").style.display='none'
                }
            }
        )

    });

    $scope.selectname= function () {
        var options=$("#name option:selected");
        $scope.searchMap.layoutname=options.text();
        searchService.findByParentId($scope.searchMap).success(
            function (response) {
            }
        )
    }

    $scope.selectname01= function () {
        var options=$("#layoutName option:selected");
        $scope.searchMap.layoutname=options.text();
        searchService.findByParentId($scope.searchMap).success(
            function (response) {
            }
        )
    }
    $scope.selectname02= function () {
        var options=$("#layoutName01 option:selected");
        $scope.searchMap.layoutname=options.text();
        searchService.findByParentId($scope.searchMap).success(
            function (response) {
            }
        )
    }
    $scope.selectname03= function () {
        var options=$("#layoutName02 option:selected");
        $scope.searchMap.layoutname=options.text();
        searchService.findByParentId($scope.searchMap).success(
            function (response) {
            }
        )
    }
    $scope.selectname04= function () {
        var options=$("#layoutName03 option:selected");
        $scope.searchMap.layoutname=options.text();
        searchService.findByParentId($scope.searchMap).success(
            function (response) {
            }
        )
    }
    //展开区县部门数据
    $scope.zhan=function () {
        document.getElementById("sh").style='block';
        document.getElementById("bu").style='block';
        document.getElementById("zh").style.display='none';
    };
    $scope.shou=function () {
        document.getElementById("zh").style='block';
        document.getElementById("bu").style.display='none';
        document.getElementById("sh").style.display='none';
    }

    $scope.openSelect = function() {
        document.getElementById("groupsDiv").style.display='block';  //显示弹窗
        document.getElementById("cover").style.display='block';
        document.getElementById("cover").style.height=document.body.clientHeight+'px';
    }

    $scope.closeSelect = function() {
        document.getElementById("groupsDiv").style.display='none';  //显示弹窗
        document.getElementById("cover").style.display='none';
    }



});