package ec.edu.espe.arqsoftware.examen_2p_documental.service;

import ec.edu.espe.arqsoftware.examen_2p_documental.dao.EstudianteRepository;
import ec.edu.espe.arqsoftware.examen_2p_documental.model.Estudiante;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

class EstudianteServiceTest {

    @Mock
    private EstudianteRepository estudianteRepository;

    @InjectMocks
    private EstudianteService estudianteService;

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
    void crearEstudiante() {
        when(estudianteRepository.save(any(Estudiante.class))).thenReturn(estudiante);
    }
}