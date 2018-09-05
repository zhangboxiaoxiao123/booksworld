package com.books.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.books.mapper.CartlistMapper;
import com.books.po.Cartlist;

@Service("cartlistService")
@Transactional
public class CartlistServiceImpl implements CartlistService{
	@Autowired
	private CartlistMapper clm;
	//查询购物车信息、用户
	public List<Cartlist> selectByPrimaryKey(Integer uid)
	{
		return this.clm.selectByPrimaryKey(uid);
	}
		//添加商品、用户
	public int insert(Cartlist record)
	{
		return this.clm.insert(record);
	}
		//删除商品、用户
	public int deleteByPrimaryKey(Integer cid)
	{
		return this.clm.deleteByPrimaryKey(cid);
	}
}
