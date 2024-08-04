
package com.example.EstudianteProgramacion.service;

import com.example.EstudianteProgramacion.model.Curso;
import com.example.EstudianteProgramacion.model.Tema;
import com.example.EstudianteProgramacion.repository.ICursoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService implements ICursoService {

    @Autowired
    ICursoRepository cursoRepo;
    
    @Override
    public List<Curso> traerCursos() {
        return cursoRepo.findAll();
    }

    @Override
    public void crearCurso(Curso curs) {
        cursoRepo.save(curs);
    }

    @Override
    public void borrarCurso(Long id) {
        cursoRepo.deleteById(id);
    }

    @Override
    public Curso findCurso(Long id_curso) {
       return cursoRepo.findById(id_curso).orElse(null);
    }

    @Override
    public void editarCurso(Curso curs) {
        cursoRepo.save(curs);
    }

    @Override
    public List<Tema> traerTemasDeCurso(Long id_curso) {
        return this.findCurso(id_curso).getListaDeTemas();
    }

    @Override
    public List<Curso> traerCursosContienePalabra(String word) {
        List<Curso> listaCursos = this.traerCursos();
        List<Curso> listaCursosBuscados = new ArrayList<>();
        
        for(Curso curs:listaCursos){
            if(curs.getNombre().contains(word)){
                listaCursosBuscados.add(curs);
            }
        }
        return listaCursosBuscados;       
    }
    
    
}
