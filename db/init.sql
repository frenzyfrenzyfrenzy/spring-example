create table MOBILE_DEVICES
(
    MID         varchar,
    USERNAME    varchar,
    APP_VERSION varchar
);

alter table MOBILE_DEVICES
    add constraint PK_MOBILE_DEVICES primary key (MID, USERNAME);