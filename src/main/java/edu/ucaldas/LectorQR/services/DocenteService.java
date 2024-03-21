package edu.ucaldas.LectorQR.services;


import edu.ucaldas.LectorQR.entities.Docente;
import edu.ucaldas.LectorQR.services.impl.DocenteImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/docente")
@CrossOrigin
public class DocenteService {

    @Autowired
    private DocenteImpl docenteImpl;


    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/consultarDocente", produces = "application/json")
    public Docente getDocente(@RequestParam(value = "codigo") String codigo){
        return (Docente) docenteImpl.read(codigo);
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping(value = "/crearDocente", consumes = "application/json")
    public void putDocente(@RequestBody Docente docente){
        docenteImpl.create(docente);
    }
}
