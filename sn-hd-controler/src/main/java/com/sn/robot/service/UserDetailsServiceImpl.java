package com.sn.robot.service;


import com.alibaba.dubbo.config.annotation.Reference;
import com.sn.robot.controller.UtilsPwd;
import com.sn.search.UserInterface;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 认证类
 *
 * @author Administrator
 */

@Service()
public class UserDetailsServiceImpl implements UserDetailsService {

    @Reference
    private UserInterface userInterface;

    public void  setUserInterface(UserInterface userInterface){
        this.userInterface=userInterface;
    }

    @Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		List<GrantedAuthority> list=new ArrayList<GrantedAuthority>();
		list.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        com.sn.pojo.User admin = userInterface.findOne(username);

        if(admin!=null){
            String key="admin";
            String decrypt = UtilsPwd.decrypt( admin.getPassword(),key);
            return new User(username,decrypt,list);
        }else{
            return null;
        }

	}


	



}

