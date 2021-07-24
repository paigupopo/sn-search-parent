/*文号搜索开启关闭*/
var isClose=true;
$('.wenhao').click(function(){
    var browser=navigator.appName;
    var b_version=navigator.appVersion;
    var version=b_version.split(";");
    var trim_Version=version[1].replace(/[ ]/g,"");
    if(isClose){
        if(browser=="Microsoft Internet Explorer" && trim_Version=="MSIE8.0")
        {
            $(this).find('.down_i').css({'filter':'progid:DXImageTransform.Microsoft.BasicImage(rotation=2)'});
        }else{
            $(this).find('.down_i').css({'transform':'rotate(180deg)','-webkit-transform':'rotate(180deg)','-moz-transform:':'rotate(180deg)','-ms-transform:':'rotate(180deg)'});
        }
        $('#hotsearchword').hide();
        $('.wenhao').attr('status','open');
        $('#office2').show();
    }else{
        if(browser=="Microsoft Internet Explorer" && trim_Version=="MSIE8.0")
        {
            $(this).find('.down_i').css({'filter':' progid:DXImageTransform.Microsoft.BasicImage(rotation=0)'});
        }else{
            $(this).find('.down_i').css({'transform':'rotate(0deg)','-webkit-transform':'rotate(0deg)','-moz-transform:':'rotate(0deg)','-ms-transform:':'rotate(0deg)'});
        }
        $('#hotsearchword').show();
        $('.wenhao').attr('status','close');
        $('#office2').hide();
    }
    isClose=!isClose;
});
//点击文种下拉框，赋值给input
$('.jiguan_sel').click(function(){
    $(this).parent().find('ul').show();
    var $Li=$(this).parent().find('ul li');
    $Li.click(function(){
        var t=$(this).html();
        $(this).parent().parent().find('ul').hide();
        $(this).parent().parent().find('.jiguan_sel span').html(t);
        $(this).parent().parent().find('#docwz').val(t);
    });
    $(document).mouseup(function(e){
        var _con = $('.jiguan_sel').parent().find('ul');
        if(!_con.is(e.target) && _con.has(e.target).length === 0){
            _con.hide();
        }
    });
});
//文号年份控制
var oDate=new Date();
var year=oDate.getFullYear();
var docnf_time=$("#docnf_time");
var docnf=$("#docnf");
docnf_time.html(year);
$('#docnf_wrap').on('click',function(){
    $(this).find('span').hide();
    $(this).find('input').focus();
    $(document).on('mouseup keyup',function(e){
        var _con = $('#docnf_wrap').find('input');
        if(!_con.is(e.target) && _con.has(e.target).length === 0&&!$('#docnf_wrap').find('span').val()){
            if($('#docnf_wrap').find('input').val()==''){
                $('#docnf_wrap').find('span').show();
            }
        }
    });
});
docnf.on('input propertychange', function() {
    docnf.val(docnf.val().replace(/\D/g,''));
});

$('#docwz_wrap').on('click',function(){
    $(this).find('span').hide();
    $(this).find('input').focus();
    $(document).on('mouseup keyup',function(e){
        var _con = $('#docwz_wrap').find('input');
        if(!_con.is(e.target) && _con.has(e.target).length === 0&&!$('#docwz_wrap').find('span').val()){
            if($('#docwz_wrap').find('input').val()==''){
                $('#docwz_wrap').find('span').show();
            }
        }
    });
});


//右侧展开、收起
$('.spread').click(function(){
    if($(this).attr('status')=='close'){
        $(this).find('span').html("收起");
        $(this).find('i').css({'transform':'rotate(180deg)'});
        $(this).parent().parent().find('.spread_part').slideDown();
        $(this).attr({'status':'open'});
    }else if($(this).attr('status')=='open'){
        $(this).find('span').html("展开");
        $(this).find('i').css({'transform':'rotate(0deg)'});
        $(this).parent().parent().find('.spread_part').slideUp();
        $(this).attr({'status':'close'});
    }
});
//点击高级下拉高级页面
$('.advanced_tip').click(function(){
    $('.layer').show();
    $('.advanced_search_box').slideDown();
    $('.close').click(function(){
        $('.layer').hide();
        $('.advanced_search_box').slideUp();
    });
    $('.time_select').change(function(){
        if($(this).val()=='-1'){
            $(this).next().show();
        }else{
            $(this).next().hide();
        }
    });
});

