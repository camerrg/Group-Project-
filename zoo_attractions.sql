-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: cis175.ctbyl9xuofqy.us-east-2.rds.amazonaws.com    Database: zoo
-- ------------------------------------------------------
-- Server version	5.7.22-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `attractions`
--

DROP TABLE IF EXISTS `attractions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `attractions` (
  `LOCATION_ID` int(11) NOT NULL AUTO_INCREMENT,
  `LOCATION_NAME` varchar(30) DEFAULT NULL,
  `TRIP_DATE` date DEFAULT NULL,
  `PRESENTER_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`LOCATION_ID`),
  KEY `PRESENTER_ID` (`PRESENTER_ID`),
  CONSTRAINT `attractions_ibfk_1` FOREIGN KEY (`PRESENTER_ID`) REFERENCES `presenter` (`PRESENTER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attractions`
--

LOCK TABLES `attractions` WRITE;
/*!40000 ALTER TABLE `attractions` DISABLE KEYS */;
INSERT INTO `attractions` VALUES (1,'Bill\'s List','2020-03-20',1),(2,'Bill\'s List','2020-03-20',2),(3,'Bill\'s List','2020-03-20',3),(4,'Bill\'s List','2020-03-20',4),(5,'Bill\'s List','2020-03-20',5),(6,'Bill\'s List','2020-03-20',6),(8,'Susan\'s List','2020-03-21',15),(9,'Susan\'s List','2020-03-21',17),(10,'Susan\'s List','2020-03-21',18),(11,'Susan\'s List','2020-03-21',19),(12,'Barbara\'s List','2020-03-21',20),(13,'East Water','2020-03-20',21),(14,'SouthLand','2020-03-20',22),(15,'Barbara\'s List','2020-03-21',23),(16,'West Prarie','2020-04-02',24),(17,'East River','2020-02-14',25),(18,'East River','2020-02-14',26);
/*!40000 ALTER TABLE `attractions` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-03-22  0:23:13
