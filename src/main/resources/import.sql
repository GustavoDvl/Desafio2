INSERT INTO tb_participants (name, email) VALUES ('Jose Silva', 'jose@gmail.com');
INSERT INTO tb_participants (name, email) VALUES ('Tiago Faria', 'tiago@gmail.com');
INSERT INTO tb_participants (name, email) VALUES ('Maria do Rosario', 'maria@gmail.com');
INSERT INTO tb_participants (name, email) VALUES ('Teresa Silva', 'teresa@gmail.com');

INSERT INTO tb_activity (name, description, price) VALUES('Curso de HTML', 'Aprenda HTML de forma prática', 80.00);
INSERT INTO tb_activity (name, description, price) VALUES('Oficina de Github', 'Controle de versões do seus projetos', 50.00);

INSERT INTO tb_category (description) VALUES ('Curso');
INSERT INTO tb_category (description) VALUES ('Oficina');

INSERT INTO tb_block (start, end, tb_activity) VALUES ('2017/04/11 08:00:00 11:00:00', 3 );
--INSERT INTO tb_block (start) VALUES ('25/09/2017', '14:00:00','18:00:00');
--INSERT INTO tb_block (start, end) VALUES ('26/09/2017', '08:00:00', '11:00:00');

