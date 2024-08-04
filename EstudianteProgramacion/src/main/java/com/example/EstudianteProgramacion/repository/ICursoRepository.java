
package com.example.EstudianteProgramacion.repository;

import com.example.EstudianteProgramacion.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICursoRepository extends JpaRepository<Curso, Long>{
    
}