//搜索工具展现收起
$('.open_tool').click(function(){
    $('.tool_box').find('.top').animate({'top':'-10px'},300);
    $('.tool_box').find('.bottom').animate({'display':'block','opacity':'1','top':'10'},300);
    $('.close_tool').show();
});
$('.close_tool').click(function(){
    $('.tool_box').find('.top').animate({'top':'10'},300);
    $('.tool_box').find('.bottom').animate({'opacity':'0','top':'10px'},300,function(){
        $('.tool_box').find('.bottom').css({'display':'none'});
    });
});

//搜索工具  文件类型搜索
function selectFile(obj){
	var fileType = $(obj).attr("value");
	if(typeof(fileType)=="undefined"){
		fileType="";
	}
	var sort = $(".Sort").attr("value");
    var keyplace = $(".keyplace").attr("value");
	searchFile(sort, keyplace, fileType);
	

//搜索工具  时间搜索
/*function selectTime(obj){
	var days = $(obj).attr("value");
	if(typeof(days)=="undefined"){
		days="";
	}
	var sort = $(".Sort").attr("value");
    var keyplace = $(".keyplace").attr("value");
	searchTime(sort, keyplace, days);
	*/
}

//点击清除按钮
$('.clean').click(function(){
    /*$('.tool_box').find('.top').animate({'top':'30'},300);
    $('.tool_box').find('.bottom').animate({'opacity':'0','top':'60px'},300,function(){
        $('.tool_box').find('.bottom').css({'display':'none'});
    });
    $('.time_part').find('.defaul_option').find('span').html('时间不限');
    $('.paixu_part').find('.defaul_option').find('span').html('按相关度排序');
    //$('.site_inner').find('.defaul_option').find('span').html('站点内搜索');
    $('.location_part').find('.defaul_option').find('span').html('全文');
    $('.file').find('.defaul_option').find('span').html('文件类型');
    $('.clean').hide();*/
    
    // 清除搜索工具搜索
    hide_toolsFunc();
});
//清除判断
function judge(){
    if($('.time_part').find('.defaul_option').find('span').html()!=='时间不限'||$('.paixu_part').find('.defaul_option').find('span').html()!=='按相关度排序'||$('.site_inner').find('.defaul_option').find('span').html()!=='站点内搜索'||$('.location_part').find('.defaul_option').find('span').html()!=='搜索位置'||$('.file').find('.defaul_option').find('span').html()!=='文件类名'){
        $('.clean').show();
        $('.close_tool').hide();
    }
}

///////////////////搜索工具查询  开始 //////////////////////////////
//排序
$(".paixu").on("click", function () {
    var sort = $(this).attr("value");
    var keyplace = $(".keyplace").attr("value");
    //搜索
    searchTool(sort, keyplace);
});
//搜索位置
$(".location").on("click", function () {
    var sort = $(".Sort").attr("value");
    var keyplace = $(this).attr("value");
    //搜索
    searchTool(sort, keyplace);
});
//按开始、结束时间
function searchByDate() {
    var sort = $(".Sort").attr("value");
    var keyplace = $(".keyplace").attr("value");
    searchTool(sort, keyplace, 2, true);
}
//时间段
$('.defaul_option').click(function(e) {
    var sort = $(".Sort").attr("value");
    var keyplace = $(".keyplace").attr("value");

    $(this).parent().find('ul').show();
    var $Li = $(this).parent().find('ul li.time');
    $Li.click(function () {
        var t = $(this).html();
        $(this).parent().parent().find('ul').hide();
        $(this).parent().parent().find('.defaul_option span').html(t);
        //清除判断
        judge();
        //	搜索
        // reloadContent_tools();
        searchTool(sort, keyplace);
    });
    $(document).mouseup(function (e) {
        if ($('#ui-datepicker-div').css('display') == 'none') {
            var _con = $('.defaul_option').parent().find('ul');
            if (!_con.is(e.target) && _con.has(e.target).length == 0) {
                _con.hide();
            }
        }
    });
    $(this).parent().find('[type="submit"]').click(function(){
    	$(this).parent().parent().hide();
    });
});
///////////////////搜索工具查询  结束 //////////////////////////////

//城市关闭
$('.city').find('i').click(function(){
    $(this).parent().hide();
});

