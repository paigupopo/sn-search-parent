// 定义模块:
var app = angular.module("sn",[]);
/*$sce 服务写成过滤器*/

app.filter('trustHtml',['$sce', function ($sce) {
    return function (input) {
        return $sce.trustAsHtml(input);
    }
}]);

app.filter("highlight", function($sce, $log){

    var fn = function(text, search){
        $log.info("text: " + text);
        $log.info("sn: " + search);

        if (!search) {
            return $sce.trustAsHtml(text);
        }
        text = encodeURI(text);
        search = encodeURI(search);

        var regex = new RegExp(search, 'gi');
        var result = text.replace(regex, '<span class="highlightedText">$&</span>');
        result = decodeURI(result);
        $log.info("result: " + result );
        return $sce.trustAsHtml(result);
    };

    return fn;
});





