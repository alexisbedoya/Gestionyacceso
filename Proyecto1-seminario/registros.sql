-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-12-2020 a las 06:39:41
-- Versión del servidor: 10.4.16-MariaDB
-- Versión de PHP: 7.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `registros`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `nombre` varchar(50) COLLATE utf8mb4_spanish_ci NOT NULL,
  `apellido` varchar(50) COLLATE utf8mb4_spanish_ci NOT NULL,
  `Carrera` varchar(50) COLLATE utf8mb4_spanish_ci NOT NULL,
  `Codigo` varchar(15) COLLATE utf8mb4_spanish_ci NOT NULL,
  `fecha` varchar(15) COLLATE utf8mb4_spanish_ci NOT NULL,
  `Sala` varchar(50) COLLATE utf8mb4_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`nombre`, `apellido`, `Carrera`, `Codigo`, `fecha`, `Sala`) VALUES
('hola ', '', '', '1231231231', '30-11-20 10:45:', ''),
('dfasfs', 'dafsfasf', 'Ingeniería de Sistemas', '123131', '01-12-20 12:06:', 'Informatica'),
('23131', '1231313', 'Ingeniería de Sistemas', '12313', '01-12-20 12:06:', 'Informatica'),
('23131', '1231313', 'Ingeniería de Sistemas', '12313', '01-12-20 12:06:', 'Informatica'),
('aa', 'aa', 'Ingeniería de Sistemas', '111', '01-12-20 12:09:', 'Informatica'),
('das', 'das', 'Ingeniería de Alimentos', '123333', '01-12-20 12:12:', 'Estudio'),
('dasdasda', 'adsadasd', 'Ingeniería de Sistemas', '12313', '01-12-20 12:16:', 'Informatica'),
('dfsdf', '123', 'Ingeniería de Sistemas', '123', '01-12-20 12:16:', 'Informatica'),
('alex', 'bedoya', 'Ingeniería de Sistemas', '1007402025', '01-12-20 12:23:', 'Informatica'),
('sampy', 'cortes', 'Ingeniería de Sistemas', '41', '01-12-20 12:25:', 'Informatica'),
('diego', 'jaramillo', 'Ingeniería de Sistemas', '52', '01-12-20 12:26:', 'Informatica'),
('diego', 'jaramillo', 'Ingeniería de Sistemas', '52', '01-12-20 12:26:', 'Informatica');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
