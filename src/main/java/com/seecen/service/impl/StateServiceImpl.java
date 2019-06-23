package com.seecen.service.impl;

import com.seecen.dao.StateMapper;
import com.seecen.pojo.State;
import com.seecen.pojo.StateExample;
import com.seecen.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 山泊树
 * @create 2019/6/19 10:54
 */
@Service
public class StateServiceImpl implements StateService {

    @Autowired
    private StateMapper stateMapper;
    @Override
    public List<State> findState() {
        return stateMapper.selectByExample(null);
    }
}
