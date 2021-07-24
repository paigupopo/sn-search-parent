
/*
layui.define(function(exports){
    var admin = layui.admin;

    //访问量
    layui.use(['carousel', 'echarts'], function(){
        var $ = layui.$
            ,carousel = layui.carousel
            ,echarts = layui.echarts;

        var echartsApp = [], options = [
            {
                tooltip : {
                    trigger: 'axis'
                },
                calculable : true,
                legend: {
                    data:['访问量','搜索量','']
                },

                xAxis : [
                    {
                        type : 'category',
                        data : ['1月','2月','3月','4月','5月','6月','7月','8月','9月','10月','11月','12月']
                    }
                ],
                yAxis : [
                    {
                        type : 'value',
                        name : '访问量',
                        axisLabel : {
                            formatter: '{value} '
                        }
                    },
                    {
                        type : 'value',
                        name : '搜索量',
                        axisLabel : {
                            formatter: '{value} '
                        }
                    }
                ],
                series : [
                    {
                        name:'访问量',
                        type:'line',
                        data:[0, 0, 0, 0, 0, 0, 0, 235, 4567, 66, 243, 0]
                    },
                    {

                        name:'搜索量',
                        type:'line',
                        yAxisIndex: 1,
                        data:[0, 0, 0, 0, 0, 0, 0, 263, 13003, 101, 371, 0]
                    },

                ]
            }
        ]
            ,elemDataView = $('#LAY-index-pagetwo').children('div')
            ,renderDataView = function(index){
            echartsApp[index] = echarts.init(elemDataView[index], layui.echartsTheme);
            echartsApp[index].setOption(options[index]);
            window.onresize = echartsApp[index].resize;
        };
        //没找到DOM，终止执行
        if(!elemDataView[0]) return;
        renderDataView(0);

    });

    //地图
    layui.use(['carousel', 'echarts'], function(){
        var $ = layui.$
            ,carousel = layui.carousel
            ,echarts = layui.echarts;

        var echartsApp = [], options = [
            {
                title : {
                    text: '全国的 搜索 用户分布',
                    subtext: '不完全统计'
                },
                tooltip : {
                    trigger: 'item'
                },
                dataRange: {
                    orient: 'horizontal',
                    min: 0,
                    max: 60000,
                    text:['高','低'],
                    splitNumber:0
                },
                series : [
                    {
                        name: '全国的 搜索 用户分布',
                        type: 'map',
                        mapType: 'china',
                        selectedMode : 'multiple',
                        itemStyle:{
                            normal:{label:{show:true}},
                            emphasis:{label:{show:true}}
                        },
                        data:[
                            {name:'西藏', value:60},
                            {name:'青海', value:167},
                            {name:'宁夏', value:210},
                            {name:'海南', value:252},
                            {name:'甘肃', value:502},
                            {name:'贵州', value:700},
                            {name:'新疆', value:661},
                            {name:'云南', value:890},
                            {name:'重庆', value:5010},
                            {name:'吉林', value:56},
                            {name:'山西', value:123},
                            {name:'天津', value:130},
                            {name:'江西', value:1170},
                            {name:'广西', value:172},
                            {name:'陕西', value:251},
                            {name:'黑龙江', value:125},
                            {name:'内蒙古', value:435},
                            {name:'安徽', value:530},
                            {name:'北京', value:1919},
                            {name:'福建', value:756},
                            {name:'上海', value:190},
                            {name:'湖北', value:109},
                            {name:'湖南', value:966},
                            {name:'四川', value:13793},
                            {name:'辽宁', value:222},
                            {name:'河北', value:451},
                            {name:'河南', value:693},
                            {name:'浙江', value:310},
                            {name:'山东', value:231},
                            {name:'江苏', value:911},
                            {name:'广东', value:891}
                        ]
                    }
                ]
            }
        ]
            ,elemDataView = $('#LAY-index-pagethree').children('div')
            ,renderDataView = function(index){
            echartsApp[index] = echarts.init(elemDataView[index], layui.echartsTheme);
            echartsApp[index].setOption(options[index]);
            window.onresize = echartsApp[index].resize;
        };
        //没找到DOM，终止执行
        if(!elemDataView[0]) return;

        renderDataView(0);
    });


    exports('sample', {})
});
*/
