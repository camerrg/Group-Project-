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
-- Table structure for table `presenter`
--

DROP TABLE IF EXISTS `presenter`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `presenter` (
  `PRESENTER_ID` int(11) NOT NULL AUTO_INCREMENT,
  `PRESENTER_NAME` varchar(30) NOT NULL,
  PRIMARY KEY (`PRESENTER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `presenter`
--

LOCK TABLES `presenter` WRITE;
/*!40000 ALTER TABLE `presenter` DISABLE KEYS */;
INSERT INTO `presenter` VALUES (1,'Bill'),(2,'Bill'),(3,'Bill'),(4,'Bill'),(5,'Bill'),(6,'Bill'),(7,'Susan'),(8,'Susan'),(9,'Susan'),(10,'Susan'),(11,'Susan'),(12,'Susan'),(14,'Susan'),(15,'Susan'),(16,'Susan'),(17,'Susan'),(18,'Sus'),(19,'Sus'),(20,'Barbara'),(21,'Sara'),(22,'Jack'),(23,'Barbara'),(24,'Larry'),(25,'Lori'),(26,'Lori'),(27,'Killerman'),(28,'Killerman'),(29,'Kelly');
/*!40000 ALTER TABLE `presenter` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-03-22  0:23:23
