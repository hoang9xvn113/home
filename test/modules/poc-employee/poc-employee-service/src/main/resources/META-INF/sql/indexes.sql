create index IX_7260768D on DG_EmployeeEntry (name[$COLUMN_LENGTH:75$]);
create index IX_F5A6E3C2 on DG_EmployeeEntry (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_37B972C4 on DG_EmployeeEntry (uuid_[$COLUMN_LENGTH:75$], groupId);