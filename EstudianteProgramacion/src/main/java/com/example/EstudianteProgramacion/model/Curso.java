
package com.example.EstudianteProgramacion.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_curso;
    private String nombre;
    private String modalidad;
    
    @Temporal(TemporalType.DATE)
    private LocalDate fecha_finalización;
    
    @OneToMany//(mappedBy="curso")
    private List<Tema> listaDeTemas;

    public Curso() {
    }

    public Curso(Long id_curso, String nombre, String modalidad, LocalDate fecha_finalización, List<Tema> listaDeTemas) {
        this.id_curso = id_curso;
        this.nombre = nombre;
        this.modalidad = modalidad;
        this.fecha_finalización = fecha_finalización;
        this.listaDeTemas = listaDeTemas;
    }
    
    
}
