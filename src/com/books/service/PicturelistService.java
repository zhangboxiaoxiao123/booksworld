package com.books.service;

import com.books.po.Picturelist;

public interface PicturelistService {
	//显示图片、管理员
	public Picturelist selectByPrimaryKey(Integer zid);
	//插入照片、管理员
	public int insert(Picturelist record);
	//修改照片、管理员
	public int updateByPrimaryKeySelective(Picturelist record);
}
