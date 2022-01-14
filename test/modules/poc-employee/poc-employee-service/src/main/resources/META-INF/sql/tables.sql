create table DG_EmployeeEntry (
	uuid_ VARCHAR(75) null,
	employeeId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	birthDay DATE null,
	gender INTEGER,
	address VARCHAR(75) null,
	hasAccount BOOLEAN
);