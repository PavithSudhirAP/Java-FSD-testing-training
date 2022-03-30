-- 1) created a database used it
create database example;
use example;

-- created tables
create table addresses(
id int,
house_no int,
city varchar(20),
postalcode varchar(6)
);

alter table addresses
add primary key (id);

alter table addresses
drop primary key;

describe addresses;
show create table addresses;


create table people(
id int,
first_name varchar(20),
last_name varchar(20),
address_id int
);
alter table people
add primary key(id);
describe people;

alter table people
add constraint fk_people
foreign key (address_id) references addresses(id);

describe people;
show create table people;

create table pets(
id int,
name varchar(20),
species varchar(20),
owner_id int
);

describe pets;
show create table pets;

-- 2)added and deleted primary keys
alter table pets
add primary key (id);

alter table pets
drop primary key;

-- 3) added and deleted foreign keys
alter table pets
add constraint fk_pets
foreign key (owner_id) references people(id);

alter table pets
drop foreign key fk_pets;

alter table pets
drop index fk_pets;

-- 4) to see the properties 
show create table pets;

-- 5)added and deleted unique constraint
alter table pets
add constraint u_species unique (species);

alter table pets
drop index u_species;

-- 6) changed the column_name of a particular table
alter table pets change `species` `animal_type`varchar(15);

-- 7) changed the data_type of a column.
alter table pets modify animal_type varchar(20);

describe pets;


