package org.generation.db_blogpessoal.repository;
import java.util.List;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.generation.db_blogpessoal.model.Postagem;

@Repository
public interface postagemRepository extends JpaRepositoryImplementation<Postagem,Long> {
	public List <Postagem> findAllByTituloContainingIgnoreCase(@Param("Titulo") String Titulo);

}
