package com.books.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.books.po.Cartlist;
import com.books.po.Userlist;
import com.books.service.CartlistService;

@Controller
public class CartlistController {
	@Autowired
	private CartlistService cls;
	private Integer[] ids;
	//显示购物车信息cart
	@RequestMapping(value = "/cart")
	public String toCartlist(Integer uid,HttpSession session,Model model)
	{
		Userlist ul = (Userlist) session.getAttribute("USER_SESSION");
		List<Cartlist> cl = cls.selectByPrimaryKey(ul.getUid());
		model.addAttribute("cal",cl);
		return "cart";
	}
	//添加商品进购物车，return到success
	@RequestMapping(value = "/addcartlist")
	public String toadd(Cartlist record,Model model)
	{
		int cl = cls.insert(record);
		model.addAttribute(cl);
		return "cart";
	}
	//从购物车中删除商品，重定向到购物车界面cart
	@RequestMapping(value = "/deletecartlist")
	public String todelete(Integer[] ids,Model model)
	{
			if (ids != null) {
				for (Integer cid : ids)
					cls.deleteByPrimaryKey(cid);
			} else {
				System.out.println("error");
			}
			return "redirect:cart";
	}
	public Integer[] getIds() {
		return ids;
	}

	public void setIds(Integer[] ids) {
		this.ids = ids;
	}
}
