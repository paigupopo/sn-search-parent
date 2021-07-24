package com.sn.robot.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sn.entity.Result;
import com.sn.pojo.User;
import com.sn.search.UserInterface;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/login")
public class Login {



    @Reference
    private UserInterface userInterface;

    @RequestMapping("exsitLoginPassword")
    public String exsitLoginPassword(String name,String pwd) {
        User one = userInterface.findOne(name);

        String key="admin";
        //将输入的密码加密处理
        String encrypt = UtilsPwd.encrypt(pwd,key);
        String password = one.getPassword();

        if (encrypt.equals(password)) {
            return "1";
        }else
        {
            return "0";
        }
    }





    @RequestMapping("exsitLoginName")
    public String exsitLoginName(String name) {
        System.out.println(name);
        User one = userInterface.findOne(name);
        if (one == null) {
            return "0";
        }else
        {
            return "1";
        }
    }




    /**
     * 获取当前登陆名
     * @return
     */
        @RequestMapping("name")
        public Map name(){
            String name= SecurityContextHolder.getContext()
                    .getAuthentication().getName();
            Map map=new HashMap();

            map.put("loginName", name);

            return map ;
        }

    /**
     * 获取登录人密码
     * @return
     */
       @RequestMapping("passWord")
        public Map passWord(){

            String name = SecurityContextHolder.getContext().getAuthentication().getName();

            User one = userInterface.findOne(name);
            String password = one.getPassword();
           Map map=new HashMap();
            map.put("password",password);

            return map;

        }

    /**
     * 修改密码
     * @param
     * @param name
     * @return
     */
    @RequestMapping("updatePwd")
    public Result update(String pwd, String name,HttpServletRequest request,HttpServletResponse response ){

        try {
            System.out.println(pwd);
            System.out.println(pwd);


            userInterface.updateByPrimaryKey(pwd, name);
            removeSessionAttributr(request,response);

            return new Result(true, "修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "修改失败");
        }


        }



    /**
     * 获取用户登陆名
     * @return
     */
    @RequestMapping("loginName")
    public String loginName() {
        String name = SecurityContextHolder.getContext()
                .getAuthentication().getName();
        return name;
    }

    /**
     * 获取当前用户名密码
     * @param username
     * @return
     */
    @RequestMapping("selectPwd")
    public String selectPwd(String username){

        return userInterface.selectPwd(username);
    }

    /**
     * 清除session数据
     * @param request
     */
    public void removeSessionAttributr(HttpServletRequest request, HttpServletResponse response) {

        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            cookie.setMaxAge(0);
            cookie.setPath("/");
            response.addCookie(cookie);
        }
    }

    @RequestMapping("clearCookie")
    public void clearCookie(HttpServletRequest request, HttpServletResponse response){

        removeSessionAttributr(request,response);

    }


}
