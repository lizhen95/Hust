package com.cn.hnust.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.hnust.pojo.User;
import com.cn.hnust.pojo.canshu;
import com.cn.hnust.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService userService;
	
	@RequestMapping("/showUser")
	public User toIndex(HttpServletRequest request,Model model){
		int userId = Integer.parseInt(request.getParameter("id"));
		String pass=request.getParameter("password");
		canshu cs=new canshu();
		cs.setId(userId);
		cs.setPassword(pass);
		User user= this.userService.getUserById(cs);
		//request.setAttribute("user", user);
		model.addAttribute("user", user);
		return user;
	}
}
