package com.books.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.books.po.Cartlist;
import com.books.po.CartlistExample;

public interface CartlistMapper {
    int countByExample(CartlistExample example);

    int deleteByExample(CartlistExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(Cartlist record);

    int insertSelective(Cartlist record);

    List<Cartlist> selectByExample(CartlistExample example);

    List<Cartlist> selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") Cartlist record, @Param("example") CartlistExample example);

    int updateByExample(@Param("record") Cartlist record, @Param("example") CartlistExample example);

    int updateByPrimaryKeySelective(Cartlist record);

    int updateByPrimaryKey(Cartlist record);
}