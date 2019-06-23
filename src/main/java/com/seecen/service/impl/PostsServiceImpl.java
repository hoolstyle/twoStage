package com.seecen.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.seecen.dao.PostsInfoMapper;
import com.seecen.dao.PostsMapper;
import com.seecen.pojo.Page;
import com.seecen.pojo.Posts;
import com.seecen.pojo.PostsExample;
import com.seecen.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @Author 山泊树
 * @create 2019/6/16 16:55
 */
@Service
public class PostsServiceImpl implements PostsService {

    @Autowired
    private PostsMapper postsMapper;

    @Autowired
    private PostsInfoMapper postsInfoMapper;


    @Override
    public Page<Posts> findPostsByPage(Posts posts, Integer pageNum) {
        Page<Posts> page = new Page<>();
        if (pageNum != null && pageNum <= 0) {
            throw new IllegalArgumentException("页码不正确");
        }
        if (pageNum != null) {
            page.setPageNum(pageNum);
        }
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        PageInfo<Posts> info = new PageInfo<>(postsInfoMapper.findPostsByCondition(posts));
        page.setCondition(posts);
        page.setList(info.getList());
        page.setTotal(info.getTotal());
        return page;
    }

    @Override
    public int delAll(List<Integer> list) {
        PostsExample example = new PostsExample();
        PostsExample.Criteria cri = example.createCriteria();
        cri.andPostsidIn(list);
        return postsMapper.deleteByExample(example);
    }

    @Override
    public boolean delById(Integer id) {
        if (postsMapper.deleteByPrimaryKey(id)>0){
            return true;
        }
        return false;
    }

    @Override
    public Posts selectDetail(Integer id) {
        return postsMapper.selectByPrimaryKey(id);
    }

    //发布帖子
    @Override
    public boolean insertPost(Posts posts) {
        if (postsMapper.insertSelective(posts)>0){
            return true;
        }
        return false;
    }


    //管理员修改帖子
    @Override
    public boolean updatePost(Posts posts) {
        if (postsMapper.updateByPrimaryKeySelective(posts)>0){
            return true;
        }
        return false;
    }

    @Override
    public Page<Posts> findPostsByPageFronts(Posts posts, Integer pageNum) {
        Page<Posts> page = new Page<>();
        if (pageNum != null && pageNum <= 0) {
            throw new IllegalArgumentException("页码不正确");
        }
        if (pageNum != null) {
            page.setPageNum(pageNum);
        }
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        PageInfo<Posts> info = new PageInfo<>(postsInfoMapper.findPostsByConditionFronts(posts));
        page.setCondition(posts);
        page.setList(info.getList());
        page.setTotal(info.getTotal());
        return page;
    }

    @Override
    public boolean insertPictrue(Posts posts) {
        if(postsMapper.insertSelective(posts)>0){
            return true;
        }
        return false;
    }

    @Override
    public Posts selectHuiFu(Integer id) {
        return postsMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateHuiFu(Posts posts) {
        posts.setCommentid(posts.getCommentid()+1);
         if(postsMapper.updateByPrimaryKeySelective(posts)>0){
             return true;
         }
         return false;
    }

    //查询回复数量



}

