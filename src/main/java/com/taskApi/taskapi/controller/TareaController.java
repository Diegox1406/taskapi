package com.taskApi.taskapi.controller;

import com.taskApi.taskapi.model.EstadoTarea;
import com.taskApi.taskapi.model.PrioridadTarea;
import com.taskApi.taskapi.model.Tarea;
import com.taskApi.taskapi.service.TareaService;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tareas")
public class TareaController {

    @Autowired
    private TareaService tareaService;

    // Endpoint para listar todas las tareas
    @GetMapping
    public ResponseEntity<List<Tarea>> listarTareas() {
        return ResponseEntity.ok(tareaService.listarTareas());
    }

    // Endpoint para obtener una tarea por su ID
    @GetMapping("/{id}")
    public ResponseEntity<Tarea> obtenerTareaPorId(@PathVariable Long id) {
        return tareaService.obtenerTareaPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Endpoint para obtener tareas por título
    @GetMapping("/titulo")
    public ResponseEntity<List<Tarea>> obtenerTareaPorTitulo(@RequestParam String titulo){
        return ResponseEntity.ok(tareaService.obtenerTareasPorTitulo(titulo));
    }

    // Endpoint para obtener tareas por prioridad
    @GetMapping("/prioridad")
    public ResponseEntity<List<Tarea>> obtenerTareaPorPrioridad(@RequestParam PrioridadTarea prioridad){
        return ResponseEntity.ok(tareaService.obtenerTareasPorPrioridad(prioridad));
    }

    // Endpoint para obtener tareas por estado
    @GetMapping("/estado")
    public ResponseEntity<List<Tarea>> obtenerTareaPorEstado(@RequestParam EstadoTarea estado){
        return ResponseEntity.ok(tareaService.obtenerTareasPorEstado(estado));
    }


    // Endpoint para crear una nueva tarea
    @PostMapping
    public ResponseEntity<Tarea> crearTarea(@Valid @RequestBody Tarea tarea) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(tareaService.crearTarea(tarea));
    }

    // Endpoint para actualizar una tarea existente
    @PutMapping("/{id}")
    public ResponseEntity<Tarea> actualizarTarea(@PathVariable Long id, @Valid @RequestBody Tarea tarea) {
        return tareaService.actualizarTarea(id, tarea)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Endpoint para eliminar una tarea existente
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarTarea(@PathVariable Long id) {
        return tareaService.eliminarTarea(id)
                ? ResponseEntity.noContent().build()
                : ResponseEntity.notFound().build();
    }


}
