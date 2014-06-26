
create sequence seq_demo_id minvalue 1 start with 1 increment by 1 cache 20;

select seq_demo_id.nextval from tbl_demo