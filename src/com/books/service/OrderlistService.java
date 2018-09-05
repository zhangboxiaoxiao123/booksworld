package com.books.service;

import java.util.List;

import com.books.po.Orderlist;

public interface OrderlistService {
	//��ѯ�������û�
	public List<Orderlist> selectByPrimaryKey(Integer uid);
	//ɾ������������Ա
	public int deleteByPrimaryKey(Integer oid);
	//�޸Ķ���������Ա
	public int updateByPrimaryKey(Orderlist record);
	//��ѯȫ������������Ա
	public List<Orderlist> selectOrderAll();
	//下订单
	public int addOrder(List<Orderlist> orderlist);
}
