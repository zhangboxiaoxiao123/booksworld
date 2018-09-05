package com.books.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.books.po.Userlist;
import com.books.service.UserlistService;

@Controller
public class UserlistController {
	@Autowired
	private UserlistService userlistService;
	@RequestMapping(value = "/authentication")
	public String tologin()
	{
		return "authentication";
	}
	@RequestMapping(value = "/user_information")
	public String toUser(Integer uid,HttpSession session,Model model)
	{
		Userlist ul1 = (Userlist) session.getAttribute("USER_SESSION");
		Userlist ul = userlistService.selectUser(ul1.getUid());
		model.addAttribute("ul",ul);
		return "user_information";
	}
//	@RequestMapping(value = "/touserrevise")
//	public String toUserrevise(Userlist record,Model model)
//	{
//		return "userrevise";
//	}
	@RequestMapping(value = "/userrevise")
	public String Userrevise(Userlist record,HttpSession session,Model model)
	{
		Userlist ul = (Userlist) session.getAttribute("USER_SESSION");
		record.setUid(ul.getUid());
		int userlist =  userlistService.updateByPrimaryKeySelective(record);
		model.addAttribute(userlist);
		return "redierct:user_infomation";
	}
	@RequestMapping(value = "/toauthentication")
	public String login(String uphone,String upwd,
						Model model,HttpSession session)
	{
		Userlist userlist = userlistService.findUser(uphone,upwd);
		if(uphone.equals("root") && upwd.equals("root"))
		{			
			return "login";		
		}
		if(userlist != null)
		{
			session.setAttribute("USER_SESSION", userlist);
			return "Userlogin";
		}
		model.addAttribute("msg","密码错误");
		return "authentication";
//		Userlist ul = new Userlist();
//		String uphone1= ul.getUphone();
//		String upwd1 = ul.getUpwd();
//		if(uphone1.equals("root") && upwd1.equals("root"))
//		{
//			return "login";
//		}
//		if (uphone1 != null && upwd1 != null && uphone1.equals("liyansong")
//				&& upwd1.equals("1234")) {
//			session.setAttribute("USER_SESSION", ul);
//			return "Userindex";
//		}
//		model.addAttribute("msg", "�������");
//		return "test";
	}
	@RequestMapping(value = "/register")
	public String register(Userlist userlist,Model model)
	{
		userlistService.insertUser(userlist);
		return "authentication";
	}
	//�鿴����Ա
	@RequestMapping(value = "/managers")
	public String addAdmin(Model model)
	{
		List<Userlist> ul = userlistService.showAdmin();
		model.addAttribute("adminma",ul);
		return "managers";
	}
	//ɾ������Ա
	@RequestMapping(value = "/admindelete")
	public String deleteAdmin(Integer uid,Model model)
	{
		int ul = userlistService.deleteByPrimaryKey(uid);
		model.addAttribute(ul);
		return "managers";
	}
	//�鿴�û���Ϣ
	@RequestMapping(value = "/user")
	public String touser(Model model)
	{
		List<Userlist> ul = userlistService.showUser();
		model.addAttribute("adminus",ul);
		return "user";
	}
}
