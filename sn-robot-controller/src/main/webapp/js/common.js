1//应用上下文根
var contextName = "/dhc";

// 没有结果时显示内容
var noResult = "您好，此类问题建议您拨打遂宁政务服务总客服<a style='text-decoration: underline;color: #e2791f; font-weight: bold;'>12345</a>进行咨询。<div style='margin-bottom:7px; font-size:12px; color:#999; margin-top:5px; '></div>"
// 控制默认提示内容
var dvalue = "请输入您的问题";
var content;
var shijian;
// 新闻类型名
var xinwen = ""
// 栏目导航高度限制
var lmdhHeight = 62
var only = 0;
var only1 = 0;
var question;
var value;
var name;
// qa新闻回复字数限制
var qaNumLimitNews = 26
// qa非新闻回复字数限制
var qaNumLimit = 26
window.out123456 = new Array();
window.out456 = new Array();


now = new Date();
hour = now.getHours();
/*if(hour < 6){
    shijian="凌晨好！";
}else if (hour < 9){
    shijian="早上好！";
}else if (hour < 12){
    shijian="上午好！";
}else if (hour < 14){
    shijian="中午好！";
}else if (hour < 17){
    shijian="下午好！";
}else if (hour < 19){
    shijian="傍晚好！";
}else if (hour < 22){
    shijian="晚上好！";
}else {
    shijian="夜里好！";
}*/

/*$(function() {
    findmodule();
    // 点击展开/隐藏栏目导航
    $(document).on("click", ".showOrHide", function() {
        var ul = $(this).siblings("ul");
        // 大于两行就隐藏
        if (parseInt(ul.css("height")) > lmdhHeight) {
            ul.css("max-height", lmdhHeight + "px");
            $(this).find("img").attr("src", "images/chat_close.png");
        } else {
            ul.css("max-height", "100%");
            $(this).find("img").attr("src", "images/chat_open.png");
        }
    })*/
    // //自适应高度
    // var msgMinHeight=490;
    // var msgHeight=$(window).height()-325;
    // if(msgHeight<msgMinHeight){
    // msgHeight=msgMinHeight;
    // }
    // $("#message").css('height',msgHeight+"px")
    // $(window).resize(function() {
    // msgHeight=$(window).height()-325;
    // if(msgHeight<msgMinHeight){
    // msgHeight=msgMinHeight;
    // }
    // $("#message").css('height',msgHeight+"px")
    // });


    $(document).on(
        "mouseover",
        ".tipDiv li",
        function() {
            $(this).addClass("tipLiActive").siblings("li").removeClass(
                "tipLiActive")
        })
    $("#messCon").val(dvalue);
    $(document).on("click", ".tipDiv li", function(e) {
        $("#messCon").val($(this).text());
        $(".tipDiv").css("display", "none")
        stopPropagation(e) // 停止dom事件层次传播
    })
    $(document).on("click", "body", function() {
        $(".tipDiv").css("display", "none")
    })

    var showTipTimeOut;
    $("#messCon").keyup(function() {

        clearTimeout(showTipTimeOut);
        var msg = $(this).val();
        showTipTimeOut = setTimeout(function() {
            $(".tipDiv").css("display", "none")
            showTip();
        }, 500);
    })

    // 左侧标签点击效果
    $("#main0 a").click(function() {
        qaSearchList($(this).text());
    })
    // 竖向tab选项卡
    var $tab_li = $(".tab_title ul li");
    $tab_li.click(function() {
        $(this).addClass("slected").siblings().removeClass("slected");
        var index = $tab_li.index(this);
        $(".tab_content > div").eq(index).show().siblings().hide();
    })
    $(".attention .btn-h").click(function() {
        $(".tab_content > div").eq(1).show().siblings().hide();
        $tab_li.eq(1).addClass("slected").siblings().removeClass("slected");

    })

    // 智能查询tab选项卡
    $(document)
        .on(
            "click",
            ".tab2_title ul li",
            function() {
                $(this).addClass("slected2").siblings().removeClass(
                    "slected2");
                var index = $(this).parent().children().index(this) + 1;
                $(this).parents(".tab2_title").siblings().children()
                    .eq(index).show().siblings().hide();
                $("#message").getNiceScroll().resize();
            })

    // 显示滚动条
    $("#message").niceScroll({
        cursorborder : "",
        cursorcolor : "#9e0001",
        cursoropacitymax : 0.5,
        boxzoom : false,
        autohidemode : "leave"
    });

    // 可输入字数
    function checkInputCount() {
        var maxLen = 50; // 定义用户可以输入的最多字数
        if (this.value.length > maxLen) {
            this.value = this.value.substring(0, maxLen); // 就去掉多余的字
            //$("#number strong").html('超啦').css('color', '#fe5325');
            $("#fontNum2").show();
            $("#fontNum").hide();
        } else {
            $("#fontNum2").hide();
            $("#fontNum").show();
            $("#number strong").html(maxLen - this.value.length);
        }
    }

    function controlInput_clear() {
        if (this.value && this.value == dvalue) {
            this.value = '';
        }
    }

    function controlInput_init() {
        if (!this.value) {
            this.value = dvalue;
        }
    }
    $('#messCon').bind({
        keyup : checkInputCount,
        keydown : checkInputCount,
        focus : controlInput_clear,
        blur : controlInput_init
    });

    // 使用帮助轮播图
    $(".slideBox").slide({
        mainCell : ".bd ul",
        autoPlay : true,
        delayTime : 1000
    });

    // 发送信息
    $("#sendMess").click(function() {

        var mess = $.trim($("#messCon").val()).replace(/[<>]/g,'');

        if (mess == "" || mess == dvalue) {

            return false;
        } else {
            qaSearch(mess);
        }
    })


    // 获得url参数，自动检索
    var paramQuestion = getUrlParam("question");
    if (paramQuestion != null && paramQuestion.length > 0) {
        $("#messCon").val(decodeURIComponent(paramQuestion));
        $("#sendMess").click();
    }

    // 隐藏展开答案
    $(document).on("click", ".onoff", function() {
        toggleDialog($(this));

    })

    // 收藏结果
    $(document)
        .on(
            "mousedown",
            ".diglog_tab_gai",
            function(e) {
                if (3 == e.which) {
                    // 获得当前问题
                    var question = $(this).prev("ul").children("li")
                        .text();

                    $(".tipDiv2 ul")
                        .empty()
                        .append(
                            "<li  class='addFavorite' question='"
                            + question
                            + "'><i class='menu_ico add_favorite'>"
                            + "</i>加入收藏</li><li  class='addHome'><i class='menu_ico add_home'>"
                            + "</i>设为首页</li><li class='cleanContent'><i class='menu_ico clean_content'></i>清空屏幕</li>");
                    $(".tipDiv2").css("display", "block");
                    $(".tipDiv2").css("top", e.pageY + 5);
                    $(".tipDiv2").css("left", e.pageX + 15);
                    stopPropagation(e) // 停止dom事件层次传播
                }
            })

    // 显示清空浮层
    /*
     * $("#message") .rightClick( function(e) { $(".tipDiv2 ul") .empty()
     * .append( "<li  class='addHome'><i class='menu_ico add_home'>" + "</i>设为首页</li><li class='cleanContent'><i
     * class='menu_ico clean_content'></i>清空屏幕</li>");
     * $(".tipDiv2").css("display", "block"); $(".tipDiv2").css("top", e.pageY +
     * 5); $(".tipDiv2").css("left", e.pageX + 15); }) // 隐藏清空浮层
     * $("#message").click(function(e) { if (3 != e.which) {
     * $(".tipDiv2").css("display", "none"); } })
     */
    // 清空屏幕绑定事件
    $(document).on("click", ".cleanContent", function() {
        $(".tipDiv2").css("display", "none");
        $("#message").empty()
    })
    // 加入收藏绑定事件
