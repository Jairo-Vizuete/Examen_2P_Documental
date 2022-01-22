package ec.edu.espe.arqsoftware.examen_2p_documental.service;

import ec.edu.espe.arqsoftware.examen_2p_documental.dao.CursoRepository;
import ec.edu.espe.arqsoftware.examen_2p_documental.dao.EstudianteRepository;
import ec.edu.espe.arqsoftware.examen_2p_documental.model.Curso;
import ec.edu.espe.arqsoftware.examen_2p_documental.model.Estudiante;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.data.domain.Sort;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

class CursoServiceTest {

    @Mock
    private CursoRepository cursoRepository;

    @InjectMocks
    private CursoService cursoService;

    private Curso curso;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);


        curso = new Curso();
        curso.setCode("NRC2020");
        curso.setArea("Sotware");
        curso.setName("Arquitectura de Software");
        curso.setStartDate(new Date());
        curso.setClassDuration(new Date());
        curso.setCost(new BigDecimal(45));
    }

    @Test
    void listarPorArea() {
        when(cursoRepository.findByArea(any(String.class))).thenReturn(Arrays.asList(curso));
    }
}