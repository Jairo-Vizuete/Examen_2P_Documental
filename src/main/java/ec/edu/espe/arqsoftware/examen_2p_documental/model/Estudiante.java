package ec.edu.espe.arqsoftware.examen_2p_documental.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@Document(collection = "estudiantes")
public class Estudiante {

    @Id
    private String id;
    private String name;
    private String email;
    private Date birthday;
    private Date creationDate;
    private String status;

}
