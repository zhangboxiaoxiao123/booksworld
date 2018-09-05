package com.books.service;

import java.util.List;

import com.books.po.Commentlist;
import com.books.po.CommentlistExample;
import com.books.po.CommentlistWithBLOBs;

public interface CommentlistService {
	//��ʾ���۸������û�������Ա
	public int countByExample(CommentlistExample example);
	//ɾ�����ۡ��û�
	public int deleteByPrimaryKey(Integer pid);
	//�������ۡ��û�������Ա
	public int insert(CommentlistWithBLOBs record);
	//��ѯȫ�����ۡ�����Ա���û�
	public CommentlistWithBLOBs selectByPrimaryKey(Integer pid);
	//��������ѯ���ۡ��û�
	public List<Commentlist> selectByExample(CommentlistExample example);
	//�޸����ۡ��û�
	public int updateByPrimaryKey(Commentlist record);
	//
	public List<Commentlist> selectCommentAll();
}
