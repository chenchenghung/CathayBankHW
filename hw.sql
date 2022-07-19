-- MariaDB dump 10.19  Distrib 10.4.24-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: hw
-- ------------------------------------------------------
-- Server version	10.4.24-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `coin`
--

DROP TABLE IF EXISTS `coin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `coin` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `zhcode` varchar(3) NOT NULL,
  `code` varchar(6) NOT NULL,
  `symbol` varchar(20) NOT NULL,
  `rate` varchar(20) NOT NULL,
  `description` varchar(50) NOT NULL,
  `ratefloat` double(9,4) DEFAULT NULL,
  `updated` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `coin`
--

LOCK TABLES `coin` WRITE;
/*!40000 ALTER TABLE `coin` DISABLE KEYS */;
INSERT INTO `coin` VALUES (1,'美元','USD','&#36;','20,712.7038','United States Dollar',20712.7031,'2022-07-17'),(4,'英鎊','GBP','&pound;','17,307.3696','British Pound Sterling',17307.3696,'2022-07-18'),(5,'英鎊','GBP','&pound;','17,307.169','British Pound Sterling',17307.3169,'2022-07-18'),(6,'美金','USD','&#36;','22,127.1874','United States Dollar',NULL,'2022-07-19'),(7,'英鎊','GBP','&pound;','18,489.3007','British Pound Sterling',NULL,'2022-07-19'),(8,'歐元','EUR','&euro;','21,555.1111','Euro',NULL,'2022-07-19'),(9,'美金','USD','&#36;','22,102.7507','United States Dollar',NULL,'2022-07-19'),(10,'英鎊','GBP','&pound;','18,468.8817','British Pound Sterling',NULL,'2022-07-19'),(11,'歐元','EUR','&euro;','21,531.3062','Euro',NULL,'2022-07-19'),(12,'美金','USD','&#36;','22,070.0983','United States Dollar',NULL,'2022-07-19'),(13,'英鎊','GBP','&pound;','18,441.5975','British Pound Sterling',NULL,'2022-07-19'),(14,'歐元','EUR','&euro;','21,499.4979','Euro',NULL,'2022-07-19'),(15,'美金','USD','&#36;','22,044.9767','United States Dollar',NULL,'2022-07-19'),(16,'英鎊','GBP','&pound;','18,420.6062','British Pound Sterling',NULL,'2022-07-19'),(17,'歐元','EUR','&euro;','21,475.0259','Euro',NULL,'2022-07-19'),(18,'美金','USD','&#36;','22,003.8250','United States Dollar',NULL,'2022-07-19'),(19,'英鎊','GBP','&pound;','18,386.2202','British Pound Sterling',NULL,'2022-07-19'),(20,'歐元','EUR','&euro;','21,434.9381','Euro',NULL,'2022-07-19'),(21,'美金','USD','&#36;','21,965.1174','United States Dollar',NULL,'2022-07-19'),(22,'英鎊','GBP','&pound;','18,353.8764','British Pound Sterling',NULL,'2022-07-19'),(23,'歐元','EUR','&euro;','21,397.2312','Euro',NULL,'2022-07-19'),(24,'美金','USD','&#36;','21,919.5285','United States Dollar',NULL,'2022-07-19'),(25,'英鎊','GBP','&pound;','18,315.7827','British Pound Sterling',NULL,'2022-07-19'),(26,'歐元','EUR','&euro;','21,352.8210','Euro',NULL,'2022-07-19');
/*!40000 ALTER TABLE `coin` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-19 17:59:33
