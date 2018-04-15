-- phpMyAdmin SQL Dump
-- version 4.3.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 10, 2018 at 03:10 PM
-- Server version: 5.6.24
-- PHP Version: 5.6.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `successful_brothers`
--

-- --------------------------------------------------------

--
-- Table structure for table `cars`
--

CREATE TABLE IF NOT EXISTS `cars` (
  `id` int(11) NOT NULL,
  `reg` varchar(15) DEFAULT NULL,
  `brand` varchar(20) DEFAULT NULL,
  `model` varchar(20) DEFAULT NULL,
  `serviced` tinyint(1) DEFAULT NULL,
  `d_id` int(11) DEFAULT NULL,
  `info` varchar(100) DEFAULT NULL,
  `price` double(10,2) DEFAULT NULL,
  `booked` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cars`
--

INSERT INTO `cars` (`id`, `reg`, `brand`, `model`, `serviced`, `d_id`, `info`, `price`, `booked`) VALUES
(1, 'SC34KLA', 'Mercedes', 'S Class', 1, 5, 'S Class 63 Black - 2017', 100000.00, 0),
(2, 'RT43KLO', 'VW', 'Golf', 1, 1, 'VW Golf Blue 1.9 - 1999', 320.00, 0),
(3, 'IK54HNM', 'Ford', 'Mondeo', 0, 5, 'Ford Mondeo White 1.6 - 2005', 2300.00, 0);

-- --------------------------------------------------------

--
-- Table structure for table `customers`
--

CREATE TABLE IF NOT EXISTS `customers` (
  `id` int(11) NOT NULL,
  `fname` varchar(30) DEFAULT NULL,
  `lname` varchar(30) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `contacts` varchar(50) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customers`
--

INSERT INTO `customers` (`id`, `fname`, `lname`, `address`, `contacts`) VALUES
(1, 'Spas', 'Spasov', 'BS1 2HF', '088**');

-- --------------------------------------------------------

--
-- Table structure for table `parts`
--

CREATE TABLE IF NOT EXISTS `parts` (
  `id` int(11) NOT NULL,
  `p_id` varchar(20) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `info` varchar(100) DEFAULT NULL,
  `price` double(10,2) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `parts`
--

INSERT INTO `parts` (`id`, `p_id`, `name`, `info`, `price`) VALUES
(1, 'UWE123', 'wheel', 'bbbbbbbbbbbbbbbbbbbbbbaaaaaaaaaaaa', 52.00),
(4, 'ABC123', 'Wheel', 'Wheel VW Golf', 35.22),
(5, 'ABC123', 'Wheel', 'Wheel VW Golf', 35.33),
(6, 'ABC123', 'Wheel', 'Wheel VW Golf', 35.33),
(7, 'ABC123', 'Wheel', 'Wheel VW Golf', 35.33),
(8, 'ABC123', 'Wheel', 'Wheel VW Golf', 35.33),
(9, 'ABC123', 'Wheel', 'Wheel VW Golf', 35.33),
(10, 'ABC123', 'Wheel', 'Wheel VW Golf', 35.33),
(11, 'ABC123', 'Wheel', 'Wheel VW Golf', 35.33),
(12, 'ABC123', 'Wheel', 'Wheel VW Golf', 35.33),
(13, 'ABC123', 'Wheel', 'Wheel VW Golf', 35.33),
(14, 'ABC123', 'Wheel', 'Wheel VW Golf', 35.33),
(15, 'ABC123', 'Wheel', 'Wheel VW Golf', 35.33),
(16, 'ABC123', 'Wheel', 'Wheel VW Golf', 35.33),
(17, 'ABC123', 'Wheel', 'Wheel VW Golf', 35.33),
(18, 'ABC123', 'Wheel', 'Wheel VW Golf', 35.33),
(19, 'ABC123', 'Wheel', 'Wheel VW Golf', 35.33),
(20, 'ABC123', 'Wheel', 'Wheel VW Golf', 35.33),
(21, 'ABC123', 'Wheel', 'Wheel VW Golf', 35.33),
(22, 'ABC123', 'Wheel', 'Wheel VW Golf', 35.33),
(23, 'ABC123', 'Wheel', 'Wheel VW Golf', 35.33),
(24, 'ABC123', 'Wheel', 'Wheel VW Golf', 35.33),
(25, 'ABC123', 'Wheel', 'Wheel VW Golf', 35.33),
(26, 'ABC123', 'Wheel', 'Wheel VW Golf', 35.33),
(27, 'ABC123', 'Wheel', 'Wheel VW Golf', 35.33),
(28, 'ABC123', 'Wheel', 'Wheel VW Golf', 35.33);

-- --------------------------------------------------------

--
-- Table structure for table `services`
--

CREATE TABLE IF NOT EXISTS `services` (
  `id` int(11) NOT NULL,
  `car_reg` varchar(15) DEFAULT NULL,
  `car_info` varchar(100) DEFAULT NULL,
  `info` varchar(100) DEFAULT NULL,
  `price` double(10,2) DEFAULT NULL,
  `done` tinyint(1) DEFAULT NULL,
  `parts_ids` varchar(100) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `services`
--

INSERT INTO `services` (`id`, `car_reg`, `car_info`, `info`, `price`, `done`, `parts_ids`) VALUES
(1, '123', 'qwe', 'asdasdasd', 40.00, 1, 'UWE123;'),
(2, 'ff22', 'qww', 'wdd', 80.00, 1, 'UWE123;UWE123;'),
(3, '2', 's', 'ss', 2.00, 1, ''),
(4, 'asd', 'dd', 'd', 2.00, 1, ''),
(5, 'asd', 'asd', 'asd', 2.00, 1, 'ABC123;ABC123;ABC123;ABC123;ABC123;ABC123;ABC123;ABC123;'),
(6, 'w', 'w', 'w', 43.33, 1, 'ABC123;'),
(7, 'b', 'b', 'a', 65.00, 1, 'ABC123;'),
(8, '', '', '', 2.00, 1, ''),
(9, '', '', '', 4.00, 1, ''),
(11, '', '', '', 3.00, 1, ''),
(12, 'HK51ZXV', 'w', 'w', 64.67, 1, 'ABC123;'),
(13, 'GH44KLJ', '', '', 5.00, 1, 'ABC123;'),
(14, 'MF39GNS', 'f', 'f', 29.34, 0, 'ABC123;ABC123;'),
(15, 'AK44GUN', 'w', 'w', 29.34, 0, 'ABC123;ABC123;');

-- --------------------------------------------------------

--
-- Table structure for table `sold_cars`
--

CREATE TABLE IF NOT EXISTS `sold_cars` (
  `id` int(6) unsigned NOT NULL,
  `reg` varchar(15) DEFAULT NULL,
  `brand` varchar(20) DEFAULT NULL,
  `model` varchar(20) DEFAULT NULL,
  `serviced` tinyint(1) DEFAULT NULL,
  `d_id` int(11) DEFAULT NULL,
  `info` varchar(100) DEFAULT NULL,
  `price` double(10,2) DEFAULT NULL,
  `date` datetime DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sold_cars`
--

INSERT INTO `sold_cars` (`id`, `reg`, `brand`, `model`, `serviced`, `d_id`, `info`, `price`, `date`) VALUES
(1, 'GH59IOA', 'VW', 'Passat', 1, 5, 'VW Passat Green 1.9 - 2000', 1000.00, '2018-03-22 03:05:43'),
(2, 'GH90LKJ', 'Renault', 'Clio', 0, 3, 'Renault Clio White 1.9 - 2000', 400.00, '2018-03-17 08:15:14');

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

CREATE TABLE IF NOT EXISTS `staff` (
  `id` int(11) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `type` varchar(100) NOT NULL,
  `fname` varchar(30) DEFAULT NULL,
  `lname` varchar(30) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `contacts` varchar(50) DEFAULT NULL,
  `d_id` varchar(30) DEFAULT NULL,
  `NINo` varchar(10) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `staff`
--

INSERT INTO `staff` (`id`, `username`, `password`, `type`, `fname`, `lname`, `address`, `contacts`, `d_id`, `NINo`) VALUES
(1, 's2-spasov', '12345', 'PartsMaintainer', 'Spas', 'Spasov', 'Flat 52 BS1 2HF', '0878787878', '2', 'de334455d'),
(2, 'user', 'user', 'ServiceCoordinator', 'Spas', 'Spasov', 'sasdasd', 'asd', '5', 'asdasd');

-- --------------------------------------------------------

--
-- Table structure for table `stock`
--

CREATE TABLE IF NOT EXISTS `stock` (
  `id` int(11) NOT NULL,
  `part_id` varchar(20) NOT NULL DEFAULT '0',
  `name` varchar(20) DEFAULT NULL,
  `info` varchar(100) DEFAULT NULL,
  `price` double(10,2) DEFAULT NULL,
  `D1` int(11) DEFAULT NULL,
  `D2` int(11) DEFAULT NULL,
  `D3` int(11) DEFAULT NULL,
  `D4` int(11) DEFAULT NULL,
  `D5` int(11) DEFAULT NULL,
  `D1min` varchar(20) DEFAULT NULL,
  `D2min` varchar(20) DEFAULT NULL,
  `D3min` varchar(20) DEFAULT NULL,
  `D4min` varchar(20) DEFAULT NULL,
  `D5min` varchar(20) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `stock`
--

INSERT INTO `stock` (`id`, `part_id`, `name`, `info`, `price`, `D1`, `D2`, `D3`, `D4`, `D5`, `D1min`, `D2min`, `D3min`, `D4min`, `D5min`) VALUES
(1, 'ABC123', 'Wheel', 'Wheel VW Golf', 35.33, 0, 10, 1, 0, 0, 'N/A', '1', 'N/A', 'N/A', 'N/A');

-- --------------------------------------------------------

--
-- Table structure for table `transactions`
--

CREATE TABLE IF NOT EXISTS `transactions` (
  `id` int(11) NOT NULL,
  `price` double(10,2) DEFAULT NULL,
  `type` varchar(20) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  `dealership` varchar(5) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transactions`
--

INSERT INTO `transactions` (`id`, `price`, `type`, `date`, `dealership`) VALUES
(1, 3.00, 'service', '2018-03-18 20:04:11', ' '),
(2, 64.67, 'service', '2018-03-18 20:06:18', ' '),
(3, 0.00, 'service', '2018-03-18 20:08:53', ' '),
(4, 70.66, 'service', '2018-03-18 20:13:17', ' '),
(5, 100.00, 'service', '2018-03-18 20:19:06', 'D2'),
(6, 1200.00, 'car sale', '2018-03-22 03:00:56', 'D5'),
(7, 1000.00, 'car sale', '2018-03-22 03:05:43', 'D5');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cars`
--
ALTER TABLE `cars`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `customers`
--
ALTER TABLE `customers`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `parts`
--
ALTER TABLE `parts`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `services`
--
ALTER TABLE `services`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `sold_cars`
--
ALTER TABLE `sold_cars`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `staff`
--
ALTER TABLE `staff`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `stock`
--
ALTER TABLE `stock`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `transactions`
--
ALTER TABLE `transactions`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cars`
--
ALTER TABLE `cars`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `customers`
--
ALTER TABLE `customers`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `parts`
--
ALTER TABLE `parts`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=29;
--
-- AUTO_INCREMENT for table `services`
--
ALTER TABLE `services`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=16;
--
-- AUTO_INCREMENT for table `sold_cars`
--
ALTER TABLE `sold_cars`
  MODIFY `id` int(6) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `staff`
--
ALTER TABLE `staff`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `stock`
--
ALTER TABLE `stock`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `transactions`
--
ALTER TABLE `transactions`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=8;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
