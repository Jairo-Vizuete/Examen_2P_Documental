package ec.edu.espe.arqsoftware.examen_2p_documental.service;

import ec.edu.espe.arqsoftware.examen_2p_documental.dao.CursoRepository;
import ec.edu.espe.arqsoftware.examen_2p_documental.model.Curso;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CursoService {
    private final CursoRepository cursoRepository;

    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public List<Curso> listarPorArea(String area){
        log.info("La lista es: {}", this.cursoRepository.findByArea(area));
        return this.cursoRepository.findByArea(area);
    }

    public List<Curso> listarPorAreaONombre(String area, String name){
        return this.cursoRepository.findByAreaLikeOrName(area, name);
    }
}