//图片尺寸
$('.img_size').find('.default_size').click(function(){
    $(this).addClass('on');
    $(this).find('i').css({'transform':'rotate(180deg)'});
    $(this).parent().find('ul').show();
    var $Li=$(this).parent().find('ul li.size');
    $Li.click(function(){
        var t=$(this).html();
        $(this).parent().parent().find('ul').hide();
        $(this).parent().parent().find('.default_size span').html(t);
        $(this).parent().parent().find('.default_size').removeClass('on');
        $(this).parent().parent().find('i').css({'transform':'rotate(360deg)','-webkit-transform':'rotate(360deg)','-moz-transform:':'rotate(360deg)','-ms-transform:':'rotate(360deg)'});
    });
    $(document).mouseup(function(e){
        var _con = $('.default_size').parent().find('ul'); // 设置目标区域
        if(!_con.is(e.target) && _con.has(e.target).length === 0){
            _con.hide();
            _con.parent().find('.default_size').removeClass('on');
            _con.parent().find('i').css({'transform':'rotate(0deg)','-webkit-transform':'rotate(0deg)','-moz-transform:':'rotate(0deg)','-ms-transform:':'rotate(0deg)'});
        }
    });
});
//tab切换
$('#all_tip').click(function(){
    $('.nav').find('a').removeClass('checked');
    $(this).addClass('checked');
    $('.advanced').show();
    $('.piece').hide();
    $('.whole').show();
    $('.img_size').hide();
});

//吸顶条
var oDiv=document.getElementById('com-head');
var oDiv2=document.getElementById('head-copy');
var oNav=document.getElementById('nav');
var browser=navigator.appName;
var b_version=navigator.appVersion;
var version=b_version.split(";");
var trim_Version=version[1].replace(/[ ]/g,"");
var oBackTop=document.getElementById('backtop');
var scrollT = document.documentElement.scrollTop || document.body.scrollTop;
if (scrollT >0) {
    oBackTop.style.display='block';
}else{
    oBackTop.style.display='none';
}
window.onscroll=function() {
    var scrollT = document.documentElement.scrollTop || document.body.scrollTop;
    if (scrollT >0) {
        oDiv.style.position = 'fixed';
        oDiv.style.zIndex = '3';
        oDiv2.style.display = 'block';
        oBackTop.style.display='block';
        if(browser=="Microsoft Internet Explorer" && trim_Version=="MSIE8.0")
        {
            oNav.style.borderBottom='1px solid #e9e9e9';
        }else{
            oDiv.style.boxShadow="0 0 5px #888";
            oNav.style.borderBottom = 'none';
        }
    } else {
        oDiv.style.position = 'static';
        oDiv.style.boxShadow="0 0 0 #fff";
        oDiv2.style.display = 'none';
        oNav.style.borderBottom='1px solid #e9e9e9';
        oBackTop.style.display='none';
    }
};
//点击返回顶部按钮
oBackTop.onclick=function(){
    document.body.scrollTop=0;
};


$(".datepicker_start").datepicker({//添加日期选择功能
    inline: true,
    showOn: "button",
    buttonImage:"sn/css/datepicker/images/date_2.png",
    buttonImageOnly: true,
    numberOfMonths:1,//显示几个月
    showButtonPanel:true,//是否显示按钮面板
    dateFormat: 'yy-mm-dd',//日期格式
    clearText:"清除",//清除日期的按钮名称
    closeText:"关闭",//关闭选择框的按钮名称
    yearSuffix: '年', //年的后缀
    showMonthAfterYear:true,//是否把月放在年的后面
    defaultDate:GetDateStr(-7),//默认日期
    minDate : $("#siteBeginServiceDate_id").val(),//最小日期
    maxDate:GetDateStr(-7),//最大日期
    monthNames: ['1月','2月','3月','4月','5月','6月','7月','8月','9月','10月','11月','12月'],
    dayNames: ['星期日','星期一','星期二','星期三','星期四','星期五','星期六'],
    dayNamesShort: ['周日','周一','周二','周三','周四','周五','周六'],
    dayNamesMin: ['日','一','二','三','四','五','六'],

});

