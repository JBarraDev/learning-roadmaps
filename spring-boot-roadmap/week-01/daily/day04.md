# 📅 Día 4 — Semana 1 ## CRUD de tareas, DTOs, excepciones personalizadas y arquitectura limpia

### 🎯 Objetivo del día
- Implementar un CRUD parcial de tareas con arquitectura limpia.
- Separar correctamente **entidad, DTO de entrada y DTO de salida.**
- Crear la interfaz `TaskService` y su implementación `TaskServiceImpl`.
- Añadir una excepción personalizada `TaskNotFoundException`.
- Manejar errores globalmente con `GlobalExceptionHandler`.
- Mantener un controlador REST limpio y desacoplado.
---

### 🛠️ Actividades realizadas
- Creación de los DTOs `TaskRequestDTO` y `TaskResponseDTO`.
- Implementación de la entidad `Task` como modelo interno.
- Creación de la interfaz `TaskService` con métodos para listar, obtener, crear y eliminar tareas.
- Implementación de `TaskServiceImpl` con:
  - Conversión centralizada Task → TaskResponseDTO
  - Uso de streams para búsquedas (`filter`, `findFirst`)
  - Excepción personalizada cuando la tarea no existe
- Implementación del controlador `TaskController` inyectando la interfaz, no la implementación.
- Añadido del manejador global GlobalExceptionHandler para capturar errores y devolver respuestas limpias.
- Pruebas de los endpoints GET, POST y DELETE.

---
### ▶️ Endpoints creados
````
GET /tasks
GET /tasks/{id}
POST /tasks
DELETE /tasks/{id}
````

---
### 🧪️ Pruebas realizadas
#### ✔ Petición válida (POST)
Request
```Json
{
  "title": "Estudiar Spring Boot",
  "description": "Completar el CRUD dia 4"
}
```
Resultado esperado
- Código: `200 OK`
- respuesta: objeto `TaskResponseDTO ` con id generado y completed = false

#### ✔ Petición NO válida

```Json
{
  "name": "",
  "email": "no-es-un-email"
}
```
Resultado esperado
- Código: `400 Bad Request`
- Respuesta generada por el `GlobalExceptionHandler` con mensajes de validación.

---
#### ✔ Obtener todas las tareas (GET)
Request
````
GET /tasks
````
Resultado esperado
- Código: `200 OK`
- Respuesta: lista de objetos `TaskResponseDTO`

---
#### ✔ Obtener una tarea existente (GET)
Request
````
GET /tasks/1
````
Resultado esperado
- Código: `200 OK`
- Respuesta: Objeto `TaskResponseDTO`

---
#### ❌ Obtener una tarea que NO existe (GET)
Request
````
GET /tasks/99999
````
Resultado esperado
- Código: `404 Not Found`
- Respuesta: `La tarea con ID 99999 no existe`

---
#### ✔ Eliminación de tarea existente (DELETE)
- Código: `200 OK`
- Respuesta: `"Task deleted"`

#### ❌ Eliminación de tarea inexistente (DELETE)
- Código: `404 Not Found`
- Respuesta: `"La tarea con ID X no existe"`

---
### 📚 Aprendizajes clave
- Diferenciar correctamente **entidad, DTO de entrada y DTO de salida**.
- Importancia de centralizar la conversión entre modelos y DTOs.
- Uso de excepciones personalizadas para mantener un flujo profesional.
- Cómo `@ControllerAdvice` permite manejar errores globalmente.
- Streams como herramienta moderna para búsquedas limpias y expresivas.
- El controlador debe delegar toda la lógica al servicio, manteniéndose ligero y claro.
- `@Override` como buena práctica para evitar errores silenciosos.

---
### 💭 Reflexión personal
Comprendiendo mejor cada día cómo se construye una API real:
Capas separadas, responsabilidades claras y un manejo de errores consistente.
Según se avanza sensación de que cada pieza encaja.

##### 🧠 Cita del día:
“Clarity comes from discipline and attention to detail.”