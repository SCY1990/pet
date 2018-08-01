/*
 Navicat Premium Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 50722
 Source Host           : localhost
 Source Database       : pet

 Target Server Type    : MySQL
 Target Server Version : 50722
 File Encoding         : utf-8

 Date: 07/31/2018 20:36:16 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `map`
-- ----------------------------
DROP TABLE IF EXISTS `map`;
CREATE TABLE `map` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `map_id` int(11) NOT NULL COMMENT '地图编号',
  `map_plot_id` int(11) NOT NULL COMMENT '地块顺序',
  `plot_type` varchar(10) NOT NULL COMMENT '地块编号',
  `plot_name` varchar(10) DEFAULT NULL COMMENT '地块类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='地图';

-- ----------------------------
--  Table structure for `plot`
-- ----------------------------
DROP TABLE IF EXISTS `plot`;
CREATE TABLE `plot` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `plot_name` varchar(10) NOT NULL COMMENT '地块类型',
  `plot_type` varchar(10) NOT NULL COMMENT '地块编号',
  `icon_path` varchar(100) DEFAULT NULL COMMENT '对应icon',
  `award_min` varchar(10) DEFAULT NULL COMMENT '奖励数值最小',
  `award_max` varchar(1) DEFAULT NULL COMMENT '奖励数值最大',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='地块';

-- ----------------------------
--  Table structure for `plot_chance`
-- ----------------------------
DROP TABLE IF EXISTS `plot_chance`;
CREATE TABLE `plot_chance` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `chance_num` varchar(10) NOT NULL COMMENT '效果编号',
  `chance_detail` varchar(100) NOT NULL COMMENT '效果',
  `award_min` varchar(10) DEFAULT NULL COMMENT '奖励数值最小',
  `award_max` varchar(10) DEFAULT NULL COMMENT '奖励数值最大',
  `icon_path` varchar(100) DEFAULT NULL COMMENT '对应icon',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='机会卡库';

-- ----------------------------
--  Table structure for `plunder_info`
-- ----------------------------
DROP TABLE IF EXISTS `plunder_info`;
CREATE TABLE `plunder_info` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `plunder_user_id` int(11) NOT NULL COMMENT '掠夺方',
  `plundered_user_id` int(11) NOT NULL COMMENT '被掠夺方',
  `plunder_gold` varchar(100) NOT NULL COMMENT '掠夺金币',
  `is_friend` varchar(1) DEFAULT '0' COMMENT '是否好友 0:否 1:是',
  `is_day_first` varchar(1) DEFAULT NULL COMMENT '是否当日首次掠夺 0:否 1:是',
  `is_revenge` varchar(1) DEFAULT '0' COMMENT '是否已复仇 0:否 1:是',
  `create_time` datetime NOT NULL COMMENT '掠夺时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间(复仇时间)',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='掠夺记录';

-- ----------------------------
--  Table structure for `resource_param`
-- ----------------------------
DROP TABLE IF EXISTS `resource_param`;
CREATE TABLE `resource_param` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `dice_default_num` int(11) DEFAULT NULL COMMENT '投掷骰子次数',
  `dice_recover_time` varchar(20) DEFAULT NULL COMMENT '骰子恢复时间',
  `dice_max_value` int(11) DEFAULT NULL COMMENT '骰子最大数字',
  `dice_min_value` int(11) DEFAULT NULL COMMENT '骰子最小数字',
  `per_step_gold` int(10) DEFAULT NULL COMMENT '每步获得金币',
  `per_step_exp` int(10) DEFAULT NULL COMMENT '每步获得经验',
  `plunder_gold` varchar(10) DEFAULT NULL COMMENT '掠夺金币',
  `fatigue_max_num` int(10) DEFAULT NULL COMMENT '宠物疲劳上限',
  `fatigue_recover_time` varchar(10) DEFAULT NULL COMMENT '疲劳恢复速度',
  `friends_max_num` varchar(255) DEFAULT NULL COMMENT '好友上限',
  `reset_time` datetime DEFAULT NULL COMMENT '每日重置时间点',
  `match_range` int(11) DEFAULT NULL COMMENT '匹配等级范围',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='资源参数';

-- ----------------------------
--  Table structure for `train_info`
-- ----------------------------
DROP TABLE IF EXISTS `train_info`;
CREATE TABLE `train_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `train_name` varchar(20) NOT NULL COMMENT '建筑名称',
  `train_lv` int(11) NOT NULL COMMENT '建筑等级',
  `lv_up_gold` int(11) DEFAULT NULL COMMENT '升级所需金币',
  `lv_up_diamond` int(11) DEFAULT NULL COMMENT '升级所需钻石',
  `icon_path` varchar(100) DEFAULT NULL COMMENT 'icon路径',
  `main_properties` int(2) DEFAULT NULL COMMENT '主要提升属性（3力量，4魅力，5灵动，6优雅，7帅气）',
  `minor_properties1` int(2) DEFAULT NULL COMMENT '次要提升属性1（3力量，4魅力，5灵动，6优雅，7帅气）',
  `minor_properties2` int(2) DEFAULT NULL COMMENT '次要提升属性2（3力量，4魅力，5灵动，6优雅，7帅气）',
  `train_gold` int(11) DEFAULT NULL COMMENT '训练所需金币',
  `train_fatigue` int(11) DEFAULT NULL COMMENT '训练所需疲劳',
  `main_up` int(11) DEFAULT NULL COMMENT '主属性提升数值',
  `minor1_up` int(11) DEFAULT NULL COMMENT '次要属性1提升数值',
  `minor2_up` int(11) DEFAULT NULL COMMENT '次要属性2提升数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='训练信息';

-- ----------------------------
--  Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `user_wechat_id` varchar(20) DEFAULT NULL COMMENT '微信账号ID',
  `nick_name` varchar(20) NOT NULL COMMENT '昵称',
  `mobile` varchar(20) DEFAULT NULL COMMENT '手机',
  `email` varchar(30) DEFAULT NULL COMMENT '邮箱',
  `token` varchar(50) NOT NULL COMMENT 'TOKEN',
  `invite_code` varchar(20) DEFAULT NULL COMMENT '邀请码',
  `reference` int(11) DEFAULT NULL COMMENT '推荐人',
  `vip_lv` varchar(5) DEFAULT '0' COMMENT 'vip等级',
  `total_recharge` varchar(100) DEFAULT NULL COMMENT '充值总额',
  `img_path` varchar(100) DEFAULT NULL COMMENT '头像路径',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
--  Table structure for `user_chat`
-- ----------------------------
DROP TABLE IF EXISTS `user_chat`;
CREATE TABLE `user_chat` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `user1` int(11) NOT NULL COMMENT '用户1',
  `user2` int(11) DEFAULT NULL COMMENT '用户2',
  `content` varchar(500) NOT NULL COMMENT '聊天内容',
  `chat_type` varchar(1) NOT NULL COMMENT '聊天类型 1:好友 2:世界',
  `chat_time` datetime NOT NULL COMMENT '发言时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户聊天信息';

-- ----------------------------
--  Table structure for `user_friend`
-- ----------------------------
DROP TABLE IF EXISTS `user_friend`;
CREATE TABLE `user_friend` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `user_id` int(11) NOT NULL COMMENT '用户ID',
  `friend_id` int(11) NOT NULL COMMENT '好友ID',
  `is_support` varchar(1) DEFAULT NULL COMMENT '是否点赞/送体力 0:否 1:是',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='好友信息';

-- ----------------------------
--  Table structure for `user_login_log`
-- ----------------------------
DROP TABLE IF EXISTS `user_login_log`;
CREATE TABLE `user_login_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `user_id` int(11) NOT NULL COMMENT '用户ID',
  `login_time` datetime NOT NULL COMMENT '登录时间',
  `login_device` varchar(100) DEFAULT NULL COMMENT '登录设备',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='登录日志';

-- ----------------------------
--  Table structure for `user_map`
-- ----------------------------
DROP TABLE IF EXISTS `user_map`;
CREATE TABLE `user_map` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `user_id` int(11) NOT NULL COMMENT '用户ID',
  `map_id` int(11) NOT NULL COMMENT '地图编号',
  `map_plot_id` int(11) NOT NULL COMMENT '当前地块',
  `circle_num` int(11) DEFAULT NULL COMMENT '圈数',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户地图信息';

-- ----------------------------
--  Table structure for `user_recharge`
-- ----------------------------
DROP TABLE IF EXISTS `user_recharge`;
CREATE TABLE `user_recharge` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `user_id` int(11) NOT NULL COMMENT '用户ID',
  `create_time` datetime DEFAULT NULL COMMENT '充值时间',
  `recharge_money` varchar(10) DEFAULT NULL COMMENT '充值金额',
  `is_first` varchar(1) DEFAULT '0' COMMENT '是否首充 0：否 1:是',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户充值记录';

-- ----------------------------
--  Table structure for `user_resource`
-- ----------------------------
DROP TABLE IF EXISTS `user_resource`;
CREATE TABLE `user_resource` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `dice_num` int(11) NOT NULL COMMENT '骰子次数',
  `fatigue_num` int(11) NOT NULL COMMENT '疲劳值',
  `gold` int(11) NOT NULL COMMENT '金币',
  `diamond` int(11) NOT NULL COMMENT '经验',
  `dice_reset_time` datetime DEFAULT NULL COMMENT '骰子上限',
  `fatigue_reset_time` datetime DEFAULT NULL COMMENT '疲劳上限',
  `dice_max_num` int(11) DEFAULT NULL COMMENT '骰子上限',
  `fatigue_max_num` int(11) DEFAULT NULL COMMENT '疲劳上限',
  `gold_addition` varchar(10) DEFAULT NULL COMMENT '金币加成',
  `diamond_addition` varchar(10) DEFAULT NULL COMMENT '钻石加成',
  `continous_login_days` int(11) DEFAULT NULL COMMENT '连续登录天数',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户资源信息';

-- ----------------------------
--  Table structure for `user_train`
-- ----------------------------
DROP TABLE IF EXISTS `user_train`;
CREATE TABLE `user_train` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `user_id` int(11) NOT NULL COMMENT '用户ID',
  `train_id` int(11) NOT NULL COMMENT '训练ID',
  `update_time` datetime DEFAULT NULL COMMENT '升级时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户训练信息';

-- ----------------------------
--  Table structure for `user_train_log`
-- ----------------------------
DROP TABLE IF EXISTS `user_train_log`;
CREATE TABLE `user_train_log` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `user_id` int(11) NOT NULL COMMENT '用户ID',
  `train_id` int(11) NOT NULL COMMENT '训练id',
  `main_properties` int(2) DEFAULT NULL COMMENT '主要提升属性（3力量，4魅力，5灵动，6优雅，7帅气）',
  `minor_properties1` int(2) DEFAULT NULL COMMENT '次要提升属性1（3力量，4魅力，5灵动，6优雅，7帅气）',
  `minor_properties2` int(2) DEFAULT NULL COMMENT '次要提升属性2（3力量，4魅力，5灵动，6优雅，7帅气）',
  `main_up` int(11) DEFAULT NULL COMMENT '主属性提升数值',
  `minor1_up` int(11) DEFAULT NULL COMMENT '次要属性1提升数值',
  `minor2_up` int(11) DEFAULT NULL COMMENT '次要属性2提升数值',
  `create_time` datetime DEFAULT NULL COMMENT '训练时间',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户训练记录';

SET FOREIGN_KEY_CHECKS = 1;
