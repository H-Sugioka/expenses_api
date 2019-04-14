insert into user(user_id,password,create_date) 
values
('test1','test1',now()),
('test2','test2',now()),
('test3','test3',now()),
('test4','test4',now()),
('test5','test5',now());

insert into spending(
category_id,
product_name,
amount,
purchace_date)
values
(1,'食費',500,now()),
(2,'ゲーム代',6000,now()),
(3,'定期代',14000,now()),
(4,'光熱費',5000,now()),
(5,'医療費',3000,now());

insert into category(name)
values
('食費'),
('ゲーム代'),
('定期代'),
('光熱費'),
('医療費');