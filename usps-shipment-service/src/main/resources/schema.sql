create schema if not exists usps_shipment;

use usps_shipment;

create table if not exists shipment(
shipment_id int(11) not null auto_increment primary key,
name varchar(100) not null,
tracking_number varchar(100) not null
);