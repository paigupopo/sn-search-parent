// 自定义字段  参数 C1 C2 C3、、、、Cn
var customColumn = "";
//站点标识
var siteCode = "";
//选中的分类标签
var database = "";
//搜索词
var qt = "";
//文件类型
var fileMap = null;
//是否展示结构化信息 1:开启，0 不开启	
var showStructInfo = 0;
//单页显示结果数
var pageSize = 10;
//当前页数
var page = 1;
//发文具体文号
var docjtwh = "";
//发文年份
var docNf = "";
//发文文种
var docWz = "";
//发文部门
var pubName = "";
//显示类别 0：信息列表;1:视频列表(带缩略图);2:图片流(下拉加载方式)3:图片列表(TABLE方式)
var displayType = 0;
// 字符集转为UTF-8的qt
var qtPasser = "";
//感兴趣的信息  0:关闭 1:开启
var interested = 0;
//智能推荐  0:关闭 1:开启
var suggest = 0;
// 搜索结果集数
var resultLisSize = 0;

// 加载全局变量
function initPubProperty(customColumn,siteCode,database,
		qt,fileMap,showStructInfo,pageSize,page,docjtwh,docNf,docWz,pubName,
		displayType,qtPasser,interested,suggest,resultLisSize){
	this.customColumn = customColumn;
	this.siteCode = siteCode;
	this.database = database;
	this.qt = qt;
	this.fileMap = fileMap;
	this.showStructInfo = showStructInfo;
	this.pageSize = pageSize;
	this.page = page;
	this.docjtwh = docjtwh;
	this.docNf = docNf;
	this.docWz = docWz;
	this.pubName = pubName;
	this.displayType = displayType;
	this.qtPasser = qtPasser;
	this.interested = interested;
	this.suggest = suggest;
	this.resultLisSize = resultLisSize;
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//					搜索部分
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//普通搜索
/*function gosearch(){
    judge();//清空搜索工具条件
    var qt = encodeURIComponent(qtFilter($("#qt").val()));
	var searchType = $("#searchType").val();
	url="s?qt="+qt+"&siteCode="+parameterFilter(siteCode)+"&database="+parameterFilter(database)+"&noTools=true";
	var city = $("#city").val() || "";
	if(city != ""){
		url += "&city="+encodeURIComponent(parameterFilter(city));
	}

	//文号搜索处理(政策文件搜索)
	var wenhao = $(".wenhao");
	//判断问号搜索开启按钮是否隐藏
	if(wenhao.length > 0){
		var docQt = "0";//标识页面问号搜索已打开 0:关闭状态 1:开启状态
		//判断问号搜索是否打开
		if(wenhao.attr("status") != "close"){
			docQt = "1";

			//未隐藏
			var docpubname=$("#docpubname").val();
			var docwz=$("#docwz").val();
			var docnf=$("#docnf").val();
			var docjtwh=$("#docjtwh").val();

			if(docwz=="文种"||docwz=="全部"||docwz==null)
				docwz="";
			if(docnf==null)
				docnf="";

			url += "&docQt="+parameterFilter(docQt)+"&pubName="+parameterFilter(docpubname)+"&docWz="+parameterFilter(docwz)+"&docNf="+parameterFilter(docnf)+"&docJtwh="+parameterFilter(docjtwh);

			if(qt == "" && docpubname == "" && docwz == "" && docnf == "" && docjtwh == ""){
				alert("请输入搜索条件");
				return;
			}
		}else{
			if(qt==null||qt==""){
				// window.open("index.jsp?siteCode="+ siteCode, "_self");
                alert("请输入搜索条件");
				return;
			}
		}
	}else{
		if(qt==null||qt==""){
			// window.open("index.jsp?siteCode="+ siteCode, "_self");
            alert("请输入搜索条件");
			return;
		}
	}

    if(searchType == 1){
        url="https://www.baidu.com/s?wd="+qt;
        window.open(url,"_blank");
    } else {
        window.open(url,"_self");
	}
}*/
//文档搜索
function docSearch(){
	var docqt=encodeURIComponent($("#docqt").val());
	var docpubname=$("#docpubname").val();
	var docwz=$("#docwz").val();
	var docnf=$("#docnf").val();
	var docjtwh=$("#docjtwh").val();
	if(docwz=="文种"||docwz=="全部"||docwz==null)
		docwz="";	
	if(docnf=="年份"||docnf=="全部"||docnf=="不限"||docnf==null)
		docnf="";
	if(docpubname==""&&docwz==""&&docnf==""&&docjtwh==""&&docqt==""){
		alert("请输入搜索内容");
		return;
	}
	var url="s?doc=1&docqt="+parameterFilter(docqt)+"&siteCode="+parameterFilter(siteCode)+"&database="+parameterFilter(database)+"&pubName="+parameterFilter(docpubname)+"&docWz="+parameterFilter(docwz)+"&docNf="+parameterFilter(docnf)+"&docJtwh="+parameterFilter(docjtwh) + customColumn;
	window.open(url,"_self");
	
}
// 政策文件搜索JS
function docSearch(docpubname,docwz,docnf,docjtwh,docQt){
	//数据回填
	if(docpubname != ""){
		$("#docpubname").val(docpubname);
	}
	if(docwz != ""){
		$("#docwz").val(docwz);
	}
	if(docnf != ""){
		$("#docnf").val(docnf);
	}
	if(docjtwh != ""){
		$("#docjtwh").val(docjtwh);
	}
	//判断文号搜索是否开启  标识页面问号搜索已打开 0:关闭状态 1:开启状态 
	if(docQt != "" && docQt != "0"){
		$(".wenhao").click();
	}
	
}
//政策文件搜索条件回填		翻页后控制搜索工具打开或关闭
function docSearchParam(){
	var times=$("#times").find('strong').html();
	var paixu=$("#paixu").find('strong').html();
	/* var site=$("#site").find('strong').html(); */
	var file_type=$("#file_type").find('strong').html();
	var location_part=$("#location_part").find('strong').html();
	//||site!="站点内搜索"
	if(times!="时间不限"||paixu!="按相关度排序"||file_type!="文件类型"||location_part!="全文"){//||docjtwh!=""||docNf!=""||docWz!=""||pubName!=""
		$('.search_tool').click();		
		$('.head_num_cont_outer ').show();
	}else{		
		$('.close_tool').click();		
	}
	
	//展示搜索工具，置顶需要搜索工具占据的高度，否则会被头部遮住
	if(docjtwh!=""||docNf!=""||docWz!=""||pubName!=""){
		$('.head_num_cont_outer ').show();
	}
	//防止刷新页面政策文件搜索关闭
    if(docjtwh != ""){
        $('#hotsearchword').hide();
        $('.wenhao').attr('status','open');
        $('#office2').show();
    }
    if(docNf != ""){
        $('#hotsearchword').hide();
        $('.wenhao').attr('status','open');
        $('#office2').show();
    }
    if(docWz != ""){
        $('#hotsearchword').hide();
        $('.wenhao').attr('status','open');
        $('#office2').show();
    }
    if(pubName != ""){
        $('#hotsearchword').hide();
        $('.wenhao').attr('status','open');
        $('#office2').show();
    }
}

//高级搜索
/*function adv_search(){
	var q1 = encodeURIComponent(qtFilter($("#q1").val())) || "";
	var q2 = encodeURIComponent(qtFilter($("#q2").val())) || "";
	var q3 = encodeURIComponent(qtFilter($("#q3").val())) || "";
	var q4 = encodeURIComponent(qtFilter($("#q4").val()));
	if(q1 == "" && q2 == "" && q3 == ""){
		$(".btn_prompt").show();
		return false;
	}else{
		$(".btn_prompt").hide();
	}
	var days = $("#days").val();
	var sdate = $("#sDateAdv").val() || "";
	var edate = $("#eDateAdv").val() || "";
	var sort = $("#sortAdv").val() || "";
	
	var fileType = $("#fileType").val();	
	fileType = fileTypeParse(fileType);// 文档类型处理
	var keyplace = $('input[name=\'keyplace\']:checked').val();
	var domain = "";//$("#domain").val();
	url="adv?&siteCode="+siteCode+"&q1="+q1+"&q2="+q2+"&q3="+q3+"&q4="+q4
			+"&days="+days+"&fileType="+parameterFilter(fileType)+"&keyPlace="+keyplace+"&domain="+parameterFilter(domain)
			+"&sdate="+sdate+"&edate="+edate+"&sort="+parameterFilter(sort);
	window.open(url,"_self");
}*/

//关闭定位搜索 
/*function closeLocationSearch(){
	var msg = confirm("您确定关闭定位搜索吗？");
	if(msg){
		$.ajax({
			  type: "post",
			  url: "closeLocationSearch",
			  dataType: "json",
			  success: function(data){
				  gosearch();
			  }
		});
	}
}*/

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//							视频&图片联合搜索
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//图片横条触摸放大
/*function videoImgMouse(){
	$('.dream').find('.content').find('img').mouseover(function(){
	    $(this).css({'width':'120px','height':'80px','left':'-10px','top':'-7px','z-index':'1','box-shadow':'0 0 10px rgba(0,0,0,.7)'});
	}).mouseout(function(){
	    $(this).css({'width':'100px','height':'67px','left':'0','top':'0','z-index':'0','box-shadow':'none'});
	});
}*/
//图片搜索
function imgVideoFunc(pictureQueryInterface){
	$.ajax({
		type: "post",
		url: "videoImgQuery",
		data: {cmd:"img",siteCode: siteCode, qt: qt,database: database, pageSize: 4},
		dataType: "json",
		success: function(data){
			var json = data;
			if(json.response == "TRUE" && json.resultList != ""){						
				var html = "<div class=\"title\">";
				var word = $("#qt").val();
				if(word.length > 28){
					word = word.substring(0,28) + "...";
				}
				html += "<a class=\"txt_color\" href=\"s?siteCode="+siteCode+"&database="+pictureQueryInterface+"&qt="+qtPasser+"\"><span class=\"color-red\">"+word+"</span>的相关图片</a>";
				html +="</div>";
				html +="<div class=\"content\">";
				html +="<div class=\"images clearfix\">";
		    	 
				$.each(json.resultList, function(k, kv){
					//显示字段			    			
					var disPlayTitle = passerHtmlStr(kv.dreTitle,20);
	    			var encodeUrl = kv.encodeUrl;
		            var encodeTitle = encodeURIComponent(kv.title);
		            var summary = disableHtmlStr(kv.summary);
		            var location = k+1;
		            html+="<a class=\"posr fl\" href='view?qt="+qtPasser+"&location="+location+"&reference="+kv.reference+"&url="+encodeUrl+"&title="+encodeTitle+"&database="+database+"' target='_blank'><img class=\"posr\" src=\"img?reference="+kv.reference+"&database="+pictureQueryInterface+"&type=1&imgType=.jpg&siteCode="+siteCode+"\" alt=\"\" /></a>";
				});
				html +="</div></div>";				    	  
				$("#pictureResults").html(html);
				$("#pictureResults").show();
				$("#pictureResults").parent("div").show();
				//图片触摸放大事件
				videoImgMouse();
				//$('#no_result').removeClass("on");
				//$('#all_content').addClass("on");
				//$('.content_conter').show();
			}
		}
	});
}
// 视频搜索
function videoImgFunc(videoQueryInterface){
	$.ajax({
		type: "post",
		url: "videoImgQuery",
		data: {cmd:"video",siteCode: siteCode, qt: qt,database: database, pageSize: 4},
		dataType: "json",
		success: function(data){
			var json = data;
			if(json.response == "TRUE" && json.resultList != ""){						
				var html = "<div class=\"title\">";
				var word = $("#qt").val();
				if(word.length > 28){
					word = word.substring(0,28) + "...";
				}
				html += "<a class=\"txt_color\" href=\"s?siteCode="+siteCode+"&database="+videoQueryInterface+"&qt="+qtPasser+"\"><span class=\"color-red\">"+word+"</span>的相关视频</a>";
				html +="</div>";
				html +="<div class=\"content\">";
				html +="<div class=\"images clearfix\">";
		    	 
				$.each(json.resultList, function(k, kv){
					//显示字段			    			
					var disPlayTitle=passerHtmlStr(kv.dreTitle,20);
	    			var encodeUrl=kv.encodeUrl;
		            var encodeTitle = encodeURIComponent(kv.title);
		            var summary=disableHtmlStr(kv.summary);
		            var location = k+1;
		            html+="<a class=\"posr fl\" href='view?qt="+qtPasser+"&location="+location+"&reference="+kv.reference+"&url="+encodeUrl+"&title="+encodeTitle+"&database="+database+"' target='_blank'><img class=\"posr\" src=\"img?reference="+kv.reference+"&database="+videoQueryInterface+"&type=1&imgType=.jpg&siteCode="+siteCode+"\" alt=\"\" /></a>";
				});
				html +="</div></div>";				    	  
				$("#videoResults").html(html);
				$("#videoResults").show();
				$("#videoResults").parent("div").show();
				//图片触摸放大事件
				videoImgMouse();
				//$('#no_result').removeClass("on");
				//$('#all_content').addClass("on");
				//$('.content_conter').show();
			}
		}
	});
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//								搜索工具搜索
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 文档类型处理
function fileTypeParse(file_type){
	var fileType = "";
	if(file_type){
		switch(file_type){
		case "word":
			fileType=".DOC,.DOCX";
			break;
		case "ppt":
			fileType=".PPT,.PPTX";
			break;
		case "pdf":
			fileType=".PDF";
			break;
		case "excel":
			fileType=".XLS,.XLSX";
			break;
		case "txt":
			fileType=".TXT";
			break;
		case "rar":
			fileType=".RAR,.ZIP";
			break;
		default:
			fileType="";
			break;
	}
	}
	return fileType;
}
//过滤除qt参数的其他参数长度，过滤特殊字符，除了qt（38个字符），其他参数限定20个字符
function parameterFilter(str) {
    if(str==null||str==""){
        return "";
    }
    str = str.replace(/[\ |\~|\`|\!|\@|\#|\$|\%|\^|\&|\*|\(|\)|\-|\+|\=|\||\\|\[|\]|\{|\}|\;|\:|\"|\'|\,|\<|\.|\>|\/|《|》|，|\?]/g,"");
    str = str.replace(/alert|script|javascript|cookie|prompt|img|document|eval|LF|CR|iframe|onclick|onfocus|href|onload|onerror|mouseover/gi , '');
    if(str.length>20){
        str=str.substring(0,20);
    }
    return str;
}
//过滤qt参数长度（38个字符）
function qtFilter(qt) {
    if(qt==null||qt==""){
        return qt;
    }
    if(qt.length>38){
        qt=qt.substring(0,38);
    }
    return qt;
}

//时间选择搜索
function searchTime(sort, keyplace, days, timeOption, isStartToEndDate){
	var qt = encodeURIComponent($("#qt").val());
	if(qt==null||qt==""){
        alert("请输入搜索条件");
		return;
	}

    //var times = $("#times_r").find('span').html();
    //var file_type =  $("#file_type").find('span').html();
    var startDateStr =""; //$("#dateStart_tool").val().trim();
    var endDateStr =""; //$("#dateEnd_tool").val().trim();
    //var fileType = fileTypeParse(file_type);// 文档类型处理

	var search = window.location.search;
	var reg = /fileType=([\s\S]*?)&/;
	var match = search.match(reg);
	var fileType = "";
	if(match instanceof Array && match.length > 1){
		if(typeof(match[1]) == "undefined"){
			fileType="";
		}else{
			fileType = match[1];
		}
	}
	
	if(days == "nolimit"){
		days = "";
	}

	if(timeOption == null && days != ""){
        timeOption = 1;
    }
    if(timeOption == null && days == ""){
        timeOption = 0;
    }
    // if(startDateStr == "" && endDateStr == "" && timeOption != 1){
        // timeOption = 0;
        // $("#times").find('span').html("时间不限");
    // }
    // if(timeOption == 2 && (startDateStr != "" || endDateStr != "")){
        // $("#times").find('span').html("自定义");
    // }
    // if(timeOption != 2){
        // startDateStr = $("#dateStart_tool").val().trim();
        // endDateStr = $("#dateEnd_tool").val().trim();
    // }
    var docpubname = $("#docpubname").val();
    var docwz = $("#docwz").val();
    var docnf = $("#docnf").val();
    var docjtwh = $("#docjtwh").val();
    if(docwz == "文种" || docwz == "全部" || docwz == null)
        docwz="";
    if(docnf == "年份" || docnf == "全部" || docnf == "不限" || docnf == null)
        docnf = "";
    if(docpubname == null)
        docpubname = "";
    if(docjtwh == null)
        docjtwh = "";

}

//文件搜索
function searchFile(sort, keyplace, file_type, timeOption, isStartToEndDate){
	var qt = encodeURIComponent($("#qt").val());
	if(qt==null||qt==""){
        alert("请输入搜索条件");
		return;
	}

    var times = $("#times_r").find('span').html();
    //var file_type =  $("#file_type").find('span').html();
    var startDateStr =""; //$("#dateStart_tool").val().trim();
    var endDateStr =""; //$("#dateEnd_tool").val().trim();
    var fileType = fileTypeParse(file_type);// 文档类型处理
	var days = "";
	var search = window.location.search;
	var reg = /days=([\s\S]*?)&/;
	var match = search.match(reg);
	if(match instanceof Array && match.length > 1){
			days = match[1];
	}
	if(days == "0" || typeof(days) == "undefined"){
		days = "";
	}

	if(timeOption == null && days != ""){
        timeOption = 1;
    }
    if(timeOption == null && days == ""){
        timeOption = 0;
    }
    if(startDateStr == "" && endDateStr == "" && timeOption != 1){
        timeOption = 0;
        $("#times").find('span').html("时间不限");
    }
    // if(timeOption == 2 && (startDateStr != "" || endDateStr != "")){
        // $("#times").find('span').html("自定义");
    // }
    // if(timeOption != 2){
        // startDateStr = $("#dateStart_tool").val().trim();
        // endDateStr = $("#dateEnd_tool").val().trim();
    // }
    var docpubname = $("#docpubname").val();
    var docwz = $("#docwz").val();
    var docnf = $("#docnf").val();
    var docjtwh = $("#docjtwh").val();
    if(docwz == "文种" || docwz == "全部" || docwz == null)
        docwz="";
    if(docnf == "年份" || docnf == "全部" || docnf == "不限" || docnf == null)
        docnf = "";
    if(docpubname == null)
        docpubname = "";
    if(docjtwh == null)
        docjtwh = "";



}

//搜索工具搜索（新）
function searchTool(sort, keyplace, timeOption, isStartToEndDate){
    var qt = encodeURIComponent($("#qt").val());
    var times = $("#times").find('span').html();
    //var file_type =  $("#file_type").find('span').html();
    var startDateStr =""; //$("#dateStart_tool").val().trim();
    var endDateStr ="";// $("#dateEnd_tool").val().trim();
    var days = "";
    var fileType =""; //fileTypeParse(file_type);// 文档类型处理
	
	var search = window.location.search;
	var regdays = /days=([\s\S]*?)&/;
	var matchdays = search.match(regdays);
	if(matchdays instanceof Array && matchdays.length > 1){		
		days = matchdays[1];
	}
	if(days == "0" || typeof(days) == "undefined"){
		days = "";
	}
	var regfile = /fileType=([\s\S]*?)&/;
	var matchfile = search.match(regfile);
	if(matchfile instanceof Array && matchfile.length > 1){
		if(typeof(matchfile[1]) == "undefined"){
			fileType="";
		}else{
			fileType = matchfile[1];
		}
	}
	
     switch(times){
         case "时间不限":
            days="";
             break;
       case "自定义":
            timeOption = 2;
             break;
         case "一周内":
             days="7";
             break;
         case "一月内":
             days="30";
             break;
        case "一年内":
             days="365";
             break;
     }
	
    if(timeOption == null && days != ""){
        timeOption = 1;
    }
    if(timeOption == null && days == ""){
        timeOption = 0;
    }
    if(startDateStr == "" && endDateStr == "" && timeOption != 1){
        timeOption = 0;
        $("#times").find('span').html("时间不限");
    }
    if(timeOption == 2 && (startDateStr != "" || endDateStr != "")){
        $("#times").find('span').html("自定义");
    }
    // if(timeOption != 2){
        // startDateStr = $("#dateStart_tool").val().trim();
        // endDateStr = $("#dateEnd_tool").val().trim();
    // }
    var docpubname = $("#docpubname").val();
    var docwz = $("#docwz").val();
    var docnf = $("#docnf").val();
    var docjtwh = $("#docjtwh").val();
    if(docwz == "文种" || docwz == "全部" || docwz == null)
        docwz="";
    if(docnf == "年份" || docnf == "全部" || docnf == "不限" || docnf == null)
        docnf = "";
    if(docpubname == null)
        docpubname = "";
    if(docjtwh == null)
        docjtwh = "";

}
//搜索工具搜索（旧）
function reloadContent_tools(timeOption,isStartToEndDate){
	//hideAllToolsSelection();
    var qt = encodeURIComponent($("#qt").val());
	var times = $("#times").find('span').html();
	var paixu = $("#paixu").html();
	/* var site=$("#site").find('strong').html(); */
	var location_part = $("#location_part").find('span').html();
	var file_type =  $("#file_type").find('span').html();
	var startDateStr="";//$("#dateStart_tool").val().trim();
	var endDateStr="";//$("#dateEnd_tool").val().trim();

	var days="";
	var fileType = fileTypeParse(file_type);// 文档类型处理
	var keyplace="";
	var domain="";
	var sort="";

	/* switch(site){
	case "站点内搜索":
		domain="";
		break;
	default:
		domain=site;
		break;
	} */
	switch(times){
		case "时间不限":
			days="";
			break;
        case "自定义":
            timeOption = 2;
			break;
		case "一周内":
			days="7";
			break;
		case "一月内":
			days="30";
			break;
		case "一年内":
			days="365";
			break;
	}
	if(timeOption == null && days != ""){
		timeOption = 1;
	}
	if(timeOption == null && days == ""){
		timeOption = 0;
	}
	if(startDateStr == "" && endDateStr == "" && timeOption != 1){
		timeOption = 0;
		$("#times").find('span').html("时间不限");
	}
	if(timeOption == 2 && (startDateStr != "" || endDateStr != "")){
		$("#times").find('span').html("自定义");
	}
	// if(timeOption != 2){
		// startDateStr = $("#dateStart_tool").val().trim();
		// endDateStr = $("#dateEnd_tool").val().trim();
	// }

	switch(paixu){
		case "按相关度排序":
			sort="relevance";
			break;
		case "按时间排序":
			sort="dateDesc";
			break;
		default:
			sort="";
	}
	switch(location_part){
		case "搜索位置":
		case "不限":
			keyplace="";
			break;
        case "作者":
            keyplace="2";
            break;
		case "标题":
			keyplace="1";
			break;
		case "全文":
			keyplace="0";
			break;
	}
	var docpubname = $("#docpubname").val();
	var docwz = $("#docwz").val();
	var docnf = $("#docnf").val();
	var docjtwh = $("#docjtwh").val();
	if(docwz == "文种" || docwz == "全部" || docwz == null)
		docwz="";
	if(docnf == "年份" || docnf == "全部" || docnf == "不限" || docnf == null)
		docnf = "";
	if(docpubname == null)
		docpubname = "";
	if(docjtwh == null)
		docjtwh = "";

}

//ajax搜索 
function reloadContent(url,qtParam){
	var qts = qtParam;
	if(qtParam == null){
		qts = encodeURIComponent(qt);
	}
	if(url==null)
		return;
	$.ajax({  
	       type : "get",  
	       async:true,
	       url : url,  
	       dataType : "json", 
	       success : function(data){
	    	  var showNameMap = "";
	    	  if(data.response=="TRUE"){
	    		  $("#load_content").hide();
	    		  var resultList=data.resultList;
	    		  var location=0;
				  var html="";

	    		  resultList.forEach(function(doc){
	    			  location+=1;
	    			  var reference = doc.reference;
	    			  var encodeReference = reference;
	    			  var url = doc.url;
	    			  var encodeUrl = doc.encodeUrl;
	    			  var doctitle = doc.title;
	    			  var dretitle = doc.dreTitle;
	    			  var summary = doc.summary;
					  if(summary != null){
						  summary = disableHtmlStr(summary);
					  }else{
						  summary = "";
					  }
					  doctitle = disableHtmlStr(doctitle);
					  dretitle = disableHtmlStr(dretitle);

					  var docDate = doc.docDate;
					  var weight = doc.weight;
					  var author = doc.author;
					  if(author == null){
						  author="";
					  }
					  var encodeTitle=encodeURIComponent(doctitle,"UTF-8");
					  var disPlayTitle=passerHtmlStr(dretitle,20);
					  //dretitle.substr(0,20);
					  var disPlayUrl=passerUrl(url);
					  var dbName=doc.dbName;
					  var domainSite=doc.domainSiteName;
					  //蓝标签
					  var displayDbLaber = "";
					  if(data.displayDBMap[doc.reference]!=null){
						  displayDbLaber = "<span class=\"project_title fl\">" + data.displayDBMap[doc.reference] + "</span>";
					  }
					  // 微信
					  if(doc.url.indexOf("weixin.qq.com") != -1){
						  displayDbLaber = "<img src=\"sn/images/photos/weixin.png\" class=\"wei-icon fl\" />";
					  }
					  // 微博
					  if(doc.url.indexOf("weibo.com") != -1){
						  displayDbLaber = "<img src=\"sn/images/photos/weibo.png\" class=\"wei-icon fl\" />";
					  }

					  var fileType="";
					  if(doc.fileType != null && doc.fileType.toUpperCase().indexOf("HTM") < 0){
						  fileType = doc.fileType.toUpperCase().replace(".","");
						  if(fileMap[fileType] && fileMap[fileType] != null){
							  fileType = fileMap[fileType];
						  }else{
							  fileType = "";
						  }
					  }
					  var structInfoSummary=data.structInfoMap[doc.reference];
					  if(structInfoSummary!=null&&1==showStructInfo){
						  html += "<div class=\"msg table\">";
						  html += "<div class=\"titleP clearfix\">";
						  html += displayDbLaber;
						  html += "<a class=\"fl txt_color\" target=\"_blank\" href=\"view?qt="+qts+"&location="+location+"&reference="+reference+"&url="+encodeUrl+"&title="+encodeTitle+"&database="+database+"&siteCode="+siteCode+"\">";
						  html += disPlayTitle;
						  html += "</a>";
						  html += "</div>";
						  html += "<div class=\"content\">";
						  html += structInfoSummary;
						  html += "<a class=\"link\" target='_blank' href=\"view?qt="+qts+"&location="+location+"&reference="+reference+"&url="+encodeUrl+"&title="+encodeTitle+"&database="+database+"&siteCode="+siteCode+"\">";
						  html += domainSite;
						  html += "</a>";
						  html += "<i class=\"kuaizhao_line\"> - </i>";
						  html += "<span class=\"colo-666\" style=\"font-size:12px;\">"+doc.docDate+"</span>";
						  html += "</div>";
						  html += "</div>";
					  }else if(doc.includeImg){
						  html += "<div class=\"msg topic\">";
						  html += "<div class=\"titleP\">";
						  html += displayDbLaber;
						  html += "<a class=\"fl txt_color\" target=\"_blank\" href=\"view?qt="+qts+"&location="+location+"&reference="+reference+"&url="+encodeUrl+"&title="+encodeTitle+"&database="+database+"&siteCode="+siteCode+"\">";
						  html += disPlayTitle;
						  html += "</a>";
						  html += "</div>";
						  html += "<div class=\"content clearfix\">";
						  html += "<a href=\"javascript:void(0)\" class=\"img fl\">";
						  html += "<img src=\"img?reference="+reference+"&database="+database+"&type=1&imgType=.jpg&siteCode="+siteCode+"\" alt=\"\"/>";
                          html += "</a>";
						  html += "<p class=\"txt fr\">";
						  html += summary+"...";
						  html += "</p>";
						  html += "<p class=\"link fr\">";
						  html += "<a class=\"link\" target='_blank' href=\"view?qt="+qts+"&location="+location+"&reference="+reference+"&url="+encodeUrl+"&title="+encodeTitle+"&database="+database+"&siteCode="+siteCode+"\">";
						  html += domainSite;
						  html += "</a>";
						  html += "<i class=\"kuaizhao_line\"> - </i>";
						  html += "<span class=\"colo-666\" style=\"font-size:12px;\">"+doc.docDate+"</span>";
						  html += "</p>";
						  html += "</div>";
						  html += "</div>";
					  }else if(fileType != ""){
						  html += "<div class=\"msg files\">";
						  html += "<div class=\"title\">";
						  html += "<i class=\"pdfIcon icon flpp posa "+fileType.toUpperCase()+"\"></i>";
						  html += "<a class=\"fl txt_color\" target=\"_blank\" href=\"view?qt="+qts+"&location="+location+"&reference="+reference+"&url="+encodeUrl+"&title="+encodeTitle+"&database="+database+"&siteCode="+siteCode+"\">";
						  html += disPlayTitle;
						  html += "</a>";
						  html += "</div>";
						  html += "<div class=\"content\">";
						  html += "<p class=\"txt\">";
						  html += summary+"...";
						  html += "</p>";
						  html += "<a class=\"link\" target='_blank' href=\"view?qt="+qts+"&location="+location+"&reference="+reference+"&url="+encodeUrl+"&title="+encodeTitle+"&database="+database+"&siteCode="+siteCode+"\">";
						  html += domainSite;
						  html += "</a>";
						  html += "<i class=\"kuaizhao_line\"> - </i>";
						  html += "<span class=\"colo-666\" style=\"font-size:12px;\">"+doc.docDate+"</span>";
						  html += "</div>";
						  html += "</div>";
					  }else{
						  html += "<div class=\"msg discuss\">";
						  html += "<div class=\"titleP\">";
						  html += displayDbLaber;
						  html += "<a class=\"fl txt_color\" target=\"_blank\" href=\"view?qt="+qts+"&location="+location+"&reference="+reference+"&url="+encodeUrl+"&title="+encodeTitle+"&database="+database+"&siteCode="+siteCode+"\">";
						  html += disPlayTitle;
						  html += "</a>";
						  html += "</div>";
						  html += "<div class=\"content\">";
						  html += "<p class=\"txt\">";
						  html += summary+"...";
						  html += "</p>";
						  html += "<a class=\"link\" target='_blank' href=\"view?qt="+qts+"&location="+location+"&reference="+reference+"&url="+encodeUrl+"&title="+encodeTitle+"&database="+database+"&siteCode="+siteCode+"\">";
						  html += domainSite;
						  html += "</a>";
						  html += "<i class=\"kuaizhao_line\"> - </i>";
						  html += "<span class=\"colo-666\" style=\"font-size:12px;\">"+doc.docDate+"</span>";
						  html += "</div>";
						  html += "</div>";
					  }
	    		  });
				  if(html != ""){
					  $('#contentlist-tool').html(html);
					  //展示搜索工具结果
		    		  show_toolsFunc();
				  }

				  var pageUrl = "s"+url.substr(url.indexOf("?"),url.length);
				  $("#sn-tools .resulte_num").html("为您找到相关结果"+data.totalHits+"个 ");
				  // 分页
				  var totlePage = data.totalHits/pageSize;
				  totlePage = Math.ceil(totlePage);
				  if(totlePage > 1){
					  searchPagination("Paginations",totlePage,pageUrl);
					  $("#Pagination").parent().show();
				  }else{
					  $("#Pagination").parent().hide();
				  }
	    	  }
	    	  if(data.response != "TRUE" || data.resultList.length <= 0){
	    		  //如果查询失败或者返回结果为空
	    		  $('#contentlist-tool').html("");
	    		  //展示搜索工具结果
	    		  show_toolsFunc();
	    	  }
               window.open(pageUrl,"_self");
           },
	       error:function(){
	    	   /*$('#contentlist').html("");
	    	   $('#no_result_word').html(qts);
	    	   $('#no_result').addClass("on");		*/
	       }
			       
	});
}
//  展示搜索工具结果
function show_toolsFunc(){
	  // 隐藏 右侧所有内容 和 底部相关词
	  $("#contentlist-tool").parent().parent().siblings().not($(".clear")[0]).hide();
	  // 隐藏搜索工具外的   来访地区/拼音搜索/纠错搜索
	  $("#contentlist-tool").parent().siblings().not($("#sn-tools")[0]).hide();
	  // 隐藏搜索列表外的  框计算/置顶/最新消息/大众词
	  $("#contentlist-tool").siblings().hide();
	  //
	  $("#contentlist-tool").show();
}
//	关闭搜索工具结果
function hide_toolsFunc(){
	gosearch();
}


//传入指定搜索词
function autoLoadContentWithQT(){


}



// 热搜词
function hotWordFun(tempWord){
	if(tempWord && tempWord != ""){
		//解析热搜词 逗号分隔
		var wordArray = tempWord.split(",");
		var lis = "<b class='hot-start fl'>热搜词：</b>";
			lis+= "<div class='clearfix hot-word fl'>";
		var count = 0;
		for(var i=0; i<wordArray.length&&i<10; i++){
			if(wordArray[i] != ""){
				var qt = encodeURIComponent(wordArray[i]).replace(/%E2%80%8B|%E2%80%8E/g,"");
				lis+= "<a href='http://localhost:9100/sn.html#?keywords=户口'>" + wordArray[i] + "</a>";
				count++;
			}
		}
		lis+="</div>";
		if(count > 0){
			$("#hotsearchword").html(lis);
			$("#hotsearchword").show();
		}
	}else{
	}
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//				插件  右侧内容
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    知识图谱
function querySummaryFun(nodes, links, qtReplaceHs){
	require.config({
	    paths: {
	        echarts: 'sn/js'
	    }
	});
	
	require(
	        [
	            'echarts',
	            'echarts/chart/force',   // 按需加载所需图表，如需动态类型切换功能，别忘了同时加载相应图表
	            'echarts/chart/chord'
	        ],
	        function (ec) {
	      		//定义图表options
	      		 var option = {
	 				    title : {
	 				        text: '双击搜索',
	 				       /* subtext: '数据来自人立方', */
	 				        x:'left',
	 				        y:'bottom'
	 				    },
	 				    toolbox: {
	 				        show : false,
	 				        feature : {
	 				            restore : {show: true},
	 				            magicType: {show: true, type: ['force', 'chord']},
	 				            saveAsImage : {show: true}
	 				        }
	 				    },
	 				    legend: {
	 				    	show: false,
	 				        x: 'left',
	 				        data:['','']
	 				    },
	 				    series : [
	 				        {
	 				            type:'force',
	 				            /* name : "词汇关系", */
	 				            ribbonType: false,
	 				            itemStyle: {
	 				                normal: {
	 				                    label: {
	 				                        show: true,
	 				                        textStyle: {
	 				                            color: '#333'
	 				                        }
	 				                    },
	 				                    nodeStyle : {
	 				                        brushType : 'both',
	 				                        borderColor : 'rgba(255,215,0,0.4)',
	 				                        borderWidth : 1
	 				                    },
	 				                    linkStyle: {
	 				                        type: 'curve'
	 				                    }
	 				                },
	 				                emphasis: {
	 				                    label: {
	 				                        show: false
	 				                        // textStyle: null      // 默认使用全局文本样式，详见TEXTSTYLE
	 				                    },
	 				                    nodeStyle : {
	 				                        //r: 30
	 				                    },
	 				                    linkStyle : {}
	 				                }
	 				            },
	 				            useWorker: false,
	 				            minRadius : 15,
	 				            maxRadius : 25,
	 				            gravity: 1.1,
	 				            scaling: 1.1,
	 				            roam: false,
	 				            nodes: nodes,
	 				            links : links
	 				        }
	 				    ]
	 				};
	        		
	      		var myChart = ec.init(document.getElementById('querySummaryImg'));
	            myChart.setOption(option);
	            $("#querySummaryImg").parent("div").show();
	            //点击搜索
	            var ecConfig = require('echarts/config');
	            myChart.on(ecConfig.EVENT.DBLCLICK, function(param){
	            	if(param.name != qtReplaceHs){
	            		var database=$("#database").val();
		            	var siteCode=$("#siteCode").val();
	            	}
	            });
	        }
	);
}

//感兴趣的信息方法(通过扩展词去查询结果返回列表)开始======================================
function interestInfo(extendWord){
	$.ajax({
		type: "post",
		async:true, 
		url: "newsquery",
		data: {cmd:"interested",siteCode: siteCode, qt:extendWord+'',database: database},
		dataType: "json",
		success: function(data){
			var json = data;
			if(json.response == "TRUE" && json.resultList != ""){
				var html = "<div class=\"title posr txt_color\">";
					html+= "您可能感兴趣的信息";
					/*if(json.resultList.length>5){
						html+= "<span class=\"posa cursor\" onclick=\"spread(this)\" status=\"close\">";
						html+= "<span class=\"txt_color\">展开</span>";
						html+= "<i class=\"double_v\"></i>";
					}*/
					html+= "</span>";
					html+= "</div>";
					html+= "<div class=\"content\">";
					html+= "<div class=\"default_part keyword rightUl\">";
					for(var i = 0; i < json.resultList.length && i < 5; i++){
						var encodeUrl = json.resultList[i].encodeUrl;
						var encodeTitle = encodeURIComponent(json.resultList[i].title);				
						//var title = passerHtmlStr(json.resultList[i].title,20);
						var location = i+1;
						html+= "<a class=\"disb\" title=\"" + json.resultList[i].title + "\" target='_blank' href=\"view?qt="+qtPasser+"&location="+location+"&reference="+json.resultList[i].reference+"&url="+encodeUrl+"&title="+encodeTitle+"&database="+database+"&siteCode="+siteCode+"\">";
						html+= json.resultList[i].title;
						html+= "</a>";
					}
					html+= "</div>";
					/*if(json.resultList.length>5){
						html+= "<div class=\"spread_part keyword rightUl\" style=\"display:none;\">";
						for(var i = 5;i < json.resultList.length;i++){
							var encodeUrl = json.resultList[i].encodeUrl;
							var encodeTitle = encodeURIComponent(json.resultList[i].title);				
							//var title = passerHtmlStr(json.resultList[i].title,20);
							var location = i+1;
							html+= "<a class=\"disb\" title=\"" + json.resultList[i].title + "\" target='_blank' href=\"view?qt="+qtPasser+"&location="+location+"&reference="+json.resultList[i].reference+"&url="+encodeUrl+"&title="+encodeTitle+"&database="+database+"&siteCode="+siteCode+"\">";
							html+= json.resultList[i].title;
							html+= "</a>";
						}
						html+= "</div>";
					}*/
					html+= "</div>";
				$('#interest').html(html);
				$('#interest').show();
			}else{
				alert("interested is null");
			}
		}
	});
}
//感兴趣的信息方法(通过扩展词去查询结果返回列表)结束======================================

//大众词（新-隐藏后台请求获取信息列表只显示一个超链）
function showPopularInfo(words){
    var encodeWords=encodeURIComponent(words);
    var html = "<div class=\"title\"><i class=\"disib posr\"></i>";
    html += "您是不是要搜索：";
    html += "<a href=\"s?qt="+encodeWords+"&siteCode="+siteCode+"&database="+database+"\" style='display:inline-block;vertical-align:bottom'>";
    html += "<span class=\"color-red\">"+words+"</span>";
    html += "</a>";
    html += "</div>";

    $("#popularword").html(html);
    $("#popularword").show();
    $("#popularword").parent().show();
}
//大众词（旧）
// function showPopularInfo(words){
// 	var encodeWords=encodeURIComponent(words);
// 	$.ajax({
// 		type:"post",
// 		url:"query",
// 		dataType:"json",
// 		success:function(data){
// 			var json=data;
// 			if(json.response == "TRUE" && json.resultList != "" && json.resultList.length > 0){
// 				var html = "<div class=\"title\"><i class=\"disib posr\"></i>";
// 					html+= "您是不是要搜索：";
// 					html+= "<a href=\"s?qt="+encodeWords+"&siteCode="+siteCode+"&database="+database+"\" style='display:inline-block;vertical-align:bottom'>";
// 					html+= "<span class=\"color-red\">"+words+"</span>";
// 					html+= "</a>";
// 					html+= "</div>";
//
// 					html+="<div class=\"content\">";
// 				$.each(json.resultList, function(k, kv){
// 					//显示字段
// 					/* 	var disPlayTitle = passerTitle(kv.dreTitle,45); */
// 					var disPlayTitle=passerHtmlStr(kv.dreTitle,90);
// 					var encodeUrl=kv.encodeUrl;
// 					var encodeTitle = encodeURIComponent(kv.title);
// 					var location = k+1;
// 					if(html == "" && kv.includeImg == 1){
// 						var url = kv.url.replace("https://","");
// 		    			url = url.replace("http://","");
// 		    			if(url.length > 30){
// 		    				url = url.substring(0,30) + "...";
// 		    			}
//
// 		    			html += "<a href='view?qt="+qtPasser+"&location="+location+"&reference="+kv.reference+"&url="+encodeUrl+"&title="+encodeTitle+"&database="+database+"&siteCode="+siteCode+"' target='_blank' class=\"txt txt-color\">" + disPlayTitle + "</a>";
// 		    			html += "<div class=\"img-txt clearfix\">";
// 		    			html += "<a href=\"javascript:void(0)\" class=\"fl img disib\">";
// 		    			html += "<img src=\"img?reference="+kv.reference+"&database="+database+"&type=1&imgType=.jpg&siteCode="+siteCode+"\" alt=\"\"/>";
// 		    			html += "</a>";
// 		    			html += "<p class=\"fl txt\">";
// 		    			html += summary;
// 		    			html += "</p>";
// 		    			html += "<p class=\"txt fl link \">";
// 		    			html += "<span class=\"colo-008000\">"+kv.domainSiteName+"</span>&nbsp;&nbsp;&nbsp;<span class=\"colo-666\">"+kv.docDate+"</span>";
// 		    			html += "</p>";
// 		    			html += "</div>";
// 					}else{
// 						html += "<p class=\"txt clearfix\">";
// 						html += "<span class=\"txt-color fl every_new\"><a class=\"txt\" href='view?qt="+qtPasser+"&location="+location+"&reference="+kv.reference+"&url="+encodeUrl+"&title="+encodeTitle+"&database="+database+"&siteCode="+siteCode+"' target='_blank'>"+disPlayTitle+"</a></span>";
// 		    			/*html += "<span class=\"link fl\"><a href=\"javascript:void(0)\">中国上海</a></span>";*/
// 						html += "<span class=\"time fr\">"+kv.docDate+"</span>";
// 					}
// 				});
// 				html += "</div>";
// 				$("#popularword").html(html);
// 				$("#popularword").show();
// 				$("#popularword").parent("div").show();
// 			}else{
// 			}
// 		}, error:function(){
// 		}
// 	});
// }

//纠错搜索方法(通过纠错词去查询结果返回列表)开始======================================
function debug(debugWord){
	var encodeDebugWord = encodeURIComponent(debugWord);
	$.ajax({
		type: "post",
		url: "query",
		dataType: "json",
		success: function(data){	
			var json = data;
			if(json.response == "TRUE" && json.resultList != ""){
				var html = "<div class=\"title\"><i class=\"disib posr\"></i>";
					html+= "您是不是要搜索：";
					html+= "<a href=\"s?qt="+encodeDebugWord+"&siteCode="+siteCode+"&database="+database+"\" style='display:inline-block;vertical-align: bottom;'>";
					html+= "<span class=\"color-red\">"+debugWord+"</span>";
					html+= "</a>";
					html+= "</div>";
					html+= "<div class=\"num\">包含<span class=\"color-red\" style=\"margin:0 3px\">"+debugWord+"</span> 的结果约"+json.totalHits+ "条</div>";
				//列表  
					html+= "<div class=\"classify relate\" style=\"display:block;\">";
				$.each(json.resultList, function(k, kv){
					if(k < 3){
						//显示字段
						var disPlayTitle=passerHtmlStr(kv.dreTitle,90);
						var encodeUrl=kv.encodeUrl;
						var encodeTitle = encodeURIComponent(kv.title);
						var location = k+1;
						
						var displayUrl = "";
						if (kv.url != null) {
							displayUrl = kv.url.replace("http://", "");
							displayUrl = displayUrl.replace("https://", "");
							var length = displayUrl.length;
							if (length > 30) 
								displayUrl = displayUrl.substring(0, 20) + "..." + displayUrl.substring(displayUrl.length - 9, length);
						}
						
						html+= "<div class=\"msg related1\">";
						html+= "<div class=\"title\">";
						html+= "<a class=\"txt_color\" href='view?qt="+qtPasser+"&location="+location+"&reference="+kv.reference+"&url="+kv.encodeUrl+"&title="+encodeTitle+"&database="+database+"' target='_blank' title=\""+kv.dreTitle+"\">";
						html+= kv.dreTitle;
						html+= "</a>";
						html+= "</div>";
						html+= "<p class=\"txt first\">";
						html+= kv.summary;
						html+= "</p>";
						html+= "<a class=\"link\" href=\"javascript:void(0)\">";
						//html+= displayUrl;
						html+= kv.domainSiteName + " - "+kv.docDate;
						html+= "</a>";
						html+= "<i class=\"disib arrow\"></i>";
						html+= "</div>";
					}
				});
					html+= "</div>";
				$("#debugword").html(html);
				$("#debugword").show();
				// 隐藏无结果提示
				$('.no_result').hide();
			}else{
				alert("no debug word!");
			}
		}, error:function(){  
			alert("ERROR: debug sn!");
		}
	});
}
//纠错搜索方法(通过纠错词去查询结果返回列表)结束======================================

//拼音搜索方法(通过拼音词去查询结果返回列表)开始======================================
function pinyin(pinyinWord){
	var encodePinyinWord=encodeURIComponent(pinyinWord);
	$.ajax({
		type: "post",
		url: "query",
		dataType: "json",
		success: function(data){
			var json = data;
			if(json.response == "TRUE" && json.resultList != ""){
				var html = "<div class=\"title\"><i class=\"disib posr\"></i>";
					html+= "您是不是要搜索：";
					html+= "<a href=\"s?qt="+encodePinyinWord+"&siteCode="+siteCode+"&database="+database+"\" style='display:inline-block;vertical-align: bottom;'>";
					html+= "<span class=\"color-red\">"+pinyinWord+"</span>";
					html+= "</a>";
					html+= "</div>";
					html+= "<div class=\"num\">包含<span class=\"color-red\" style=\"margin:0 3px\">"+pinyinWord+"</span> 的结果约"+json.totalHits+ "条</div>";
				//列表  
					html+= "<div class=\"classify relate\" style=\"display:block;\">";
				$.each(json.resultList, function(k, kv){
					if(k < 3){
						//显示字段
						var disPlayTitle=passerHtmlStr(kv.dreTitle,90);
						var encodeUrl=kv.encodeUrl;
						var encodeTitle = encodeURIComponent(kv.title);
						var location = k+1;
						
						var displayUrl = "";
						if (kv.url != null) {
							displayUrl = kv.url.replace("http://", "");
							displayUrl = displayUrl.replace("https://", "");
							var length = displayUrl.length;
							if (length > 30) 
								displayUrl = displayUrl.substring(0, 20) + "..." + displayUrl.substring(displayUrl.length - 9, length);
						}
						
						html+= "<div class=\"msg related1\">";
						html+= "<div class=\"title\">";
						html+= "<a class=\"txt_color\" href='view?qt="+qtPasser+"&location="+location+"&reference="+kv.reference+"&url="+kv.encodeUrl+"&title="+encodeTitle+"&database="+database+"' target='_blank' title=\""+kv.dreTitle+"\">";
						html+= kv.dreTitle;
						html+= "</a>";
						html+= "</div>";
						html+= "<p class=\"txt first\">";
						html+= kv.summary;
						html+= "</p>";
						html+= "<a class=\"link\" href=\"javascript:void(0)\">";
						//html+= displayUrl;
						html+= kv.domainSiteName + " - "+kv.docDate;
						html+= "</a>";
						html+= "<i class=\"disib arrow\"></i>";
						html+= "</div>";
					}
				});
					html+= "</div>";
				$("#pinyinword").html(html);
				$("#pinyinword").show();
				// 隐藏无结果提示
				$('.no_result').hide();
			}else{
			}
		}, error:function(){  
		}
	});
}
//拼音搜索方法(通过拼音词去查询结果返回列表)结束======================================

//智能推荐开始=============================================================/
function zntj(word){
	//每个推荐加上一个div控制推荐排版
	$.ajax({  
		type: "post",
		url : "suggestquery",
		async:true,  
		data: {cmd:"suggest",siteCode: siteCode,qt: ""+ word +"",database: database},
		dataType : "json",  
		success : function(data){
			var json = data;
			if(json.response == "TRUE" && json.data.length > 0){
				var jsonData = json.data;
				$.each(jsonData, function(k, resultJson){
					if(resultJson.response == "TRUE" && resultJson.resultList != "" && json.data[k].resultList.length > 0){
						var html = "<div class=\"part online_servers\">";
		                	html+= "<div class=\"title posr txt_color\">";
		                	html+= "<span class=\"disib name\">";
		                	html+= resultJson.suggestShowName;
		                	html+= "</span>";
		                	/*if(resultJson.resultList.length>5){
			                	html+= "<span class=\"posa cursor\" onclick=\"spread(this)\" status=\"close\">";
			                	html+= "<span class=\"txt_color\">展开</span>";
			                	html+= "<i class=\"double_v\"></i>";
			                	html+= "</span>";
		                	}*/
		                	html+= "</div>";
		                	html+= "<div class=\"content\">";
		                	html+= "<div class=\"default_part keyword rightUl\">";
		                	for(var i = 0; i < resultJson.resultList.length && i < 5; i++){
		                		var n = resultJson.resultList[i];
		                		var displaytitle = n.title;
								/*if(n.title.length > 23) {
									displaytitle = n.title.substr(0,23) + "...";
								}*/
		                		var encodeUrl = n.encodeUrl;
								var encodeTitle = encodeURIComponent(n.title);
								var location = i+1;
								html+= "<a class=\"disb\" title=\""+n.title+"\" target='_blank' href=\"view?qt="+qtPasser+"&location="+location+"&reference="+n.reference+"&url="+encodeUrl+"&title="+encodeTitle+"&database="+database+"&siteCode="+siteCode+"\">";
								html+= displaytitle;
								html+= "</a>";
		                	}
		                	html+= "</div>";
		                	/*if(resultJson.resultList.length > 5){
		                		html+= "<div class=\"spread_part keyword rightUl\" style=\"display:none;\">";
		                		for(var i = 5;i < resultJson.resultList.length;i++){
		                			var n = resultJson.resultList[i];
		                			var displaytitle = n.title;
									if(n.title.length > 23) {
										displaytitle = n.title.substr(0,23) + "...";
									}
			                		var encodeUrl = n.encodeUrl;
									var encodeTitle = encodeURIComponent(n.title);
									var location = i+1;
									html+= "<a class=\"disb\" title=\""+n.title+"\" target='_blank' href=\"view?qt="+qtPasser+"&location="+location+"&reference="+n.reference+"&url="+encodeUrl+"&title="+encodeTitle+"&database="+database+"&siteCode="+siteCode+"\">";
									html+= displaytitle;
									html+= "</a>";
		                		}
		                		html+= "</div>";
		                	}*/
		                	html+= "</div>";
		                	html+= "</div>";
		                $("#online_servers").before(html);
		                $("#online_servers").parent().show();
						$("#online_servers").siblings().show();
					}
				});
			}else{
				$("#online_servers").parent().hide();
			}
		}, error:function(){  
			alert("智能推荐搜索失败!");
		}  
	});
}
//智能推荐结束=============================================================

//右面右侧统计字段=============================================================
function tagFunc(dataParam,tagSearchUrl,tagStr){
	$.ajax({
		type: "post",
		url: "tag",
		data: dataParam,
		dataType: "json",
		success: function(data){
			var json = data;
			if(json.response == "TRUE"){
				if(json.tagList && json.tagList != ""){
					$.each(json.tagList, function(k, kv){
						var html = "<div class=\"part keywords\">";
						html += "<div class=\"title posr txt_color\">";
						html += json.tagFieldMap[k];
						//全部分类只针对高检网开放
						if("N000005434" == json.siteCode){
                            html += "<span class=\"posa cursor\" style='left: 68%;' onclick=\"gosearch()\" status=\"close\">全部分类</span>"
                        }

						if(kv.length > 5){
							html += "<span class=\"posa cursor\" onclick=\"spread(this)\" status=\"close\">";
							html += "<span class=\"txt_color\">展开</span>";
							html += "<i class=\"double_v\"></i>";
							html += "</span>";
						}
						html += "</div>";
						/*if(k.toLowerCase()=="filetype"){
							ulDom.append("<a href='"+ tagurl +"' target='_self'>"+"<li class=\"file-icon "+tag.rekey.toLowerCase()+"\">"+ displaytitle +"( " + tag.value + " )</li></a>");
						}else{
							ulDom.append("<a href='"+ tagurl +"' target='_self'>"+"<li title='"+ tag.key +"'>"+ displaytitle +"( " + tag.value + " )</li></a>");
						}*/

						html += "<div class=\"content\">";
						html += "<div class=\"default_part keyword rightUl\">";
						for(var i = 0; i < kv.length && i < 5; i++){
							var displaytitle = kv[i].key;
							/*if(tag.key.length > 20) {
								displaytitle = tag.key.substr(0,20) + "...";
							}*/
							var tagurl = tagSearchUrl + "&"+k.toLowerCase()+"="+ encodeURIComponent(kv[i].key);
                            if(displaytitle == tagStr){
                                html += "<a class=\"disb\" style='background-color: #F7F7F7;font-weight: bold;' href=\""+tagurl+"\" target='_self' title=\""+kv[i].key+"\">";
                                html += displaytitle +"( " + kv[i].value + " )";
                                html += "</a>";
                            }else{
                                html += "<a class=\"disb\" href=\""+tagurl+"\" target='_self' title=\""+kv[i].key+"\">";
                                html += displaytitle +"( " + kv[i].value + " )";
                                html += "</a>";
                            }
                        }
						html += "</div>";
						if(kv.length > 5){
							html += "<div class=\"spread_part keyword rightUl\" style=\"display:none;\">";
							for(var i = 5;i < kv.length;i++){
								var displaytitle = kv[i].key;
								/*if(tag.key.length > 20) {
									displaytitle = tag.key.substr(0,20) + "...";
								}*/
								var tagurl = tagSearchUrl + "&"+k.toLowerCase()+"="+ encodeURIComponent(kv[i].key);
                                if(displaytitle == tagStr){
                                    html += "<a class=\"disb\" style='background-color: #F7F7F7;font-weight: bold;' href=\""+tagurl+"\" target='_self' title=\""+kv[i].key+"\">";
                                    html += displaytitle +"( " + kv[i].value + " )";
                                    html += "</a>";
                                }else{
                                    html += "<a class=\"disb\" href=\""+tagurl+"\" target='_self' title=\""+kv[i].key+"\">";
                                    html += displaytitle +"( " + kv[i].value + " )";
                                    html += "</a>";
                                }
							}
							html += "</div>";
						}
	                    html += "</div>";
	                    html += "</div>";
	                    $("#keywords").before(html);
					});
				}else{
				}
			}
		}
	});
}

// 最新消息=============================================================
function showNewsFunc(){
	var newsqt = qt;
	//TODO 去除特殊字符
	qt = qt.replace(/[\ |\~|\`|\!|\@|\#|\$|\%|\^|\&|\*|\(|\)|\-|\_|\+|\=|\||\\|\[|\]|\{|\}|\;|\:|\"|\'|\,|\<|\.|\>|\/|&quot|《|》|，|\?]/g,"");
	newsqt = "&quot;" + qt + "&quot;";
	$.ajax({
		type: "post",
		url: "newsquery",
		data: {cmd:"news",siteCode: siteCode, qt: newsqt,database: database,redTitleLength: 28,combine: "MD5TITLE"},
		dataType: "json",
		success: function(data){
			var json = data;
			if(json.response == "TRUE" && json.resultList != "" && json.resultList.length > 0){
				var html = "<div title=\""+qt+" 的最新相关消息\" class=\"title\"><a class=\"txt_color\" href=\"javascript:void(0)\" style=\"cursor: default;\">";
				var word = $("#qt").val();
				if(word.length > 20){
					word = word.substring(0,20) + "...";
				}
				html += "<span class=\"color-red\">"+word+"</span>的最新相关消息";
				html +="</a></div>";
				html +="<div class=\"content\">";
				$.each(json.resultList, function(k, kv){
					//显示字段
					var disPlayTitle=passerHtmlStr(kv.dreTitle,90);
	    			var encodeUrl=kv.encodeUrl;
		            var encodeTitle = encodeURIComponent(kv.title);
		            var summary=disableHtmlStr(kv.summary);
		            var location = k+1;
			    	if(k == 0 && kv.includeImg == 1){
		    			var url = kv.url.replace("https://","");
		    			url = url.replace("http://","");
		    			if(url.length > 30){
		    				url = url.substring(0,30) + "...";
		    			}

		    			html += "<a title=\""+kv.title+"\" href='view?qt="+qtPasser+"&location="+location+"&reference="+kv.reference+"&url="+encodeUrl+"&title="+encodeTitle+"&database="+database+"&siteCode="+siteCode+"' target='_blank' class=\"txt txt-color lastest_news_title\">" + kv.redTitle + "</a>";
		    			html += "<div class=\"img-txt clearfix\">";
		    			html += "<a href=\"javascript:void(0)\" class=\"fl img disib\">";
		    			html += "<img src=\"img?reference="+kv.reference+"&database="+database+"&type=1&imgType=.jpg&siteCode="+siteCode+"\" alt=\"\"/>";
		    			html += "</a>";
		    			html += "<p class=\"fr txt\">";
		    			html += summary;
						html += "</p>";
						html += "<p class=\"txt fr link \">";
						html += "<span class=\"colo-008000\">"+kv.domainSiteName+"</span>&nbsp;&nbsp;&nbsp;<span class=\"colo-666\">"+kv.docDate+"</span>";
						html += "</p>";
						html += "</div>";
		    		}else{
		    			html += "<p class=\"txt clearfix\">";
		    			html += "<a title=\""+kv.title+"\" class=\"txt-color fl every_new\" href='view?qt="+qtPasser+"&location="+location+"&reference="+kv.reference+"&url="+encodeUrl+"&title="+encodeTitle+"&database="+database+"&siteCode="+siteCode+"' target='_blank'>"+kv.redTitle+"</a>";
		    			/*html += "<span class=\"link fl\"><a href=\"javascript:void(0)\">中国上海</a></span>";*/
		    			html += "<span class=\"time fr\">"+kv.docDate+"</span>";
		    		}
				});
				html += "</div>";
				$("#lastest_news").html(html);
				$("#lastest_news").show();
				$("#lastest_news").parent("div").show();
				//$('#no_result').removeClass("on");
				//$('#all_content').addClass("on");
				//$('.content_conter').show();
			}else{
			}
		}
	});
}

//搜索历史 开始======================================
//搜索过的词汇
function searchcookieWord(wordJson){
	if(wordJson && wordJson != "" && wordJson.length > 0){
		var html = "<div class=\"title posr txt_color\">";
			html+= "搜索历史";
			if(wordJson.length>5){
	    		html+= "<span class=\"posa cursor\" onclick=\"spread(this)\" status=\"close\">";
	    		html+= "<span class=\"txt_color\">展开</span>";
	    		html+= "<i class=\"double_v\"></i>";
	    		html+= "</span>";
			}
    		html+= "</div>";
    		html+= "<div class=\"content\">";
    		html+= "<div class=\"default_part rightUl\">";
		for(var i = 0; i < wordJson.length && i < 5; i++){
			html += "<a class=\"disb\" href=\"s?q=1&database="+database+"&qt="+wordJson[i].wordqt+"&siteCode="+siteCode+"\" target='_self'>";
			html += wordJson[i].displayqt;
			html += "</a>";
		}
		html += "</div>";
		if(wordJson.length > 5){
			html += "<div class=\"spread_part rightUl\" style=\"display:none;\">";
			for(var i = 5;i < wordJson.length;i++){
				html += "<a class=\"disb\" href=\"s?q=1&database="+database+"&qt="+wordJson[i].wordqt+"&siteCode="+siteCode+"\" target='_self'>";
				html += wordJson[i].displayqt;
				html += "</a>";
			}
			html += "</div>";
		}
		html += "<div class=\"clearbox\" onclick=\"clearSearchcookieWord()\"><span class=\"disib textC cursor\">清空搜索历史</span></div>";
		html += "</div>";
		$("#history").html(html);
		$("#history").show();
	}else{
	}
}
//清空搜索历史 
function clearSearchcookieWord(){
	var msg = confirm("您确定清空搜索历史吗？");
	if(msg){
		$.ajax({
			type: "post",
			url: "clearSearchWordCookie",
			dataType: "json",
			success: function(data){
				if(data.status == "true"){
					$("#history").hide();
					$("#history").html("");
				}
			}
		});
	}
}
//搜索历史 结束======================================


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//							接口和插件     词汇
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
function connectorPlugin(){
	$.ajax({
		type : "get", 
		async:true,
		dataType : "json",
		success : function(data){ 
			//纠错词//////////////////////////////////////////////
			if(data.debugWords != ""){
				var debugWord = "";
				for(var i=0; i<data.debugWords.length; i++){
					debugWord += data.debugWords[i];
				}
				//调用
				debug(debugWord);
			}else{
				//提示webSite
				/** var html = "<li><p style='font-size:18px;'>";
				<%if(!CommonUtils.isEmpty(param.getDomainSite())) {%>
				html += "<span id='alertTxt'>您限定了在<%=param.getDomainSite() %>中进行搜索<a href='s?database=all&qt=<%=qtPasser %>&siteCode=<%=siteCode %>' target='_self' title='取消站点限定' id='cancel'><img src='image/blue/images/x.png'/></a></span>";
				<%} %>
				html += "<p></li>";
				$('#tishi').html(html);
				$('#tishi').show();*/
			}
			
			//拼音搜索词//////////////////////////////////////////////////////////
			if(data.pinyinWords != ""){
				var pinyinWord = "";
	    	    for(var i=0; i<data.pinyinWords.length; i++){
	    	    	pinyinWord += data.pinyinWords[i] + " ";
	    	    }	    	    
	    	    //调用
	    	    pinyin(pinyinWord);
			}
			
			// 搜索结果集大于0
			if(resultLisSize > 0){
				//智能推荐//////////////////////////////////////////////
				var conceptWord = new Array();//概念词汇
				// 智能推荐功能必须开启
				if(suggest == 1){
					if(data.synonymsWords != ""){
						//同义词
						var synonyWord = "";
						for(var i=0; i<data.synonymsWords.length; i++){
							//概念词启用 
							if(conceptWord.length>0){
								//将概念词中不存在的同义词加入
								if(conceptWord.indexOf(data.synonymsWords[i])<0){
									conceptWord += data.synonymsWords[i] + " ";
								}
							}   
				    		
				    		if(i < data.synonymsWords.length-1){
				    			synonyWord += data.synonymsWords[i] + ",";
				    		}else{
				    			synonyWord += data.synonymsWords[i];
				    		}
						}
						//调用 
						zntj(synonyWord);
					}else if(data.extendWords != ""){
						//扩展词
						var extendWord = qt+",";
						for(var i=0; i<data.extendWords.length; i++){
							if(i < data.extendWords.length-1){
								extendWord += data.extendWords[i] + ",";
						  	}else{
						    	extendWord += data.extendWords[i];
						  	}
						} 
						//调用
						zntj(extendWord);
					}else{
						zntj(qt);
					}
				}
		    	   
				//通过扩展词获取感兴趣的信息    感兴趣信息必须开启
				if(interested == 1 && data.extendWords != ""){
					var extendWords = "";
					for(var i=0; i<data.extendWords.length; i++){
						if(conceptWord.length!=0){
							//将扩展词中不存在的同义词加入
							if(conceptWord.indexOf(data.extendWords[i])<0){
								conceptWord += data.extendWords[i] + " ";
							}
						}
						extendWords += data.extendWords[i] + " ";
					}
					interestInfo(extendWords);
				}

				//大众词//////////////////////////////////////////////////////////
				if(data.popularWords != ""){
					var words="";				
					$.each(data.popularWords,function(i,n){ 
						if(words=="")
							words=words+n;
						else
							words=words+","+n;
								
					}); 
					showPopularInfo(words);
				}
			}
		}, error:function(){  
		}
	});
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//							搜索辅助   置顶、框计算、相关推荐
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
function assistPlugin(){
	$.ajax({
		type : "post",  
		async:true,  
		url : "assist",
		dataType : "json",
		success : function(data){
			if(data.status){
				//页面下方相关词
				if(data.relate.relatedWords != "" && resultLisSize > 0){
					var html = "<div class=\"title txt_color\">相关搜索</div>";
						html+= "<div class=\"rs_ul clearfix\">";
					for(var i=0; i<data.relate.relatedWords.length; i++){
						var title = data.relate.relatedWords[i];
						/*if(title.length > 10){
							title = title.substring(0,10)+"...";
						}*/
						html+= "<a class=\"fl\" target='_self' title='"+data.relate.relatedWords[i]+"' href=\"s?siteCode="+siteCode+"&qt="+encodeURIComponent(data.relate.relatedWords[i])+"&database="+database+"\">";
						html+= title;
						html+= "</a>";
					}
					html += "</div>";
					var dispType = displayType;
					if(dispType != 2){
						$("#relatedBottomWord").html(html);
						$("#relatedBottomWord").show();
					}
				}else{
				}
				
				//页面右侧相关信息展示
				if(data.relate.relatedFlBeans != "" && resultLisSize > 0){
					var html = "";
					var infos = data.relate.relatedFlBeans;
					for(var i =0; i<infos.length; i++){
						html += "<div class=\"part person\">";
						html += "<div class=\"title posr txt_color\">";
						html += infos[i].name;
						if(infos[i].relatedList.length > 4){
							html += "<span class=\"posa cursor\" onclick=\"spread(this)\" status=\"close\">";
							html += "<span class=\"txt_color\">展开</span>";
							html += "<i class=\"double_v\"></i>";
							html += "</span>";
						}
						html += "</div>";
						html += "<div class=\"content textC\">";
						html += "<ul class=\"img_ul default_part clearfix\">";
						for(var k=0; k<infos[i].relatedList.length && k<4; k++){
							var name = infos[i].relatedList[k].keyword;
							/*if(name.length >=5){
								name = name.substr(0,5);
							}*/
							html += "<a href=\"s?qt="+encodeURIComponent(infos[i].relatedList[k].keyword)+"&siteCode="+siteCode+"&database="+database+"\" class=\"fl\">";
							html += "<img src=\"thumbnail?qt="+qtPasser+"&relatedName="+encodeURIComponent(infos[i].name)+"&relatedKeyWord="+encodeURIComponent(infos[i].relatedList[k].keyword)+"&siteCode="+siteCode+"\" alt=\"\" />";
							html += "<div class=\"link txt_color\">"+name+"</div>";
							html += "</a>";
						}
						html += "</ur>";
						if(infos[i].relatedList.length > 4){
							html += "<ul class=\"img_ul spread_part clearfix\" style=\"display:none; \">";
							for(var k = 4;k<infos[i].relatedList.length;k++){
								var name = infos[i].relatedList[k].keyword;
								if(name.length >=5){
									name = name.substr(0,5);
								}
								html += "<a href=\"s?qt="+encodeURIComponent(infos[i].relatedList[k].keyword)+"&siteCode="+siteCode+"&database="+database+"\" class=\"fl\">";
								html += "<img style=\"width: 70px;height: 75px;\" src=\"thumbnail?qt="+qtPasser+"&relatedName="+encodeURIComponent(infos[i].name)+"&relatedKeyWord="+encodeURIComponent(infos[i].relatedList[k].keyword)+"&siteCode="+siteCode+"\" alt=\"\" />";
								html += "<div class=\"link txt_color\">"+name+"</div>";
								html += "</a>";
							}
							html += "</ur>";
						}
						
						html += "</div>";
						html += "</div>";
					}
					$("#relatedWord").before(html);
				}else{
				}
				
				
				//置顶框计算只在第一页展示
				if(page == 1){
					//置顶信息
					if(data.topInfo != ""){
						var topHtml = "";
						for(var j=0; j<data.topInfo.length; j++){
							topHtml += data.topInfo[j];
						}
						$("#top").html(topHtml);
						//$(".found").show();
						$("#top").show();
						$("#top").parent("div").show();
						$('.no_result').hide();
						//  $('#all_content').addClass("on");
						//$('.content_conter').show();
					}
					//框计算
					if(data.frame != ""){
						var frameHtml = "";
						for(var j=0; j<data.frame.length; j++){
							frameHtml += "<iframe frameborder='0' scrolling='no' src='" + data.frame[j].url +"' height='"+data.frame[j].iframeHeight  +"' width='100%'/>";
						}
						$("#frame").html(frameHtml);
						//$(".found").show();
						$("#frame").show();
						$("#frame").parent("div").show();
						$('.no_result').hide();
						//$('#no_result').removeClass("on");
						//$('#all_content').addClass("on");
						//$('.content_conter').show();
					}
				}
			}else{
				alert("搜索辅助请求数据失败!");
			}
		}, 
		error:function(){ 
			alert("搜索辅助请求数据失败!");
		}
	});
}


///////////////////////////////////////////////////////////////
//					工具扩展方法
//////////////////////////////////////////////////////////////
//右侧内容“展开”“收起”实现
function spread(val){
	if($(val).attr('status')=='close'){
	    $(val).find('span').html("收起");
	    $(val).find('i').css({'transform':'rotate(180deg)'});
	    $(val).parent().parent().find('.spread_part').slideDown();
	    $(val).attr({'status':'open'});
	}else if($(val).attr('status')=='open'){
	    $(val).find('span').html("展开");
	    $(val).find('i').css({'transform':'rotate(0deg)'});
	    $(val).parent().parent().find('.spread_part').slideUp();
	    $(val).attr({'status':'close'});
	}
}
function spreads(val){
	var $Z=$(val).find('b').html();
	if($Z=='展开'){
		$(val).prev().slideDown(69);
		$(val).find('b').html('收起');
		$(val).find('i').css('transform','rotate(180deg)');
	}else{
		if($Z=='收起'){
			$(val).prev().hide();
			$(val).find('b').html('展开');
			$(val).find('i').css('transform','rotate(360deg)');
		}
	}
}

//替换str中HTML标签
function disableHtmlStr(str){
	str = str.replace(/</g, "&lt;");
	str = str.replace(/>/g, "&gt;");
	str = str.replace(/\"/g, "&quot;");

	str = str.replace(/&lt;font color=red&gt;/g, "<font color=red>");
	str = str.replace(/&lt;\/font&gt;/g, "</font>");

	return str;
}
function removeRedStr(str){
	if(str==null||str=="")
		return "";
	str=str.replace(/<font color=red>/,"");
	str=str.replace(/<\/font>/,"");
	return str;
}
//截取指定长度字符串
function passerHtmlStr(str,len){
	if(str==null||str=="")
		return "";
	var strTmp=str;
	if (str.indexOf("<font color=red>") != -1 && str.indexOf("</font>") != -1) {
		str=str.replace(/<font color=red>/g,"");
		str=str.replace(/<\/font>/g,"");
		str=str.replace(/<br>/g,"");
		str=str.replace(/<BR>/g,"");
		str=str.replace(/<br \/>/g,"");
		str=str.replace(/<BR \/>/g,"");
		if(len < str.length){
			str=str.substr(0,len);
			var redWords=redStrList(strTmp);
			for(var i=0;i<redWords.length;i++){
				var tmpWord=redWords[i];
				tmpWord=removeRedStr(tmpWord);
				var regExp=new RegExp(tmpWord,'g');
				str=str.replace(regExp,redWords[i]);
			}
			return str+"..";
		}else{
			var redWords=redStrList(strTmp);
			var hasReplaces=new Array();
			for(var i=0;i<redWords.length;i++){
				var tmpWord=redWords[i];
				if(hasReplaces.toString().indexOf(tmpWord)>=0)
				{
					continue;
				}else{
					hasReplaces[hasReplaces.length]=tmpWord;
				}
				tmpWord=removeRedStr(tmpWord);
				var regExp=new RegExp(tmpWord,'g');
				str=str.replace(regExp,redWords[i]);
			}
			return str;
		}		
	}else{
		if(str.length>len){
			return str.substr(0,len)+"..";
		}else{
			return str;
		}
	}
	
}
function redStrList(str){
	var reg=/<font color=red>([\s\S]*?)<\/font>/gi;
	return str.match(reg);
}

//转换URL 用于显示 
function passerUrl(url){
	if(url!=null){
		url=url.replace("http://","");
		url=url.replace("https://","");
		var length=url.length;
		if(length>30){
			url=url.substring(0,20)+url.substr(length-9,9);
		}
	}else
		url="";
	return url;

}

//日期格式化
function myformatter(date){
    var y = date.getFullYear();
    var m = date.getMonth()+1;
    var d = date.getDate();
    return y+'-'+(m<10?('0'+m):m)+'-'+(d<10?('0'+d):d);
}
function myparser(s){
    if (!s) return new Date();
    var ss = (s.split('-'));
    var y = parseInt(ss[0],10);
    var m = parseInt(ss[1],10);
    var d = parseInt(ss[2],10);
    if (!isNaN(y) && !isNaN(m) && !isNaN(d)){
        return new Date(y,m-1,d);
    } else {
        return new Date();
    }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//									分页
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//分页
function searchPagination(id,totlePage,pageUrl){
	$("#"+id).pagination(totlePage, {
		num_edge_entries: 0,
		num_display_entries:10,
	    callback: function(pageNumber){
	    	var url = pageUrl;
			url += "&page="+(pageNumber+1);
			window.open(url,"_self");
	    },
	    link_to: "javascript:void(0)",
	    current_page: page -1,
	    prev_show_always:false,
		next_show_always:false,
	    items_per_page: 1
	});
}


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//									用户反馈
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 用户反馈初始化
function initFeedback(){
	$('.layer').fadeIn();
    $('.back').fadeIn();
    $('.back_close').click(function(){
        $('.layer').fadeOut();
        $('.back').fadeOut();
    });
	
	//更换验证码
	$("#verCodeId").click(function(){
		getVerCode();
	});
	getVerCode();
}
//反馈提交
function postFeedInfo(){
	var content = $("#content").val();
	var email = $("#email").val();
	var vercode = $("input[name=verCode]").val();
	
	if(content == ""){
		alert("请输入您想反馈的内容");
		return false;
	}
	if(email == ""){
		alert("请填写您的邮箱");
		return false;
	}
	var reg = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
	if(!reg.test(email)){
		alert("邮箱格式不正确");
		return false;
	}
	if(vercode == ""){
		alert("请填写验证码");
		return false;
	}
	if($("#isvercodeimg").html().indexOf('ok') == -1){
		alert("验证码错误");
		return false;
	}
	
	$.post("feedback",{
			"realPathId":$("#realPathId").val(),
			"siteCodeId": siteCode,
			"qtId": qt,
			"queryUrl": $("#queryUrl").val(),
			"content": $("#content").val(),
			"email": $("#email").val()
		},function(data){
			if(data.status == "true"){
				alert(data.msg);
				$('.back_close').click();
				//window.location=data.realPath + "index.jsp?siteCode=" + data.siteCode;
			}else{
				alert(data.msg);
			}
		},"json");
}
//获得验证码
function getVerCode(){
	$.ajax({
		type: "post",
		async: false, //同步执行  
		url: "VarCodeServlet",
		dataType: "json", //返回数据形式为json  
		success: function(result) {
			if (result.success) {
				$("#verCodeId").attr("src","data:image/png;base64,"+result.img);
				$("input[name='verCode']").val("");//验证码清空
				$("#isvercodeimg").html("");//验证码验证图片清除
			}
		}
	}); 
}
//即时校验验证码
function isVerCode(vercode){
	$.post("CheckCodeServlet",{"vercode":vercode},function(result){
		if (result.status == "true") {
			$("#idvercode").val("yes");
			$("#isvercodeimg").html("<img src='image/easyui_metro/images/ok.png'/>");
			$("input[name=feedbackbtn]").removeAttr("disabled");
		}else{
			$("#idvercode").val("");
			$("#isvercodeimg").html("<img src='image/easyui_metro/images/cancel.png'/>");
			$("input[name=feedbackbtn]").attr('disabled',"true");
		}
	},"json");
}
//验证码校验
function verCodeText(dom){
	var verCode = $(dom).val()||"";
	//只能输入字母和数字
	$(dom).val(verCode.replace(/[^0-9a-zA-Z]/g,''));
	verCode = $(dom).val()||"";
	if(verCode.length > 4){
		verCode = verCode.substring(0,4);
		$(dom).val(verCode);
	}
	if(verCode.length == 4 || verCode.length < 4){
		isVerCode(verCode);
	}

}
