package com.wangjie.mapper;

import com.wangjie.model.SysOrg;

/**
 *
 *
 */
public interface SysOrgMapper {
    /**
     * sys_org
     */
    int deleteByPrimaryKey(Long oId);

    /**
     * sys_org
     */
    int insert(SysOrg record);

    /**
     * sys_org
     */
    SysOrg selectByPrimaryKey(Long oId);

    /**
     * sys_org
     */
    int updateByPrimaryKey(SysOrg record);
}