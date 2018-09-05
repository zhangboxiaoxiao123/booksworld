package com.books.mapper;

import com.books.po.Commentlist;
import com.books.po.CommentlistExample;
import com.books.po.CommentlistWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentlistMapper {
    int countByExample(CommentlistExample example);

    int deleteByExample(CommentlistExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(CommentlistWithBLOBs record);

    int insertSelective(CommentlistWithBLOBs record);

    List<CommentlistWithBLOBs> selectByExampleWithBLOBs(CommentlistExample example);

    List<Commentlist> selectByExample(CommentlistExample example);

    CommentlistWithBLOBs selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") CommentlistWithBLOBs record, @Param("example") CommentlistExample example);

    int updateByExampleWithBLOBs(@Param("record") CommentlistWithBLOBs record, @Param("example") CommentlistExample example);

    int updateByExample(@Param("record") Commentlist record, @Param("example") CommentlistExample example);

    int updateByPrimaryKeySelective(CommentlistWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CommentlistWithBLOBs record);

    int updateByPrimaryKey(Commentlist record);
    
    List<Commentlist> selectCommentAll();
}