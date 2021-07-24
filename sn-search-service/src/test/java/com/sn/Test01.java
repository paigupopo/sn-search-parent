package com.sn;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;


public class Test01 {


    public static void main(String[] args) throws Exception {
        //方法一
        //System.out.println((new Test()).getURLContent());
        String urlStr = "http://www.suining.gov.cn/api/jsonws/jxkh-portlet.assessmentsystem/get-layout-tree?groupId=10184";
    (new Test01()).getURLContent(urlStr);
    }

    public static String getURLContent() throws Exception {
        String strURL = "http://www.suining.gov.cn/api/jsonws/jxkh-portlet.assessmentsystem/get-layout-tree?groupId=10184";
        URL url = new URL(strURL);
        HttpURLConnection httpConn = (HttpURLConnection)url.openConnection();
        httpConn.setRequestMethod("POST");
        httpConn.connect();

        BufferedReader reader = new BufferedReader(new InputStreamReader(httpConn.getInputStream()));
        String line;
        StringBuffer buffer = new StringBuffer();
        while ((line = reader.readLine()) != null) {
            buffer.append(line);
        }
        reader.close();
        httpConn.disconnect();

        System.out.println(buffer.toString());
        return buffer.toString();
    }

    /**
     * 程序中访问http数据接口
     */
    public static String getURLContent(String urlStr) {
        /** 网络的url地址 */
        URL url = null;
        /** http连接 */
        HttpURLConnection httpConn = null;
        /**//** 输入流 */
        BufferedReader in = null;
        StringBuffer sb = new StringBuffer();
        try {
            url = new URL(urlStr);
            in = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
            String str = null;
            while ((str = in.readLine()) != null) {
                sb.append(str);
            }
        } catch (Exception ex) {

        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
            }
        }
        String result = sb.toString();

       // String substring = result.substring(0, result.length() - 1);

        //{"id":6235386,"pId":5985361,"categoryId":6235831,"name":"工作动态"}

//JSONObject object = JSON.parseObject(result.toString());

        //JSONObject jsStr = JSONObject.fromObject(JSON.toJSONString(substring1));

        JSONArray jsonArray = JSONArray.fromObject(result);
        Iterator iterator = jsonArray.iterator();
        while (iterator.hasNext()){
            JSONObject jsonObject = JSONObject.fromObject(iterator.next());
            String str = (String) jsonObject.get("name");
            System.out.println(str);
        }
        //Object o = object.get("name");


        System.out.println();
        return result;
    }


}
