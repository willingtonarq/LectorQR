package edu.ucaldas.LectorQR.repositories;

import edu.ucaldas.LectorQR.entities.Asignatura;
import edu.ucaldas.LectorQR.entities.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AsignaturaRepository extends JpaRepository<Asignatura, Long> {

    @Query("SELECT Asignatura FROM Asignatura a WHERE a.codigo = :codigo")
    public Docente encontrarPorCodigo(@Param("codigo") String codigo);


    @Modifying
    @Query("UPDATE Asignatura a SET estado = 'INACTIVO' WHERE a.codigo = :codigo")
    public Docente eliminarPorCodigo(@Param("codigo") String codigo);

}