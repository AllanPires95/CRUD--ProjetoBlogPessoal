USE db_blogpessoal;


INSERT INTO tb_postagens (data, texto, titulo) 
VALUES (current_timestamp(), 'Postagem 01', 'Texto da postagem 01');
INSERT INTO tb_postagens (data, texto, titulo) 
VALUES (current_timestamp(), 'Postagem 02', 'texto da postagem 02');

SELECT * FROM tb_postagens;