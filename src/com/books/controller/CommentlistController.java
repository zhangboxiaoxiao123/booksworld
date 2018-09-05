package com.books.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.books.po.Commentlist;
import com.books.po.CommentlistExample;
import com.books.po.CommentlistWithBLOBs;
import com.books.service.CommentlistService;

@Controller
public class CommentlistController {
	@Autowired
	private CommentlistService cls;
	//����Ա���桢��ʾ���۸�����������Ϣ
	@RequestMapping(value = "/index")
	public String toComment(CommentlistExample example,Model model)
	{
		int cl = cls.countByExample(example);
		List<Commentlist> commentlist = cls.selectCommentAll();
		model.addAttribute("cl",cl);
		model.addAttribute("commentlist",commentlist);
		return "index";
	}
	//ɾ�����۹��ܡ�redirect���û�����
	@RequestMapping(value = "/deleteComment")
	public String deleteComment(Integer pid,Model model)
	{
		int cl = cls.deleteByPrimaryKey(pid);
		model.addAttribute(cl);
		return "redirect:comment";
	}
	//�����޸Ľ���
	@RequestMapping(value = "/toupdate")
	public String toupdate(Commentlist record,Model model)
	{
		return "updatecomment";
	}
	//�޸����۹��ܡ�return��success
	@RequestMapping(value = "/updateComment")
	public String updateComment(Commentlist record,Model model)
	{
		int cl = cls.updateByPrimaryKey(record);
		model.addAttribute(cl);
		return "success";
	}
	//�����������
	@RequestMapping(value = "/toinsert")
	public String toinsert(CommentlistWithBLOBs record,Model model)
	{
		return "insertcomment";
	}
	//�û����빦�ܡ�return��success
	@RequestMapping(value = "/userinsertComment")
	public String insertComment1(CommentlistWithBLOBs record,Model model)
	{
		int cl = cls.insert(record);
		model.addAttribute(cl);
		return "success";
	}
	//����Ա���빦�ܡ�return��success
	@RequestMapping(value = "/admininsertComment")
	public String insertComment2(CommentlistWithBLOBs record,Model model)
	{
		int cl = cls.insert(record);
		model.addAttribute(cl);
		return "success";
	}
	//�û�������ѯ���۹��ܡ�redirect���û�����
	@RequestMapping(value = "/userselectComment")
	public String selectComment1(CommentlistExample example,Model model)
	{
		List<Commentlist> cl = cls.selectByExample(example);
		model.addAttribute("clc",cl);
		return "redirect:comment";
	}
	//����Ա������ѯ���۹��ܡ�redirect������Ա����index
	@RequestMapping(value = "/adminselectComment")
	public String selectComment2(CommentlistExample example,Model model)
	{
		List<Commentlist> cl = cls.selectByExample(example);
		model.addAttribute("cli",cl);
		return "redirect:index";
	}
}
