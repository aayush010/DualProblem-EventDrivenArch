CREATE DATABASE movr_rides;

CREATE TABLE movr_rides.rides (
	id UUID PRIMARY KEY,
	vehicle_id UUID NOT NULL,
	user_email STRING NOT NULL,
	start_ts TIMESTAMP NOT NULL,
	end_ts TIMESTAMP DEFAULT NULL
);

CREATE TABLE movr_rides.events(
	id UUID,
	ts TIMESTAMP,
	event_type STRING,
	event_data STRING
);