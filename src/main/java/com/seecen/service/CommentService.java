package com.seecen.service;

import com.seecen.pojo.Comment;

import java.util.List;

/**
 * @Author 山泊树
 * @create 2019/6/18 9:48
 */
public interface CommentService {

    public boolean replys(Comment comment);

    //返回各个帖子里的评论信息
    public List<Comment> lists(Integer id);

    public boolean del(Integer id);

    public int reDel(List<Integer> list);
}
