
drop table tbl_demo;

create table tbl_demo(
  id number(9) primary key,

  userName varchar2(10),
  password varchar2(10),

  createDate date,
  createUser varchar2(10),
  updateDate date,
  updateUser varchar2(10),
  deleteFlag char(1)
);

insert into tbl_demo (ID, USERNAME, PASSWORD, CREATEDATE, CREATEUSER, UPDATEDATE, UPDATEUSER, DELETEFLAG)
values (1, '张三', '654321', to_date('11-06-2014 15:11:10', 'dd-mm-yyyy hh24:mi:ss'), 'Admin', to_date('11-06-2014 15:11:11', 'dd-mm-yyyy hh24:mi:ss'), 'Admin', '0');

select * from tbl_demo for update;
