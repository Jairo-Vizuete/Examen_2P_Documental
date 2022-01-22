package ec.edu.espe.arqsoftware.examen_2p_documental.dao;

import ec.edu.espe.arqsoftware.examen_2p_documental.model.Estudiante;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface EstudianteRepository extends MongoRepository<Estudiante, String> {

    Optional<Estudiante> findByEmail (String email);
}
