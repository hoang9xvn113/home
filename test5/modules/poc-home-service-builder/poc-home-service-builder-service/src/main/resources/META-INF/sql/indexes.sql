create index IX_1F2576C7 on DG_HomeEntry (address[$COLUMN_LENGTH:75$]);
create index IX_DA3AB0B1 on DG_HomeEntry (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_4769AF73 on DG_HomeEntry (uuid_[$COLUMN_LENGTH:75$], groupId);