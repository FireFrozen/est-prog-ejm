
package com.example.EstudianteProgramacion.service;

import com.example.EstudianteProgramacion.model.Tema;
import java.util.List;


public interface ITemaService {

    public List<Tema> traerTemas();

    public void crearTema(Tema tem);

    public void borrarTema(Long id);

    public void editarTema(Tema tem);

    public Tema findTema(Long id_tema);
    
}
