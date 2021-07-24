/**
 * Created by lingling on 2017/4/20.
 */
//视频摸上文字说明出来
var Video=document.getElementById('video');
var aVideo=Video.getElementsByTagName('a');
for(var i=0;i<aVideo.length;i++){
	aVideo[i].onmouseover=function(ev){
        $(this).find('.play').show();
    };
    aVideo[i].onmouseout=function(ev){
        $(this).find('.play').hide();
    };
}
function findDir(oDiv,ev){
    var oEvent=ev||event;
    var scrollT=document.body.scrollTop || document.documentElement.scrollTop;
    var scrollL=document.body.scrollLeft || document.documentElement.scrollLeft;

    var y=oDiv.offsetHeight/2+getPos(oDiv).top-(oEvent.clientY+scrollT);
    var x=oDiv.offsetWidth/2+getPos(oDiv).left-(oEvent.clientX+scrollL);

    return Math.round((Math.atan2(y,x)*180/Math.PI+180)/90)%4;
}
function getPos(obj){
    var l=0;
    var t=0;
    while(obj){
        l+=obj.offsetLeft;
        t+=obj.offsetTop;
        obj=obj.offsetParent;
    }
    return {left:l,top:t};
}