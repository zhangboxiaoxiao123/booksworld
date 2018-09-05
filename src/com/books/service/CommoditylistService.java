package com.books.service;

import java.util.List;

import com.books.po.Commoditylist;
import com.books.po.CommoditylistExample;
import com.books.po.CommoditylistWithBLOBs;


public interface CommoditylistService {
	//ɾ����Ʒ������Ա
	public int deleteByPrimaryKey(Integer cid);
	//������Ʒ������Ա
	public int insert(CommoditylistWithBLOBs record);
	//������Ʒ������Ա
	public int updateByPrimaryKey(Commoditylist record);
	//����
	public List<Commoditylist> findCommodityAll();
	//条件查询
	 public List<Commoditylist>  	findByName(String cname);
	 public List<Commoditylist>  	findByType(String ctype);
	 public List<Commoditylist>  	findByPrice(String cprice);
	 public List<Commoditylist>  	findByCombination(String cname,String ctype);
}
