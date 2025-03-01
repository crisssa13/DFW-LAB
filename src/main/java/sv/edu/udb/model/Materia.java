package sv.edu.udb.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
}