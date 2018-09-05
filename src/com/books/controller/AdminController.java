package com.books.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.books.po.Userlist;

@Controller
public class AdminController {
	//RequestMapping��valueдǰ��ҳ�����õ�ֵ���Լ��趨
	//String��ķ��������д�����̲��ۣ�ûӰ��
	//return��Ķ���ָ����Ҫ��ת�����ҳ�棬������涨д
//	@RequestMapping(value = "/adminindex")
//	public String toindex()
//	{
//		return "adminindex";
//	}
	@RequestMapping(value = "/adminlogin")
	public String toadminlogin(Userlist user,Model model)
	{
		String uname = user.getUname();
		String upwd = user.getUpwd();
		if(uname.equals("admin")
				&& upwd.equals("admin"))
		{
		return "adminindex";
		}
		model.addAttribute("mag", "�������");
		return "login";
	}
	@RequestMapping(value = "/manage")
	public String tomanage()
	{
		return "manage";
	}
	@RequestMapping(value = "/cates")
	public String tocates()
	{
		return "cates";
	}
	@RequestMapping(value = "/list2")
	public String tolist2()
	{
		return "list2";
	}
	@RequestMapping(value = "/add")
	public String toadd()
	{
		return "add";
	}
	@RequestMapping(value = "/categoryadd")
	public String toCategoryadd()
	{
		return "categoryadd";
	}
	@RequestMapping(value = "/reg")
	public String toreg()
	{
		return "reg";
	}
	@RequestMapping(value = "/changeemail")
	public String tochangeemail()
	{
		return "changeemail";
	}
	@RequestMapping(value = "/send")
	public String tosend()
	{
		return "send";
	}
	@RequestMapping(value = "/login")
	public String tologin()
	{
		return "login";
	}
	@RequestMapping(value = "/productupdate")
	public String toUpdate()
	{
		return "productupdate";
	}
	@RequestMapping(value = "/seekpassword")
	public String toSeek()
	{
		return "seekpassword";
	}
}
