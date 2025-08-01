package com.taskApi.taskapi.service;

import com.taskApi.taskapi.model.EstadoTarea;
import com.taskApi.taskapi.model.PrioridadTarea;
import com.taskApi.taskapi.model.Tarea;
import com.taskApi.taskapi.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TareaService {

    @Autowired
    private TareaRepository tareaRepository;

    // Método para listar todas las tareas
    public List<Tarea> listarTareas(){
        return tareaRepository.findAll();
    }

    // Método para obtener una tarea por su ID
    public Optional<Tarea> obtenerTareaPorId(Long id) {
        return tareaRepository.findById(id);
    }

    //Método para obtener tareas por título
    public List<Tarea> obtenerTareasPorTitulo(String titulo){
        return tareaRepository.findByTituloContainingIgnoreCase(titulo);
    }

    // Método para obtener tareas por prioridad
    public List<Tarea> obtenerTareasPorPrioridad(PrioridadTarea prioridad) {
        return tareaRepository.findByPrioridad(prioridad);
    }

    // Método para obtener tareas por estado
    public List<Tarea> obtenerTareasPorEstado(EstadoTarea estado){
        return tareaRepository.findByEstado(estado);
    }

    // Método para crear una nueva tarea
    public Tarea crearTarea(Tarea tarea){
        return tareaRepository.save(tarea);
    }

    // Método para actualizar una tarea
    public Optional<Tarea> actualizarTarea(Long id, Tarea nuevaTarea){
        return tareaRepository.findById(id).map(tarea -> {
            tarea.setTitulo(nuevaTarea.getTitulo());
            tarea.setDescripcion(nuevaTarea.getDescripcion());
            tarea.setPrioridad(nuevaTarea.getPrioridad());
            tarea.setEstado(nuevaTarea.getEstado());
            return tareaRepository.save(tarea);
        });
    }

    // Método para eliminar una tarea
    public boolean eliminarTarea(Long id){
        if(tareaRepository.existsById(id)){
            tareaRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }


}
