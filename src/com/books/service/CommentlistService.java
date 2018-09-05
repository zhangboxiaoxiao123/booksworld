package com.books.service;

import java.util.List;

import com.books.po.Commentlist;
import com.books.po.CommentlistExample;
import com.books.po.CommentlistWithBLOBs;

public interface CommentlistService {
	//显示评论个数、用户、管理员
	public int countByExample(CommentlistExample example);
	//删除评论、用户
	public int deleteByPrimaryKey(Integer pid);
	//插入评论、用户、管理员
	public int insert(CommentlistWithBLOBs record);
	//查询全部评论、管理员、用户
	public CommentlistWithBLOBs selectByPrimaryKey(Integer pid);
	//按条件查询评论、用户
	public List<Commentlist> selectByExample(CommentlistExample example);
	//修改评论、用户
	public int updateByPrimaryKey(Commentlist record);
	//
	public List<Commentlist> selectCommentAll();
}
