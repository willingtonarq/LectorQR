package edu.ucaldas.LectorQR.services.impl;

import edu.ucaldas.LectorQR.entities.Docente;
import edu.ucaldas.LectorQR.repositories.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocenteImpl implements ICrud {

    @Autowired
    private DocenteRepository docenteRepository;


    @Override
    public Object create(Object o) {
        Docente docente = (Docente) o;
        return docenteRepository.save(docente);
    }

    @Override
    public Object read(String codigo) {
        return docenteRepository.encontrarPorCodigo(codigo);
    }

    @Override
    public Object update(Object o) {
        Docente docente = (Docente) o;
        return docenteRepository.save(docente);
    }

    @Override
    public Object delete(String codigo) {
        return docenteRepository.eliminarPorCodigo(codigo);
    }
}