/*    $(document).on("click", ".addFavorite", function() {
        var question = $(this).attr("question");
        var url = window.location.href.split("?")[0];
        if (url.indexOf("index.html") == -1) {
            url += "index.html";
        }
        url += "?question=" + encodeURIComponent(question);
        addFavorite(url, "智能咨询平台问题：" + question);
        $(".tipDiv2").css("display", "none");
    })*/

    // 设为首页绑定事件
 /*   $(document).on("click", ".addHome", function() {
        setHomepage()
        $(".tipDiv2").css("display", "none");
    })*/

    // 新闻中心
    getLatestNews("近期信息公开", function(out) {
        $("[channel='zcfb']").empty().html(out)
    })
    // 信息公开
    getLatestNews("政策解读", function(out) {
        $("[channel='zcjd']").empty().html(out)
    })

/*function findmodule(){
    $.getJSON(contextName+"/admin/web/module.do",function(date){
        var modulelist=date.msg;
        for(var i = 0; i < modulelist.length; i++){
            if(modulelist[i].title=="欢迎语"){
                var huanyingyu=shijian+modulelist[i].content;
                $("#huanying").append(huanyingyu);
            }
            if(modulelist[i].title=="常见问题"){
                var changjianwenti=""
                changjianwenti=changjianwenti+"<li><a href='javascript:;' title='"+modulelist[i].content+"'>"+modulelist[i].content+"</a></li>"
                $("#changjianwenti").append(changjianwenti);
            }
        }
        liclick();
    });

}*/
function liclick(){
    $(".hottags-ul li a").click(function(){
        var nowTime = new Date().getTime();
        var clickTime = $(this).attr("ctime");
        if( clickTime != 'undefined' && (nowTime - clickTime < 2000)){

            return false;
        }else{
            $(this).attr("ctime",nowTime);
            var hot = $(this).html();
            $(".onoff").each(function() {
                toggleDialog($(this), "off")
            })
            qaSearch(hot);
        }
    });
}

// 最新新闻
function getLatestNews(channel, callback) {
    var template_table = " <table>{tr}</table>"
    var template_tr = "<tr><td class='dd'></td><td class='t'><a href='{link}' target='_blank' title='{title}'>{title}</a></td></tr>"
    // 获取json
    var url = '';
    var param = {
        "channel" : channel
    }
    $
        .getJSON(
            url,
            param,
            function(data) {
                var out = "";
                var msg = data.msg;
                if (data.sig) {
                    // 请求成功
                    for (var i = 0; i < msg.length; i++) {

                        var qaNumLimitTrue = qaNumLimit;
                        msg[i].title.length > qaNumLimitTrue ? msg[i].title = msg[i].title
                                .substring(0, qaNumLimitTrue)
                            + "..."
                            : msg[i].title
                        var obj = [ {
                            "name" : "link",
                            "value" : msg[i].url
                        }, {
                            "name" : "title",
                            "value" : msg[i].title
                        }, {
                            "name" : "date",
                            "value" : msg[i].date
                        } ]
                        out += replaceTemplate(template_tr, obj);
                    }
                    var obj = [ {
                        "name" : "tr",
                        "value" : out
                    } ]
                    out = replaceTemplate(template_table, obj);
                    // 获得最终的html，回调函数自己处理拼接
                    callback(out)
                } else {
                    // 请求失败，返回空字符串
                    callback("")
                }
            })
}

