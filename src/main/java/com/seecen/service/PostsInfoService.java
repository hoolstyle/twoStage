package com.seecen.service;

import com.seecen.pojo.Page;
import com.seecen.pojo.Posts;

import java.util.List;

/**
 * @Author 山泊树
 * @create 2019/6/17 14:17
 */
public interface PostsInfoService {

    public List<Posts> findPostsByAll(Posts posts);

    public List<Posts> findPostsByAllFronts(Posts posts);

    //前台热议数据
    public List<Posts> findPostsByHost();

    public List<Posts> selectCountComment(Posts posts);

}
