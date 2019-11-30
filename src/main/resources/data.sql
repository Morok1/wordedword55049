DROP TABLE IF EXISTS USERS;
DROP TABLE IF EXISTS TRAVELS;
DROP TABLE IF EXISTS Regions;
DROP TABLE IF EXISTS flights;

CREATE TABLE users (
  id INT(11) NOT NULL,
  name VARCHAR(25),
  PRIMARY KEY (id)
);


CREATE TABLE travels (
  travel_id INT(11) NOT NULL,
  user_id INT(11) NOT NULL,
  name VARCHAR(25),

  PRIMARY KEY (travel_id),
  FOREIGN KEY (user_id) REFERENCES USERS(id)
);
create table regions(
  id int(11) Primary key,
  name varchar(25) not null,
  destination varchar(25) not null,
  requirements varchar(25) not null
  );

create table flights(
  flight_id int(11) Primary key,
  travel_id int(11),
  destination varchar(25) not null,
--   region_id int(11) not null,
  order_travel int(11) not null,
  price int(11) not null,
  foreign key (travel_id) references travels(travel_id),
--   foreign key (region_id) references regions(id)
);





INSERT INTO users
   VALUES (1, 'Nick'), (2, 'Ed') ,   (3, 'Igor'),   (4,'Yarik');
INSERT INTO travels
   VALUES (1, 1, 'Travel 1');

insert into regions values (1, 'Europe', 'Rome', 'Visa');
insert into flights values (1, 1, 'Rome' ,  1, 111);
