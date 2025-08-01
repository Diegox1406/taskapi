package com.taskApi.taskapi.repository;

import com.taskApi.taskapi.model.EstadoTarea;
import com.taskApi.taskapi.model.PrioridadTarea;
import com.taskApi.taskapi.model.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TareaRepository extends JpaRepository<Tarea, Long> {
    List<Tarea> findByPrioridad(PrioridadTarea prioridad);
    List<Tarea> findByEstado(EstadoTarea estado);
    List<Tarea> findByTituloContainingIgnoreCase(String titulo);
}
