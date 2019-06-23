package com.seecen.service.impl;

import com.seecen.dao.CommentInfoMapper;
import com.seecen.pojo.Comment;
import com.seecen.pojo.Posts;
import com.seecen.service.CommentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 山泊树
 * @create 2019/6/18 17:42
 */
@Service
public class CommentInfoServiceImpl implements CommentInfoService {

    @Autowired
    private CommentInfoMapper commentInfoMapper;

    @Override
    public List<Comment> selectNew(Integer id) {
        return commentInfoMapper.selectCommentAndPosts(id);
    }

    @Override
    public int selectCountByComment(Posts posts) {
        return commentInfoMapper.selectCountComment(posts);
    }
}
