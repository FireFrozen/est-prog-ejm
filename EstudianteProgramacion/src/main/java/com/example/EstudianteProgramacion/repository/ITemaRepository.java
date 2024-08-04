
package com.example.EstudianteProgramacion.repository;

import com.example.EstudianteProgramacion.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITemaRepository extends JpaRepository<Tema, Long>{
    
}
