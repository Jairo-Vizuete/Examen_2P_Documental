package ec.edu.espe.arqsoftware.examen_2p_documental.controller;

import ec.edu.espe.arqsoftware.examen_2p_documental.model.Curso;
import ec.edu.espe.arqsoftware.examen_2p_documental.service.CursoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/curso")
@Slf4j
public class CursoController {
    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping(value = "{area}")
    public ResponseEntity obtenerCursos(@PathVariable("area") String area) {
        try {
            List<Curso> cursos = this.cursoService.listarPorArea(area);
            return ResponseEntity.ok(cursos);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    /*@GetMapping(value = "{data}")
    public ResponseEntity listarPorAreaONombre(@PathVariable("data") String areaOrName) {
        try {
            List<Curso> curso = this.cursoService.listarPorAreaONombre(areaOrName, areaOrName);
            return ResponseEntity.ok(curso);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }*/
}
