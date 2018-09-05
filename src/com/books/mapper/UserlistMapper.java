package com.books.mapper;

import com.books.po.Userlist;
import com.books.po.UserlistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserlistMapper {
    int countByExample(UserlistExample example);

    int deleteByExample(UserlistExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(Userlist record);

    int insertSelective(Userlist record);

    List<Userlist> selectByExample(UserlistExample example);


    int updateByExampleSelective(@Param("record") Userlist record, @Param("example") UserlistExample example);

    int updateByExample(@Param("record") Userlist record, @Param("example") UserlistExample example);

    int updateByPrimaryKeySelective(Userlist record);

    int updateByPrimaryKey(Userlist record);
    
    Userlist findUser(String uphone,String upwd); 
    
    int insertUser(Userlist userlist);
    List<Userlist> showAdmin();
    List<Userlist> showUser();
    Userlist selectUser(Integer uid);
}