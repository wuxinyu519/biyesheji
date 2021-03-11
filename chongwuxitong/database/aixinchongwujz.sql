SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------

-- ----------------------------

-- Table structure for aixinchongwujz

-- ----------------------------

DROP TABLE IF EXISTS `t_admin`;

CREATE TABLE `t_admin` (`id` int(11) NOT NULL AUTO_INCREMENT COMMENT '管理员id',`username` varchar(255) DEFAULT NULL COMMENT '账号',`password` varchar(255) DEFAULT NULL COMMENT '密码',PRIMARY KEY (`id`)

) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='管理员';


-- ----------------------------

DROP TABLE IF EXISTS `t_yonghu`;

CREATE TABLE `t_yonghu` (`id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',`mingzi` varchar(255) DEFAULT NULL COMMENT '名字',`username` varchar(255) DEFAULT NULL COMMENT '账号',`password` varchar(255) DEFAULT NULL COMMENT '密码',`xingbie` varchar(255) DEFAULT NULL COMMENT '性别',`jieshao` varchar(500) DEFAULT NULL COMMENT '介绍',PRIMARY KEY (`id`)

) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='用户';


-- ----------------------------

DROP TABLE IF EXISTS `t_liulangchongwu`;

CREATE TABLE `t_liulangchongwu` (`id` int(11) NOT NULL AUTO_INCREMENT COMMENT '流浪宠物id',`mingzi` varchar(255) DEFAULT NULL COMMENT '名字',`tupian` varchar(255) DEFAULT NULL COMMENT '图片',`jieshao` varchar(500) DEFAULT NULL COMMENT '介绍',`zhuyi` varchar(500) DEFAULT NULL COMMENT '注意事项',`leibie` varchar(255) DEFAULT NULL COMMENT '类别',`leibieid` int(11) DEFAULT NULL COMMENT '类别id',`state` varchar(255) DEFAULT NULL COMMENT '状态',PRIMARY KEY (`id`)

) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='流浪宠物';


-- ----------------------------

DROP TABLE IF EXISTS `t_leibie`;

CREATE TABLE `t_leibie` (`id` int(11) NOT NULL AUTO_INCREMENT COMMENT '类别id',`mingcheng` varchar(255) DEFAULT NULL COMMENT '名称',PRIMARY KEY (`id`)

) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='类别';


-- ----------------------------

DROP TABLE IF EXISTS `t_lingyang`;

CREATE TABLE `t_lingyang` (`id` int(11) NOT NULL AUTO_INCREMENT COMMENT '领养id',`liulangchongwu` varchar(255) DEFAULT NULL COMMENT '宠物',`liulangchongwuid` int(11) DEFAULT NULL COMMENT '宠物id',`yonghu` varchar(255) DEFAULT NULL COMMENT '用户',`yonghuid` int(11) DEFAULT NULL COMMENT '用户id',`lyriqi` varchar(255) DEFAULT NULL COMMENT '领养日期',PRIMARY KEY (`id`)

) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='领养';


-- ----------------------------

DROP TABLE IF EXISTS `t_liulangchongwupinglun`;

CREATE TABLE `t_liulangchongwupinglun` (`id` int(11) NOT NULL AUTO_INCREMENT COMMENT '宠物评论id',`liulangchongwu` varchar(255) DEFAULT NULL COMMENT '宠物',`liulangchongwuid` int(11) DEFAULT NULL COMMENT '宠物id',`neirong` varchar(500) DEFAULT NULL COMMENT '内容',`pinglunrenmingzi` varchar(255) DEFAULT NULL COMMENT '评论人名字',`pinglunrenid` int(11) DEFAULT NULL COMMENT '评论人id',`pinglunshijian` varchar(255) DEFAULT NULL COMMENT '评论时间',PRIMARY KEY (`id`)

) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='宠物评论';


-- ----------------------------

DROP TABLE IF EXISTS `t_chongwuzixun`;

CREATE TABLE `t_chongwuzixun` (`id` int(11) NOT NULL AUTO_INCREMENT COMMENT '宠物资讯id',`biaoti` varchar(255) DEFAULT NULL COMMENT '标题',`fabushijian` varchar(255) DEFAULT NULL COMMENT '发布时间',`neirong` varchar(500) DEFAULT NULL COMMENT '内容',`fengmian` varchar(255) DEFAULT NULL COMMENT '封面',PRIMARY KEY (`id`)

) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='宠物资讯';


-- ----------------------------

DROP TABLE IF EXISTS `t_xitongshuoming`;

CREATE TABLE `t_xitongshuoming` (`id` int(11) NOT NULL AUTO_INCREMENT COMMENT '系统说明id',`biaoti` varchar(255) DEFAULT NULL COMMENT '标题',`mokuai` varchar(255) DEFAULT NULL COMMENT '模块',`neirong` varchar(500) DEFAULT NULL COMMENT '内容',PRIMARY KEY (`id`)

) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='系统说明';


-- ----------------------------

DROP TABLE IF EXISTS `t_dongtai`;

CREATE TABLE `t_dongtai` (`id` int(11) NOT NULL AUTO_INCREMENT COMMENT '动态id',`biaoti` varchar(255) DEFAULT NULL COMMENT '标题',`fabushijian` varchar(255) DEFAULT NULL COMMENT '发布时间',`neirong` varchar(500) DEFAULT NULL COMMENT '内容',`yonghu` varchar(255) DEFAULT NULL COMMENT '用户',`yonghuid` int(11) DEFAULT NULL COMMENT '用户id',`pic` varchar(255) DEFAULT NULL COMMENT '封面',PRIMARY KEY (`id`)

) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='动态';


-- ----------------------------

DROP TABLE IF EXISTS `t_dongtaipinglun`;

CREATE TABLE `t_dongtaipinglun` (`id` int(11) NOT NULL AUTO_INCREMENT COMMENT '动态回复id',`dongtai` varchar(255) DEFAULT NULL COMMENT '动态',`dongtaiid` int(11) DEFAULT NULL COMMENT '动态id',`neirong` varchar(500) DEFAULT NULL COMMENT '内容',`pinglunrenmingzi` varchar(255) DEFAULT NULL COMMENT '回复人',`pinglunrenid` int(11) DEFAULT NULL COMMENT '回复人id',`pinglunshijian` varchar(255) DEFAULT NULL COMMENT '回复时间',PRIMARY KEY (`id`)

) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='动态回复';




