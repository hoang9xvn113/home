create table DG_HomeEntry (
	uuid_ VARCHAR(75) null,
	homeId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	address VARCHAR(75) null,
	floor INTEGER,
	square DOUBLE,
	room INTEGER,
	color VARCHAR(75) null,
	owner VARCHAR(75) null
);