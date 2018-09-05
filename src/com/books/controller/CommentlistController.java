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
	//管理员界面、显示评论个数及评论信息
	@RequestMapping(value = "/index")
	public String toComment(CommentlistExample example,Model model)
	{
		int cl = cls.countByExample(example);
		List<Commentlist> commentlist = cls.selectCommentAll();
		model.addAttribute("cl",cl);
		model.addAttribute("commentlist",commentlist);
		return "index";
	}
	//删除评论功能、redirect到用户界面
	@RequestMapping(value = "/deleteComment")
	public String deleteComment(Integer pid,Model model)
	{
		int cl = cls.deleteByPrimaryKey(pid);
		model.addAttribute(cl);
		return "redirect:comment";
	}
	//跳到修改界面
	@RequestMapping(value = "/toupdate")
	public String toupdate(Commentlist record,Model model)
	{
		return "updatecomment";
	}
	//修改评论功能、return到success
	@RequestMapping(value = "/updateComment")
	public String updateComment(Commentlist record,Model model)
	{
		int cl = cls.updateByPrimaryKey(record);
		model.addAttribute(cl);
		return "success";
	}
	//跳到插入界面
	@RequestMapping(value = "/toinsert")
	public String toinsert(CommentlistWithBLOBs record,Model model)
	{
		return "insertcomment";
	}
	//用户插入功能、return到success
	@RequestMapping(value = "/userinsertComment")
	public String insertComment1(CommentlistWithBLOBs record,Model model)
	{
		int cl = cls.insert(record);
		model.addAttribute(cl);
		return "success";
	}
	//管理员插入功能、return到success
	@RequestMapping(value = "/admininsertComment")
	public String insertComment2(CommentlistWithBLOBs record,Model model)
	{
		int cl = cls.insert(record);
		model.addAttribute(cl);
		return "success";
	}
	//用户条件查询评论功能、redirect到用户界面
	@RequestMapping(value = "/userselectComment")
	public String selectComment1(CommentlistExample example,Model model)
	{
		List<Commentlist> cl = cls.selectByExample(example);
		model.addAttribute("clc",cl);
		return "redirect:comment";
	}
	//管理员条件查询评论功能、redirect到管理员界面index
	@RequestMapping(value = "/adminselectComment")
	public String selectComment2(CommentlistExample example,Model model)
	{
		List<Commentlist> cl = cls.selectByExample(example);
		model.addAttribute("cli",cl);
		return "redirect:index";
	}
}
