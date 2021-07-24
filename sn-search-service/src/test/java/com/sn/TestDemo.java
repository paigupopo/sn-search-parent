/*
package com.sn.solr;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestDemo {


    public static void main(String[] args) {

        String content = "<?xml version=\"1.0\"?>\n" +
                "\n" +
                "<root available-locales=\"zh_CN\" default-locale=\"zh_CN\">\n" +
                "\t<static-content language-id=\"zh_CN\"><![CDATA[<div class=\"gzcy-bg\">\n" +
                " <img alt=\"\" src=\"/documents/10184/16021/wxszsjh.png/5c2b05c8-5141-4a12-a4ec-0c43ecd673f1?t=1545122235497\n" +
                "\" />\n" +
                "</div>\n" +
                "<ul class=\"bslableul clearfix\">\n" +
                " <li><a href=\"#\" target=\"_blank\">我要建议</a></li>\n" +
                " <li><a href=\"#\" target=\"_blank\">我要投诉</a></li>\n" +
                "</ul>\n" +
                "<div style=\"clear:both;height: 20px;\">\n" +
                " &nbsp;\n" +
                "</div>\n" +
                "<div class=\"gzcy-box3\">\n" +
                " <a class=\"faa-parent animated-hover\" href=\"#\">12345热线 </a>\n" +
                " <a class=\"faa-parent animated-hover\" href=\"#\"> 在线访谈 </a>\n" +
                " <a class=\"faa-parent animated-hover\" href=\"#\"> 网上调查 </a>\n" +
                "</div>\n" +
                "<link href=\"/suining-2019-theme/css/fontawesome.min.css\" rel=\"stylesheet\" />\n" +
                "<link href=\"/suining-2019-theme/css/font-awesome-animation.min.css\" rel=\"stylesheet\" />\n" +
                "<style type=\"text/css\">.clearfix{\n" +
                "\tcontent: '';\n" +
                "\tdisplay: block;\n" +
                "\tclear: both;\n" +
                "}\n" +
                ".gzcy-bg img{\n" +
                "\tdisplay: block;\n" +
                "\tmargin: 0 auto 20px;\n" +
                "}\n" +
                ".bslableul{\n" +
                "\twidth: 98%;\n" +
                "\tmargin:  0 auto;\n" +
                "\tpadding: 0;\n" +
                "}\n" +
                ".bslableul li{\n" +
                "\tfloat: left;\n" +
                "\twidth: 48%;\n" +
                "\theight: 27px;\n" +
                "\tborder: 1px solid #cccccc;\n" +
                "\tline-height: 27px;\n" +
                "\tcolor: #333;\n" +
                "\ttext-align: center;\n" +
                "\tborder-radius: 5px;\n" +
                "\tmargin-left: 10px;\n" +
                "\tfont-size: 16px;\n" +
                "\t-webkit-transition-duration: 0.3s;\n" +
                "    -moz-transition-duration: 0.3s;\n" +
                "    -ms-transition-duration: 0.3s;\n" +
                "    transition-duration: 0.3s;\n" +
                "    list-style: none;\n" +
                "}\n" +
                ".bslableul li:before {\n" +
                "  pointer-events: none;\n" +
                "  position: absolute;\n" +
                "  z-index: -1;\n" +
                "  content: '';\n" +
                "  top: 100%;\n" +
                "  left: 5%;\n" +
                "  height: 10px;\n" +
                "  width: 90%;\n" +
                "  opacity: 0;\n" +
                "  background: radial-gradient(ellipse at center, rgba(80, 121, 76, 0.35) 0%, rgba(80, 121, 76, 0) 80%);\n" +
                "  -webkit-transition-duration: 0.3s;\n" +
                "  -moz-transition-duration: 0.3s;\n" +
                "  -ms-transition-duration: 0.3s;\n" +
                "  transition-duration: 0.3s;\n" +
                "  -webkit-transition-property: transform, opacity;\n" +
                "  -moz-transition-property: transform, opacity;\n" +
                "  -ms-transition-property: transform, opacity;\n" +
                "  transition-property: transform, opacity;\n" +
                "}\n" +
                ".bslableul li:hover{\n" +
                "   -webkit-transform: translateY(-5px);\n" +
                "   -moz-transform: translateY(-5px);\n" +
                "   -ms-transform: translateY(-5px);\n" +
                "   transform: translateY(-5px);\n" +
                "}\n" +
                ".bslableul li:hover:before{\n" +
                "\topacity: 1;\n" +
                "   -webkit-transform: translateY(3px);\n" +
                "   -moz-transform: translateY(3px);\n" +
                "   -ms-transform: translateY(3px);\n" +
                "   transform: translateY(3px);\n" +
                "}\t\n" +
                ".bslableul li:first-child{\n" +
                "\tmargin-left: 0;\n" +
                "}\n" +
                ".bslableul li a{\n" +
                "\tdisplay: block;\n" +
                "\tcolor: #333;\n" +
                "\ttext-decoration: none;\n" +
                "}\t\n" +
                ".gzcy-box3{\n" +
                "\twidth: 100%;\n" +
                "\tbackground: #f8f8f8;\n" +
                "}\n" +
                ".gzcy-box3 a{\n" +
                "\tfont-size: 14px;\n" +
                "\tdisplay: inline-block;\n" +
                "\ttext-decoration: none;\n" +
                "\theight: 60px;\n" +
                "\tline-height: 40px;\n" +
                "\ttext-align: center;\n" +
                "\tborder-right: 1px solid #dddddd;\n" +
                "\tmargin: 10px 0 10px 8px;\n" +
                "\tpadding-right: 11px;\n" +
                "\tcolor: #005596;\n" +
                "}\t\n" +
                ".gzcy-box3 a:last-child{\n" +
                "\tborder-right: none;\n" +
                "}\n" +
                ".gzcy-box3 i{\n" +
                "\tdisplay: block;\n" +
                "\tfont-size: 34px;\n" +
                "\tcolor: #005596;\n" +
                "}\n" +
                "</style>]]></static-content>\n" +
                "</root>";
        List<String> srcList = new ArrayList<String>(); //用来存储获取到的图片地址
        Pattern p = Pattern.compile("<(img|IMG)(.*?)(>|></img>|/>)");//匹配字符串中的img标签
        Matcher matcher = p.matcher(content);
        boolean hasPic = matcher.find();
        if (hasPic == true)//判断是否含有图片
        {
            while (hasPic) //如果含有图片，那么持续进行查找，直到匹配不到
            {
                String group = matcher.group(2);//获取第二个分组的内容，也就是 (.*?)匹配到的
                Pattern srcText = Pattern.compile("(src|SRC)=(\"|\')(.*?)(\"|\')");//匹配图片的地址
                Matcher matcher2 = srcText.matcher(group);
                if (matcher2.find()) {
                    srcList.add(matcher2.group(3));//把获取到的图片地址添加到列表中
                }
                hasPic = matcher.find();//判断是否还有img标签
            }

        }

        System.out.println("匹配到的内容："+srcList);
        for (int i = 0; i < srcList.size(); i++) {

            System.out.println(srcList.get(i));
        }

    }
}
*/
