package com.books.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@RequestMapping(value = "/Userindex")
	public String toIndex()
	{
		return "Userindex";
	}
	@RequestMapping(value = "/category-grid")
	public String toCategory()
	{
		return "category-grid";
	}
	@RequestMapping(value = "/checkout")
	public String toCheckout()
	{
		return "checkout";
	}
	@RequestMapping(value = "/loginout")
	public String logingout(HttpSession session)
	{
		session.invalidate();
		return "redirect:authentication";
	}
	
}
