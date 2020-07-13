package com.wangjie.service;

import com.wangjie.model.SysUser;

import java.util.List;

public interface UserService {

    /**
     * 查询用户列表
     *
     * @param user
     * @return
     */
    List<SysUser> queryUsers(SysUser user);

    /**
     * 用户注册
     *
     * @param user
     * @return
     */
    int insert(SysUser user);

    /**
     * 用户信息修改
     *
     * @param user
     * @return
     */
    int update(SysUser user);
}
