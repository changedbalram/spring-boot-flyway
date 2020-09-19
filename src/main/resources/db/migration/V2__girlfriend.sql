create table girlfriend (
  	girl_id int identity primary key,
  	short_name varchar(20) not null,
  	contact_name varchar (50) not null,
  	contact_number varchar (20) not null,
  	constraint gfr_bfr_fk
    foreign key (girl_id)
    references boyfriend (boy_id)
);

insert into girlfriend (girl_id, short_name, contact_name, contact_number)
						select boy_id,short_name,contact_name,contact_number from boyfriend;

alter table boyfriend drop column contact_name;
alter table boyfriend drop column contact_number;
