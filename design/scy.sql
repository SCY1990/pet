/*
 Navicat MySQL Data Transfer

 Source Server         : game
 Source Server Type    : MySQL
 Source Server Version : 80012
 Source Host           : localhost:3306
 Source Schema         : mysql

 Target Server Type    : MySQL
 Target Server Version : 80012
 File Encoding         : 65001

 Date: 31/07/2018 15:22:42
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for levelup_info
-- ----------------------------
DROP TABLE IF EXISTS `levelup_info`;
CREATE TABLE `levelup_info`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `level` int(11) NULL DEFAULT NULL COMMENT '等级',
  `needexp` int(11) NULL DEFAULT NULL COMMENT '当前等级升级所需训练次数',
  `strup` int(11) NULL DEFAULT NULL COMMENT '当前等级升级增加力量数值',
  `agiup` int(11) NULL DEFAULT NULL COMMENT '当前等级升级增加灵动数值',
  `charmup` int(11) NULL DEFAULT NULL COMMENT '当前等级升级增加魅力数值',
  `graceup` int(11) NULL DEFAULT NULL COMMENT '当前等级升级增加优雅数值',
  `handsome` int(11) NULL DEFAULT NULL COMMENT '当前等级升级增加帅气数值',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '宠物升级相关信息' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for pet
-- ----------------------------
DROP TABLE IF EXISTS `pet`;
CREATE TABLE `pet`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `pet_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '宠物名称',
  `strength` int(11) NULL DEFAULT NULL COMMENT '力量',
  `charm` int(11) NULL DEFAULT NULL COMMENT '魅力',
  `agility` int(11) NULL DEFAULT NULL COMMENT '灵动',
  `grace` int(11) NULL DEFAULT NULL COMMENT '优雅',
  `handsome` int(11) NULL DEFAULT NULL COMMENT '帅气',
  `fatigue` int(5) NULL DEFAULT NULL COMMENT '疲劳',
  `level` int(11) NULL DEFAULT NULL COMMENT '等级',
  `train_num` int(3) NULL DEFAULT NULL COMMENT '宠物当前训练次数',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '宠物表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for pet_skill
-- ----------------------------
DROP TABLE IF EXISTS `pet_skill`;
CREATE TABLE `pet_skill`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `pet_id` int(11) NULL DEFAULT NULL COMMENT '宠物ID',
  `skill_id` int(11) NULL DEFAULT NULL COMMENT '技能ID',
  `skill_position` int(1) NULL DEFAULT NULL COMMENT '技能栏位（共3个1,2,3）',
  `status` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '0' COMMENT '是否解锁（0否，1是）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '宠物装备技能' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for skill_info
-- ----------------------------
DROP TABLE IF EXISTS `skill_info`;
CREATE TABLE `skill_info`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `skill_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '技能名称',
  `skill_description` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '技能描述',
  `buff_type` int(1) NULL DEFAULT NULL COMMENT '加成方式（0：固定数值，1：百分比）',
  `buff_properties` int(2) NULL DEFAULT NULL COMMENT '加成属性1（0战斗金币，1行动金币，3力量，4魅力，5灵动，6优雅，7帅气）',
  `buff_num` int(5) NULL DEFAULT NULL COMMENT '加成数值',
  `buff_properties2` int(2) NULL DEFAULT NULL COMMENT '加成属性2',
  `buff_num2` int(5) NULL DEFAULT NULL COMMENT '加成数值2',
  `buff_properties3` int(2) NULL DEFAULT NULL COMMENT '加成属性3',
  `buff_num3` int(5) NULL DEFAULT NULL COMMENT '加成数值3',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '技能信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for train_info
-- ----------------------------
DROP TABLE IF EXISTS `train_info`;
CREATE TABLE `train_info`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `train_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '训练名称',
  `train_level` int(3) NULL DEFAULT NULL COMMENT '训练等级',
  `main_properties` int(2) NULL DEFAULT NULL COMMENT '主要提升属性',
  `minor_properties1` int(2) NULL DEFAULT NULL COMMENT '次要提升属性1',
  `minor_properties2` int(2) NULL DEFAULT NULL COMMENT '次要提升属性2',
  `gold` int(11) NULL DEFAULT NULL COMMENT '训练所需金币',
  `pl` int(4) NULL DEFAULT NULL COMMENT '训练所需疲劳',
  `main_up` int(11) NULL DEFAULT NULL COMMENT '主属性提升数值',
  `minor1_up` int(11) NULL DEFAULT NULL COMMENT '次要属性1提升数值',
  `minor2_up` int(11) NULL DEFAULT NULL COMMENT '次要属性2提升数值',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '训练表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user_pet
-- ----------------------------
DROP TABLE IF EXISTS `user_pet`;
CREATE TABLE `user_pet`  (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `user_id` int(11) NOT NULL COMMENT '用户ID',
  `pet_id` int(11) NULL DEFAULT NULL COMMENT '宠物ID',
  `bar` int(2) NULL DEFAULT NULL COMMENT '宠物栏位',
  `status` int(2) NULL DEFAULT NULL COMMENT '状态（0未解锁，1已解锁）',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '用户宠物栏宠物' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
