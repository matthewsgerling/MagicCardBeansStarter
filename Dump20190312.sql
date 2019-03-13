-- MySQL dump 10.13  Distrib 8.0.14, for Win64 (x86_64)
--
-- Host: localhost    Database: magiccardbean
-- ------------------------------------------------------
-- Server version	8.0.14

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
-- Table structure for table `cards`
--

DROP TABLE IF EXISTS `cards`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `cards` (
  `cardid` int(11) NOT NULL AUTO_INCREMENT,
  `card_name` varchar(45) NOT NULL,
  `card_type` varchar(45) NOT NULL,
  `manacost` varchar(45) NOT NULL,
  `card_attack` varchar(45) NOT NULL,
  `card_defence` varchar(45) NOT NULL,
  `cards_in_deck` varchar(45) NOT NULL,
  `deck_name` varchar(45) NOT NULL,
  PRIMARY KEY (`cardid`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cards`
--

LOCK TABLES `cards` WRITE;
/*!40000 ALTER TABLE `cards` DISABLE KEYS */;
INSERT INTO `cards` VALUES (1,'Test Card','Test Type','1','2','3','',''),(2,'Matt','human','2','2','2','10','test'),(3,'Matt','human','2','2','2','10','test'),(4,'Matt','Human','1','2','3','20','My Deck'),(5,'Matt','human','2','2','2','10','test'),(6,'Matt','Human','1','2','3','20','My Deck'),(7,'Matt','human','2','2','2','10','test'),(8,'Matt','Human','1','2','3','20','My Deck'),(9,'Matt','human','2','2','2','10','test'),(10,'Matt','Human','1','2','3','20','My Deck'),(11,'Matt','human','2','2','2','10','test'),(12,'Matt','Human','1','2','3','20','My Deck'),(13,'Matt','human','2','2','2','10','test'),(14,'Matt','Human','1','2','3','20','My Deck'),(15,'Matt','human','2','2','2','10','test'),(16,'Matt','Human','1','2','3','20','My Deck');
/*!40000 ALTER TABLE `cards` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-03-12 20:50:00
