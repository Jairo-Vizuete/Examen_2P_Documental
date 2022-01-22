package ec.edu.espe.arqsoftware.examen_2p_documental.dao;

import ec.edu.espe.arqsoftware.examen_2p_documental.model.Curso;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CursoRepository extends MongoRepository<Curso, String> {

    List<Curso> findByArea(String area);

    List<Curso> findByAreaLikeOrName(String area, String name);
}
