package com.seecen.dao;

import com.seecen.pojo.Posts;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author 山泊树
 * @create 2019/6/17 11:48
 */
@Repository
public interface PostsInfoMapper {

    public List<Posts> findPostsByCondition(Posts posts);

    public List<Posts> findPostsByConditionFronts(Posts posts);

    //前台根据热议查询的数据
    public List<Posts> findPostsByHot();

    public List<Posts> selectCountCommentAndPosts(Posts posts);
}
