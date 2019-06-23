package com.seecen.dao;

import com.seecen.pojo.PostType;
import com.seecen.pojo.PostTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface PostTypeMapper {
    int countByExample(PostTypeExample example);

    int deleteByExample(PostTypeExample example);

    int deleteByPrimaryKey(Integer typeid);

    int insert(PostType record);

    int insertSelective(PostType record);

    List<PostType> selectByExample(PostTypeExample example);

    PostType selectByPrimaryKey(Integer typeid);

    int updateByExampleSelective(@Param("record") PostType record, @Param("example") PostTypeExample example);

    int updateByExample(@Param("record") PostType record, @Param("example") PostTypeExample example);

    int updateByPrimaryKeySelective(PostType record);

    int updateByPrimaryKey(PostType record);
}