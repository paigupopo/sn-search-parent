/**
 * Created by lingling on 2017/4/20.
 */
//图片列表
    var videoCon=$('.video').find('.container');
    var picList=$('.picList').find('.container');
    //图片摸上放大，文字说明出来
    magnify('picList','a');
    function  magnify(container,item){
        var oContaniner=document.getElementById(container);
        //var oContaniner=$('#container')[0];
        var aDiv=oContaniner.getElementsByTagName(item);
        for(var i=0;i<aDiv.length;i++){
            aDiv[i].onmouseover=function(ev){
                var oEvent=ev||event;
                var oSon=this.children[1];
                var oImg=this.children[0];
                var oFrom=oEvent.fromElement || oEvent.relatedTarget;
                if(this.contains(oFrom))return false;
                switch(findDir(this,ev)){
                    case 0:
                        oSon.style.left=196+'px';
                        oSon.style.bottom=0;
                        break;
                    case 1:
                        oSon.style.left=0;
                        oSon.style.bottom=-27+'px';
                        break;
                    case 2:
                        oSon.style.left=-196+'px';
                        oSon.style.bottom=0;
                        break;
                    case 3:
                        oSon.style.bottom=-27+'px';
                        oSon.style.left=0;
                        break;
                }
                $(oSon).animate({left:0,bottom:0},300);
                $(oImg).animate({'width':'220px','height':'162px','left':'-15px','top':'-11px'},300);

            };
            aDiv[i].onmouseout=function(ev){
                var oEvent=ev||event;
                var oSon=this.children[1];
                var oImg=this.children[0];
                var to=oEvent.toElement || oEvent.relatedTarget;
                if(this.contains(to))return false;
                $(oImg).animate({'width':'196px','height':'144px','left':'0','top':'0'},300);
                $(oSon).animate({left:0,bottom:-27},300);
            };
        }
    }
function findDir(oDiv,ev){
    var oEvent=ev||event;
    var scrollT=document.body.scrollTop || document.documentElement.scrollTop;
    var scrollL=document.body.scrollLeft || document.documentElement.scrollLeft

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