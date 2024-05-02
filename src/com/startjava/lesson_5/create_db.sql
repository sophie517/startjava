\c robots

DROP TABLE IF EXISTS jaegers;

-- create database
CREATE TABLE jaegers (
    id 		SERIAL PRIMARY KEY,
    model_name  TEXT,
    mark 	CHAR(6),
    height 	REAL,
    weight 	NUMERIC,
    status 	TEXT,
    origin 	TEXT,
    launch 	INTEGER,
    kaiju_kill 	INTEGER
);

\ir init_db.sql
\ir queries.sql