create table boyfriend (
  boy_id int identity primary key,
  short_name varchar(20) not null,
  contact_name varchar (50) not null,
  contact_number varchar (20) not null
);

insert into boyfriend (short_name, contact_name, contact_number) values
  ('Tiffin', 'Rushi',  '123564879'),
  ('CreditCard', 'Mahi',  '65985623'),
  ('Lunch', 'Arora',  '2325689565'),
  ('Dinner', 'Sashi',  '784549454'),
  ('TimePass', 'Ekveer',  '874545812');