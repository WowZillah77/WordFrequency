-- phpMyAdmin SQL Dump
-- version 4.5.4.1deb2ubuntu2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Oct 01, 2017 at 10:49 AM
-- Server version: 5.7.19-0ubuntu0.16.04.1
-- PHP Version: 7.0.22-0ubuntu0.16.04.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `WordFrequency`
--

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `Type`
--

CREATE TABLE `Type` (
  `id` int(11) NOT NULL,
  `typeName` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `userId` varchar(255) NOT NULL,
  `pwd` varchar(255) NOT NULL,
  `score` int(11) NOT NULL,
  `level` int(11) NOT NULL,
  `age` int(3) NOT NULL,
  `sex` char(1) NOT NULL,
  `admin` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `wordCategories`
--

CREATE TABLE `wordCategories` (
  `wordId` int(11) NOT NULL,
  `categoryId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `wordDictionary`
--

CREATE TABLE `wordDictionary` (
  `id` int(11) NOT NULL,
  `englishword` varchar(255) NOT NULL,
  `englishSound` text NOT NULL,
  `frenchWord` varchar(255) NOT NULL,
  `frenchSound` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `wordTally`
--

CREATE TABLE `wordTally` (
  `idUser` int(11) NOT NULL,
  `idWord` int(11) NOT NULL,
  `nbCorrect` int(11) NOT NULL,
  `nbIncorrect` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `wordType`
--

CREATE TABLE `wordType` (
  `idword` int(11) NOT NULL,
  `idType` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `Type`
--
ALTER TABLE `Type`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `wordCategories`
--
ALTER TABLE `wordCategories`
  ADD KEY `wordId` (`wordId`),
  ADD KEY `categoryId` (`categoryId`);

--
-- Indexes for table `wordDictionary`
--
ALTER TABLE `wordDictionary`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `wordTally`
--
ALTER TABLE `wordTally`
  ADD KEY `idUser` (`idUser`),
  ADD KEY `idWord` (`idWord`);

--
-- Indexes for table `wordType`
--
ALTER TABLE `wordType`
  ADD UNIQUE KEY `idType` (`idType`),
  ADD KEY `idword` (`idword`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `category`
--
ALTER TABLE `category`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `Type`
--
ALTER TABLE `Type`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `wordDictionary`
--
ALTER TABLE `wordDictionary`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `wordCategories`
--
ALTER TABLE `wordCategories`
  ADD CONSTRAINT `wordCategories_ibfk_1` FOREIGN KEY (`wordId`) REFERENCES `wordDictionary` (`id`),
  ADD CONSTRAINT `wordCategories_ibfk_2` FOREIGN KEY (`categoryId`) REFERENCES `category` (`id`);

--
-- Constraints for table `wordTally`
--
ALTER TABLE `wordTally`
  ADD CONSTRAINT `wordTally_ibfk_1` FOREIGN KEY (`idUser`) REFERENCES `user` (`id`),
  ADD CONSTRAINT `wordTally_ibfk_2` FOREIGN KEY (`idWord`) REFERENCES `wordDictionary` (`id`);

--
-- Constraints for table `wordType`
--
ALTER TABLE `wordType`
  ADD CONSTRAINT `wordType_ibfk_1` FOREIGN KEY (`idword`) REFERENCES `wordDictionary` (`id`),
  ADD CONSTRAINT `wordType_ibfk_2` FOREIGN KEY (`idType`) REFERENCES `Type` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
