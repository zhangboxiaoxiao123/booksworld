package com.books.mapper;

import com.books.po.Orderlist;
import com.books.po.OrderlistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderlistMapper {
    int countByExample(OrderlistExample example);

    int deleteByExample(OrderlistExample example);

    int deleteByPrimaryKey(Integer oid);

    int insert(Orderlist record);

    int insertSelective(Orderlist record);

    List<Orderlist> selectByExample(OrderlistExample example);

    List<Orderlist> selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") Orderlist record, @Param("example") OrderlistExample example);

    int updateByExample(@Param("record") Orderlist record, @Param("example") OrderlistExample example);

    int updateByPrimaryKeySelective(Orderlist record);

    int updateByPrimaryKey(Orderlist record);
    
    List<Orderlist> selectOrderAll();
    
    int updateStatus(Integer oid,String ostatus);
    //Ôö¼Ó¶©µ¥
    int addOrder(List<Orderlist> orderlist);
}