$(".datepicker_start2").datepicker({//添加日期选择功能
    inline: true,
    showOn: "button",
    buttonImage:"sn/css/datepicker/images/date_2.png",
    buttonImageOnly: true,
    numberOfMonths:1,//显示几个月
    showButtonPanel:true,//是否显示按钮面板
    dateFormat: 'yy-mm-dd',//日期格式
    clearText:"清除",//清除日期的按钮名称
    closeText:"关闭",//关闭选择框的按钮名称
    yearSuffix: '年', //年的后缀
    showMonthAfterYear:true,//是否把月放在年的后面
    // defaultDate:GetDateStr(-7),//默认日期
    // minDate : $("#siteBeginServiceDate_id").val(),//最小日期
    // maxDate:GetDateStr(-7),//最大日期
    monthNames: ['1月','2月','3月','4月','5月','6月','7月','8月','9月','10月','11月','12月'],
    dayNames: ['星期日','星期一','星期二','星期三','星期四','星期五','星期六'],
    dayNamesShort: ['周日','周一','周二','周三','周四','周五','周六'],
    dayNamesMin: ['日','一','二','三','四','五','六'],
    onSelect: function( startDate ) {
        // var $startDate = $( "#dateStart_tool" );
        var $endDate = $('.datepicker_end2');
        // var endDate = $endDate.datepicker( 'getDate' );
        // if(endDate < startDate){
        //     $endDate.datepicker('setDate', startDate - 3600*1000*24);
        // }
        $endDate.datepicker( "option", "minDate", startDate );
    }

});
/*============================
 ============================*/
$(".datepicker_end").datepicker({//添加日期选择功能
    inline: true,
    showOn: "button",
    buttonImage: "sn/css/datepicker/images/date_2.png",
    buttonImageOnly: true,
    numberOfMonths:1,//显示几个月
    showButtonPanel:true,//是否显示按钮面板
    dateFormat: 'yy-mm-dd',//日期格式
    clearText:"清除",//清除日期的按钮名称
    closeText:"关闭",//关闭选择框的按钮名称
    yearSuffix: '年', //年的后缀
    showMonthAfterYear:true,//是否把月放在年的后面
    defaultDate:GetDateStr(-1),//默认日期
    minDate : $("#siteBeginServiceDate_id").val(),//最小日期
    maxDate:GetDateStr(-1),//最大日期
    monthNames: ['1月','2月','3月','4月','5月','6月','7月','8月','9月','10月','11月','12月'],
    dayNames: ['星期日','星期一','星期二','星期三','星期四','星期五','星期六'],
    dayNamesShort: ['周日','周一','周二','周三','周四','周五','周六'],
    dayNamesMin: ['日','一','二','三','四','五','六'],
});

$(".datepicker_end2").datepicker({//添加日期选择功能
    inline: true,
    showOn: "button",
    buttonImage: "sn/css/datepicker/images/date_2.png",
    buttonImageOnly: true,
    numberOfMonths:1,//显示几个月
    showButtonPanel:true,//是否显示按钮面板
    dateFormat: 'yy-mm-dd',//日期格式
    clearText:"清除",//清除日期的按钮名称
    closeText:"关闭",//关闭选择框的按钮名称
    yearSuffix: '年', //年的后缀
    showMonthAfterYear:true,//是否把月放在年的后面
    // defaultDate:GetDateStr(-1),//默认日期
    // minDate : $("#siteBeginServiceDate_id").val(),//最小日期
    // maxDate:GetDateStr(-1),//最大日期
    monthNames: ['1月','2月','3月','4月','5月','6月','7月','8月','9月','10月','11月','12月'],
    dayNames: ['星期日','星期一','星期二','星期三','星期四','星期五','星期六'],
    dayNamesShort: ['周日','周一','周二','周三','周四','周五','周六'],
    dayNamesMin: ['日','一','二','三','四','五','六'],
    onSelect: function( endDate ) {
        var $startDate = $( ".datepicker_start2" );
        // var $endDate = $('#dateEnd_tool');
        // var startDate = $startDate.datepicker( "getDate" );
        // if(endDate < startDate){
        //     $startDate.datepicker('setDate', startDate + 3600*1000*24);
        // }
        $startDate.datepicker( "option", "maxDate", endDate );
    }
});

function GetDateStr(AddDayCount) {
    var dd = new Date();
    dd.setDate(dd.getDate() + AddDayCount);// 获取AddDayCount天后的日期
    var y = dd.getFullYear();
    var m = dd.getMonth() + 1;// 获取当前月份的日期
    var d = dd.getDate();
    return y + "-" + m + "-" + d;
}

//高级搜索提示语
$('.condition_top').find('input').focus(function(){
	$(this).next().show();
}).blur(function(){
	$(this).next().hide();
});
$('#q1').on('input propertychange',function(){
	if($('#q1').val()!=''){
        $('#advanced_btn').next().hide();
    }
});

/*
search('qt','sn-ul','sn-btn');
*/
