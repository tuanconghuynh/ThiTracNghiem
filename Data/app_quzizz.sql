-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Oct 26, 2023 at 03:44 PM
-- Server version: 8.0.30
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `app_quzizz`
--

-- --------------------------------------------------------

--
-- Table structure for table `exams`
--

CREATE TABLE `exams` (
  `id` int NOT NULL,
  `subject` varchar(255) NOT NULL,
  `class_room` varchar(50) NOT NULL,
  `quantity` int DEFAULT '0',
  `status` tinyint(1) DEFAULT '1',
  `total_time` int DEFAULT '0',
  `user_id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `exams`
--

INSERT INTO `exams` (`id`, `subject`, `class_room`, `quantity`, `status`, `total_time`, `user_id`) VALUES
(1, 'Lap trinh co ban', 'DCT1191', 3, 1, 2, 2),
(2, 'Co so du lieu ta', 'DCT1192', 3, 0, 15, 2),
(3, 'Xay dung mo hinh phan lop', 'DCT1193', 0, 1, 25, 2),
(4, 'Cong nghe phan mem', 'DCT1194', 0, 1, 30, 2),
(5, 'Lap trinh mang', 'DCT1195', 0, 1, 45, 5),
(6, 'Ma nguon mo', 'DCT1196', 0, 1, 15, 6),
(7, 'Co so du lieu phan tan', 'DCT1197', 30, 1, 30, 7),
(9, 'Cuộc Sống Và Trải Nghiệm', '2111', 10, 1, 15, 9),
(11, 'Thiet Ke Giao Dien', 'GH025', 10, 0, 15, 2),
(25, 'Cuộc đời', 'HP0043', 3, 1, 15, 2),
(28, 'Lap Trinh Mang', '001', 3, 1, 3, 31),
(31, 'WorldCup2022', 'Quatar', 3, 1, 3, 2),
(32, 'Tết', '123', 3, 1, 3, 32),
(33, 'Lap Trinh Co Ban', 'ABHG20', 3, 1, 3, 34),
(34, 'adasg', '12213', 3, 1, 3, 34),
(35, 'd', 'g', 3, 1, 3, 34),
(36, 'asdfa', 'fsafsadf', 3, 1, 3, 34),
(37, 'LTM', 'E1-02.12', 3, 1, 15, 39);

-- --------------------------------------------------------

--
-- Table structure for table `questions`
--

CREATE TABLE `questions` (
  `id` int NOT NULL,
  `exam_id` int NOT NULL,
  `question` text,
  `A` text,
  `B` text,
  `C` text,
  `D` text,
  `answer` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `questions`
--

INSERT INTO `questions` (`id`, `exam_id`, `question`, `A`, `B`, `C`, `D`, `answer`) VALUES
(3, 1, 'Từ khoá protected trong một lớp có ý nghĩa:', 'Khai báo các thành viên của lớp chỉ Được thừa kế', ' Khai báo các thành viên Được bảo vệ;\r\n', 'Khai báo các thành viên của lớp Được dùng riêng ', 'Khong co', 'B'),
(4, 1, 'Khi chạy Đoạn chương trình trên sẽ xảy ra hiện tượng gì? ', '. Báo lỗi không truy cập Được vào biến a,b của lớp Lop1 do nằm ở phạm viprivate', '. Hoàn toàn bình thường. Không có lỗi.', 'Đối tượng obj không gọi Được hàm nhập. ', 'Đối tượng obj không gọi Được hàm nhập. ', 'C'),
(5, 7, 'Một biến sau khi Được khai báo, cấp vùng nhớ, nhưng\r\nvoid f() { chưa Đặt giá trị ban Đầu thì bản thân nó sẽ có giá trị là', ' Khoảng trắng', '. giá trị rác (không biết trước)\r\n', '0', '. giá trị rác (không biết trước)\r\n', 'D'),
(6, 7, '\r\n( 10>7 ) && (\'a\' < \'A\' ) Kết quả sẽ như thế nào? \r\n', '( 10>7 ) && (\'a\' < \'A\' )', '(3 + 2 <= 5) || (2 < 4 % 2)', '(4 + 2 > 5) && (2 < 4 / 2)', '3 * (2+ 1) >= 10 % 4* 2', 'A'),
(7, 1, 'Việt Nam có bao nhiêu tỉnh thành', '64', '69', '56', '86', 'A'),
(8, 9, 'Đối với sản xuất và đời sống con người, trước hết sông ngòi cung cấp', 'Thức ăn', 'Nước', 'đường giao thông', 'Thuỷ sản ', 'B'),
(9, 9, 'Vũ khí năng lượng định hướng là gì?', 'Là vũ khí hạt nhân', 'Là vũ khí sinh học', 'Là vũ khi hoá học', 'Là việc bắn các tia năng lượng công suất cao', 'D'),
(10, 9, 'Cách để vượt qua deadline', 'Qua đời', 'Cầu nguyện', 'Rút môn', 'Lên kế hoạch chính xác và đảm báo thực hiện tốt các mục tiêu đề ra.', 'D'),
(11, 9, 'Xe Tank cho ai phát minh và khi nào ', 'Đức - 1925', 'Anh - 1916', 'Anh - 1925', 'Đức - 1895', 'B'),
(12, 9, 'Nước nào đang có ngư lôi hạt nhân ', 'Nga', 'Mỹ', 'Trung Quốc', 'Anh', 'A'),
(13, 9, 'Việt nam Có chiếm giữ bao nhiêu thực thể và thực thể nào chiến lược nhất ở Trường Sa', '15 - Thuyền Chài', '21 - Tiên Nữ', '15 - Châu Viên', '10 - Châu Viên', 'B'),
(14, 9, 'Hẻm Tu Sản - Sông Nho Quế ỏ địa phương nào nước ta ?', 'Quảng Ninh', 'Yên Bái', 'Bắc Cạn', 'Hà Giang', 'D'),
(15, 9, 'Tỉnh/Thành phố nào mệnh danh là thiên nhiên đẹp nhất Việt Nam nhưng lại là nghèo nhất Việt Nam về mặt kinh tế ', 'Sơn La', 'Tây Ninh', 'Hà Giang', 'Kon Tum', 'C'),
(16, 9, 'Chọn từ đúng dưới đây để điền vào chỗ trống “Ruộng bốn bề không bằng…trong tay” ?', 'nghề ', 'vàng', 'tiền', 'của', 'A'),
(17, 9, 'Việt Nam hứng chiu bao nhiêu tấn bom đạn từ chiến tranh với Mỹ', '800.000 tấn', '2 triệu tấn', '957.895 tấn', '15 triệu tấn', 'D'),
(29, 25, 'Trái đất của chúng ta có hình gì đây nào các bạn ?', 'cầu', 'tròn nha', 'ovan', 'chữ nhật', 'A'),
(30, 25, 'Lập trình mạng khó không', 'quá khó', 'khó', 'dễ', 'rất rất khó', 'B'),
(31, 25, 'Cách để vượt qua deadline', 'Qua đời', 'Cầu nguyện', 'Rút môn', 'Lên kế hoạch chính xác và đảm báo thực hiện tốt các mục tiêu đề ra.', 'D'),
(38, 28, 'Ai day lap trinh mang ?', 'Thầy Giang', 'Thầy A', 'Thầy B', 'Thầy C', 'A'),
(39, 28, '3+5', '8', '7', '6', '5', 'A'),
(40, 28, '3+3', '6', '5', '3', '1', 'A'),
(41, 31, 'Ta có ', 'a', 'g', 'h', '1', 'B'),
(42, 31, 'a', '5', '0', '7', '23', 'C'),
(43, 31, 'Quốc gia nào vô dịch worldcup nhiều nhất', 'Đức', 'Brazil', 'Ý', 'Pháp', 'B'),
(44, 32, '2+3=', '5', '8', '9', '4', 'A'),
(45, 32, 'Chúc bạn nhiều may mắn nhé', 'Chào ', 'b', 'c', 'd', 'B'),
(46, 32, '15+25=', '40', '50', '60', '45', 'A'),
(47, 33, 'Từ khóa extends là gì', 'kế thừa', 'đa hình', 'toàn cục', 'gọi ', 'A'),
(48, 33, '15+25=?', '40', '58', '36', '45', 'A'),
(49, 33, 'y=15\r\nx=45\r\nz=y-5\r\nz=?', '15', '40', '10', '25', 'C'),
(50, 37, 'Vấn đề nào sau đây liên quan chính đến pha thiết kế?', 'Khả thi', 'Dữ liệu', 'Tất cả các mục', 'Phạm vi dự án', 'C'),
(51, 37, 'Use-cases là một kịch bản mà mô tả:', 'Phần mềm thực hiện như thế nào khi được dùng trong một tình huống cho trước', 'Những công cụ CASE sẽ được dùng như thế nào để xây dựng hệ thống', 'Kế hoạch xây dựng cho sản phẩm phần mềm', 'Những test-case cho sản phẩm phần mềm', 'B'),
(52, 37, 'Từ điển dữ liệu chứa những mô tả của mỗi', 'Mục cấu hình phần mềm', 'Đối tượng dữ liệu phần mềm', 'Biểu đồ phần mềm', 'Hệ thống ký hiệu phần mềm', 'D'),
(53, 37, 'Từ điển dữ liệu chứa những mô tả của mỗi', 'Mục cấu hình phần mềm', 'Đối tượng dữ liệu phần mềm', 'Biểu đồ phần mềm', 'Hệ thống ký hiệu phần mềm', 'D'),
(54, 37, 'Từ điển dữ liệu chứa những mô tả của mỗi', 'Mục cấu hình phần mềm', 'Đối tượng dữ liệu phần mềm', 'Biểu đồ phần mềm', 'Hệ thống ký hiệu phần mềm', 'D');

-- --------------------------------------------------------

--
-- Table structure for table `results`
--

CREATE TABLE `results` (
  `id` int NOT NULL,
  `exam_id` int NOT NULL,
  `user_id` int NOT NULL,
  `score` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `results`
--

INSERT INTO `results` (`id`, `exam_id`, `user_id`, `score`) VALUES
(76, 9, 34, 7),
(77, 9, 32, 4),
(78, 7, 34, 0),
(79, 1, 34, 3.3),
(80, 33, 31, 0),
(81, 1, 37, 3.3),
(82, 37, 37, 6),
(83, 37, 37, 8),
(84, 37, 39, 4),
(85, 37, 40, 6);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `status` tinyint(1) DEFAULT '1',
  `gender` tinyint(1) DEFAULT '0',
  `birthday` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `role` tinyint(1) DEFAULT NULL,
  `otp` varchar(20) DEFAULT NULL,
  `otp_create_time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `email`, `password`, `name`, `status`, `gender`, `birthday`, `role`, `otp`, `otp_create_time`) VALUES
