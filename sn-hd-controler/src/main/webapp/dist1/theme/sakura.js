var theme = {
		 // 全图默认背景
	    // backgroundColor: 'rgba(0,0,0,0)',
	    
	    // 默认色板
	    color: ['#e52c3c','#f7b1ab','#fa506c','#f59288','#f8c4d8',
	            '#e54f5c','#f06d5c','#e54f80','#f29c9f','#eeb5b7'],

	    // 值域
	    dataRange: {
	        color:['#e52c3c','#f7b1ab']//颜色 
	    },

	    
	    // K线图默认参数
	    k: {
	        // barWidth : null          // 默认自适应
	        // barMaxWidth : null       // 默认自适应 
	        itemStyle: {
	            normal: {
	                color: '#e52c3c',          // 阳线填充颜色
	                color0: '#f59288',      // 阴线填充颜色
	                lineStyle: {
	                    width: 1,
	                    color: '#e52c3c',   // 阳线边框颜色
	                    color0: '#f59288'   // 阴线边框颜色
	                }
	            },
	            emphasis: {
	                // color: 各异,
	                // color0: 各异
	            }
	        }
	    },
	    
	    // 饼图默认参数
	    pie: {
	        itemStyle: {
	            normal: {
	                // color: 各异,
	                borderColor: '#fff',
	                borderWidth: 1,
	                label: {
	                    show: true,
	                    position: 'outer',
	                  textStyle: {color: 'black'}
	                    // textStyle: null      // 默认使用全局文本样式，详见TEXTSTYLE
	                },
	                labelLine: {
	                    show: true,
	                    length: 20,
	                    lineStyle: {
	                        // color: 各异,
	                        width: 1,
	                        type: 'solid'
	                    }
	                }
	            }
	        }
	    },
	    
	    map: {
	        mapType: 'china',   // 各省的mapType暂时都用中文
	        mapLocation: {
	            x : 'center',
	            y : 'center'
	            // width    // 自适应
	            // height   // 自适应
	        },
	        showLegendSymbol : true,       // 显示图例颜色标识（系列标识的小圆点），存在legend时生效
	        itemStyle: {
	            normal: {
	                // color: 各异,
	                borderColor: '#fff',
	                borderWidth: 1,
	                areaStyle: {
	                    color: '#ccc'//rgba(135,206,250,0.8)
	                },
	                label: {
	                    show: false,
	                    textStyle: {
	                        color: 'rgba(139,69,19,1)'
	                    }
	                }
	            },
	            emphasis: {                 // 也是选中样式
	                // color: 各异,
	                borderColor: 'rgba(0,0,0,0)',
	                borderWidth: 1,
	                areaStyle: {
	                    color: '#f3f39d'
	                },
	                label: {
	                    show: false,
	                    textStyle: {
	                        color: 'rgba(139,69,19,1)'
	                    }
	                }
	            }
	        }
	    },
	    
	    force : {
	        // 分类里如果有样式会覆盖节点默认样式
	        itemStyle: {
	            normal: {
	                // color: 各异,
	                label: {
	                    show: false
	                    // textStyle: null      // 默认使用全局文本样式，详见TEXTSTYLE
	                },
	                nodeStyle : {
	                    brushType : 'both',
	                    strokeColor : '#e54f5c'
	                },
	                linkStyle : {
	                    strokeColor : '#e54f5c'
	                }
	            },
	            emphasis: {
	                // color: 各异,
	                label: {
	                    show: false
	                    // textStyle: null      // 默认使用全局文本样式，详见TEXTSTYLE
	                },
	                nodeStyle : {},
	                linkStyle : {}
	            }
	        }
	    },
	    
	    gauge : {
	        axisLine: {            // 坐标轴线
	            show: true,        // 默认显示，属性show控制显示与否
	            lineStyle: {       // 属性lineStyle控制线条样式
	                color: [[0.2, '#e52c3c'],[0.8, '#f7b1ab'],[1, '#fa506c']], 
	                width: 8
	            }
	        },
	        axisTick: {            // 坐标轴小标记
	            splitNumber: 10,   // 每份split细分多少段
	            length :12,        // 属性length控制线长
	            lineStyle: {       // 属性lineStyle控制线条样式
	                color: 'auto'
	            }
	        },
	        axisLabel: {           // 坐标轴文本标签，详见axis.axisLabel
	            textStyle: {       // 其余属性默认使用全局文本样式，详见TEXTSTYLE
	                color: 'auto'
	            }
	        },
	        splitLine: {           // 分隔线
	            length : 18,         // 属性length控制线长
	            lineStyle: {       // 属性lineStyle（详见lineStyle）控制线条样式
	                color: 'auto'
	            }
	        },
	        pointer : {
	            length : '90%',
	            color : 'auto'
	        },
	        title : {
	            textStyle: {       // 其余属性默认使用全局文本样式，详见TEXTSTYLE
	                color: '#333'
	            }
	        },
	        detail : {
	            textStyle: {       // 其余属性默认使用全局文本样式，详见TEXTSTYLE
	                color: 'auto'
	            }
	        }
	    }
};