package com.books.service;

import java.util.List;

import com.books.po.Cartlist;

public interface CartlistService {
	//查询购物车信息、用户
	public List<Cartlist> selectByPrimaryKey(Integer uid1);
	//添加商品、用户
	public int insert(Cartlist record);
	//删除商品、用户
	public int deleteByPrimaryKey(Integer cid);
}
