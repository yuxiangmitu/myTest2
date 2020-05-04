/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50726
 Source Host           : localhost:3306
 Source Schema         : mytest

 Target Server Type    : MySQL
 Target Server Version : 50726
 File Encoding         : 65001

 Date: 04/05/2020 23:01:32
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_sys_role
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_role`;
CREATE TABLE `t_sys_role`  (
  `role_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '角色id',
  `role_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '角色名',
  `is_deleted` tinyint(1) NOT NULL COMMENT '作废标记（1作废，0未作废）',
  `sort_no` int(11) NOT NULL COMMENT '序号（从0开始）',
  `gmt_create` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(40) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '创建者(登录账号)',
  `gmt_modified` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `last_modified_by` varchar(40) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '更新者(登录账号)',
  `version` int(11) NOT NULL COMMENT '版本号',
  PRIMARY KEY (`role_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_sys_role
-- ----------------------------
INSERT INTO `t_sys_role` VALUES ('9ea0dd08-8ab9-4f10-bb41-f48aee95aa06', 'driver', 0, 0, '2020-05-04 22:59:28', 'b', '2020-05-04 22:59:28', 'b', 0);

SET FOREIGN_KEY_CHECKS = 1;
