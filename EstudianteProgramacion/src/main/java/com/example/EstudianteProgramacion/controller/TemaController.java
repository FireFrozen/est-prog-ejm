
package com.example.EstudianteProgramacion.controller;

import com.example.EstudianteProgramacion.model.Tema;
import com.example.EstudianteProgramacion.service.ITemaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemaController {
    @Autowired
    ITemaService interTema;
    
    @GetMapping("temas/traer")
    public List<Tema> traerTemas(){       
        return interTema.traerTemas();
    }
    
    @PostMapping("temas/crear")
    public String crearTema(@RequestBody Tema tem){
        interTema.crearTema(tem);        
        return "Tema creado correctamente";
    }
    
    @DeleteMapping("temas/borrar")
    public String borrarTema(Long id){
        interTema.borrarTema(id);       
        return "Tema borrado correctamente";
    }
    
    @PutMapping("temas/editar")
    public Tema editarTema(@RequestBody Tema tem){
        interTema.editarTema(tem); 
        return interTema.findTema(tem.getId_tema());
    }
}
