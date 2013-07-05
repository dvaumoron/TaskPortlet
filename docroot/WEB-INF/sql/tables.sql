create table Task_Task (
	taskId LONG not null primary key,
	companyId LONG,
	name VARCHAR(75) null,
	done BOOLEAN,
	description VARCHAR(75) null
);