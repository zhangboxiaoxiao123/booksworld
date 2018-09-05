package com.books.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.books.mapper.UserlistMapper;
import com.books.po.Userlist;

@Service("userService")
@Transactional
public class UserlistServiceImpl implements UserlistService{
	@Autowired
	private UserlistMapper userlistMapper;
	public Userlist selectUser(Integer uid)
	{
		return this.userlistMapper.selectUser(uid);
	}
	public int insert(Userlist record)
	{
		return this.userlistMapper.insertSelective(record);
	}
	public int updateByPrimaryKeySelective(Userlist record)
	{
		return this.userlistMapper.updateByPrimaryKeySelective(record);
	}
	public Userlist findUser(String uphone,String upwd)
	{
		Userlist userlist = this.userlistMapper.findUser(uphone,upwd);
		return userlist;
	}
	public int insertUser(Userlist userlist)
	{
		return this.userlistMapper.insertUser(userlist);
	}
	public List<Userlist> showAdmin()
	{
		return this.userlistMapper.showAdmin();
	}
	public List<Userlist> showUser()
	{
		return this.userlistMapper.showUser();
	}
	public int deleteByPrimaryKey(Integer uid)
	{
		return this.userlistMapper.deleteByPrimaryKey(uid);
	}
}
