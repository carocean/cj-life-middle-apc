-- MySQL dump 10.13  Distrib 8.0.29, for macos12.2 (x86_64)
--
-- Host: 192.168.43.63    Database: life.apc
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
SET @MYSQLDUMP_TEMP_LOG_BIN = @@SESSION.SQL_LOG_BIN;
SET @@SESSION.SQL_LOG_BIN= 0;

--
-- GTID state at the beginning of the backup 
--

SET @@GLOBAL.GTID_PURGED=/*!80000 '+'*/ 'e7063ee0-ef8e-11ec-9c08-0242ac150005:1-12,
f08e590a-ef8e-11ec-afcf-0242ac150005:1-1138';

--
-- Table structure for table `apc_channel`
--

DROP TABLE IF EXISTS `apc_channel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `apc_channel` (
  `channel_id` varchar(50) NOT NULL COMMENT '频道标识',
  `channel_name` varchar(20) NOT NULL COMMENT '频道名',
  `order_num` int NOT NULL DEFAULT '0' COMMENT '顺序',
  `note` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`channel_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='频道';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `apc_channel`
--

LOCK TABLES `apc_channel` WRITE;
/*!40000 ALTER TABLE `apc_channel` DISABLE KEYS */;
INSERT INTO `apc_channel` VALUES ('10961511735252817450','探索',0,NULL),('26528656326806907292','类别',6,NULL),('50559157935675001826','工作',2,NULL),('54226435404631052269','更新',7,NULL),('81706425150960582956','开发',5,NULL),('82001603459255840189','创作',1,NULL),('91391254633115278679','游戏',3,NULL);
/*!40000 ALTER TABLE `apc_channel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `apc_portlet`
--

DROP TABLE IF EXISTS `apc_portlet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `apc_portlet` (
  `portlet_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '栏目标识',
  `portlet_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '栏目名',
  `show_mode` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT 'list' COMMENT '显示模式：list|alone|waterfall',
  `create_time` varchar(17) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `portlet_note` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`portlet_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='频道栏目';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `apc_portlet`
--

LOCK TABLES `apc_portlet` WRITE;
/*!40000 ALTER TABLE `apc_portlet` DISABLE KEYS */;
INSERT INTO `apc_portlet` VALUES ('33478340546766472708','栏目2','list','20220724224336892',NULL),('37814128706988183890','栏目3','list','20220724224340988',NULL),('53208308445376095111','栏目1','list','20220724224334315',NULL),('98345960311447620787','栏目4','list','20220724224344471',NULL);
/*!40000 ALTER TABLE `apc_portlet` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dim_category`
--

DROP TABLE IF EXISTS `dim_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dim_category` (
  `cate_id` varchar(50) NOT NULL COMMENT '类别标识',
  `cate_name` varchar(50) NOT NULL COMMENT '类别名',
  `order_num` int NOT NULL DEFAULT '0',
  `cate_note` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`cate_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='类别维';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dim_category`
--

LOCK TABLES `dim_category` WRITE;
/*!40000 ALTER TABLE `dim_category` DISABLE KEYS */;
INSERT INTO `dim_category` VALUES ('03146935680827589445','类别1',0,NULL),('15107705186566100283','类别4',3,NULL),('52895475926218891437','类别3',2,NULL),('87865551500510210245','类别2',1,NULL);
/*!40000 ALTER TABLE `dim_category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dim_country`
--

DROP TABLE IF EXISTS `dim_country`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dim_country` (
  `country_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '标识',
  `cn_name` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '中文名',
  `en_name` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '英文名',
  `alpha2_code` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '二字母码',
  `alpha3_code` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '三字母码',
  `numeric_code` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '数字代码',
  `area_code` varchar(10) NOT NULL COMMENT '国际电话区号',
  PRIMARY KEY (`country_id`),
  KEY `dim_country_en_name_IDX` (`en_name`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='国家维度';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dim_country`
--

LOCK TABLES `dim_country` WRITE;
/*!40000 ALTER TABLE `dim_country` DISABLE KEYS */;
INSERT INTO `dim_country` VALUES ('68986138721','中国','China','CN','CHN','156','86');
/*!40000 ALTER TABLE `dim_country` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dim_terminal`
--

DROP TABLE IF EXISTS `dim_terminal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dim_terminal` (
  `terminal_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '终端标识',
  `terminal_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '终端名',
  `terminal_note` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '终端说明',
  `order_num` int NOT NULL DEFAULT '0',
  PRIMARY KEY (`terminal_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='终端维度，如：生命app，生命小程序，微信小程序等等';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dim_terminal`
--

LOCK TABLES `dim_terminal` WRITE;
/*!40000 ALTER TABLE `dim_terminal` DISABLE KEYS */;
INSERT INTO `dim_terminal` VALUES ('29711043777','终端1',NULL,0),('35785888797','终端2',NULL,1),('70779664564','终端3',NULL,2);
/*!40000 ALTER TABLE `dim_terminal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fact_app`
--

DROP TABLE IF EXISTS `fact_app`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fact_app` (
  `app_id` varchar(50) NOT NULL COMMENT '应用标识，对应uc中的真实app_id',
  `cate_id` varchar(50) NOT NULL COMMENT '类别标识',
  `terminal_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '终端标识',
  `country_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '国家代码表',
  `charge_mode` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '要价标识:free|pay',
  `cate_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '庸余字段：分类名',
  `terminal_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '庸余字段：终端名',
  `country_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '庸余字段：国家名',
  `charge_name` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '庸余字段：要价中文称呼',
  `app_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '应用名',
  `app_icon` varchar(250) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '应用图标',
  `newest_version` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '最新版本号',
  `pub_time` varchar(17) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '发布时间',
  `app_developer` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '应用开发者',
  `app_supplier` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '供应商：即开发者的公司',
  `app_tenant` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '来自租户名',
  `app_slogan` varchar(100) NOT NULL COMMENT '广告语或口号',
  `empl_unit_price` decimal(20,2) NOT NULL DEFAULT '0.00' COMMENT '员工购买价',
  `tenant_unit_price` decimal(20,2) NOT NULL DEFAULT '0.00' COMMENT '租户购买单价',
  `app_note` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '应用描述',
  PRIMARY KEY (`app_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='事实表：应用';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fact_app`
--

LOCK TABLES `fact_app` WRITE;
/*!40000 ALTER TABLE `fact_app` DISABLE KEYS */;
INSERT INTO `fact_app` VALUES ('78385558764','03146935680827589445','29711043777','68986138721','free','类别1','终端1','中国','免费','控制面板','/e/t/1.jpg','1.0.0','20220727223224328','cj','郑州节点动力科技有限公司','节点动力','用于管理租户',0.00,0.00,'新增功能:-修改图片;-打开开关');
/*!40000 ALTER TABLE `fact_app` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fact_imgs`
--

DROP TABLE IF EXISTS `fact_imgs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fact_imgs` (
  `img_id` varchar(50) NOT NULL COMMENT '标识',
  `app_id` varchar(50) NOT NULL COMMENT '所属应用',
  `img_src` varchar(250) NOT NULL COMMENT '图片地址',
  `create_time` varchar(17) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `img_note` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`img_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='发布时应用描述图片';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fact_imgs`
--

LOCK TABLES `fact_imgs` WRITE;
/*!40000 ALTER TABLE `fact_imgs` DISABLE KEYS */;
INSERT INTO `fact_imgs` VALUES ('31381820720051288971','78385558764','/2/3.jpg','20220727223314049',NULL),('77771711528761863869','78385558764','/1/1.jpg','20220727223305800',NULL);
/*!40000 ALTER TABLE `fact_imgs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fact_versions`
--

DROP TABLE IF EXISTS `fact_versions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fact_versions` (
  `version_id` varchar(50) NOT NULL COMMENT '标识',
  `version_num` varchar(10) NOT NULL COMMENT '版本号',
  `app_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '应用标识',
  `pub_time` varchar(17) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '发布时间',
  `version_note` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '版本说明，拷贝应用描述',
  PRIMARY KEY (`version_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='发布的版本历史';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fact_versions`
--

LOCK TABLES `fact_versions` WRITE;
/*!40000 ALTER TABLE `fact_versions` DISABLE KEYS */;
INSERT INTO `fact_versions` VALUES ('64242398272093566515','1.0.0','78385558764','20220727223224374','新增功能:-修改图片;-打开开关');
/*!40000 ALTER TABLE `fact_versions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `follow_app_empl`
--

DROP TABLE IF EXISTS `follow_app_empl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `follow_app_empl` (
  `app_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '应用标识',
  `empl_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '员工标识',
  `follow_time` varchar(17) NOT NULL COMMENT '关注时间',
  PRIMARY KEY (`app_id`,`empl_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='员工购买的app，在life中user不能直接安装应用，必须在某个租户下作为员工才能安装应用。\n在员工通过uc安装应用时在应用中心留痕，因此apc和uc(desktop_iapp)都会有一份安装记录。但apc与uc的展示方式或许不同.';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `follow_app_empl`
--

LOCK TABLES `follow_app_empl` WRITE;
/*!40000 ALTER TABLE `follow_app_empl` DISABLE KEYS */;
/*!40000 ALTER TABLE `follow_app_empl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `follow_app_tenant`
--

DROP TABLE IF EXISTS `follow_app_tenant`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `follow_app_tenant` (
  `app_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '应用标识',
  `tenant_id` varchar(50) NOT NULL COMMENT '租户标识',
  `follow_time` varchar(17) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '关注时间',
  PRIMARY KEY (`app_id`,`tenant_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='租户购买的app。在租户通过uc安装应用时在应用中心留痕，因此apc和uc都会有一份安装记录。但apc与uc的展示方式或许不同.';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `follow_app_tenant`
--

LOCK TABLES `follow_app_tenant` WRITE;
/*!40000 ALTER TABLE `follow_app_tenant` DISABLE KEYS */;
/*!40000 ALTER TABLE `follow_app_tenant` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mt_portlet_app`
--

DROP TABLE IF EXISTS `mt_portlet_app`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mt_portlet_app` (
  `portlet_id` varchar(50) NOT NULL,
  `app_id` varchar(50) NOT NULL,
  `order_num` int NOT NULL DEFAULT '0',
  PRIMARY KEY (`portlet_id`,`app_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='向栏目挂载app';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mt_portlet_app`
--

LOCK TABLES `mt_portlet_app` WRITE;
/*!40000 ALTER TABLE `mt_portlet_app` DISABLE KEYS */;
INSERT INTO `mt_portlet_app` VALUES ('53208308445376095111','78385558764',0);
/*!40000 ALTER TABLE `mt_portlet_app` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mt_portlet_category`
--

DROP TABLE IF EXISTS `mt_portlet_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mt_portlet_category` (
  `portlet_id` varchar(50) NOT NULL,
  `cate_id` varchar(50) NOT NULL,
  `order_num` int NOT NULL DEFAULT '0' COMMENT '在类别中的顺序',
  PRIMARY KEY (`portlet_id`,`cate_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='挂载栏目到类别';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mt_portlet_category`
--

LOCK TABLES `mt_portlet_category` WRITE;
/*!40000 ALTER TABLE `mt_portlet_category` DISABLE KEYS */;
/*!40000 ALTER TABLE `mt_portlet_category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mt_portlet_channel`
--

DROP TABLE IF EXISTS `mt_portlet_channel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mt_portlet_channel` (
  `portlet_id` varchar(50) NOT NULL,
  `channel_id` varchar(50) NOT NULL,
  `order_num` int NOT NULL DEFAULT '0',
  PRIMARY KEY (`portlet_id`,`channel_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='挂载栏目到频道';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mt_portlet_channel`
--

LOCK TABLES `mt_portlet_channel` WRITE;
/*!40000 ALTER TABLE `mt_portlet_channel` DISABLE KEYS */;
INSERT INTO `mt_portlet_channel` VALUES ('37814128706988183890','10961511735252817450',1),('53208308445376095111','10961511735252817450',0),('98345960311447620787','10961511735252817450',2);
/*!40000 ALTER TABLE `mt_portlet_channel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'life.apc'
--
SET @@SESSION.SQL_LOG_BIN = @MYSQLDUMP_TEMP_LOG_BIN;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-27 23:19:22
