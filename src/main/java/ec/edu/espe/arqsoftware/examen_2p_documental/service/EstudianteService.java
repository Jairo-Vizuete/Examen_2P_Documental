package ec.edu.espe.arqsoftware.examen_2p_documental.service;

import ec.edu.espe.arqsoftware.examen_2p_documental.dao.EstudianteRepository;
import ec.edu.espe.arqsoftware.examen_2p_documental.model.Estudiante;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
@Slf4j
public class EstudianteService {

    private final EstudianteRepository estudianteRepository;

    public EstudianteService(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    public Optional<Estudiante> obtenerPorEmail(String email){
        return this.estudianteRepository.findByEmail(email);
    }

    public void crearEstudiante(Estudiante estudiante) {
        log.info("Se va a crear el estudiante con la siguiente informacion: {}", estudiante);
        Optional<Estudiante> estudianteOpt = this.estudianteRepository.findByEmail(estudiante.getEmail());

        if (!estudianteOpt.isPresent()){
            estudiante.setCreationDate(new Date());
            this.estudianteRepository.save(estudiante);
        }else{
            throw new RuntimeException("El estudiante con el email: "+estudiante.getEmail()+" ya existe.");
        }
    }
}
