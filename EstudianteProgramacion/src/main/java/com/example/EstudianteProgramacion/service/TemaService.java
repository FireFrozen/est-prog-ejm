
package com.example.EstudianteProgramacion.service;

import com.example.EstudianteProgramacion.model.Tema;
import com.example.EstudianteProgramacion.repository.ITemaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TemaService implements ITemaService{

    @Autowired
    ITemaRepository temaRepo;
    
    @Override
    public List<Tema> traerTemas() {
        return temaRepo.findAll();
    }

    @Override
    public void crearTema(Tema tem) {
        temaRepo.save(tem);
    }

    @Override
    public void borrarTema(Long id) {
        temaRepo.deleteById(id);
    }

    @Override
    public void editarTema(Tema tem) {
        temaRepo.save(tem);
    }

    @Override
    public Tema findTema(Long id_tema) {
        return temaRepo.findById(id_tema).orElse(null);
    }
    
}
