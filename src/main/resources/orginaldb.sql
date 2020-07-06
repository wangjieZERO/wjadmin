-- 测试表
DROP TABLE IF EXISTS `t_test`;
CREATE TABLE `t_test` (
  `id` bigint(16) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `name` varchar(20) DEFAULT NULL COMMENT '测试名称',
  `time` datetime DEFAULT NULL COMMENT '测试时间',
  `enabled` bit(1) NOT NULL COMMENT '是否可用状态',
  `create_by` varchar(255) DEFAULT NULL COMMENT '创建者',
  `update_by` varchar(255) DEFAULT NULL COMMENT '更新者',
  `create_time` datetime DEFAULT NULL COMMENT '创建日期',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='测试表';

--组织机构表
DROP TABLE IF EXISTS `sys_org`;
CREATE TABLE `sys_org` (
  `o_id` bigint(20) NOT NULL COMMENT '机构码',
  `po_id` bigint(20) NOT NULL COMMENT '上级机构码',
  `d_id` bigint(20) NOT NULL  COMMENT '部门码',
  `pd_id` bigint(20) NOT NULL  COMMENT '上级部门码',
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
  key `inx_pd_id` (`pd_id`),
  KEY `inx_enabled` (`enabled`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='组织机构';