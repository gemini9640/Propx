
CREATE TABLE `submit_requirement` (
  `id` int(9) NOT NULL AUTO_INCREMENT,
  `buy_sell` text NOT NULL,
  `from_place` varchar(100) NOT NULL,
  `fullname` varchar(100) NOT NULL,
  `contact` varchar(40) NOT NULL,
  `email` varchar(100) NOT NULL,
  `title_type` text NOT NULL,
  `size` varchar(30) NOT NULL,
  `propery_type` varchar(100) NOT NULL,
  `price` varchar(100) NOT NULL,
  `bedrooms` varchar(50) NOT NULL,
  `bathrooms` varchar(50) NOT NULL,
  `parking_lot` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8