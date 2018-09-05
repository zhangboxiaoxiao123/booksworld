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
	//ͼƬ������ʾ
	@RequestMapping(value = "/picture")
	public String pictureshow(Integer zid,Model model)
	{
		Picturelist	pl = (Picturelist) pls.selectByPrimaryKey(zid);
		model.addAttribute(pl);
		return "picture";
	}
	//ͼƬ��ӡ��ض���picture
	@RequestMapping(value = "/pictureadding")
	public String insert(Picturelist record,Model model)
	{
		int	pl = pls.insert(record);
		model.addAttribute(pl);
		return "redirect:picture";
	}
	//ͼƬ�޸ġ��ض���picture
	@RequestMapping(value = "/pictureupdating")
	public String update(Picturelist record,Model model)
	{
		int pl = pls.updateByPrimaryKeySelective(record);
		model.addAttribute(pl);
		return "redirect:picture";
	}
}
