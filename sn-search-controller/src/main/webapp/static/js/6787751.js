(function () {
    var linkLiArr = [], num = ll_6787751;
    if (!num || num <= 0) {
        num = "100";
    }
    var linkLi = '<li class="num1">                    <a title="巴州区政府"  href="http://www.bzqzf.gov.cn/" target="_blank"  tabindex="-1">             巴州区政府  </a>         </li>';
    linkLiArr.push(linkLi);
    var linkLi = '<li class="num2">                    <a title="恩阳区政府"  href="http://www.scey.gov.cn/" target="_blank"  tabindex="-1">             恩阳区政府  </a>         </li>';
    linkLiArr.push(linkLi);
    var linkLi = '<li class="num3">                    <a title="南江县政府"  href="http://www.scnj.gov.cn/" target="_blank"  tabindex="-1">             南江县政府  </a>         </li>';
    linkLiArr.push(linkLi);
    var linkLi = '<li class="num4">                    <a title="通江县政府"  href="http://www.tjxzf.gov.cn/" target="_blank"  tabindex="-1">             通江县政府  </a>         </li>';
    linkLiArr.push(linkLi);
    var linkLi = '<li class="num5">                    <a title="平昌县政府"  href="http://www.scpc.gov.cn/" target="_blank"  tabindex="-1">             平昌县政府  </a>         </li>';
    linkLiArr.push(linkLi);
    var printContent = function () {
        var length = linkLiArr.length;
        if (num > length) {
            num = length;
        }
        if (linkLiArr.length > 0) {
            for (var i = 0; i < num; i++) {
                document.write(linkLiArr[i]);
            }
        }
    }();
})()