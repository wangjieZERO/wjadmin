/*
Navicat MySQL Data Transfer

Source Server         : wangjie
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : wjadmindb

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2020-07-13 14:12:15
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `sys_org`
-- ----------------------------
DROP TABLE IF EXISTS `sys_org`;
CREATE TABLE `sys_org` (
  `o_id` bigint(20) NOT NULL COMMENT '机构码',
  `po_id` bigint(20) NOT NULL COMMENT '上级机构码',
  `d_id` bigint(20) NOT NULL COMMENT '部门码',
  `pd_id` bigint(20) NOT NULL COMMENT '上级部门码',
  `level` int(5) DEFAULT '0' COMMENT '级别',
  `name` varchar(255) NOT NULL COMMENT '名称',
  `sort` int(5) DEFAULT '0' COMMENT '排序号',
  `enabled` bit(1) NOT NULL COMMENT '是否可用状态',
  `create_by` varchar(255) DEFAULT NULL COMMENT '创建者',
  `update_by` varchar(255) DEFAULT NULL COMMENT '更新者',
  `create_time` datetime DEFAULT NULL COMMENT '创建日期',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`o_id`) USING BTREE,
  KEY `inx_d_id` (`d_id`),
  KEY `inx_po_id` (`po_id`),
  KEY `inx_pd_id` (`pd_id`),
  KEY `inx_enabled` (`enabled`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='组织机构';

-- ----------------------------
-- Records of sys_org
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_test`
-- ----------------------------
DROP TABLE IF EXISTS `tb_test`;
CREATE TABLE `tb_test` (
  `id` bigint(16) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `name` varchar(20) DEFAULT NULL COMMENT '测试名称',
  `time` datetime DEFAULT NULL COMMENT '测试时间',
  `enabled` bit(1) NOT NULL COMMENT '是否可用状态',
  `create_by` varchar(255) DEFAULT NULL COMMENT '创建者',
  `update_by` varchar(255) DEFAULT NULL COMMENT '更新者',
  `create_time` datetime DEFAULT NULL COMMENT '创建日期',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='测试表';

-- ----------------------------
-- Records of tb_test
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
create table `sys_user`(
  `id` bigInt(20) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `name` varchar(32) NOT NULL COMMENT '用户姓名',
  `login_name` varchar(64) NOT NULL COMMENT '登入名',
  `password` varchar(64) NOT NULL COMMENT '用户名密码',
  `age` int(3) DEFAULT NULL COMMENT '年龄',
  `job` varchar(32) default null comment '职业',
  `mobile_phone` varchar(11) default null comment '手机号',
  `org_id` bigInt(20) default null comment '机构',
  `dept_id` bigInt(20) default null comment '部门',
  `register_ip` varchar(32) not null comment '注册IP',
  `enabled` bit(1) default 1 comment '是否启用',
  `create_by` bigInt(20) default null comment'创建人',
  `create_time` datetime default now() comment '创建时间',
  `update_by` bigInt(20) default null comment '修改人',
  `update_time` datetime default now() comment '修改时间',
   primary key (`id`)  USING BTREE,
   key `inx_name` (`name`),
   key `inx_login_name` (`login_name`),
   key `inx_age` (`age`),
   key `inx_job` (`job`),
   KEY `inx_mobile_phone` (`mobile_phone`),
   key `inx_org_id` (`org_id`),
  key `inx_dept_id` (`dept_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='用户表';
