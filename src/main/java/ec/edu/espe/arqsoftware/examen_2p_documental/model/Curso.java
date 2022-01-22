package ec.edu.espe.arqsoftware.examen_2p_documental.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Document(collection = "cursos")
public class Curso {
    @Id
    private String id;
    private String code;
    private String area;
    private String name;
    private Date classDuration;
    private Date startDate;
    private BigDecimal cost;
}
