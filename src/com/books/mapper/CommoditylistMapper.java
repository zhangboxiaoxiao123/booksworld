package com.books.mapper;

import java.util.List;

import com.books.po.Commoditylist;
import com.books.po.CommoditylistExample;
import com.books.po.CommoditylistWithBLOBs;

public interface CommoditylistMapper {

    int deleteByPrimaryKey(Integer cid);

    int insert(CommoditylistWithBLOBs record);

    int insertSelective(CommoditylistWithBLOBs record);

    List<CommoditylistWithBLOBs> selectByExampleWithBLOBs(CommoditylistExample example);

    List<Commoditylist> selectByExample(CommoditylistExample example);

    CommoditylistWithBLOBs selectByPrimaryKey(Integer cid);

    int updateByPrimaryKey(Commoditylist record);
    
    List<Commoditylist> findCommodityAll();
    //�����ѯ
    List<Commoditylist>  	findByName(String cname);
    List<Commoditylist>  	findByType(String ctype);
    List<Commoditylist>  	findByPrice(String cprice);
    List<Commoditylist>  	findByCombination(String cname,String ctype);
}