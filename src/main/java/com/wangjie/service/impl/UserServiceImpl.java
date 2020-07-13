package com.wangjie.service.impl;

import com.wangjie.mapper.SysUserMapper;
import com.wangjie.model.SysUser;
import com.wangjie.service.UserService;
import lombok.RequiredArgsConstructor;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final SysUserMapper userMapper;

    @Override
    public List<SysUser> queryUsers(SysUser user) {
        List<SysUser> users = userMapper.selectUsers(user);
        if (CollectionUtils.isNotEmpty(users)) {
            return users;
        } else {
            return new ArrayList<>();
        }
    }

    @Override
    public int insert(SysUser user) {
        int num = userMapper.insert(user);
        return num;
    }

    @Override
    public int update(SysUser user) {
        int num = userMapper.updateByPrimaryKey(user);
        return num;
    }
}
