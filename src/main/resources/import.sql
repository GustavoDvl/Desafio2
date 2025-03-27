INSERT INTO tb_participants (name, email) VALUES ('Jose Silva', 'jose@gmail.com');
INSERT INTO tb_participants (name, email) VALUES ('Tiago Faria', 'tiago@gmail.com');
INSERT INTO tb_participants (name, email) VALUES ('Maria do Rosario', 'maria@gmail.com');
INSERT INTO tb_participants (name, email) VALUES ('Teresa Silva', 'teresa@gmail.com');

INSERT INTO tb_activity (name, description, price) VALUES('Curso de HTML', 'Aprenda HTML de forma prática', 80.00);
INSERT INTO tb_activity (name, description, price) VALUES('Oficina de Github', 'Controle de versões do seus projetos', 50.00);

INSERT INTO tb_category (description) VALUES ('Curso');
INSERT INTO tb_category (description) VALUES ('Oficina');


INSERT INTO tb_activity_participant (activity_id, participant_id) VALUES (1, 1);
INSERT INTO tb_activity_participant (activity_id, participant_id) VALUES (1, 2);
INSERT INTO tb_activity_participant (activity_id, participant_id) VALUES (2, 3);

INSERT INTO tb_block (start, end_moment, activity_id) VALUES (TIMESTAMP WITH TIME ZONE '2022-07-25T08:00:00Z',TIMESTAMP WITH TIME ZONE '2023-10-27T10:00:00Z', 1);
INSERT INTO tb_block (start, end_moment, activity_id) VALUES (TIMESTAMP WITH TIME ZONE '2022-07-25T08:00:00',TIMESTAMP WITH TIME ZONE '2023-10-27T10:00:00Z', 1);
INSERT INTO tb_block (start, end_moment, activity_id) VALUES (TIMESTAMP WITH TIME ZONE '2022-07-25T08:00:00',TIMESTAMP WITH TIME ZONE '2023-10-27T10:00:00Z', 1);


