package com.books.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.books.mapper.OrderlistMapper;
import com.books.po.Orderlist;

@Service("orderlistService")
@Transactional
public class OrderlistServiceImpl implements OrderlistService{
	@Autowired
	private OrderlistMapper olm;
	public List<Orderlist> selectByPrimaryKey(Integer uid)
	{
		return this.olm.selectByPrimaryKey(uid);
	}
	public int deleteByPrimaryKey(Integer oid)
	{
		return this.olm.deleteByPrimaryKey(oid);
	}
	public int insert(Orderlist record)
	{
		return this.olm.insert(record);
	}
	public int updateByPrimaryKey(Orderlist record)
	{
		return this.olm.updateByPrimaryKey(record);
	}
	public List<Orderlist> selectOrderAll()
	{
		return this.olm.selectOrderAll();
	}
	public int addOrder(List<Orderlist> orderlist)
	{
		return this.olm.addOrder(orderlist);
	}
}