// 定义加入收藏夹函数
function addFavorite(siteUrl, siteName) {
    if (document.all) {
        try {
            window.external.addFavorite(siteUrl, siteName);
        } catch (e) {

        }

    } else if (window.sidebar) {
        window.sidebar.addPanel(document.title, window.location.href, "");
    } else {

    }
}

// 设为首页 <a onclick="SetHome(this,window.location)">设为首页</a>
function setHomepage() {
    if (document.all) {
        document.body.style.behavior = 'url(#default#homepage)';
        document.body.setHomePage(window.location.href);
    } else if (window.sidebar) {
        if (window.netscape) {
            try {
                netscape.security.PrivilegeManager
                    .enablePrivilege("UniversalXPConnect");
            } catch (e) {
            }
        }
        var prefs = Components.classes['@mozilla.org/preferences-service;1']
            .getService(Components.interfaces.nsIPrefBranch);
        prefs.setCharPref('browser.startup.homepage', window.location.href);
    } else {
    }
}

function toggleDialog(obj, paramStatus) {
    var toStatus = "";
    // 未传入paramStatus参数，获得当前obj的status，toggle
    if (typeof (paramStatus) == 'undefined' || paramStatus == null) {
        var status = obj.attr("status");
        if (status == "on") {
            toStatus = "off";
        } else {
            toStatus = "on";
        }
    } else {
        toStatus = paramStatus;
    }

    if (toStatus == "off") {
        obj.attr("status", "off");
        obj.css("background-image", "url('images/chat_close.png')");
        obj.parent("li").parent("ul").next("div").css("display", "none");

    } else {
        obj.attr("status", "on");
        obj.css("background-image", "url('images/chat_open.png')");
        obj.parent("li").parent("ul").next("div").css("display", "");

    }

}

var tipArr = new Array();

