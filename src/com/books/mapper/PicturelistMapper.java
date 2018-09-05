package com.books.mapper;

import com.books.po.Picturelist;
import com.books.po.PicturelistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PicturelistMapper {
    int countByExample(PicturelistExample example);

    int deleteByExample(PicturelistExample example);

    int deleteByPrimaryKey(Integer zid);

    int insert(Picturelist record);

    int insertSelective(Picturelist record);

    List<Picturelist> selectByExample(PicturelistExample example);

    Picturelist selectByPrimaryKey(Integer zid);

    int updateByExampleSelective(@Param("record") Picturelist record, @Param("example") PicturelistExample example);

    int updateByExample(@Param("record") Picturelist record, @Param("example") PicturelistExample example);

    int updateByPrimaryKeySelective(Picturelist record);

    int updateByPrimaryKey(Picturelist record);
}