package com.wangjie.model;

import com.wangjie.common.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * MBG自动生成<br/>
 * sys_org
 */
@Getter
@Setter
public class SysOrg extends BaseEntity implements Serializable {
    /**
     * 机构码<br/>`
     * sys_org.o_id<br/>
     */
    private Long oId;

    /**
     * 上级机构码<br/>
     * sys_org.po_id<br/>
     */
    private Long poId;

    /**
     * 部门码<br/>
     * sys_org.d_id<br/>
     */
    private Long dId;

    /**
     * 上级部门码<br/>
     * sys_org.pd_id<br/>
     */
    private Long pdId;

    /**
     * 级别<br/>
     * sys_org.level<br/>
     */
    private Integer level;

    /**
     * 名称<br/>
     * sys_org.name<br/>
     */
    private String name;

    /**
     * 排序号<br/>
     * sys_org.sort<br/>
     */
    private Integer sort;

    /**
     * 是否可用状态<br/>
     * sys_org.enabled<br/>
     */
    private Boolean enabled;


}