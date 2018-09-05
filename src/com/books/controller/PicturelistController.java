package com.books.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.books.po.Picturelist;
import com.books.service.PicturelistService;

@Controller
public class PicturelistController{
	@Autowired
	private PicturelistService pls;
	//图片界面显示
	@RequestMapping(value = "/picture")
	public String pictureshow(Integer zid,Model model)
	{
		Picturelist	pl = (Picturelist) pls.selectByPrimaryKey(zid);
		model.addAttribute(pl);
		return "picture";
	}
	//图片添加、重定向到picture
	@RequestMapping(value = "/pictureadding")
	public String insert(Picturelist record,Model model)
	{
		int	pl = pls.insert(record);
		model.addAttribute(pl);
		return "redirect:picture";
	}
	//图片修改、重定向到picture
	@RequestMapping(value = "/pictureupdating")
	public String update(Picturelist record,Model model)
	{
		int pl = pls.updateByPrimaryKeySelective(record);
		model.addAttribute(pl);
		return "redirect:picture";
	}
}
