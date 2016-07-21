package com.APIManager.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.APIManager.bean.User;
import com.APIManager.service.UserService;

@Controller
public class UserController {
	@Resource
	private UserService userService;
	@RequestMapping("/getUser")
	public @ResponseBody Map<String,Object> getUser(HttpServletRequest request){
		List<User> list=userService.getUsers();
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("name", list);
		return map;
	}
	@RequestMapping("/getUserCount")
	public @ResponseBody Map<String,Object> getUserCount(HttpServletRequest request){
		int count=userService.getUserCount();
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("count", count);
		return map;
	}
	
	@RequestMapping("/test")
	public @ResponseBody void test(HttpServletRequest request){
		List<User> list=userService.getUsers();
		Iterator<User> iterator=list.iterator();
		while (iterator.hasNext()) {
			User user=iterator.next();
			System.out.println(user.getUlName());
		}
	}
}
