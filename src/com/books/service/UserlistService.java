package com.books.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.books.po.Userlist;

public interface UserlistService {
	//��ʾ�û���Ϣ������Ա
	public Userlist selectUser(Integer uid);
	//�޸��û���Ϣ���û�
	public int updateByPrimaryKeySelective(Userlist record);
	//��֤�û���¼��Ϣ
	public Userlist findUser(@Param("uphone") String uphone,
			 @Param("upwd")	String upwd);
	//�����û���Ϣ��ע��
	public int insertUser(Userlist userlist);
	
	public List<Userlist> showAdmin();
	
	public List<Userlist> showUser();
	
	public int deleteByPrimaryKey(Integer uid);
}
