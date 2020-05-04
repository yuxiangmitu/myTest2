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

 Date: 04/05/2020 23:02:02
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_sys_user_role.sql
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_user_role.sql`;
CREATE TABLE `t_sys_user_role.sql`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '用户表id',
  `role_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '角色表id',
  `is_delete` tinyint(1) NOT NULL DEFAULT 0 COMMENT '作废标记（1作废，0未作废）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