// 显示提示浮层
function showTip() {
    var url = ''
    var param = {
        "question" : $("#messCon").val().replace(/[^\u4e00-\u9fa5a-zA-Z0-9\w]/g,'').replace( /[a-zA-Z]/g,''),
        "isParticle" : "true",
        "isShould" : "true"
    }
    if (param.question == dvalue)
        return;
    if ($.trim($("#messCon").val().replace(/[^\u4e00-\u9fa5a-zA-Z0-9\w]/g,'').replace( /[a-zA-Z]/g,'')).length > 0) {

        $.getJSON(url, param, function(data) {
            tipArr = new Array()
            var msg = data.msg;
            if (data.sig == true) {
                var out = "";
                var datalist = new Array();
                var flag = false;
                for (var i = 0; i < msg.length; i++) {
                    tipArr.push(msg[i]);
                    var datamasg = msg[i].SEARCHCONTENT.replace($("#messCon").val().replace(/[^\u4e00-\u9fa5a-zA-Z0-9\w]/g,'').replace( /[a-zA-Z]/g,''),
                        '<font color="red">' + $("#messCon").val().replace(/[^\u4e00-\u9fa5a-zA-Z0-9\w]/g,'').replace( /[a-zA-Z]/g,'')
                        + '</font>');
                    for (var j = 0; j < datalist.length; j++) {
                        if (datamasg == datalist[j]) {
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) {
                        datalist.push(datamasg);
                        out += "<li>" + datamasg + "</li>";
                    }

                }

                if (msg.length > 0) {
                    $(".tipDiv ul").html(out);
                    $(".tipDiv").css("display", "block");
                }
            }
        })
    }

}
// 获得传入问题相同的提示，并将此提示ID作为参数传入后台
function getSimTip(question) {
    for (var i = 0; i < tipArr.length; i++) {
        if (question == tipArr[i].SEARCHCONTENT) {
            return tipArr[i].ID
        }
    }
}

/*!// 阻止事件气泡
function stopPropagation(e) {
    e = window.event || e;
    if (document.all) {
        e.cancelBubble = true;
    } else {
        e.stopPropagation();
    }
}*/
function qaSearch(question) {
    // 显示问题并移动到底部
    addQuestion(question);
    scrollToBottom();

    var searchHisId = getSimTip(question) + "";
    searchHisId = searchHisId.length == 0 ? "0" : searchHisId;
    var qaData = {
        "msg" : new Array()
    };
    if(question.indexOf("\\")>=0||question.indexOf("{")>=0||question.indexOf("}")>=0||question.indexOf("[")>=0||question.indexOf("]")>=0||question.indexOf(":")>=0||question.indexOf("^")>=0||question.indexOf("(")>=0||question.indexOf(")")>=0||question.indexOf("~")>=0){
        Specialcharacters();
        scrollToBottom();
        return 0;
    }
    this.question=question;
    var param = {
        "question" : encodeURIComponent(question.replace(/[\s|\~|`|\!|\@|\#|\$|\%|\^|\&|\*|\(|\)|\-|\_|\+|\=|\||\|\[|\]|\{|\}|\;|\:|\"|\'|\,|\<|\.|\>|\/|\?\。]/g,"")),
        "begin" : 0,
        "end" : 20,
        "searchHisId" : searchHisId,
        "isStorgeHis" : "true"
    };
    $.getJSON(contextName + "/admin/web/qaSearch.do", param, function(data) {
        addAnswer(question, data);
        showOrHideUl();
        scrollToBottom();
    });

    var url = ''
    var param = {
        "question" : encodeURIComponent(question.replace(/[ ]/g,"")),
        "isParticle" : "true",
        "isShould" : "true"
    }
    if (param.question == dvalue)
        return;

    $.getJSON(
        url,
        param,
        function(data) {
            tipArr = new Array()
            var msg = data.msg;
            if (data.sig == true) {
                var out123 = "";

                out456 = new Array();
                for (var i = 0; i < msg.length; i++) {
                    flag = false;
                    tipArr.push(msg[i]);
                    out123456 = null;
                    out123456 = msg[i].SEARCHCONTENT.replace();
                    if (question != out123456) {
                        for (var j = 0; j < out456.length; j++) {
                            if (out123456 == out456[j]) {
                                flag = true;
                                break;
                            }
                        }
                        if (!flag) {

                            out456.push(out123456);
                            if(out123456.length>=2){
                                out123 += "<li>" + out123456 + "</li>";
                            }

                        }

                        out123456 = "<div class='xg-qus'><div class='qus-tit'>相关查询</div><ul class='clearfix hottags-ul2'>"
                            + out123 + "</ul></div>";
                    } else {
                        out123456 = "";

                    }
                }
            }
        })

}

/*
function qaSearchList(question) {
    var url = '';
    if (url.indexOf("?") != -1) {
        w

        // window.location.href=url+"&word="+encodeURIComponent(question);
    } else {
        window.open(url + "?word=" + encodeURIComponent(question));

        // window.location.href=url+"?word="+encodeURIComponent(question);
    }
}
*/


function scrollToBottom() {
    $("#message").scrollTop(
        parseInt($("#message")[0].scrollHeight)
        - parseInt($("#message").css("height")));
    $("#message").getNiceScroll().resize();
}

// 追加问题

// 适用于$page $page[n-n:n]
function changeChnlUrl(url) {
    return url.replace(/\$page\[(.*?)-.*?\]/, "$1").replace(/\$page/, "1");
}

// 获得栏目导航信息
function getChannels(msg) {
    var channelObj = {};
    var titleJson = {}
    for (i in msg) {
        for (var j = 0; j < msg[i].length; j++) {
            // 过滤掉重复标题
            var fullTitle = msg[i][j].title;
            if (typeof (titleJson[fullTitle]) != 'undefined') {
                continue;
            } else {
                titleJson[fullTitle] = "";
            }
            if (typeof (msg[i][j].channel) != 'undefined'
                && typeof (msg[i][j].channelUrl) != 'undefined') {
                msg[i][j].channel = msg[i][j].channel.replace(
                    /[^a-zA-Z0-9_\u4e00-\u9fa5]/ig, "");
                if (typeof (channelObj[msg[i][j].channel]) == 'undefined') {
                    channelObj[msg[i][j].channel] = {
                        "channel" : msg[i][j].channel,
                        "channelUrl" : changeChnlUrl(msg[i][j].channelUrl),
                        "num" : 1
                    }
                } else {
                    channelObj[msg[i][j].channel].num++;
                }
            }

        }
    }
    return channelObj;
}


function js_response(date) {

}
function Sensitiveword() {

/*
    var cont22 = "<div class='diglog_tab_gai'><div><div class='right_arrow'></div><span class='triangle'></span><div class='tab2_content'>很抱歉，您搜索的内容含有<font style='color:#e2791f; font-weight: 700;'>敏感词</font>，无法找到相关内容</div></div></div>"
*/

    //$("#message").append(cont22);
}
function Chattingwords(msg) {
    for (var i1 in msg) {
        for (var j1 = 0; j1 < msg[i1].length && j1< 1; j++) {
/*
            var cont22 = "<div class='diglog_tab_gai'><div><div class='right_arrow'></div><span class='triangle'></span><div class='tab2_content'>"+msg[i1][j1].title+"</div></div></div>";
*/
            //$("#message").append(cont22);
            return 0;
        }
    }



}

function Specialcharacters(){
/*
    var noResult1="<div class='diglog_tab_gai'><div><div class='right_arrow'></div><span class='triangle'></span><div class='tab2_content'>很抱歉，您搜索的内容含有<font style='color:#e2791f;  font-weight: 700;'>特殊字符</font>，无法找到相关内容。</div></div></div>";
*/
    //$("#message").append(noResult1);
}
function addAnswer(question, qaMsg) {
    var question = question;

    var categoryLi = "";
    var qaDiv = "";
    var bcon="";
    var channelLi = "";
    var msg = qaMsg.msg;
    var index = 0;
    // 重复标题
    for ( var i in msg) {
        if (i == "含有敏感词") {
            Sensitiveword();
            return 0;
        }
        if (i == "闲聊词") {
            Chattingwords(msg);
            return 0;
        }
    }
    if(question.indexOf("\\")>=0||question.indexOf("{")>=0||question.indexOf("}")>=0||question.indexOf("[")>=0||question.indexOf("]")>=0||question.indexOf(":")>=0||question.indexOf("^")>=0||question.indexOf("(")>=0||question.indexOf(")")>=0||question.indexOf("~")>=0){

        Specialcharacters();
        scrollToBottom();
        return 0;
    }
    var titleJson = {}
    if (qaMsg.sig) {
        var channelObj = getChannels(msg);
        for (i in channelObj) {

            if (channelLi.length == 0) {
                var date = {
                    "channelUrl" : channelObj[i].channelUrl,
                    "channel" : channelObj[i].channel,
                    "content" : channelObj[i].content
                };
                channelLi = "<a href='javascript:void(0);' onclick='js_response(date)' "
                    + channelObj[i].channel
                    + "("
                    + channelObj[i].num
                    + ")</a>"

            } else {
                var date = {
                    "channelUrl" : channelObj[i].channelUrl,
                    "channel" : channelObj[i].channel,
                    "content" : channelObj[i].content
                };
                channelLi = "-<a href='javascript:void(0);' onclick='js_response(date)' "
                    + channelObj[i].channel
                    + "("
                    + channelObj[i].num
                    + ")</a>"
            }
        }
        if (channelLi.length != 0) {
            channelLi = "<p><strong>栏目导航</strong></p><ul class='news chnl'><li>"
                + channelLi + "</li></ul>"
        }
        var rr=0;
        var aa;
        for (i in msg) {
            if (msg[i].length == 0) {
                continue;
            }
            var curQaLi = "";
            var curQaDiv = "";
            // 遍历分类
            if (index == 0) {
                categoryLi = "<li class='slected2'>" + i + "</li>"
            } else {
                categoryLi += "<li>" + i + "</li>"
            }
            var result = 0;
            for (var j = 0; j < msg[i].length && j < 4; j++) {
                // qa回复字数限制
                var title = msg[i][j].title;
                var fullTitle = msg[i][j].title;
                var qaNumLimitTrue = qaNumLimit;

                // 过滤掉重复标题
                if (typeof (titleJson[fullTitle]) != 'undefined') {
                    continue;
                } else {
                    titleJson[fullTitle] = "";
                }

                if (isInclude(xinwen, i)) {
                    qaNumLimitTrue = qaNumLimitNews;
                }
                /*if (title.length > qaNumLimitTrue) {
                    title = title.substring(0, qaNumLimitTrue) + "...";
                }*/
                var category1=msg[i][j].category;
                if(category1==null){
                    category1=i
                }
                // 如果有预设页面html则优先展示
                if (msg[i][j].html != undefined && msg[i][j].html != null
                    && msg[i][j].html.length > 0) {
                    curQaDiv +='<p style="color:#0066cb;"> '+msg[i][j].html+'</p></br></br><span style="color:#e08639">相关推荐:</span>';
                } else {
                    content = msg[i][j].content;
                    if (msg[i][j].url.indexOf("http") == -1) {
                        result++;
                        curQaLi += "<li><button id='"
                            + title
                            + "' value='"
                            + content
                            + "' title='"
                            + title
                            + "' name='"
                            + msg[i][j].url
                            + "' onclick='findcontent123(this)' >"
                            + title
                            + "</button><span class='bszn'>["
                            + category1 + "]</span></li>"
                    } else {
                        content = msg[i][j].content;
                        nameone=msg[i][j].url;
                        if (content == ""||content==null) {
                            result++;
                            curQaLi += "<li><a title='" + fullTitle
                                + "' href=" + msg[i][j].url
                                + " target='_blank' onclick='recordClick(this)'>" + title
                                + "</a><span class='bszn'>[" +category1
                                + "]</span></li>"
                        } else {
                            question=question.replace(/[\ |\~|\`|\!|\@|\#|\$|\%|\^|\&|\*|\(|\)|\-|\_|\+|\=|\||\\|\[|\]|\{|\}|\;|\:|\"|\'|\,|\<|\.|\>|\/|\？|\?|\。|\，|\；|\r|\n]/g,"");
                            title=title.replace(/[\ |\~|\`|\!|\@|\#|\$|\%|\^|\&|\*|\(|\)|\-|\_|\+|\=|\||\\|\[|\]|\{|\}|\;|\:|\"|\'|\,|\<|\.|\>|\/|\？|\?|\。|\，|\；|\r|\n]/g,"");

                            if(question==title){
                                // 判断是否含有空格
                                if (content.indexOf("img") > 0) {

                                } else {
                                    // obj.value = content.replace(/\s+/g, "<br/>");
                                    content = content.replace(/\s+/g, "");
                                    content = content.replace(/br/g, "");
                                    content = content.replace(/。/g, "。<br/>");

                                }

                                if(content.length>500){
                                    bcon="<div class='bcontext bcontext-c'>"+content+"</div>"+"<p class='bcon-more'>[阅读全文]</p><a href='"+nameone+ "' target='_blank' class='adwz' style='margin-left:10px;'>点击进入网页内容</a>"
                                }else{
                                    bcon="<div class='bcontext' style='margin-bottom: 10px;'>"+content+"<a href='"+nameone+ "' target='_blank' class='adwz'  style='margin-left:10px;'>点击进入网页内容</a></div>"
                                }

                            }else{
                                if(content.length>=39){
                                    var valuesubstr = msg[i][j].content.substr(0,
                                        39);
                                    if (valuesubstr == '<img src="http://www.shanghai.gov.cn/nw'||valuesubstr == '<img src="http://wsxf.sh.gov.cn/xf_swld') {
                                        result++;
                                        curQaLi += "<li><button id='"
                                            + title
                                            + "' value='"
                                            + content
                                            + "' title='"
                                            + title
                                            + "' name='"
                                            + msg[i][j].url
                                            + "' onclick='findcontent123(this)' >"
                                            + title
                                            + "</button><span class='bszn'>[市领导]</span></li>"
                                    }
                                    else{
                                        if(i=="公众服务" || i=="要闻动态" || i=="政策解读" || i=="政策文件" || i=="信息公开"){
                                            result++;
                                            curQaLi += "<li><button id='"
                                                + title
                                                + "' value='"
                                                + content
                                                + "' title='"
                                                + title
                                                + "' name='"
                                                + msg[i][j].url
                                                + "' onclick='findcontent1234(this)' >"
                                                + title
                                                + "</button><span class='bszn'>["
                                                + i + "]</span></li>"
                                        }
                                        else{
                                            result++;
                                            curQaLi += "<li><button id='"
                                                + title
                                                + "' value='"
                                                + content
                                                + "' title='"
                                                + title
                                                + "' name='"
                                                + msg[i][j].url
                                                + "' onclick='findcontent123(this)' >"
                                                + title
                                                + "</button><span class='bszn'>["
                                                + i + "]</span></li>"
                                        }
                                    }
                                }

                            }

                        }
                    }
                    // 新闻类型的显示时间
                    if (isInclude(xinwen, i) && msg[i][j].date != undefined) {
                        curQaLi = curQaLi.replace(/\{date\}/g, "<span>"
                            + msg[i][j].date + "</span>");
                    } else {
                        curQaLi = curQaLi.replace(/\{date\}/g, "");
                    }
                }
            }
            rr+=result;
            qaDiv += "" + curQaDiv + "  " + curQaLi + "";
            index++;
            aa += curQaDiv;
        }
        if(aa!="" && aa != 'undefined' && aa!=null){
/*
            var template = "<div class='diglog_tab_gai'><div><div class='right_arrow'></div><span class='triangle'></span><div class='tab2_content'><ul class='news news-nn'>{qaDiv}</ul></div></div>"
*/
                + out123456
                + "<div class='g-man clearfix'><span>您对以上信息是否满意？</span><div class='g-man1 left'  onclick='judge(this)' id='yesDiv'><span></span>满意</div><div class='g-man2 left'  onclick='judge(this)' id='noDiv'><span></span>不满意</div></div></div>";

        }
        else if(rr>6){
            var template = "<div class='diglog_tab_gai'><div><div class='right_arrow'></div><span class='triangle'></span><p>您好，您的问题是：<span>{question}</span><br/>我为您优先推荐以下服务信息：</p>"+bcon+"<div class='tab2_content'><ul class='news news-nn'>{qaDiv}<p class='more-new'>更多信息</p></ul></div></div>"
                + "<div class='g-man clearfix'><span>您对以上信息是否满意？</span><div class='g-man1 left'  onclick='judge(this)' id='yesDiv'><span></span>满意</div><div class='g-man2 left'  onclick='judge(this)' id='noDiv'><span></span>不满意</div><span>如果上述回答还没有解决您的问题，您也可以拨打上海政务服务总客服12345进一步咨询。</span></div></div>";


        }else if(rr==0){
/*
            var template = "<div class='diglog_tab_gai'><div><div class='right_arrow'></div><span class='triangle'></span><p>您的问题是：<span>{question}</span><br/我为您优先推荐以下服务信息：</p>"+bcon+"</div><div class='g-man clearfix'><span>您对以上回答是否满意？</span><div class='g-man1 left'  onclick='judge(this)' id='yesDiv'><span></span>满意</div><div class='g-man2 left'  onclick='judge(this)' id='noDiv'><span></span>不满意</div></div></div>";
*/

        }else{
/*
            var template = "<div class='diglog_tab_gai'><div><div class='right_arrow'></div><span class='triangle'></span><p>您的问题是：<span>{question}</span><br/>我为您优先推荐以下服务信息：</p>"+bcon+"<div class='tab2_content'><ul class='news news-nn'>{qaDiv}</ul></div></div><div class='g-man clearfix'><span>您对以上回答是否满意？</span><div class='g-man1 left'  onclick='judge(this)' id='yesDiv'><span></span>满意</div><div class='g-man2 left'  onclick='judge(this)' id='noDiv'><span></span>不满意</div></div></div>";
*/

        }
    } else {
        qaDiv = noResult;
/*
        var template = "<div class='diglog_tab_gai' style='padding-bottom:0;'>{channelLi}<div><div class='right_arrow'></div><span class='triangle'></span><div class='tab2_content'>{qaDiv}</div></div>"
*/
            +  "</div>";
    }
    template = template.replace(/\{question\}/g, question);
    template = template.replace(/\{categoryLi\}/g, categoryLi);
    template = template.replace(/\{qaDiv\}/g, qaDiv);
    template = template.replace(/\{channelLi\}/g, channelLi);

   // $("#message").append(template);
    clickmore();
    // 移动滚动条
    scrollToBottom();

    var flag = true;
    $('.bcon-more').click(function() {

        if (flag) {
            $(this).siblings('.bcontext-c').css({
                'overflow' : 'visible',
                'height' : 'auto'
            })
            $(this).html("[收起]");

            flag = false;
        } else {
            $(this).siblings('.bcontext-c').css({
                'overflow' : 'hidden',
                'height' : '148px'
            })
            $(this).html("[阅读全文]");

            flag = true;
        }

    })
    scrollToBottom();
}
// 评价
function submit(submitid) {
    var valueshanghai="";
    valueshanghai=document.getElementById('content').value
    if (submitid.id == "cancelBtn") {

    } else if (submitid.id == "submitBtn") {
        var thumb = "不满意";
        var date = {
            "question" : this.question,
            "thumb" : thumb,
            "jjthumbtext" : valueshanghai
        };
        $.post(contextName + "/admin/web/qathumbSearch.do", date, function(data) {
        });
    }
}
//判断是否是第一次点击
function judge(a) {
    if (a.id == "yesDiv") {
        var thumb = "满意";
        var date = {
            "question":this.question,
            "thumb" : thumb
        };
        $.post(contextName + "/admin/web/qathumbSearch.do", date,
            function(data) {
                // 显示异步回传的数据
                $(a).parent("div").html("谢谢您的评价！");

            });
    } else if (a.id == "noDiv") {
        var thumb = "不满意";
        $(a).parent("div").html("很抱歉上述回答没有解决您的问题，您也可以拨打遂宁政务服务总客服12345进一步咨询。");
        $('.prompting').show();
    }
}
$('.other').click(function(){
    if($(this).is(':checked')) {
        $(this).parent().siblings('.cause').show();
    }else{
        $(this).parent().siblings('.cause').hide();
    }
})
$('#submitBtn').click(function() {
    $(".prompting").hide();
    $("#content").val("");
    $('.input-box').attr("checked",false);
    $('.cause').hide();
})

$('#cancelBtn').click(function() {
    $(".prompting").hide();
    $("#content").val("");
    $('.input-box').attr("checked",false);
    $('.cause').hide();
})

//评价-end



function recordClick(xqtitle) {
    var url;
    if(xqtitle.href==null){
        url=xqtitle;
    }else{
        url=xqtitle.href;
    }
    var date = {
        "xqtitle" : url
    };
    $.post(contextName + "/admin/web/recordClick.do", date, function(data) {
    });
}


// 返回答案
function findcontent123(obj) {

    name = obj.name;
    value = obj.value;
    recordClick(name)
    var a = '<ul class="dialog"><li class="center"><a  title='+obj.id+'>' + obj.id
        + '</a><div class="onoff" status="on"></div></li></ul>';

   // $("#message").append(a);
    // 判断是否含有空格
    if (obj.value.indexOf("img") > 0) {

    } else {
        // obj.value = obj.value.replace(/\s+/g, "<br/>");
        obj.value = obj.value.replace(/\s+/g, "");
        obj.value = obj.value.replace(/br/g, "");
        obj.value = obj.value.replace(/。/g, "。<br/>");

    }
    if(name!=null&&name!=""){
        if (obj.value.length < 160) {
            var cont = /*"<div class='diglog_tab_gai daan'><div><div class='right_arrow'></div><span class='triangle'></span><span>"*/
                + obj.id
                + "</span><div class='c_text1' id='c_text'>"
                + obj.value
                + "</div><a href='"
                + obj.name
                + "' target='_blank' class='adwz'>点击进入网页内容</a><div class='g-man clearfix' ><span>您对以上回答是否满意？</span><div class='g-man1 left' name='"
                + obj.id
                + "' url='"
                + obj.name
                + "' onclick='judge(this)' id='yesDiv' ><span></span>满意</div><div class='g-man2 left' name='"
                + obj.id
                + "' url='"
                + obj.name
                + "' onclick='judge(this)' id='noDiv' ><span></span>不满意</div></div></div></div>"
        } else {
            var cont = /*"<div class='diglog_tab_gai daan'><div><div class='right_arrow'></div><span class='triangle'></span><span>"
                + obj.id*/
                + "</span><div class='c_text' id='c_text'>"
                + obj.value
                + "</div><a href='"
                + obj.name
                + "' target='_blank' class='adwz'>点击进入网页内容</a><p class='more-dan'>[阅读全文]</p><div class='g-man clearfix' ><span>您对以上回答是否满意？</span><div class='g-man1 left' name='"
                + obj.id
                + "' url='"
                + obj.name
                + "' onclick='judge(this)' id='yesDiv' ><span></span>满意</div><div  class='g-man2 left' name='"
                + obj.id
                + "'url='"
                + obj.name
                + "' onclick='judge(this)' id='noDiv' ><span></span>不满意</div></div></div></div>"

        }
    }else{
        var cont = /*"<div class='diglog_tab_gai daan'><div><div class='right_arrow'></div><span class='triangle'></span><span>"
            + obj.id*/
            + "</span><div class='c_text1' id='c_text'>"
            + obj.value
            + "</div><div class='g-man clearfix' ><span>您对以上回答是否满意？</span><div class='g-man1 left' name='"
            + obj.id
            + "' url='"
            + obj.name
            + "' onclick='judge(this)' id='yesDiv' ><span></span>满意</div><div class='g-man2 left' name='"
            + obj.id
            + "' url='"
            + obj.name
            + "' onclick='judge(this)' id='noDiv' ><span></span>不满意</div></div></div></div>"

    }
    //$("#message").append(cont);
    var flag = true;
    $('.more-dan').click(function() {

        if (flag) {
            $(this).siblings('.c_text').css({
                'overflow' : 'visible',
                'height' : 'auto'
            })
            $(this).html("[收起]");

            flag = false;
        } else {
            $(this).siblings('.c_text').css({
                'overflow' : 'hidden',
                'height' : '134px'
            })
            $(this).html("[阅读全文]");

            flag = true;
        }

    })
    scrollToBottom();

}
// 返回答案-end
/*function findcontent1234(obj) {

    name = obj.name;
    value = obj.value;
    recordClick(name)
    var a = '<ul class="dialog"><li class="center"><a  title='+obj.id+'>' + obj.id
        + '</a><div class="onoff" status="on"></div></li></ul>';

   //  $("#message").append(a);
    // 判断是否含有空格
    if (obj.value.indexOf("img") > 0) {

    } else {
        // obj.value = obj.value.replace(/\s+/g, "<br/>");
        obj.value = obj.value.replace(/\s+/g, "");
        obj.value = obj.value.replace(/br/g, "");
        obj.value = obj.value.replace(/。/g, "。<br/>");

    }
    if(name!=null&&name!=""){
        if (obj.value.length < 160) {
            var cont = "<div class='modal_show'><div class='modal'><span id='modal_close'></span><div class='modal_content'><p><span>"
                + obj.id
                + "</span></p><p></p><div class='c_text1' id='c_text'>"
                + obj.value
                + "</div><a href='"
                + obj.name
                + "' target='_blank' class='adwz'>点击进入网页内容</a><div class='g-man clearfix' style='display:none;'><span>您对以上回答是否满意？</span><div class='g-man1 left' name='"
                + obj.id
                + "' url='"
                + obj.name
                + "' onclick='judge(this)' id='yesDiv' ><span></span>满意</div><div class='g-man2 left' name='"
                + obj.id
                + "' url='"
                + obj.name
                + "' onclick='judge(this)' id='noDiv' ><span></span>不满意</div></div></div></div></div>"
        } else {
            var cont= "<div class='modal_show'><div class='modal'><span id='modal_close'></span><div class='modal_content'><p><span>"
                + obj.id
                + "</span></p><p></p><div class='c_text' id='c_text'>"
                + obj.value
                + "</div><a href='"
                + obj.name
                + "' target='_blank' class='adwz'>点击进入网页内容</a><p class='more-dan'>[阅读全文]</p><div class='g-man clearfix' style='display:none;' ><span>您对以上回答是否满意？</span><div class='g-man1 left' name='"
                + obj.id
                + "' url='"
                + obj.name
                + "' onclick='judge(this)' id='yesDiv' ><span></span>满意</div><div  class='g-man2 left' name='"
                + obj.id
                + "'url='"
                + obj.name
                + "' onclick='judge(this)' id='noDiv' ><span></span>不满意</div></div></div></div></div>"

        }
    }else{
        var cont = "<div class='modal_show'><div class='modal'><span id='modal_close'></span><div class='modal_content'><p><span>"
            + obj.id
            + "</span></p><p></p><div class='c_text1' id='c_text'>"
            + obj.value
            + "</div><div class='g-man clearfix' style='display:none;'><span>您对以上回答是否满意？</span><div class='g-man1 left' name='"
            + obj.id
            + "' url='"
            + obj.name
            + "' onclick='judge(this)' id='yesDiv' ><span></span>满意</div><div class='g-man2 left' name='"
            + obj.id
            + "' url='"
            + obj.name
            + "' onclick='judge(this)' id='noDiv' ><span></span>不满意</div></div></div></div></div>"

    }
   // $("#message").append(cont);
    var flag = true;
    $('.more-dan').click(function() {

        if (flag) {
            $(this).siblings('.c_text').css({
                'overflow' : 'visible',
                'height' : 'auto'
            })
            $(this).html("[收起]");

            flag = false;
        } else {
            $(this).siblings('.c_text').css({
                'overflow' : 'hidden',
                'height' : '134px'
            })
            $(this).html("[阅读全文]");

            flag = true;
        }

    })
    scrollToBottom();
    $(".modal #modal_close").click(function(){
        $(".modal_show").hide();
    })
}*/
// 返回答案-end
function clickmore() {
    $('.news-nn li').slice(6, 20).hide();
    $('.news-nn li').parent().removeClass("news-nn");

    $(".hottags-ul2 li").click(function() {
        var hot123 = $(this).html();
        $(".onoff").each(function() {
            toggleDialog($(this), "off")
        })
        qaSearch(hot123);

    })

    $('.more-new').click(function() {

        $(this).siblings('li').slice(6, 20).slideDown();
        $(this).parent().removeClass("news-nn")
        $(this).hide();

    })

}

// 横向tab选项卡
function setTab(m, n) {
    var tli = document.getElementById("menu" + m).getElementsByTagName("li");
    var mli = document.getElementById("main" + m).getElementsByTagName("ul");
    for (i = 0; i < tli.length; i++) {
        tli[i].className = i == n ? "hover" : "";
        mli[i].style.display = i == n ? "block" : "none";
    }
}

// 横向tab选项卡
function Tab(a, b) {
    var tli = document.getElementById("me" + a).getElementsByTagName("li");
    var mli = document.getElementById("ma" + a).getElementsByTagName("ul");
    for (i = 0; i < tli.length; i++) {
        tli[i].className = i == b ? "hover" : "";
        mli[i].style.display = i == b ? "block" : "none";
    }
}
// 获取url中的参数
function getUrlParam(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); // 构造一个含有目标参数的正则表达式对象
    var r = window.location.search.substr(1).match(reg); // 匹配目标参数
    if (r != null)
        return r[2];
    return null; // 返回参数值
}

var decToHex = function(str) {
    var res = [];
    for (var i = 0; i < str.length; i++)
        res[i] = ("00" + str.charCodeAt(i).toString(16)).slice(-4);
    return "\\u" + res.join("\\u");
}
var hexToDec = function(str) {
    str = str.replace(/\\/g, "%");
    return unescape(str);
}

function replaceTemplate(template, obj) {
    var out = "";
    for (i in obj) {
        var reg = new RegExp("\\{" + obj[i].name + "\\}", "g");
        template = template.replace(reg, obj[i].value);
    }
    out = template;
    return out;
}
function showOrHideUl() {
    var height = parseInt($("ul.chnl:last").css("height"));
    if (height > lmdhHeight) {
        $("ul.chnl:last").addClass("hideul");
        $("ul.chnl:last").after(
            "<div class='showOrHide'>"
            + "<a href='#' title='点击显示/隐藏所有栏目导航'>"
            + "<img src='images/chat_close.png'/></a></div>"
            + "<div style='clear: both;'></div>");
    }

}
$(function() {
    $('.hottags-ul li').slice(5, 10).hide();
    $('.more-b').click(function() {
        $('.hottags-ul li').slice(5, 10).slideDown(500);
        $('.more-b').hide();
    });

})
// 当前栏目是否在栏目列表，栏目列表使用逗号分隔
function isInclude(chnls, curChnl) {
    var arrChnls = chnls.split(",");
    for (var i = 0; i < arrChnls.length; i++) {
        if (curChnl == arrChnls[i]) {
            return true;
        }
    }
    return false;
}
