use demo_users;

CREATE TABLE `user` (
  `id` varchar(50) NOT NULL,
  `first_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `username` varchar(25) NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`)
);

CREATE TABLE `userrole` (
  `id` varchar(50) NOT NULL,
  `user_id` varchar(50) NOT NULL,
  `scope` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
);