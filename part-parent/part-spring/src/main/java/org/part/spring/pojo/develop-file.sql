/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.5.28-log : Database - develop
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`develop` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `develop`;

/*Table structure for table `trace_develop` */

DROP TABLE IF EXISTS `trace_develop`;

CREATE TABLE `trace_develop` (
  `trace_id` int(16) NOT NULL AUTO_INCREMENT,
  `trace_file_name` varchar(64) DEFAULT NULL,
  `file_create_time` date DEFAULT NULL COMMENT '文件创建时间',
  `file_last_update_time` date DEFAULT NULL COMMENT '最后一次修改时间',
  `file_type` varchar(64) DEFAULT NULL COMMENT '记录：文件夹、txt文件、doc文件等',
  `file_size` int(64) DEFAULT NULL COMMENT '文件夹、文件大小',
  PRIMARY KEY (`trace_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `trace_develop` */

insert  into `trace_develop`(`trace_id`,`trace_file_name`,`file_create_time`,`file_last_update_time`,`file_type`,`file_size`) values (1,'a.txt','2019-11-29','2019-11-29','文件',1),(2,'nginx','2019-11-29','2019-11-29',NULL,0),(3,'nginx.rar','2019-11-29','2019-11-29','文件',1),(4,'repository-spring','2019-11-29','2019-11-29',NULL,0),(5,'tomcat_8.1','2019-11-29','2019-11-29',NULL,0),(6,'tomcat_8.2','2019-11-29','2019-11-29',NULL,0),(7,'tomcat_8111.rar','2019-11-29','2019-11-29','文件',1),(8,'tomcat_8222.rar','2019-11-29','2019-11-29','文件',1),(9,'zheng','2019-11-29','2019-11-29',NULL,0),(10,'新建文本文档.pdf','2019-11-29','2019-11-29','文件',1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
