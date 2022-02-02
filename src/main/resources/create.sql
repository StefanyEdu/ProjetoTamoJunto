
DROP TABLE IF EXISTS user_event CASCADE;

DROP TABLE IF EXISTS users CASCADE;

DROP TABLE IF EXISTS events CASCADE;
create table users(
    id uuid not null,
    nikename varchar(100) not null,
    registration varchar(80) not null, 
    date varchar(8) not null,
    primary key (id)

);

create table events(
    id uuid not null,
    eventType varchar(100) not null,
    eventDateTime varchar(80) not null, 
    primary key (id)

);
create table user_event (
   users_id uuid not null ,
    events_id uuid not null,
 CONSTRAINT FK_users_id FOREIGN KEY (users_id)
 REFERENCES users (id),
 CONSTRAINT FK_events_id FOREIGN KEY (events_id)
 REFERENCES events (id));