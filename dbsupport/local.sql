CREATE SCHEMA IF NOT EXISTS demo_users CHARACTER SET = 'utf16';
CREATE USER IF NOT EXISTS 'demo'@'%' IDENTIFIED BY 'logmein';
GRANT ALL PRIVILEGES ON demo_users.* TO 'demo'@'%' IDENTIFIED by 'logmein';


CREATE TABLE `user` (
  `id` varchar(50) NOT NULL,
  `first_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `username` varchar(25) NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf16;

CREATE TABLE `userrole` (
  `user_id` varchar(50) NOT NULL,
  `scope` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16;