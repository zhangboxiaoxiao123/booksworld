package com.books.service;

import java.util.List;

import com.books.po.Cartlist;

public interface CartlistService {
	//��ѯ���ﳵ��Ϣ���û�
	public List<Cartlist> selectByPrimaryKey(Integer uid1);
	//�����Ʒ���û�
	public int insert(Cartlist record);
	//ɾ����Ʒ���û�
	public int deleteByPrimaryKey(Integer cid);
}
