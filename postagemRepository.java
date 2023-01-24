package org.generation.db_blogpessoal.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;
import org.generation.db_blogpessoal.model.Postagem;

@Repository
public interface postagemRepository extends JpaRepositoryImplementation<Postagem,Long> {

}
