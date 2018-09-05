package com.books.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.books.po.Orderlist;
import com.books.po.Userlist;
import com.books.service.OrderlistService;

@Controller
public class OrderlistController {
	@Autowired
	private OrderlistService ols;
	private Integer[] ids;
	//��ϸ������ʾlist
		@RequestMapping(value = "/order")
		public String order(Integer oid,Model model)
		{
			return "orders";
		}
	@RequestMapping(value = "/orders")
	public String ordershow(Integer oid,Model model)
	{
		Orderlist ol = (Orderlist) ols.selectByPrimaryKey(oid);
		model.addAttribute("ol",ol);
		return "list";
	}
	//�û�ȫ��������ʾdetail
	@RequestMapping(value = "/orderall")
	public String orderallshow(Integer uid,HttpSession session,Model model)
	{
		Userlist ul = (Userlist) session.getAttribute("USER_SESSION");
		Integer uid1 = ul.getUid();
		List<Orderlist> ol = ols.selectByPrimaryKey(uid1);
		model.addAttribute("ola",ol);
		return "detail";
	}
	//����ɾ�����ض��򵽶�������detail
	@RequestMapping(value = "/orderdelete")
	public String delete(Integer[] ids,Model model)
	{
		if (ids != null) {
			for (Integer oid : ids)
				ols.deleteByPrimaryKey(oid);
		} else {
			System.out.println("error");
		}
		return "redirect:list";
	}
	//����Ա�鿴���ж���
	@RequestMapping(value = "/list")
	public String all(Model model)
	{
		List<Orderlist> ol = ols.selectOrderAll();
		model.addAttribute("adminol", ol);
		return "list";
	}
	public Integer[] getIds() {
		return ids;
	}

	public void setIds(Integer[] ids) {
		this.ids = ids;
	}
	//下订单
	/*@RequestMapping("/addorder")
	public String addorder(Orderlist orderlist,HttpServletRequest request,Model model)
	{
		
	}*/
}
