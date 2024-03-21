package edu.ucaldas.LectorQR.entities;

import edu.ucaldas.LectorQR.entities.enums.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Entity
@Table(name = "docente")
@Data
@EqualsAndHashCode(callSuper=false)
public class Docente extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDocente;

    @Column(length = 100)
    private String nombre;

    @Column(length = 100)
    private String segundoNombre;

    @Column(length = 100)
    private String apellido;

    @Column(length = 100)
    private String segundoApellido;

    @Column(length = 50)
    private String codigo;

    @ManyToMany(targetEntity = Asignatura.class)
    @JoinTable(name = "DOCENTE_ASIGNATURA_MAPPING", joinColumns = @JoinColumn(name = "idAsignatura"),
            inverseJoinColumns = @JoinColumn(name = "idDocente"))
    private List<Asignatura> asignaturas;
}
