(function () {    var linkLiArr = [],num = ll_6787761;    if (!num || num <= 0) {        num = "100";    }                var linkLi = '<li class="num1">                    <a title="成都"  href="http://www.chengdu.gov.cn/" target="_blank"  tabindex="-1">             成都  </a>         </li>';        linkLiArr.push(linkLi);            var linkLi = '<li class="num2">                    <a title="自贡"  href="http://www.zg.gov.cn/" target="_blank"  tabindex="-1">             自贡  </a>         </li>';        linkLiArr.push(linkLi);            var linkLi = '<li class="num3">                    <a title="攀枝花"  href="http://www.panzhihua.gov.cn/" target="_blank"  tabindex="-1">             攀枝花  </a>         </li>';        linkLiArr.push(linkLi);            var linkLi = '<li class="num4">                    <a title="泸州"  href="http://www.luzhou.gov.cn/" target="_blank"  tabindex="-1">             泸州  </a>         </li>';        linkLiArr.push(linkLi);            var linkLi = '<li class="num5">                    <a title="德阳"  href="http://www.deyang.gov.cn/" target="_blank"  tabindex="-1">             德阳  </a>         </li>';        linkLiArr.push(linkLi);            var linkLi = '<li class="num6">                    <a title="绵阳"  href="http://www.my.gov.cn/" target="_blank"  tabindex="-1">             绵阳  </a>         </li>';        linkLiArr.push(linkLi);            var linkLi = '<li class="num7">                    <a title="广元"  href="http://www.cngy.gov.cn/" target="_blank"  tabindex="-1">             广元  </a>         </li>';        linkLiArr.push(linkLi);            var linkLi = '<li class="num8">                    <a title="遂宁"  href="http://www.suining.gov.cn/" target="_blank"  tabindex="-1">             遂宁  </a>         </li>';        linkLiArr.push(linkLi);            var linkLi = '<li class="num9">                    <a title="内江"  href="http://www.neijiang.gov.cn/" target="_blank"  tabindex="-1">             内江  </a>         </li>';        linkLiArr.push(linkLi);            var linkLi = '<li class="num10">                    <a title="乐山"  href="http://www.leshan.gov.cn/" target="_blank"  tabindex="-1">             乐山  </a>         </li>';        linkLiArr.push(linkLi);            var linkLi = '<li class="num11">                    <a title="南充"  href="http://www.nanchong.gov.cn/" target="_blank"  tabindex="-1">             南充  </a>         </li>';        linkLiArr.push(linkLi);            var linkLi = '<li class="num12">                    <a title="宜宾"  href="http://www.yb.gov.cn/index.html" target="_blank"  tabindex="-1">             宜宾  </a>         </li>';        linkLiArr.push(linkLi);            var linkLi = '<li class="num13">                    <a title="广安"  href="http://www.guang-an.gov.cn/" target="_blank"  tabindex="-1">             广安  </a>         </li>';        linkLiArr.push(linkLi);            var linkLi = '<li class="num14">                    <a title="达州"  href="http://www.dazhou.gov.cn/" target="_blank"  tabindex="-1">             达州  </a>         </li>';        linkLiArr.push(linkLi);            var linkLi = '<li class="num15">                    <a title="雅安"  href="http://www.yaan.gov.cn/" target="_blank"  tabindex="-1">             雅安  </a>         </li>';        linkLiArr.push(linkLi);            var linkLi = '<li class="num16">                    <a title="眉山"  href="http://www.ms.gov.cn/" target="_blank"  tabindex="-1">             眉山  </a>         </li>';        linkLiArr.push(linkLi);            var linkLi = '<li class="num17">                    <a title="资阳"  href="http://www.ziyang.gov.cn/" target="_blank"  tabindex="-1">             资阳  </a>         </li>';        linkLiArr.push(linkLi);            var linkLi = '<li class="num18">                    <a title="阿坝"  href="http://www.abazhou.gov.cn/" target="_blank"  tabindex="-1">             阿坝  </a>         </li>';        linkLiArr.push(linkLi);            var linkLi = '<li class="num19">                    <a title="甘孜"  href="http://www.gzz.gov.cn/" target="_blank"  tabindex="-1">             甘孜  </a>         </li>';        linkLiArr.push(linkLi);            var linkLi = '<li class="num20">                    <a title="凉山"  href="http://www.lsz.gov.cn/" target="_blank"  tabindex="-1">             凉山  </a>         </li>';        linkLiArr.push(linkLi);            var printContent = function(){        var length = linkLiArr.length;        if (num > length) {            num = length;        }        if (linkLiArr.length > 0) {            for (var i=0;i < num;i++) {                document.write(linkLiArr[i]);            }        }    }();})()