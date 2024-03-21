package edu.ucaldas.LectorQR.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Entity
@Table(name = "estudiante")
@Data
@EqualsAndHashCode(callSuper=false)
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstudiante;

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

    @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
    @JoinTable(name = "ESTUDIANTE_ASIGNATURA_MAPPING", joinColumns = @JoinColumn(name = "idAsignatura"),
            inverseJoinColumns = @JoinColumn(name = "idEstudiante"))
    private List<Asignatura> asignaturas;
}
