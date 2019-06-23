package com.seecen.service;

import com.seecen.pojo.Comment;
import com.seecen.pojo.Posts;

import java.util.List;

/**
 * @Author 山泊树
 * @create 2019/6/18 17:41
 */
public interface CommentInfoService {

    public List<Comment> selectNew(Integer id);

    //查回复数量
    public int selectCountByComment(Posts posts);
}
