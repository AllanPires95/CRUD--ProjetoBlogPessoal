USE db_blogpessoal;


INSERT INTO tb_postagens (data, texto, titulo) 
VALUES (current_timestamp(), 'Bem vindo ao git', 'Welcome 24/01');
INSERT INTO tb_postagens (data, texto, titulo) 
VALUES (current_timestamp(), 'Portfolio', 'Estudos');

SELECT * FROM tb_postagens;