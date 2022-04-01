CREATE TABLE `user` (
                        `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
                        `name` varchar(255) COLLATE utf8mb4_bin NOT NULL COMMENT '账户名',
                        `password` varchar(255) COLLATE utf8mb4_bin NOT NULL COMMENT '账户密码',
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

INSERT INTO `user` VALUES (1, 'admin', '123456');
INSERT INTO `user` VALUES (2, 'rudecrab', '654321');