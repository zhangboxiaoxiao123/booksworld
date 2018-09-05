package com.books.mapper;

import com.books.po.Addresslist;
import com.books.po.AddresslistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AddresslistMapper {
    int countByExample(AddresslistExample example);

    int deleteByExample(AddresslistExample example);

    int deleteByPrimaryKey(Integer aid);

    int insert(Addresslist record);

    int insertSelective(Addresslist record);

    List<Addresslist> selectByExample(AddresslistExample example);

    List<Addresslist> selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") Addresslist record, @Param("example") AddresslistExample example);

    int updateByExample(@Param("record") Addresslist record, @Param("example") AddresslistExample example);

    int updateByPrimaryKeySelective(Addresslist record);

    int updateByPrimaryKey(Addresslist record);
}