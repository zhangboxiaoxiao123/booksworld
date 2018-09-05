package com.books.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.books.mapper.CommentlistMapper;
import com.books.po.Commentlist;
import com.books.po.CommentlistExample;
import com.books.po.CommentlistWithBLOBs;

@Service("commentlistService")
@Transactional
public class CommentlistServiceImpl implements CommentlistService{
	@Autowired
	private CommentlistMapper clm;
	public int countByExample(CommentlistExample example)
	{
		return this.clm.countByExample(example);
	}
	public int deleteByPrimaryKey(Integer pid)
	{
		return this.clm.deleteByPrimaryKey(pid);
	}
	public int insert(CommentlistWithBLOBs record)
	{
		return this.clm.insert(record);
	}
	public CommentlistWithBLOBs selectByPrimaryKey(Integer pid)
	{
		return this.clm.selectByPrimaryKey(pid);
	}
	public List<Commentlist> selectByExample(CommentlistExample example)
	{
		return this.clm.selectByExample(example);
	}
	public int updateByPrimaryKey(Commentlist record)
	{
		return this.clm.updateByPrimaryKey(record);
	}
	public List<Commentlist> selectCommentAll()
	{
		return this.clm.selectCommentAll();
	}
}
