package com.seecen.service.impl;

import com.seecen.dao.CommentMapper;
import com.seecen.pojo.Comment;
import com.seecen.pojo.CommentExample;
import com.seecen.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 山泊树
 * @create 2019/6/18 11:58
 */
@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentMapper commentMapper;

    @Override
    public boolean replys(Comment comment) {
            if (commentMapper.insertSelective(comment)>0){
                return true;
            }
            return false;
        }

    @Override
    public List<Comment> lists(Integer id) {
        CommentExample example = new CommentExample();
        CommentExample.Criteria cri = example.createCriteria();
        cri.andPostsidEqualTo(id);
        List<Comment> list =  commentMapper.selectByExample(example);
        return list;
    }

    @Override
    public boolean del(Integer id) {
        if (commentMapper.deleteByPrimaryKey(id)>0){
            return true;
        }
        return false;
    }

    @Override
    public int reDel(List<Integer> list) {
        CommentExample example = new CommentExample();
        CommentExample.Criteria cri = example.createCriteria();
        cri.andPostsidIn(list);
        return commentMapper.deleteByExample(example);
    }

}
