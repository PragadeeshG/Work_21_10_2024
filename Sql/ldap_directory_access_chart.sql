create table if not exists ldap_directory_access_chart(
ldap_server_url Integer not null,
ldap_directory_access_id Integer null,
ldap_directory_access_budget_indicator varchar(255) null,
ldap_directory_access_sheet varchar(255) null,
ldap_directory_access_control_flag varchar(255) null,
ldap_directory_access_desc varchar(255) null,
ldap_directory_access_short_desc varchar(255) null,
ldap_directory_access_type varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint ldap_directory_access_chart_pk primary key(ldap_server_url));