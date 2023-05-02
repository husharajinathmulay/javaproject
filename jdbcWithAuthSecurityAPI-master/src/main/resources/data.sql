Insert Into users(username,password,enabled)
 values('user','pass',true);
Insert Into users(username,password,enabled)
 values('admin','pass',true);
Insert Into authorities(username,authority)
  values('user','ROLE_USER');
Insert Into authorities(username,authority)
  values('admin','ROLE_ADMIN');
