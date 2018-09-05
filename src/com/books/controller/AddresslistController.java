package com.books.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.books.po.Addresslist;
import com.books.po.Userlist;
import com.books.service.AddresslistService;

@Controller
public class AddresslistController {
	@Autowired
	private AddresslistService als;
	//������ַ��ʾ
	@RequestMapping(value = "/address")
	public String toaddress(Integer uid,HttpSession session,Model model)
	{	
		Userlist ul = (Userlist) session.getAttribute("USER_SESSION");
		Integer uid1 = ul.getUid();
		List<Addresslist> al = als.selectByPrimaryKey(uid1);
		model.addAttribute("al",al);
		return "address";
	}
	//��ת�����ӵ�ַ����
	@RequestMapping(value = "/addressadd")
	public String toAdd() {
		return "addressadd";
	}
	//��ַ���ӣ��ض��򵽵�ַ��ʾ����
	@RequestMapping(value = "/addressadding")
	public String insert(Addresslist record,HttpSession session,Model model)
	{
		Userlist ul = (Userlist) session.getAttribute("USER_SESSION");
		record.setUid(ul.getUid());
		int	al = als.insert(record);
		model.addAttribute(al);
		return "redirect:address";
	}
	//��ת���޸ĵ�ַ����
	@RequestMapping(value = "/addressupdate")
	public String toUpdate()
	{
		return "addressupdate";
	}
	//��ַ�޸ģ��ض��򵽵�ַ��ʾ����
	@RequestMapping(value = "/addressupadting")
	public String update(Addresslist record,HttpSession session,Model model)
	{
		Userlist ul = (Userlist) session.getAttribute("USER_SESSION");
		record.setUid(ul.getUid());
		int al = als.updateByPrimaryKey(record);
		model.addAttribute(al);
		return "redirect:address";
	}
	//��ַɾ�����ض��򵽵�ַ��ʾ����
	@RequestMapping(value = "deleteAddress")
	public String DelectAddress(Integer[] ids) {
		if (ids != null) {
			for (Integer id : ids)
				als.deleteByPrimaryKey(id);
		} else {
			System.out.println("error");
		}
		return "redirect:address";
		}
}
