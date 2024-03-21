package edu.ucaldas.LectorQR.services.impl;

import edu.ucaldas.LectorQR.entities.Asignatura;
import edu.ucaldas.LectorQR.entities.Docente;
import edu.ucaldas.LectorQR.entities.dtos.AsignaturaDTO;
import edu.ucaldas.LectorQR.repositories.AsignaturaRepository;
import edu.ucaldas.LectorQR.repositories.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AsignaturaImpl implements ICrud {

    @Autowired
    private AsignaturaRepository asignaturaRepository;

    @Autowired
    private DocenteRepository docenteRepository;


    @Override
    public Object create(Object o) {
        Asignatura asignatura = (Asignatura) o;
        return asignaturaRepository.save(asignatura);
    }

    @Override
    public Object read(String codigo) {
        return  asignaturaRepository.encontrarPorCodigo(codigo);
    }

    @Override
    public Object update(Object o) {
        return null;
    }

    @Override
    public Object delete(String codigo) {
        return null;
    }
}
