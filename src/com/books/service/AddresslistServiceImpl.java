package com.books.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.books.mapper.AddresslistMapper;
import com.books.po.Addresslist;

@Service("addresslistService")
@Transactional
public class AddresslistServiceImpl implements AddresslistService{
	@Autowired
	private AddresslistMapper ulm;
	public int insert(Addresslist record)
	{
		return this.ulm.insert(record);
	}
	public List<Addresslist> selectByPrimaryKey(Integer uid)
	{
		return this.ulm.selectByPrimaryKey(uid);
	}
	public int updateByPrimaryKey(Addresslist record)
	{
		return this.ulm.updateByPrimaryKey(record);
	}
	public int deleteByPrimaryKey(Integer aid)
	{
		return this.ulm.deleteByPrimaryKey(aid);
	}
}
