package com.wangjie.mapper;

import com.wangjie.model.SysUser;

import java.util.List;

/**
 *
 */
public interface SysUserMapper {
    /**
     * sys_user
     */
    int deleteByPrimaryKey(Long id);

    /**
     * sys_user
     */
    int insert(SysUser record);

    /**
     * sys_user
     */
    SysUser selectByPrimaryKey(Long id);

    /**
     * sys_user
     */
    int updateByPrimaryKey(SysUser record);

    /**
     * 查询用户列表
     *
     * @param user
     * @return
     */
    List<SysUser> selectUsers(SysUser user);
}