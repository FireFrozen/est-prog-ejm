
package com.example.EstudianteProgramacion.controller;

import com.example.EstudianteProgramacion.model.Curso;
import com.example.EstudianteProgramacion.model.Tema;
import com.example.EstudianteProgramacion.service.ICursoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursoController {
    
    @Autowired
    ICursoService interCurso;
    
    @GetMapping("cursos/traer")
    public List<Curso> traerCursos(){       
        return interCurso.traerCursos();
    }
    
    //Endoint para traer los temas de un curso
    @GetMapping("cursos/temas")
    public List<Tema> traerTemasDeCurso(@RequestParam Long id_curso){       
        return interCurso.traerTemasDeCurso(id_curso);
    }
    
    //Endoint para traer los cursos que contengan cierta palabra
    @GetMapping("cursos/contiene")
    public List<Curso> traerCursosContienePalabra(@RequestParam String word){
        return interCurso.traerCursosContienePalabra(word);
    } 
    
    @PostMapping("cursos/crear")
    public String crearCurso(@RequestBody Curso curs){
        interCurso.crearCurso(curs);        
        return "Curso creado correctamente";
    }
    
    @DeleteMapping("cursos/borrar")
    public String borrarCurso(Long id){
        interCurso.borrarCurso(id);       
        return "Curso borrado correctamente";
    }
    
    @PutMapping("cursos/editar")
    public Curso editarCurso(@RequestBody Curso curs){
        interCurso.editarCurso(curs); 
        return interCurso.findCurso(curs.getId_curso());
    }
}
