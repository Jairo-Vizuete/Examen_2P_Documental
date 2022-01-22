package ec.edu.espe.arqsoftware.examen_2p_documental.controller;

import ec.edu.espe.arqsoftware.examen_2p_documental.model.Estudiante;
import ec.edu.espe.arqsoftware.examen_2p_documental.service.EstudianteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/estudiante")
@Slf4j
public class EstudianteController {
    private final EstudianteService estudianteService;

    public EstudianteController(EstudianteService estudianteService) {
        this.estudianteService = estudianteService;
    }

    @PostMapping
    public ResponseEntity crearPersona(@RequestBody Estudiante estudiante){
        try {
            log.info("Va a crear el estudiante con la siguiente informacion: {}", estudiante);
            this.estudianteService.crearEstudiante(estudiante);
            return ResponseEntity.ok().build();
        }catch (Exception e){
            log.error("Ocurrio un error al crear el estudiante. {} - retorna badrequest", e.getMessage());
            return ResponseEntity.badRequest().build();
        }
    }
}
