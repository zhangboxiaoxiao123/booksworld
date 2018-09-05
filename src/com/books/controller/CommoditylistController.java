package com.books.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.books.po.Commoditylist;
import com.books.po.CommoditylistWithBLOBs;
import com.books.service.CommoditylistService;

@Controller
public class CommoditylistController {
	@Autowired
	private CommoditylistService cls;
	private Integer[] ids;
//	锟矫伙拷锟斤拷锟斤拷锟狡凤拷锟较�
//	@RequestMapping(value = "/commoditylistallshow")
//	public String commodityallshow(Integer cid,Model model)
//	{
//		CommoditylistWithBLOBs cl = cls.selectByPrimaryKey(cid);
//		model.addAttribute("cola",cl);
//		return "";
//	}
	@RequestMapping(value = "/book")
	public String book()
	{
		
		return "book";
	}
	
	//锟斤拷锟斤拷员锟斤拷锟斤拷锟狡凤拷锟较�
	@RequestMapping(value = "/adminindex")
	public String admincommodity(Model model)
	{
		List<Commoditylist> cl = cls.findCommodityAll();
		model.addAttribute("admincola",cl);
		return "adminindex";
	}
	@RequestMapping(value = "/products")
	public String toproducts(Model model)
	{
		List<Commoditylist> cl = cls.findCommodityAll();
		model.addAttribute("admincola",cl);
		return "products";
	}
	//锟斤拷锟斤拷员锟斤拷锟斤拷锟斤拷品锟斤拷锟截讹拷锟斤拷锟斤拷锟斤拷锟狡凤拷锟较拷锟斤拷锟�
	@RequestMapping(value = "/admincommodityinsert")
	public String commodityinsert(CommoditylistWithBLOBs record,Model model)
	{
		int cl = cls.insert(record);
		model.addAttribute(cl);
		return "redirect:products";
	}
	//锟斤拷锟斤拷员锟睫革拷锟斤拷品锟斤拷锟截讹拷锟斤拷锟斤拷锟斤拷锟狡凤拷锟较拷锟斤拷锟�
	@RequestMapping(value = "/admincommodityupdate")
	public String commodityupdate(Commoditylist record,Model model)
	{
		int cl = cls.updateByPrimaryKey(record);
		model.addAttribute(cl);
		return "redirect:products";
	}
	//锟斤拷锟斤拷员删锟斤拷锟斤拷品锟斤拷锟截讹拷锟斤拷锟斤拷锟斤拷锟狡凤拷锟较拷锟斤拷锟�
	@RequestMapping(value = "/admincommoditydelete")
	public String commoditydelete(Integer[] ids,Model model)
	{
		if (ids != null) {
			for (Integer cid : ids)
				cls.deleteByPrimaryKey(cid);
		} else {
			System.out.println("error");
		}
		return "redirect:adminindex";
	}
	public Integer[] getIds() {
		return ids;
	}

	public void setIds(Integer[] ids) {
		this.ids = ids;
	}
	//鏍规嵁涔﹀悕鏌ヨ
	@RequestMapping(value = "/cname")
	public String Cname(String cname,HttpServletRequest request,Model model)
	{
		String cname1 = request.getParameter("cname1");
		List<Commoditylist>  cl = cls.findByName(cname1);
		model.addAttribute("cname1", cl);
		return "cname1";
	}
	//鏍规嵁浠锋牸鏌ヨ
	@RequestMapping(value = "/cprice")
	public String Cprice(String cprice,HttpServletRequest request,Model model)
	{
		String cprice1 = request.getParameter("cprice");
		List<Commoditylist>  cl = cls.findByPrice(cprice1);
		model.addAttribute("price", cl);
		return "";
	}
	//鏍规嵁绫诲瀷鏌ヨ
	@RequestMapping(value = "/ctype")
	public String Ctype(String ctype,HttpServletRequest request,Model model)
	{
		String ctype1 = request.getParameter("ctype");
		List<Commoditylist>  cl = cls.findByName(ctype1);
		model.addAttribute("type", cl);
		return "";
	}
	//鐗规畩鏌ヨ
	@RequestMapping(value = "/combination")
	public String Combination(String cname,String ctype,HttpServletRequest request,Model model)
	{
		String cname1 = request.getParameter("cname");
		String ctype1 = request.getParameter("ctype");
		List<Commoditylist>  cl = cls.findByCombination(cname1, ctype1);
		model.addAttribute("name", cl);
		return "";
	}
}
