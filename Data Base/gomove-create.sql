create table users (

	usr_id SERIAL not null,

	usr_username VARCHAR(20) not null,
	usr_name VARCHAR(25) not null,  	
	usr_bdate date not null, 		
	usr_gender CHAR(1) not null, 		
	usr_email VARCHAR(30), 					
	usr_password VARCHAR(20),
	usr_points int not null,
	usr_area_id VARCHAR(15),

	primary key (usr_id)	
);           



create table areas (

	are_id SERIAL not null,

	are_ids int not null,
	are_points int not null,

	primary key (are_id)	

);          



create table coords (

	crd_id SERIAL not null,

	crd_are_id INT not null,

	crd_latone FLOAT,
	crd_lngone FLOAT,

	crd_lattwo FLOAT,
	crd_lngtwo FLOAT,

	crd_latthree FLOAT,
	crd_lngthree FLOAT,

	crd_latfour FLOAT,
	crd_lngfour FLOAT,

	crd_sqrarea FLOAT,
	
	primary key(crd_id)
);

create table areacoords (

	areacrd_id SERIAL not null,

	areacrd_area_id INT not null,
	areacrd_crd_id INT not null,

	primary key(areacrd_id)
);


alter table areacoords
add constraint areacoord_fk_areas
foreign key (areacrd_area_id) references areas(are_id)
ON DELETE NO ACTION ON UPDATE NO ACTION;

alter table areacoords
add constraint areacoord_fk_coords
foreign key (areacrd_crd_id) references coords(crd_id)
ON DELETE NO ACTION ON UPDATE NO ACTION;