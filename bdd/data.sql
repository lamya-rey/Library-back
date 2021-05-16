CREATE TABLE user (id INTEGER PRIMARY KEY,
                       name VARCHAR(255),
                       age INTEGER,
                       category VARCHAR(255),
                       email VARCHAR(255),
                       nbrEmp INTEGER,
                       userName VARCHAR(255),
                       password VARCHAR(255)
);

CREATE TABLE book (id INTEGER PRIMARY KEY,
                   title VARCHAR(255),
                   category VARCHAR(255),
                   cover VARCHAR(255),
                   user_id INTEGER
);

CREATE TABLE comment (id INTEGER PRIMARY KEY,
                      title VARCHAR(255),
                      content VARCHAR(255),
                      user_id INTEGER,
                      book_id INTEGER
);

insert into user (id, name,age, category, email, user_name, nbr_empr) values (1,'amira', 15, 'ado', 'amirafahem1920@gmail.com','amira_fahem', 2);
insert into user (id, name,age, category, email, user_name, nbr_empr) values (2,'ahlem', 6, 'enfant', 'ahlem.fahem98@gmail.com','ahlem123',1);
insert into user (id, name,age, category, email, user_name, nbr_empr)values (3,'lamya', 23 , 'adulte', 'lamya.rayess1@gmail.com','lamia.rayess', 2);
insert into user (id, name,age, category, email, user_name, nbr_empr) values (4,'hanen', 17 , 'ado', 'hanen_mansour@gmail.com','hanen1997', 2);
insert into user (id, name,age, category, email, user_name, nbr_empr) values (5,'ines', 10 ,'enfant', 'ines.loulou123@gmail.com','inesnoussa', 3);
insert into user (id, name,age, category, email, user_name, nbr_empr) values (6,'test', 10 ,'ado', 'test.loulou123@gmail.com','testnoussa', 0);
COMMIT;

insert into book (id, title, cover, category, user_id) values (1,'the fault in our stars', 'https://images2.medimops.eu/product/07b38f/M00141345632-source.jpg', 'adulte', 3);
insert into book (id, title, cover, category, user_id) values (2,'the citadel', 'https://images2.medimops.eu/product/f1e30f/M00316161837-source.jpg', 'enfant', 5);
insert into book (id, title, cover, category, user_id) values (3,'Le chat Tome', 'https://images2.medimops.eu/product/bd51dd/M0281042909X-source.jpg', 'enfant', 5);
insert into book (id, title, cover, category, user_id) values (4,'Bla bla bla Tome', 'https://pictures.abebooks.com/inventory/30150757932.jpg', 'ado', 4);
insert into book (id, title, cover, category, user_id) values (5,'Magnificat', 'https://images2.medimops.eu/product/27643b/M00283221143-source.jpg', 'ado', 1);
insert into book (id, title, cover, category, user_id) values (6,'Chonchon', 'https://img.livraddict.com/covers/200/200097/couv55991104.jpg', 'ado', 1);
insert into book (id, title, cover, category, user_id) values (7,'La tarentule', 'https://f4.bcbits.com/img/a2942852870_10.jpg', 'adulte',3);
insert into book (id, title, cover, category, user_id) values (8,'Darkness Tome', 'https://cdn1.booknode.com/book_cover/1099/full/darkness-tome-1-darkness-of-light-1099111.jpg', 'enfant',2);
insert into book (id, title, cover, category, user_id) values (9,'La dame Abou Simbel', 'https://images2.medimops.eu/product/6d3b45/M02221081560-source.jpg', 'ado',4);
insert into book (id, title, cover, category, user_id) values (10,'Le Masque Doré', 'https://img.wattpad.com/5694475d85bf9f848fcb7d0a4d71edc429edaed5/68747470733a2f2f73332e616d617a6f6e6177732e636f6d2f776174747061642d6d656469612d736572766963652f53746f7279496d6167652f74644c656d7347423232633964413d3d2d32322e313562356531306266636630316465373137383637303939383834362e6a7067', 'enfant', 5);
COMMIT;

insert into comment (id, content, title, book_id, user_id) values (1,'seems Great', 'motivated', 5, 2);
insert into comment (id, content, title, book_id, user_id) values (2,'i Like it', 'grateful', 6, 1);
insert into comment (id, content, title, book_id, user_id) values (3,'Amazing book', 'Avis', 1,3);
insert into comment (id, content, title, book_id, user_id) values (4, 'i dislike its too long', 'too long', 2, 5);
insert into comment (id, content, title, book_id, user_id) values (5,'Good book', 'Avis', 4, 4);
COMMIT;