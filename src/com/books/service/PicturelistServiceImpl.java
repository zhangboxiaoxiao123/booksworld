package com.books.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.books.po.Picturelist;


@Service("PicturelistService")
@Transactional
public class PicturelistServiceImpl implements	PicturelistService{
	@Autowired
	private PicturelistService pls;
	public int insert(Picturelist record)
	{
		return this.pls.insert(record);
	}
	public int updateByPrimaryKeySelective(Picturelist record)
	{
		return this.pls.updateByPrimaryKeySelective(record);
	}
	@Override
	public Picturelist selectByPrimaryKey(Integer zid) {
		return this.pls.selectByPrimaryKey(zid);
	}
}
