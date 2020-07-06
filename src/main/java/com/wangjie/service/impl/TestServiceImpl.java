package com.wangjie.service.impl;

import com.wangjie.mapper.TestMapper;
import com.wangjie.model.Test;
import com.wangjie.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public Test getTestInfoById(Integer id) {
        return testMapper.selectTestByPrimaryKey(id);
    }
}
