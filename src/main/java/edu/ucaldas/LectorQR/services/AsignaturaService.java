package edu.ucaldas.LectorQR.services;


import edu.ucaldas.LectorQR.entities.Asignatura;
import edu.ucaldas.LectorQR.entities.Docente;
import edu.ucaldas.LectorQR.entities.dtos.AsignaturaDTO;
import edu.ucaldas.LectorQR.services.impl.AsignaturaImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/asignatura")
@CrossOrigin
public class AsignaturaService {

    @Autowired
    private AsignaturaImpl asignaturaImpl;


    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/consultarAsignatura", produces = "application/json")
    public Docente getAsingatura(@RequestParam String codigo){
        return (Docente) asignaturaImpl.read(codigo);
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping(value = "/crearAsignatura", consumes = "application/json")
    public void postAsignatura(@RequestBody Asignatura asignatura){
        asignaturaImpl.create(asignatura);
    }


}
