package com.books.service;

import java.util.List;

import com.books.po.Addresslist;

public interface AddresslistService {
	//�����µ�ַ���û�
	public int insert(Addresslist record);
	//��ѯ����ӵ�ַ���û�
	public List<Addresslist> selectByPrimaryKey(Integer uid);
	//�޸ĵ�ַ���û�
	public int updateByPrimaryKey(Addresslist record);
	//ɾ����ַ���û�
	public int deleteByPrimaryKey(Integer aid);
}
