package com.wangjie.model;

import java.util.Date;

/**
 *
 * MBG自动生成<br/>
 * sys_org
 *
 * @mbg.工具生成
 */
public class SysOrg {
    /**
     * 
     *   机构码<br/>
     * sys_org.o_id<br/>
     *
     * @mbg.工具生成
     */
    private Long oId;

    /**
     * 
     *   上级机构码<br/>
     * sys_org.po_id<br/>
     *
     * @mbg.工具生成
     */
    private Long poId;

    /**
     * 
     *   部门码<br/>
     * sys_org.d_id<br/>
     *
     * @mbg.工具生成
     */
    private Long dId;

    /**
     * 
     *   上级部门码<br/>
     * sys_org.pd_id<br/>
     *
     * @mbg.工具生成
     */
    private Long pdId;

    /**
     * 
     *   级别<br/>
     * sys_org.level<br/>
     *
     * @mbg.工具生成
     */
    private Integer level;

    /**
     * 
     *   名称<br/>
     * sys_org.name<br/>
     *
     * @mbg.工具生成
     */
    private String name;

    /**
     * 
     *   排序号<br/>
     * sys_org.sort<br/>
     *
     * @mbg.工具生成
     */
    private Integer sort;

    /**
     * 
     *   是否可用状态<br/>
     * sys_org.enabled<br/>
     *
     * @mbg.工具生成
     */
    private Boolean enabled;

    /**
     * 
     *   创建者<br/>
     * sys_org.create_by<br/>
     *
     * @mbg.工具生成
     */
    private String createBy;

    /**
     * 
     *   更新者<br/>
     * sys_org.update_by<br/>
     *
     * @mbg.工具生成
     */
    private String updateBy;

    /**
     * 
     *   创建日期<br/>
     * sys_org.create_time<br/>
     *
     * @mbg.工具生成
     */
    private Date createTime;

    /**
     * 
     *   更新时间<br/>
     * sys_org.update_time<br/>
     *
     * @mbg.工具生成
     */
    private Date updateTime;

    public Long getoId() {
        return oId;
    }

    public void setoId(Long oId) {
        this.oId = oId;
    }

    public Long getPoId() {
        return poId;
    }

    public void setPoId(Long poId) {
        this.poId = poId;
    }

    public Long getdId() {
        return dId;
    }

    public void setdId(Long dId) {
        this.dId = dId;
    }

    public Long getPdId() {
        return pdId;
    }

    public void setPdId(Long pdId) {
        this.pdId = pdId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}