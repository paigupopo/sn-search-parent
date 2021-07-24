/*
//search('sear-t','ch-srch-sel-ul','search-b')
function search(searchTxt,searchUl,searchBtn){
    var oT=document.getElementById(searchTxt);
    var oUl=document.getElementById(searchUl);
    var oBtn=document.getElementById(searchBtn);
    var iNow=-1;
    var oldValue='';

    if(document.addEventListener){

    oT.addEventListener('keyup',showList);
    oT.addEventListener('click',showList);

    }else{
    oT.attachEvent('keyup',showList);
    oT.attachEvent('click',showList);

    }
    function showList(ev){
        var oEvent=ev || event;
        var autoSearchMode = $("#autoSearchMode").html();
        if(autoSearchMode == "1"){
        	if(oEvent.keyCode==40 || oEvent.keyCode==38 || 
        			(oEvent.keyCode>=48&&oEvent.keyCode<=57)||oEvent.keyCode==32||(oEvent.keyCode>=96&&oEvent.keyCode<=105)){
        		autoLoadContent();
            	return;
        	}
        }else if(autoSearchMode == "2"){
        	if(oEvent.keyCode==40 || oEvent.keyCode==38){
            	autoLoadContent();
            	return;
        	}
        }else{
        	if(oEvent.keyCode==40 || oEvent.keyCode==38)
            	return;
        }

        if(oEvent.keyCode==13){
        	oBtn.click();
        }
        $.ajax({
            url:'auto?method=json&siteCode='+$("#siteCode").val(),
            data:{
                qt:oT.value
            },
            dataType: 'json',
            success:function(json){
                var arr=json;

                oUl.innerHTML='';
                if(arr.length){
                    oUl.style.display='block';
                }else{
                    oUl.style.display='none';
                }

                for(var i=0; i<arr.length; i++){
                    var oLi=document.createElement('li');
                    oLi.innerHTML=arr[i].chinese;
                    oUl.appendChild(oLi);

                    //给li加事件
                    (function(index){
                        oLi.onmouseover=function(){
                            for(var i=0; i<oUl.children.length; i++){
                                oUl.children[i].className='';

                            }
                            this.className='on';
                            iNow=index;
                        };

                        oLi.onclick=function(){
                        	oT.value = this.innerHTML;
                        	oBtn.click();
                        };
                    })(i);
                }
            }
        });
        oldValue=oT.value;
    };

    oT.onkeydown=function(ev){
        var aLi=oUl.children;
        var oEvent=ev || event;
        switch(oEvent.keyCode){
            case 40:
                iNow++;
                if(iNow==aLi.length)iNow=-1;

                for(var i=0; i<aLi.length; i++){
                    aLi[i].className='';
                }
                if(iNow==-1){
                    oT.value=oldValue;
                }else{
                    aLi[iNow].className='on';
                    oT.value=aLi[iNow].innerHTML;
                }
                break;
            case 38:
                iNow--;
                if(iNow==-2)iNow=aLi.length-1;
                for(var i=0; i<aLi.length; i++){
                    aLi[i].className='';
                }
                if(iNow==-1){
                    oT.value=oldValue;
                }else{
                    aLi[iNow].className='on';
                    oT.value=aLi[iNow].innerHTML;
                }
                break;
            default:
                iNow=-1;
        }
    };
}
*/
