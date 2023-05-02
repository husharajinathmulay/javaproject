-- MySQL dump 10.13  Distrib 5.7.28, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: database_connection_task
-- ------------------------------------------------------
-- Server version	5.7.28-0ubuntu0.18.04.4

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tblAppParament`
--

DROP TABLE IF EXISTS `tblAppParament`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblAppParament` (
  `id` int(11) NOT NULL,
  `key_type` varchar(30) DEFAULT NULL,
  `key_value` int(11) DEFAULT NULL,
  `key_text` text,
  `cur_status` varchar(30) DEFAULT NULL,
  `lastupd_user` varchar(30) DEFAULT NULL,
  `lastupd_stamp` varchar(30) DEFAULT NULL,
  `creator_stamp` varchar(30) DEFAULT NULL,
  `creator_user` varchar(30) DEFAULT NULL,
  `seq_num` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblAppParament`
--

LOCK TABLES `tblAppParament` WRITE;
/*!40000 ALTER TABLE `tblAppParament` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblAppParament` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblCandidateBankDetails`
--

DROP TABLE IF EXISTS `tblCandidateBankDetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblCandidateBankDetails` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `candidate_id` int(11) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `account_number` varchar(20) DEFAULT NULL,
  `is_account_number_varified` int(1) DEFAULT NULL,
  `ifsc_code` varchar(10) DEFAULT NULL,
  `is_ifsc_code_varified` int(1) DEFAULT NULL,
  `pan_number` varchar(12) DEFAULT NULL,
  `is_pan_number_varified` int(1) DEFAULT NULL,
  `addhaar_number` varchar(12) DEFAULT NULL,
  `is_addhaar_number_varified` int(1) DEFAULT NULL,
  `creator_stamp` varchar(30) DEFAULT NULL,
  `creator_user` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `candidate_id` (`candidate_id`),
  CONSTRAINT `tblCandidateBankDetails_ibfk_1` FOREIGN KEY (`candidate_id`) REFERENCES `tblFellowShipCandidates` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblCandidateBankDetails`
--

LOCK TABLES `tblCandidateBankDetails` WRITE;
/*!40000 ALTER TABLE `tblCandidateBankDetails` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblCandidateBankDetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblCandidateDocuments`
--

DROP TABLE IF EXISTS `tblCandidateDocuments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblCandidateDocuments` (
  `id` int(11) NOT NULL,
  `candidate_id` int(11) DEFAULT NULL,
  `doc_type` varchar(20) DEFAULT NULL,
  `doc_path` text,
  `status` varchar(10) DEFAULT NULL,
  `creator_stamp` varchar(30) DEFAULT NULL,
  `creator_user` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `candidate_id` (`candidate_id`),
  CONSTRAINT `tblCandidateDocuments_ibfk_1` FOREIGN KEY (`candidate_id`) REFERENCES `tblFellowShipCandidates` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblCandidateDocuments`
--

LOCK TABLES `tblCandidateDocuments` WRITE;
/*!40000 ALTER TABLE `tblCandidateDocuments` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblCandidateDocuments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblCandidateQualification`
--

DROP TABLE IF EXISTS `tblCandidateQualification`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblCandidateQualification` (
  `id` int(11) NOT NULL,
  `candidate_id` int(11) DEFAULT NULL,
  `diploma` varchar(30) DEFAULT NULL,
  `degree_name` varchar(30) DEFAULT NULL,
  `is_degree_name_varified` int(1) DEFAULT NULL,
  `employee_decipline` varchar(30) DEFAULT NULL,
  `is_employee_decipline_varified` int(1) DEFAULT NULL,
  `passing_year` int(4) DEFAULT NULL,
  `is_passing_year_varified` int(1) DEFAULT NULL,
  `aggr_per` decimal(2,2) DEFAULT NULL,
  `is_aggr_per_varified` int(1) DEFAULT NULL,
  `final_year_per` decimal(2,2) DEFAULT NULL,
  `is_final_year_per_varified` int(1) DEFAULT NULL,
  `training_institude` varchar(50) DEFAULT NULL,
  `is_training_institude_varified` int(1) DEFAULT NULL,
  `training_duration_month` int(4) DEFAULT NULL,
  `is_training_duration_month_varified` int(1) DEFAULT NULL,
  `other_training` varchar(50) DEFAULT NULL,
  `is_other_training_varified` int(1) DEFAULT NULL,
  `creator_stamp` varchar(30) DEFAULT NULL,
  `creator_user` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `candidate_id` (`candidate_id`),
  CONSTRAINT `tblCandidateQualification_ibfk_1` FOREIGN KEY (`candidate_id`) REFERENCES `tblFellowShipCandidates` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblCandidateQualification`
--

LOCK TABLES `tblCandidateQualification` WRITE;
/*!40000 ALTER TABLE `tblCandidateQualification` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblCandidateQualification` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblCandidateTechStackAssignment`
--

DROP TABLE IF EXISTS `tblCandidateTechStackAssignment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblCandidateTechStackAssignment` (
  `id` int(11) NOT NULL,
  `requirement_id` int(11) DEFAULT NULL,
  `candidate_id` int(11) DEFAULT NULL,
  `assign_date` date DEFAULT NULL,
  `status` varchar(30) DEFAULT NULL,
  `creator_stamp` varchar(30) DEFAULT NULL,
  `creator_user` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `requirement_id` (`requirement_id`),
  KEY `candidate_id` (`candidate_id`),
  CONSTRAINT `tblCandidateTechStackAssignment_ibfk_1` FOREIGN KEY (`requirement_id`) REFERENCES `tblCompanyRequirement` (`id`) ON DELETE SET NULL,
  CONSTRAINT `tblCandidateTechStackAssignment_ibfk_2` FOREIGN KEY (`candidate_id`) REFERENCES `tblFellowShipCandidates` (`id`) ON DELETE SET NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblCandidateTechStackAssignment`
--

LOCK TABLES `tblCandidateTechStackAssignment` WRITE;
/*!40000 ALTER TABLE `tblCandidateTechStackAssignment` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblCandidateTechStackAssignment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblCompany`
--

DROP TABLE IF EXISTS `tblCompany`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblCompany` (
  `id` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `location` varchar(50) DEFAULT NULL,
  `status` int(1) DEFAULT NULL,
  `creator_stamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `creator_user` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblCompany`
--

LOCK TABLES `tblCompany` WRITE;
/*!40000 ALTER TABLE `tblCompany` DISABLE KEYS */;
INSERT INTO `tblCompany` VALUES (1,'Cabgimini','Matunga Mumbai','Mumbai',1,'2020-01-07 09:32:03',NULL),(2,'Accenture','KoperKairan Mumbai','Mumbai',1,'2020-01-07 10:00:07',NULL),(3,'Motichur','Thane Mumbai','Mumbai',1,'2020-01-07 10:00:10',NULL),(4,'Amdoc','Magrpata Pune','Pune',1,'2020-01-07 10:00:12',NULL),(5,'Accenture','Hinjewadi Pune','Pune',1,'2020-01-07 10:00:13',NULL),(6,'Yatra','Thane Mumbai','Mumbai',1,'2020-01-07 10:00:15',NULL),(7,'BookMyShow','CityCafe Bengluru','Bengluru',1,'2020-01-07 10:00:16',NULL),(8,'TCS','Hinjewadi Pune','Pune',1,'2020-01-07 10:00:18',NULL),(9,'BirlaSoft','Hinjewadi Pune','Pune',1,'2020-01-07 12:13:59',NULL),(10,'Atos Syntel','Hinjewadi Pune','Pune',1,'2020-01-07 12:13:58',NULL);
/*!40000 ALTER TABLE `tblCompany` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblCompanyRequirement`
--

DROP TABLE IF EXISTS `tblCompanyRequirement`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblCompanyRequirement` (
  `id` int(11) NOT NULL,
  `company_id` int(11) DEFAULT NULL,
  `requested_month` varchar(20) DEFAULT NULL,
  `city` varchar(20) DEFAULT NULL,
  `is_doc_varification` int(1) DEFAULT NULL,
  `requirement_doc_path` text,
  `no_of_engg` int(11) DEFAULT NULL,
  `tech_stack_id` int(11) DEFAULT NULL,
  `tech_type_id` int(11) DEFAULT NULL,
  `maker_program_id` int(11) DEFAULT NULL,
  `lead_id` int(11) DEFAULT NULL,
  `ideation_engg_id` int(11) DEFAULT NULL,
  `buddy_engg_id` int(11) DEFAULT NULL,
  `special_remark` varchar(30) DEFAULT NULL,
  `status` varchar(30) DEFAULT NULL,
  `creator_stamp` varchar(30) DEFAULT NULL,
  `creator_user` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `company_id` (`company_id`),
  KEY `tech_stack_id` (`tech_stack_id`),
  KEY `tech_type_id` (`tech_type_id`),
  KEY `maker_program_id` (`maker_program_id`),
  CONSTRAINT `tblCompanyRequirement_ibfk_1` FOREIGN KEY (`company_id`) REFERENCES `tblCompany` (`id`) ON DELETE SET NULL,
  CONSTRAINT `tblCompanyRequirement_ibfk_2` FOREIGN KEY (`tech_stack_id`) REFERENCES `tblTechStack` (`id`) ON DELETE SET NULL,
  CONSTRAINT `tblCompanyRequirement_ibfk_3` FOREIGN KEY (`tech_type_id`) REFERENCES `tblTechType` (`id`) ON DELETE SET NULL,
  CONSTRAINT `tblCompanyRequirement_ibfk_4` FOREIGN KEY (`maker_program_id`) REFERENCES `tblMakerProgram` (`id`) ON DELETE SET NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblCompanyRequirement`
--

LOCK TABLES `tblCompanyRequirement` WRITE;
/*!40000 ALTER TABLE `tblCompanyRequirement` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblCompanyRequirement` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblFellowShipCandidates`
--

DROP TABLE IF EXISTS `tblFellowShipCandidates`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblFellowShipCandidates` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(20) DEFAULT NULL,
  `middle_name` varchar(20) DEFAULT NULL,
  `last_name` varchar(20) DEFAULT NULL,
  `emailid` varchar(50) DEFAULT NULL,
  `mobile_number` varchar(13) DEFAULT NULL,
  `permanent_pincode` int(11) DEFAULT NULL,
  `degree` varchar(50) DEFAULT NULL,
  `hired_city` varchar(50) DEFAULT NULL,
  `hired_date` date DEFAULT NULL,
  `hired_lab` varchar(50) DEFAULT NULL,
  `attitude` varchar(10) DEFAULT NULL,
  `communication_remark` varchar(10) DEFAULT NULL,
  `knowledge_remark` varchar(10) DEFAULT NULL,
  `aggregate_remark` varchar(10) DEFAULT NULL,
  `status` int(1) DEFAULT NULL,
  `creator_stamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `creator_user` varchar(30) DEFAULT NULL,
  `is_birth_date_varified` int(1) DEFAULT NULL,
  `parent_name` varchar(30) DEFAULT NULL,
  `parent_occupation` varchar(30) DEFAULT NULL,
  `parent_mobile_number` varchar(13) DEFAULT NULL,
  `parent_annual_salary` decimal(8,2) DEFAULT NULL,
  `local_address` varchar(100) DEFAULT NULL,
  `permanent_address` varchar(100) DEFAULT NULL,
  `photo_path` text,
  `joining_date` date DEFAULT NULL,
  `candidate_status` varchar(10) DEFAULT NULL,
  `personal_information` varchar(100) DEFAULT NULL,
  `bank_information` varchar(50) DEFAULT NULL,
  `educational_information` varchar(50) DEFAULT NULL,
  `document_status` varchar(10) DEFAULT NULL,
  `remark` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `emailid` (`emailid`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblFellowShipCandidates`
--

LOCK TABLES `tblFellowShipCandidates` WRITE;
/*!40000 ALTER TABLE `tblFellowShipCandidates` DISABLE KEYS */;
INSERT INTO `tblFellowShipCandidates` VALUES (1,'Pandit','Rakhmaji','Walde','panditwalde64@gmail.com','9561318438',431134,'MCA','Pune','2019-06-10','Pune Lab',NULL,NULL,NULL,NULL,1,'2020-01-17 09:38:01',NULL,NULL,'Rakhamji',NULL,'8180018678',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(2,'Shubham','Mahendra','Chavan','shubham.chavan689977@gmail.com','7709999035',441106,'BE','Pune','2019-10-30','Pune Lab',NULL,NULL,NULL,NULL,1,'2020-01-17 09:40:31',NULL,NULL,'Mahendra',NULL,'8180018678',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(3,'Milind','Bhatu','Patil','milindpatil3276@gmail.com','9860724572',446532,'BE','Mumbai','2019-08-12','Mumbai Lab',NULL,NULL,NULL,NULL,1,'2020-01-17 11:10:50',NULL,NULL,'Bhatu',NULL,'8180018678',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(4,'Saurab','Ramaja','Magdum','saurabmagdum12@gmail.com','8184565478',412124,'BE','Pune','2019-09-20','Pune Lab',NULL,NULL,NULL,NULL,1,'2020-01-17 11:12:45',NULL,NULL,'Ramaji',NULL,'8180018678',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(5,'Yogesh','Shubhash','Sharma','yogeshsharma55@gmail.com','9465132456',484654,'BE','Mumbai','2019-11-10','Mumbai Lab',NULL,NULL,NULL,NULL,1,'2020-01-17 11:17:29',NULL,NULL,'Shubhash',NULL,'8180018678',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(6,'Mayur','Ramesh','Chavan','mayurchavan764@gmail.com','9435146535',413264,'BE','Pune','2019-12-22','Pune Lab',NULL,NULL,NULL,NULL,1,'2020-01-17 11:22:16',NULL,NULL,'Ramesh',NULL,'8180018678',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(7,'Vikas','Bhau','Waghmare','vikaswaghmare86@gmail.com','7894566541',412454,'BCA','Mumbai','2019-12-10','Mumbai Lab',NULL,NULL,NULL,NULL,1,'2020-01-17 11:30:54',NULL,NULL,'Bhau',NULL,'8180018678',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(8,'Chetan','Manoj','Wankhede','chetanwankhede22@gmail.com','9646452317',412123,'BE','Pune','2019-11-26','Pune Lab',NULL,NULL,NULL,NULL,1,'2020-01-17 11:43:06',NULL,NULL,'Manoj',NULL,'8180018678',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(9,'Prem','Suresh','Chouhan','premchouhan72@gmail.com','8486571235',412414,'BE','Pune','2019-11-26','Pune Lab',NULL,NULL,NULL,NULL,1,'2020-01-17 11:44:52',NULL,NULL,'Suresh',NULL,'8180018678',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(10,'Harshali','Ravi','Badgujar','harshalibadgujar23@gmail.com','9854561234',410100,'BE','Mumbai','2019-12-10','Mumbai Lab',NULL,NULL,NULL,NULL,1,'2020-01-17 11:52:19',NULL,NULL,'Ravi',NULL,'8180018678',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(11,'Surbhi','Kishor','Wankhede','surbhiwankhede12@gmail.com','8945621325',410150,'BE','Pune','2019-12-10','Pune Lab',NULL,NULL,NULL,NULL,1,'2020-01-17 11:56:56',NULL,NULL,'Kishor',NULL,'8180018678',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(12,'Vishnu','Bhaurao','Kale','vishnukale23@gmail.com','9561398654',412312,'BE','Pune','2019-12-11','Pune Lab',NULL,NULL,NULL,NULL,1,'2020-01-17 11:59:24',NULL,NULL,'Bhaurao',NULL,'8180018678',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `tblFellowShipCandidates` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblHiredCandidate`
--

DROP TABLE IF EXISTS `tblHiredCandidate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblHiredCandidate` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(20) DEFAULT NULL,
  `middle_name` varchar(20) DEFAULT NULL,
  `last_name` varchar(20) DEFAULT NULL,
  `emailid` varchar(50) DEFAULT NULL,
  `mobile_number` varchar(13) DEFAULT NULL,
  `permanent_pincode` int(11) DEFAULT NULL,
  `degree` varchar(50) DEFAULT NULL,
  `hired_city` varchar(50) DEFAULT NULL,
  `hired_date` date DEFAULT NULL,
  `hired_lab` varchar(50) DEFAULT NULL,
  `attitude` varchar(10) DEFAULT NULL,
  `communication_remark` varchar(10) DEFAULT NULL,
  `knowledge_remark` varchar(10) DEFAULT NULL,
  `aggregate_remark` varchar(10) DEFAULT NULL,
  `status` int(1) DEFAULT NULL,
  `creator_stamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `creator_user` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `emailid` (`emailid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblHiredCandidate`
--

LOCK TABLES `tblHiredCandidate` WRITE;
/*!40000 ALTER TABLE `tblHiredCandidate` DISABLE KEYS */;
INSERT INTO `tblHiredCandidate` VALUES (1,'Pandit','Rakhamaji','Walde','panditwalde64@gmail.com','9561318438',431143,'MCA','Pune','2019-06-15','Pune Lab',NULL,NULL,NULL,NULL,1,'2020-01-07 05:44:52',NULL),(2,'Sourabh','Nandkumar','Mugdum','sourabh161196@gmail.com','8888161340',415143,'BE','Pune','2019-06-15','Pune Lab',NULL,NULL,NULL,NULL,1,'2020-01-07 05:49:59',NULL),(3,'Shubham','Mahendrakumar','Chavan','sshhuubbhhaamm77@gmail.com','9284767207',441106,'BE','Pune','2019-06-15','Pune Lab',NULL,NULL,NULL,NULL,1,'2020-01-07 05:51:47',NULL),(4,'Milind','Bhatu','Patil','milindpatil3276@gmail.com','9370805836',425111,'BE','Mumbai','2019-06-15','Mumbai Lab',NULL,NULL,NULL,NULL,1,'2020-01-07 05:53:22',NULL),(5,'Rahul','Ramu','Kale','rahulkale64@gmail.com','8488445642',412312,'MCA','Mumbai','2019-06-15','Mumbai Lab',NULL,NULL,NULL,NULL,1,'2020-01-07 05:54:34',NULL),(6,'Kishor','Phatu','Dange','kishordange80@gmail.com','7897894561',484854,'BE','Pune','2019-06-15','Pune Lab',NULL,NULL,NULL,NULL,1,'2020-01-07 05:55:33',NULL);
/*!40000 ALTER TABLE `tblHiredCandidate` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblLab`
--

DROP TABLE IF EXISTS `tblLab`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblLab` (
  `id` int(11) NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `location` varchar(30) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `status` int(1) DEFAULT NULL,
  `creator_stamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `creator_user` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblLab`
--

LOCK TABLES `tblLab` WRITE;
/*!40000 ALTER TABLE `tblLab` DISABLE KEYS */;
INSERT INTO `tblLab` VALUES (1,'BridgeLabz Mumbai','Mumbai','Manotra Chember Govandi Mumbai',1,'2020-01-07 08:33:50',NULL),(2,'BridgeLabz Pune','Pune','Near Pankaj Gandhi Academy Pune',1,'2020-01-07 08:35:06',NULL),(3,'BridgeLabz Bengluru','Bengluru','Rawdi Square Bengluru',1,'2020-01-07 08:36:41',NULL);
/*!40000 ALTER TABLE `tblLab` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblLabThreshold`
--

DROP TABLE IF EXISTS `tblLabThreshold`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblLabThreshold` (
  `id` int(11) NOT NULL,
  `lab_id` int(11) DEFAULT NULL,
  `lab_capacity` int(11) DEFAULT NULL,
  `lead_threshold` varchar(30) DEFAULT NULL,
  `ideation_engg_threshol` varchar(30) DEFAULT NULL,
  `buddy_engg_threshold` varchar(30) DEFAULT NULL,
  `status` varchar(30) DEFAULT NULL,
  `creator_stamp` varchar(30) DEFAULT NULL,
  `creator_user` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `lab_id` (`lab_id`),
  CONSTRAINT `tblLabThreshold_ibfk_1` FOREIGN KEY (`lab_id`) REFERENCES `tblLab` (`id`) ON DELETE SET NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblLabThreshold`
--

LOCK TABLES `tblLabThreshold` WRITE;
/*!40000 ALTER TABLE `tblLabThreshold` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblLabThreshold` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblMakerProgram`
--

DROP TABLE IF EXISTS `tblMakerProgram`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblMakerProgram` (
  `id` int(11) NOT NULL,
  `program_name` varchar(30) DEFAULT NULL,
  `program_type` varchar(30) DEFAULT NULL,
  `program_link` varchar(30) DEFAULT NULL,
  `tech_stack_id` int(11) DEFAULT NULL,
  `tech_type_id` int(11) DEFAULT NULL,
  `is_program_approved` int(1) DEFAULT NULL,
  `description` varchar(50) DEFAULT NULL,
  `status` varchar(30) DEFAULT NULL,
  `creator_stamp` varchar(30) DEFAULT NULL,
  `creator_user` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `tech_stack_id` (`tech_stack_id`),
  KEY `tech_type_id` (`tech_type_id`),
  CONSTRAINT `tblMakerProgram_ibfk_1` FOREIGN KEY (`tech_stack_id`) REFERENCES `tblTechStack` (`id`) ON DELETE SET NULL,
  CONSTRAINT `tblMakerProgram_ibfk_2` FOREIGN KEY (`tech_type_id`) REFERENCES `tblTechType` (`id`) ON DELETE SET NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblMakerProgram`
--

LOCK TABLES `tblMakerProgram` WRITE;
/*!40000 ALTER TABLE `tblMakerProgram` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblMakerProgram` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblMentor`
--

DROP TABLE IF EXISTS `tblMentor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblMentor` (
  `id` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `mentor_type` varchar(30) DEFAULT NULL,
  `lab_id` int(11) DEFAULT NULL,
  `status` varchar(30) DEFAULT NULL,
  `creator_stamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `creator_user` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `lab_id` (`lab_id`),
  CONSTRAINT `tblMentor_ibfk_1` FOREIGN KEY (`lab_id`) REFERENCES `tblLab` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblMentor`
--

LOCK TABLES `tblMentor` WRITE;
/*!40000 ALTER TABLE `tblMentor` DISABLE KEYS */;
INSERT INTO `tblMentor` VALUES (1,'Jotiram','Ideation Engg',1,'1','2020-01-07 09:16:45',NULL),(2,'Nisha','Buddy Engg',1,'1','2020-01-07 09:17:21',NULL),(3,'Rohini','Buddy Engg',1,'1','2020-01-07 09:17:40',NULL),(4,'Dipak','Ideation Engg',1,'1','2020-01-07 09:19:00',NULL),(5,'Manoj','Ideation Engg',2,'1','2020-01-07 09:19:03',NULL),(6,'Sampna','Buddy Engg',2,'1','2020-01-07 09:19:07',NULL),(7,'Rahul','Buddy Engg',3,'1','2020-01-07 09:21:09',NULL),(8,'Dilip','Ideation Lead',3,'1','2020-01-07 09:21:35',NULL),(9,'Sunil','Ideation Lead',3,'1','2020-01-07 09:21:39',NULL),(10,'Sakshi','Buddy Engg',3,'1','2020-01-07 09:21:43',NULL),(11,'Anjali','Buddy Engg',3,'1','2020-01-07 09:21:46',NULL),(12,'Jasprit','Ideation Engg',3,'1','2020-01-07 09:21:54',NULL);
/*!40000 ALTER TABLE `tblMentor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblMentorIdeationMap`
--

DROP TABLE IF EXISTS `tblMentorIdeationMap`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblMentorIdeationMap` (
  `id` int(11) NOT NULL,
  `ideation_id` int(11) DEFAULT NULL,
  `mentor_id` int(11) DEFAULT NULL,
  `status` int(1) DEFAULT NULL,
  `creator_stamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `creator_user` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `mentor_id` (`mentor_id`),
  CONSTRAINT `tblMentorIdeationMap_ibfk_1` FOREIGN KEY (`mentor_id`) REFERENCES `tblMentor` (`id`) ON DELETE SET NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblMentorIdeationMap`
--

LOCK TABLES `tblMentorIdeationMap` WRITE;
/*!40000 ALTER TABLE `tblMentorIdeationMap` DISABLE KEYS */;
INSERT INTO `tblMentorIdeationMap` VALUES (1,8,4,1,'2020-01-07 12:35:53',NULL),(2,8,5,1,'2020-01-07 12:35:56',NULL),(3,8,6,1,'2020-01-07 12:35:57',NULL),(4,8,7,1,'2020-01-07 12:35:59',NULL),(5,8,10,1,'2020-01-07 12:36:00',NULL),(6,9,1,1,'2020-01-07 12:36:01',NULL),(7,9,2,1,'2020-01-07 12:36:06',NULL),(8,9,5,1,'2020-01-07 12:30:33',NULL),(9,9,12,1,'2020-01-07 12:36:09',NULL),(10,9,11,1,'2020-01-07 12:36:15',NULL);
/*!40000 ALTER TABLE `tblMentorIdeationMap` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblMentorTechStack`
--

DROP TABLE IF EXISTS `tblMentorTechStack`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblMentorTechStack` (
  `id` int(11) NOT NULL,
  `mentor_id` int(11) DEFAULT NULL,
  `tech_stack_id` int(11) DEFAULT NULL,
  `status` int(1) DEFAULT NULL,
  `creator_stamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `creator_user` varchar(30) DEFAULT NULL,
  `datetime` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `mentor_id` (`mentor_id`),
  KEY `tech_stack_id` (`tech_stack_id`),
  CONSTRAINT `tblMentorTechStack_ibfk_1` FOREIGN KEY (`mentor_id`) REFERENCES `tblMentor` (`id`) ON DELETE SET NULL,
  CONSTRAINT `tblMentorTechStack_ibfk_2` FOREIGN KEY (`tech_stack_id`) REFERENCES `tblTechStack` (`id`) ON DELETE SET NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblMentorTechStack`
--

LOCK TABLES `tblMentorTechStack` WRITE;
/*!40000 ALTER TABLE `tblMentorTechStack` DISABLE KEYS */;
INSERT INTO `tblMentorTechStack` VALUES (1,1,1,1,'2020-01-07 14:16:12',NULL,NULL),(2,2,7,1,'2020-01-07 14:17:59',NULL,NULL),(3,3,2,1,'2020-01-07 14:18:01',NULL,NULL),(4,4,6,1,'2020-01-07 14:18:02',NULL,NULL),(5,5,2,1,'2020-01-07 14:18:04',NULL,NULL),(6,5,4,1,'2020-01-07 14:18:06',NULL,NULL),(7,6,3,1,'2020-01-07 14:18:07',NULL,NULL),(8,7,2,1,'2020-01-07 14:18:09',NULL,NULL);
/*!40000 ALTER TABLE `tblMentorTechStack` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblTechStack`
--

DROP TABLE IF EXISTS `tblTechStack`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblTechStack` (
  `id` int(11) NOT NULL,
  `tech_name` varchar(50) DEFAULT NULL,
  `framework` varchar(30) DEFAULT NULL,
  `cur_status` varchar(30) DEFAULT NULL,
  `creator_stamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `creator_user` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblTechStack`
--

LOCK TABLES `tblTechStack` WRITE;
/*!40000 ALTER TABLE `tblTechStack` DISABLE KEYS */;
INSERT INTO `tblTechStack` VALUES (1,'Java','Spring Boot','1','2020-01-07 13:30:02',NULL),(2,'Java','Hibernate','1','2020-01-07 13:33:04',NULL),(3,'Java','Scruts','1','2020-01-07 13:33:05',NULL),(4,'.Net','ASP.Net','1','2020-01-07 13:33:05',NULL),(5,'Node.js','React Js','1','2020-01-07 13:33:06',NULL),(6,'Node.js','Express','1','2020-01-07 13:33:07',NULL),(7,'DevOpe','Deployement','1','2020-01-07 13:32:57',NULL),(8,'PHP','Laravel','1','2020-01-07 13:36:48',NULL),(9,'PHP','Symfony','1','2020-01-07 13:36:47',NULL),(10,'Node.js','Angular js','1','2020-01-07 13:36:46',NULL);
/*!40000 ALTER TABLE `tblTechStack` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblTechType`
--

DROP TABLE IF EXISTS `tblTechType`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblTechType` (
  `id` int(11) NOT NULL,
  `type_name` varchar(30) DEFAULT NULL,
  `cur_status` varchar(30) DEFAULT NULL,
  `creator_stamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `creator_user` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblTechType`
--

LOCK TABLES `tblTechType` WRITE;
/*!40000 ALTER TABLE `tblTechType` DISABLE KEYS */;
INSERT INTO `tblTechType` VALUES (1,'FullStack','1','2020-01-07 13:54:23',NULL),(2,'BackEnd','1','2020-01-07 13:54:23',NULL),(3,'FrontEnd','1','2020-01-07 13:54:23',NULL),(4,'DevOpe','1','2020-01-07 13:54:23',NULL);
/*!40000 ALTER TABLE `tblTechType` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblUserDetails`
--

DROP TABLE IF EXISTS `tblUserDetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblUserDetails` (
  `id` int(11) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `first_name` varchar(30) DEFAULT NULL,
  `last_name` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `contact_number` varchar(13) DEFAULT NULL,
  `varified` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblUserDetails`
--

LOCK TABLES `tblUserDetails` WRITE;
/*!40000 ALTER TABLE `tblUserDetails` DISABLE KEYS */;
INSERT INTO `tblUserDetails` VALUES (1,'jasprit123@gmail.com','Jasprit','Singh','12345','8787878787',1),(2,'sunilpatil3@gmail.com','Sunil','Patil','84875','8484848484',1);
/*!40000 ALTER TABLE `tblUserDetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblUserRoles`
--

DROP TABLE IF EXISTS `tblUserRoles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblUserRoles` (
  `user_id` int(11) NOT NULL,
  `role_name` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  CONSTRAINT `tblUserRoles_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `tblUserDetails` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblUserRoles`
--

LOCK TABLES `tblUserRoles` WRITE;
/*!40000 ALTER TABLE `tblUserRoles` DISABLE KEYS */;
INSERT INTO `tblUserRoles` VALUES (1,'Project Manager'),(2,'Technical Officer');
/*!40000 ALTER TABLE `tblUserRoles` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-01-17 18:02:09
