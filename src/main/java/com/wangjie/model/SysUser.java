package com.wangjie.model;

import com.wangjie.common.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


/**
 * sys_user
 */
@Getter
@Setter
public class SysUser extends BaseEntity implements Serializable {
    /**
     * 用户ID<br/>
     * sys_user.id<br/>
     */
    private Long id;

    /**
     * 用户姓名<br/>
     * sys_user.name<br/>
     */
    private String name;

    /**
     * 登入名<br/>
     * sys_user.login_name<br/>
     */
    private String loginName;

    /**
     * 用户名密码<br/>
     * sys_user.password<br/>
     */
    private String password;

    /**
     * 年龄<br/>
     * sys_user.age<br/>
     */
    private Integer age;

    /**
     * 职业<br/>
     * sys_user.job<br/>
     */
    private String job;

    /**
     * 手机号<br/>
     * sys_user.mobile_phone<br/>
     */
    private String mobilePhone;

    /**
     * 机构<br/>
     * sys_user.org_id<br/>
     */
    private Long orgId;

    /**
     * 部门<br/>
     * sys_user.dept_id<br/>
     */
    private Long deptId;

    /**
     * 注册IP<br/>
     * sys_user.register_ip<br/>
     */
    private String registerIp;

}