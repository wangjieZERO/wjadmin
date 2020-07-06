package com.wangjie.mapper;

import com.wangjie.model.SysOrg;

/**
 * MBG自动生成<br/>
 * @mbg.工具生成
 */
public interface SysOrgMapper {
    /**
     * MBG自动生成<br/>
     * sys_org
     *
     * @mbg.工具生成
     */
    int deleteByPrimaryKey(Long oId);

    /**
     * MBG自动生成<br/>
     * sys_org
     *
     * @mbg.工具生成
     */
    int insert(SysOrg record);

    /**
     * MBG自动生成<br/>
     * sys_org
     *
     * @mbg.工具生成
     */
    SysOrg selectByPrimaryKey(Long oId);

    /**
     * MBG自动生成<br/>
     * sys_org
     *
     * @mbg.工具生成
     */
    int updateByPrimaryKey(SysOrg record);
}