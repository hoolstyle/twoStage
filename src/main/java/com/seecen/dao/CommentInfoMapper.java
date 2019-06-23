package com.seecen.dao;

import com.seecen.pojo.Comment;
import com.seecen.pojo.Posts;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author 山泊树
 * @create 2019/6/18 17:57
 */
@Repository
public interface CommentInfoMapper {

    public List<Comment> selectCommentAndPosts(Integer id);

    //查回复数量
    public int selectCountComment(Posts posts);
}
