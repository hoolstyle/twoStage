package com.seecen.service;

import com.seecen.pojo.Page;
import com.seecen.pojo.Posts;

import java.util.List;

/**
 * @Author 山泊树
 * @create 2019/6/16 16:47
 */

public interface PostsService {

    public Page<Posts> findPostsByPage(Posts posts, Integer pageNum);

    public int delAll(List<Integer> list);

    public boolean delById(Integer id);

    public Posts selectDetail(Integer id);

    //发帖子
    public boolean insertPost(Posts posts);

    //管理员修改帖子
    public boolean updatePost(Posts posts);

    //用户能看到的帖子
    public Page<Posts> findPostsByPageFronts(Posts posts, Integer pageNum);

    //发布多张图片
    public boolean insertPictrue(Posts posts);

    //让回复数量自增
    public Posts selectHuiFu(Integer id);
    public boolean updateHuiFu(Posts posts);

}
