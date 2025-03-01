package sv.edu.udb.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;

    @Column(name = "id_materia")
    private Long idMateria;
}