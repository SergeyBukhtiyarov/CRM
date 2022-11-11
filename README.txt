Create DB hibernate and admin user in postgres:


1) psql   -> open postgres command line
2) CREATE DATABASE "crm" WITH OWNER=postgres;
3) CREATE USER "admin" WITH PASSWORD 'admin';
4) GRANT ALL PRIVILEGES ON DATABASE crm TO admin;
5) \l
   \du  -> list of all existing db and users, just created 'admin' & 'hibernate' should appear here
   \dt  -> list of all tables in selected db

=========================================================================================

