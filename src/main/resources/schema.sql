drop table if exists visitor;
CREATE TABLE visitor (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(70) NOT NULL,
  email varchar(70) NULL,
  city varchar(70) NOT NULL,
  gender varchar(10) NOT NULL,
  dob date NOT NULL,
  created_date date NOT NULL,
  PRIMARY KEY (id)
);