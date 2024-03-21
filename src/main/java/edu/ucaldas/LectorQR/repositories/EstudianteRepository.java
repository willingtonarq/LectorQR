package edu.ucaldas.LectorQR.repositories;

import edu.ucaldas.LectorQR.entities.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
}