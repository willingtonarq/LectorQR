package edu.ucaldas.LectorQR.repositories;

import edu.ucaldas.LectorQR.entities.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DocenteRepository extends JpaRepository<Docente, Long> {


    @Query("SELECT d FROM Docente d WHERE d.codigo = :codigo")
    public Docente encontrarPorCodigo(@Param("codigo") String codigo);


    @Modifying
    @Query("UPDATE Docente d SET estado = 'INACTIVO' WHERE d.codigo = :codigo")
    public Docente eliminarPorCodigo(@Param("codigo") String codigo);
}
