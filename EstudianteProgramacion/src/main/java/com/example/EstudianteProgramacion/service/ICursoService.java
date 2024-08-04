
package com.example.EstudianteProgramacion.service;

import com.example.EstudianteProgramacion.model.Curso;
import com.example.EstudianteProgramacion.model.Tema;
import java.util.List;


public interface ICursoService {

    public List<Curso> traerCursos();

    public void crearCurso(Curso curs);

    public void borrarCurso(Long id);

    public Curso findCurso(Long id_curso);

    public void editarCurso(Curso curs);

    public List<Tema> traerTemasDeCurso(Long id_curso);

    public List<Curso> traerCursosContienePalabra(String word);
    
}
