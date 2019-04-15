-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: staff
-- ------------------------------------------------------
-- Server version	8.0.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `department` (
  `deptid` int(11) NOT NULL AUTO_INCREMENT,
  `deptname` varchar(45) DEFAULT NULL,
  `deptdetails` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`deptid`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `department`
--

LOCK TABLES `department` WRITE;
/*!40000 ALTER TABLE `department` DISABLE KEYS */;
INSERT INTO `department` VALUES (2,'Sales','medium priority'),(3,'Sanu','High priority'),(4,'AI','not enough'),(5,'','machine Learning'),(6,'clerk','very tough'),(7,'',''),(8,'',''),(9,'vikas','coding'),(10,'chacha','seth ji'),(11,'chahi','sethani'),(12,'edff','yyuio'),(13,'ihgdhg','eoigusog'),(14,'sdghlg','ygsguai'),(15,'',''),(16,'',''),(17,'sale','new product department'),(18,'',''),(19,'',''),(20,'',''),(21,'',''),(22,'',''),(23,'',''),(24,'q123','poiii'),(25,'ksgj;kdjg\'','gvklfjglkdfjb');
/*!40000 ALTER TABLE `department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employees`
--

DROP TABLE IF EXISTS `employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `employees` (
  `empid` int(11) NOT NULL AUTO_INCREMENT,
  `empname` varchar(45) DEFAULT NULL,
  `deptid` int(11) DEFAULT NULL,
  `designation` varchar(45) DEFAULT NULL,
  `doj` date DEFAULT NULL,
  `salary` int(11) DEFAULT NULL,
  PRIMARY KEY (`empid`)
) ENGINE=InnoDB AUTO_INCREMENT=120 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employees`
--

LOCK TABLES `employees` WRITE;
/*!40000 ALTER TABLE `employees` DISABLE KEYS */;
INSERT INTO `employees` VALUES (102,'vikas',1,'clecrk','2012-12-12',40000),(103,'vikas',1,'clecrk','2012-12-12',40000),(104,'vikas',1,'clecrk','2012-12-12',40000),(105,'vikas',1,'clecrk','2012-12-12',40000),(106,'sanu',2,'Manager','2010-10-10',400000),(107,'sanu',2,'Manager','2010-10-10',400000),(108,'sanu',2,'Manager','2010-10-10',400000),(109,'sanu',2,'Manager','2010-10-10',400000),(110,'sanu',2,'Manager','2010-10-10',400000),(111,'veer',3,'CEO','2015-10-19',4000000),(112,'veer',3,'CEO','2015-10-19',4000000),(113,'veer',3,'CEO','2015-10-19',4000000),(114,'veer',3,'CEO','2015-10-19',4000000),(115,'vikas',2,'CEO','2014-12-24',500000),(118,'sgkfh',3,'jashjh','2010-10-12',2000),(119,'manish',23,'manager','2011-01-01',10000);
/*!40000 ALTER TABLE `employees` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-15 22:16:44