(2, 'dblinerman1@cpanel.net', '$2a$12$2NedCPpQh8VtQcKSPa3Oiuz.PXQMeIzUG1Lx9qbG.P9TtwL06BcdW', 'Tèo A Lủ', 1, 1, '2022-11-30 00:00:00', 0, NULL, NULL),
(3, 'vbrithman2@geocities.com', '$2a$12$2NedCPpQh8VtQcKSPa3Oiuz.PXQMeIzUG1Lx9qbG.P9TtwL06BcdW', 'Valaria', 2, 0, '2022-12-07 22:35:20', 0, NULL, NULL),
(4, 'datwill3@indiegogo.com', '$2a$12$2NedCPpQh8VtQcKSPa3Oiuz.PXQMeIzUG1Lx9qbG.P9TtwL06BcdW', 'Devin', 3, 0, '2022-12-07 22:35:20', 0, NULL, NULL),
(5, 'bdiss4@ucoz.com', '$2a$12$2NedCPpQh8VtQcKSPa3Oiuz.PXQMeIzUG1Lx9qbG.P9TtwL06BcdW', 'Bobina', 4, 1, '2022-12-07 22:35:20', 0, NULL, NULL),
(6, 'tambrogio5@macromedia.com', '$2a$12$2NedCPpQh8VtQcKSPa3Oiuz.PXQMeIzUG1Lx9qbG.P9TtwL06BcdW', 'Tamara', 0, 1, '2022-11-30 13:44:36', 0, NULL, NULL),
(7, 'erist6@sun.com', '$2a$12$2NedCPpQh8VtQcKSPa3Oiuz.PXQMeIzUG1Lx9qbG.P9TtwL06BcdW', 'Etty', 0, 0, '2022-11-30 13:44:36', 0, NULL, NULL),
(9, 'aproback8@deliciousdays.com', 'e06bf3201dacb9f9ae2e8efb51a2339d18017fbe445d316f48669bdd68aa6cd8', 'Athene', 0, 0, '0000-00-00 00:00:00', 0, NULL, NULL),
(10, 'rbulpitt9@deviantart.com', '220d63e8d037b87355f809199274fd82c47541e141a407fe79f9a40752d469f4', 'Ramonda', 1, 1, '0000-00-00 00:00:00', 0, NULL, NULL),
(11, 'tweara@technorati.com', 'd46d9799747fa86d03aa5cfec233db50fb9ab1b01c89908f6d7ca5de39632f90', 'Therese', 0, 1, '0000-00-00 00:00:00', 0, NULL, NULL),
(12, 'ltunsleyb@alexa.com', 'd28a0a031c8ddce1fec12ed71f37ab53422e8654ab98ad69525051dd1c76c199', 'Leann', 0, 0, '0000-00-00 00:00:00', 0, NULL, NULL),
(13, 'flemmc@cafepress.com', 'ffc1b12d4afa8ff44405597e96219d60a98458baf88909ea47d33b6afb08c40e', 'Frankie', 0, 0, '0000-00-00 00:00:00', 0, NULL, NULL),
(22, 'minhtrung@gmail.com', '$2a$09$g7ELO8kWTV6lquGOCKmQeeKYN.ao8JtAT3rat7vp9xuW46j0qfb7O', 'minhtrung', 1, 1, '2001-12-01 00:00:00', 0, NULL, NULL),
(31, 'tanthuan031@gmail.com', '$2a$09$BolldvZUnKd5ddh.oT8gluwNMoZS4UtHILCAUxrlZJ7yV5QhXfgh2', 'Tân Thuận Hồ \" #', 3, 1, '2022-12-08 11:35:01', 0, '879540', '2022-12-08 10:52:46'),
(32, 'minhtrung4367@gmail.com', '$2a$09$AWnSf0aJpISravyA98MlAOMMrzrTMwtgxXIdNbBusycg60sSfRzFG', 'Lê Văn Nam Xì', 1, 1, '2023-01-22 00:00:00', 0, NULL, NULL),
(34, 'nguyenducminhtrung0044@gmail.com', '$2a$09$c1ogbpqU4nE5HF4rcmZQKe7ixtEj0nhdOwZhm0z/MCmJrvq6X5UCW', 'Nguyen Van Teo A Lủ', 1, 1, '2023-01-23 00:00:00', 0, NULL, NULL),
(36, 'kingofdarkness2402@gmail.com', '$2a$09$lUlXqi/w.J8BNs/9m1RH5eydi5EVuWlhkmfT64Bqeb/5MJ775Fpyu', 'Teo', 1, 1, '2023-04-10 12:26:13', 0, NULL, NULL),
(37, 'tuanconghuynh77@gmail.com', '$2a$09$QkIqMoTITChmwolIFPFxXOfIw51PsQPqGZRbgLhkdSVYEsQju7bEO', 'tuanhuynh', 1, 1, '2023-10-13 14:17:31', 0, NULL, NULL),
(39, 'hctbuffsao1@gmail.com', '$2a$09$UtXhsuRdS7Y6zsyc.rxiA.4auqa6RhTRFySD58wEwwF/1/r6CGQ7i', 'Tuấn', 1, 1, '2023-10-19 14:43:23', 0, NULL, NULL),
(40, 'tuanconghuynh777@gmail.com', '$2a$09$G7.W2kIYZ3kynBxCiMskA.tf2AdXeQFMAIIlOh5B.Gb1HtZPDUm46', 'Huiynh Cong Tuan', 1, 1, '2023-10-19 15:40:01', 0, NULL, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `exams`
--
ALTER TABLE `exams`
  ADD PRIMARY KEY (`id`,`user_id`),
  ADD KEY `user_id` (`user_id`);

--
-- Indexes for table `questions`
--
ALTER TABLE `questions`
  ADD PRIMARY KEY (`id`,`exam_id`),
  ADD KEY `exam_id` (`exam_id`);

--
-- Indexes for table `results`
--
ALTER TABLE `results`
  ADD PRIMARY KEY (`id`,`exam_id`),
  ADD KEY `user_id` (`user_id`),
  ADD KEY `exam_id` (`exam_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `exams`
--
ALTER TABLE `exams`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=38;

--
-- AUTO_INCREMENT for table `questions`
--
ALTER TABLE `questions`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=55;

--
-- AUTO_INCREMENT for table `results`
--
ALTER TABLE `results`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=86;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `exams`
--
ALTER TABLE `exams`
  ADD CONSTRAINT `exams_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);

--
-- Constraints for table `questions`
--
ALTER TABLE `questions`
  ADD CONSTRAINT `questions_ibfk_1` FOREIGN KEY (`exam_id`) REFERENCES `exams` (`id`);

--
-- Constraints for table `results`
--
ALTER TABLE `results`
  ADD CONSTRAINT `results_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`),
  ADD CONSTRAINT `results_ibfk_2` FOREIGN KEY (`exam_id`) REFERENCES `exams` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
