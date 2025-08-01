-- Crear base de datos
CREATE DATABASE taskapidb;

-- Crear tabla tareas
CREATE TABLE tareas (
    id BIGSERIAL PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL,
    descripcion TEXT,
    prioridad VARCHAR(50) NOT NULL,
    estado VARCHAR(50) NOT NULL,
	fecha_creacion TIMESTAMP NOT NULL DEFAULT NOW(),
    fecha_actualizacion TIMESTAMP NOT NULL DEFAULT NOW()
);

-- Insertar datos de prueba
INSERT INTO tareas (titulo, descripcion, prioridad, estado)
VALUES 
  ('Estudiar Java', 'Repasar streams y lambda expressions', 'ALTA', 'PENDIENTE'),
  ('Comprar víveres', 'Ir al supermercado a las 6pm', 'MEDIA', 'EN_PROCESO'),
  ('Terminar API', 'Finalizar endpoints y documentación', 'ALTA', 'COMPLETADA'),
  ('Llamar al médico', 'Agendar cita para el viernes', 'BAJA', 'CANCELADA');
