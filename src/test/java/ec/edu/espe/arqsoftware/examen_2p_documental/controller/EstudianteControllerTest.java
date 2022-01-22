package ec.edu.espe.arqsoftware.examen_2p_documental.controller;

import ec.edu.espe.arqsoftware.examen_2p_documental.dao.EstudianteRepository;
import ec.edu.espe.arqsoftware.examen_2p_documental.model.Estudiante;
import ec.edu.espe.arqsoftware.examen_2p_documental.service.EstudianteService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

class EstudianteControllerTest {

    @Mock
    private EstudianteService estudianteService;

    @InjectMocks
    private EstudianteController estudianteController;

    private Estudiante estudiante;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

        estudiante = new Estudiante();
        estudiante.setName("Jairo");
        estudiante.setEmail("javizuete1@espe.edu.ec");
        estudiante.setBirthday(new Date());
        estudiante.setCreationDate(new Date());
        estudiante.setStatus("ACT");
    }

    @Test
    void crearPersona() {
        when(estudianteService.crearEstudiante(any(Estudiante.class))).thenReturn(estudiante);
    }
}