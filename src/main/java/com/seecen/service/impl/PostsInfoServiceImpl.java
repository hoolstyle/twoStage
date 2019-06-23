package com.seecen.service.impl;

import com.seecen.dao.PostsInfoMapper;
import com.seecen.pojo.Posts;
import com.seecen.pojo.PostsExample;
import com.seecen.service.PostsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 山泊树
 * @create 2019/6/17 14:37
 */
@Service
public class PostsInfoServiceImpl implements PostsInfoService {

    @Autowired
    private PostsInfoMapper postsInfoMapper;

    @Override
    public List<Posts> findPostsByAll(Posts posts) {
       return postsInfoMapper.findPostsByCondition(posts);
    }

    @Override
    public List<Posts> findPostsByAllFronts(Posts posts) {
        return postsInfoMapper.findPostsByConditionFronts(posts);
    }

    @Override
    public List<Posts> findPostsByHost() {
        return postsInfoMapper.findPostsByHot();
    }

    @Override
    public List<Posts> selectCountComment(Posts posts) {
        return postsInfoMapper.selectCountCommentAndPosts(posts);
    }


}
