package com.books.service;

import com.books.po.Picturelist;

public interface PicturelistService {
	//��ʾͼƬ������Ա
	public Picturelist selectByPrimaryKey(Integer zid);
	//������Ƭ������Ա
	public int insert(Picturelist record);
	//�޸���Ƭ������Ա
	public int updateByPrimaryKeySelective(Picturelist record);
}
