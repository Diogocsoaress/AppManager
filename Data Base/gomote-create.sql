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

	crd_latone VARCHAR(15),
	crd_lngone VARCHAR(15),

	crd_lattwo VARCHAR(15),
	crd_lngtwo VARCHAR(15),

	crd_latthree VARCHAR(15),
	crd_lngthree VARCHAR(15),

	crd_latfour VARCHAR(15),
	crd_lngfour VARCHAR(15),

	primary key(crd_id)
);
adicionar pontos (coordenadas) das áreas