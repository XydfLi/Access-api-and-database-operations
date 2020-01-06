-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: weatherconditions
-- ------------------------------------------------------
-- Server version	8.0.17

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

--
-- Table structure for table `livewea`
--

DROP TABLE IF EXISTS `livewea`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `livewea` (
  `adcode` char(10) DEFAULT NULL,
  `weather` char(20) DEFAULT NULL,
  `temperature` char(10) DEFAULT NULL,
  `winddirection` char(10) DEFAULT NULL,
  `windpower` char(10) DEFAULT NULL,
  `humidity` char(10) DEFAULT NULL,
  `reporttime` char(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `livewea`
--

LOCK TABLES `livewea` WRITE;
/*!40000 ALTER TABLE `livewea` DISABLE KEYS */;
INSERT INTO `livewea` VALUES ('110000','多云','2','东北','≤3','77','2020-01-06 16:04:49'),('120000','阴','0','北','≤3','96','2020-01-06 16:03:40'),('130000','阴','1','北','≤3','74','2020-01-06 16:01:20'),('140000','多云','1','西南','≤3','74','2020-01-06 16:04:19'),('210000','阴','0','东','≤3','77','2020-01-06 15:55:07'),('220000','阴','-1','东南','≤3','57','2020-01-06 16:03:23'),('230000','多云','-7','东','≤3','74','2020-01-06 15:53:37'),('310000','多云','21','西','≤3','65','2020-01-06 15:56:36'),('320000','阴','12','西北','≤3','97','2020-01-06 15:56:10'),('330000','多云','24','南','≤3','51','2020-01-06 16:00:56'),('340000','雨','5','西北','≤3','99','2020-01-06 15:58:01'),('350000','多云','24','东南','≤3','53','2020-01-06 15:58:30'),('360000','多云','24','东南','≤3','52','2020-01-06 16:00:29'),('370000','阴','1','东北','≤3','98','2020-01-06 15:55:34'),('410000','雨夹雪','2','西北','≤3','99','2020-01-06 15:52:29'),('420000','阴','5','东北','≤3','96','2020-01-06 15:54:39'),('430000','阴','9','西','≤3','91','2020-01-06 15:58:52'),('440000','阴','24','西南','≤3','61','2020-01-06 15:51:54'),('460000','多云','25','东北','≤3','78','2020-01-06 15:59:25'),('500000','雨','10','西北','≤3','87','2020-01-06 15:57:32'),('510000','阴','11','东北','≤3','60','2020-01-06 16:02:33'),('520000','阴','15','南','≤3','87','2020-01-06 15:57:09'),('530000','阴','15','西','≤3','59','2020-01-06 16:03:44'),('610000','阴','4','西北','≤3','90','2020-01-06 15:56:41'),('620000','多云','-1','北','≤3','56','2020-01-06 16:02:09'),('630000','多云','-1','东','≤3','58','2020-01-06 15:59:32'),('710000','晴','20','东北','≤3','77','2020-01-06 16:02:09');
/*!40000 ALTER TABLE `livewea` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-01-06 16:10:32
