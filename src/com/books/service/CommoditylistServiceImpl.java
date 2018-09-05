package com.books.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.books.mapper.CommoditylistMapper;
import com.books.po.Commoditylist;
import com.books.po.CommoditylistExample;
import com.books.po.CommoditylistWithBLOBs;

@Service("commoditylistService")
@Transactional
public class CommoditylistServiceImpl implements CommoditylistService{
	@Autowired
	private CommoditylistMapper clm;
	public int deleteByPrimaryKey(Integer cid)
	{
		return this.clm.deleteByPrimaryKey(cid);
	}
	public int insert(CommoditylistWithBLOBs record)
	{
		return this.clm.insert(record);
	}
	public CommoditylistWithBLOBs selectByPrimaryKey(Integer cid)
	{
		return this.clm.selectByPrimaryKey(cid);
	}
	public List<Commoditylist> selectByExample(CommoditylistExample example)
	{
		return this.clm.selectByExample(example);
	}
	public int updateByPrimaryKey(Commoditylist record)
	{
		return this.clm.updateByPrimaryKey(record);
	}
	public List<Commoditylist> findCommodityAll()
	{
		return this.clm.findCommodityAll();
	}
	public List<Commoditylist>  	findByName(String cname)
	{
		return this.clm.findByName(cname);
	}
	 public List<Commoditylist>  	findByType(String ctype)
	 {
		 return this.clm.findByType(ctype);
	 }
	 public List<Commoditylist>  	findByPrice(String cprice)
	 {
		 return this.clm.findByPrice(cprice);
	 }
	 public List<Commoditylist>  	findByCombination(String cname,String ctype)
	 
	 {
		 return this.clm.findByCombination(cname, ctype);
	 }
}
