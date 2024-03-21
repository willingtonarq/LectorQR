package edu.ucaldas.LectorQR.entities;

import edu.ucaldas.LectorQR.entities.enums.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Entity
@Table(name = "asistencia")
@Data
@EqualsAndHashCode(callSuper=false)
public class Asistencia extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAsistencia;


    @ManyToOne
    @JoinColumn(name = "idAsignatura", nullable = false)
    private Asignatura asignatura;

    @ManyToOne
    @JoinColumn(name = "idEstudiante", nullable = false)
    private Estudiante estudiante;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

}
