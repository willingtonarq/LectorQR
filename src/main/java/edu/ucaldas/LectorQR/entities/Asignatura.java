package edu.ucaldas.LectorQR.entities;

import edu.ucaldas.LectorQR.entities.enums.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "asignatura")
@Data
@EqualsAndHashCode(callSuper=false)
public class Asignatura extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAsignatura;

    @Column (length = 50)
    private String nombre;

    @Column (length = 50)
    private String codigo;


    @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
    @JoinTable(name = "ASIGNATURA_ESTUDIANTE_MAPPING", joinColumns = @JoinColumn(name = "idEstudiante"),
            inverseJoinColumns = @JoinColumn(name = "idAsignatura"))
    private List<Estudiante> estudiantes;




}

