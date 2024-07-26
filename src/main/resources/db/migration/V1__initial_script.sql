CREATE EXTENSION IF NOT EXISTS "uuid-ossp";
create table accounts (
	id uuid not null default uuid_generate_v4() primary key,
	account_name varchar (255) not null,
	created_date timestamp not null default now(),
    last_updated timestamp not null default now()
);

insert into accounts (account_name, created_date, last_updated) values ('admin', now(), now());
insert into accounts (account_name, created_date, last_updated) values ('user', now(), now());