package com.seecen.service.impl;

import com.seecen.dao.PostTypeMapper;
import com.seecen.pojo.PostType;
import com.seecen.pojo.PostTypeExample;
import com.seecen.pojo.Posts;
import com.seecen.service.PostTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 山泊树
 * @create 2019/6/17 19:51
 */
@Service
public class PostTypeServiceImpl implements PostTypeService {

    @Autowired
    private PostTypeMapper postTypeMapper;



    @Override
    public List<PostType> selects() {
        PostTypeExample example = new PostTypeExample();
        PostTypeExample.Criteria cri = example.createCriteria();
        cri.andTypeidIsNotNull();
        return postTypeMapper.selectByExample(example);
    }


}
