delimiter $$

CREATE TABLE `trainer_personal` (
  `personal_id` int(11) NOT NULL,
  `mother_tongue` varchar(45) DEFAULT NULL,
  `hometown` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`personal_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$

delimiter $$

CREATE TABLE `trainer_professional` (
  `trainer_id` int(11) NOT NULL,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `designation` varchar(45) DEFAULT NULL,
  `salary` double DEFAULT NULL,
  `trainer_personal_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`trainer_id`),
  KEY `trainer_personal_id_idx` (`trainer_personal_id`),
  CONSTRAINT `trainer_personal_id` FOREIGN KEY (`trainer_personal_id`) REFERENCES `trainer_personal` (`personal_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$

