-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 07, 2022 at 11:29 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `toko_sepeda`
--

-- --------------------------------------------------------

--
-- Table structure for table `sepeda_gowes`
--

CREATE TABLE `sepeda_gowes` (
  `kode` int(11) NOT NULL,
  `tipe` varchar(64) NOT NULL,
  `merk` varchar(64) NOT NULL,
  `harga` decimal(11,2) NOT NULL,
  `stok` int(11) NOT NULL,
  `jenis` varchar(64) NOT NULL,
  `ban` varchar(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sepeda_gowes`
--

INSERT INTO `sepeda_gowes` (`kode`, `tipe`, `merk`, `harga`, `stok`, `jenis`, `ban`) VALUES
(11, 'Sonic 4501', 'Sonic', '4000.00', 18, 'Lipat', 'So nika z90'),
(26, 'SP-LPT2', 'Wimcycle', '3000000.00', 10, 'Lipat', '12');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `id` int(11) NOT NULL,
  `nama` varchar(64) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `total` decimal(11,2) NOT NULL,
  `pembayaran` decimal(11,2) NOT NULL,
  `kembalian` decimal(11,2) NOT NULL,
  `tanggal` date NOT NULL,
  `kategori` varchar(64) NOT NULL,
  `kode` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`id`, `nama`, `jumlah`, `total`, `pembayaran`, `kembalian`, `tanggal`, `kategori`, `kode`) VALUES
(11, 'Saleh', 2, '108000.00', '109000.00', '1000.00', '2022-10-30', 'Listrik', 1),
(15, 'Test', 1, '4000.00', '5000.00', '1000.00', '2022-11-11', 'Gowes', 11),
(16, 'Syila', 1, '5000000.00', '6000000.00', '1000000.00', '2022-11-14', 'Listrik', 14),
(17, 'Sila', 1, '4000.00', '4000.00', '0.00', '2022-12-07', 'Gowes', 11);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `sepeda_gowes`
--
ALTER TABLE `sepeda_gowes`
  ADD PRIMARY KEY (`kode`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `sepeda_gowes`
--
ALTER TABLE `sepeda_gowes`
  MODIFY `kode` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT for table `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
