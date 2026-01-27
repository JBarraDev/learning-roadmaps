# 📅 Día 6 — Semana 1 ## Refactorización, buenas prácticas y actualización de tareas (PUT / PATCH)

### 🎯 Objetivo del día
- Añadir endpoints para actualizar tareas (PUT), marcarlas como completadas (PATCH) y alternar su estado (PATCH toggle).
- Mantener el controlador ligero delegando toda la lógica al servicio.

---
### 🛠️ Actividades realizadas
- Revisión de la arquitectura para asegurar separación clara entre entidad y DTOs.
- Confirmación de que el controlador no contiene lógica de negocio.
- Añadidas nuevas firmas en `TaskService`:
  - `updateTask(Long id, TaskRequestDTO dto)`
  - `markTaskAsCompleted(Long id)`
  - `toggleTaskCompleted(Long id)`
- Implementación de ambos métodos en `TaskServiceImpl`.
- Extracción del método reutilizable `findTaskOrThrowException(Long id)` para evitar duplicación.
- Creación de los nuevos endpoints en el controlador:
  - `PUT /tasks/{id}`
  - `PATCH /tasks/{id}/complete`
  - `PATCH /tasks/{id}/toggle`

---
### ▶️ Endpoints añadidos
````
PUT /tasks/{id}
PATCH /tasks/{id}/complete
PATCH  /tasks/{id}/toggle
````

---
### 🧪️ Pruebas realizadas
- PUT válido: actualiza título y descripción correctamente.
- PUT con ID inexistente: `"La tarea con id XX no existe."`
- PATCH válido: marca la tarea como completada.
- PATCH con ID inexistente: `"La tarea con id XX no existe."`
- PATCH /toggle válido: alterna el estado completed → true/false.
- PATCH /toggle con ID inexistente: devuelve `"La tarea con id XX no existe."`

---
### 📚 Aprendizajes clave
- Extraer lógica repetida mejora la claridad y reduce errores.
- PUT y PATCH completan el CRUD y aportan semántica profesional a la API.
- Mantener el controlador limpio facilita la escalabilidad del proyecto.
- La arquitectura por capas empieza a sentirse sólida y coherente.
- PATCH puede representar acciones explícitas o acciones de alternancia.
- Diferencia entre PUT y PATCH:
  - **PUT** reemplaza toda la tarea.
  - **PATCH** modifica solo una parte de la tarea.

---
### 💭 Reflexión personal
Un paso más hacia una API mejor desarrollada: refactor, claridad y endpoint bien diseñado.
El código es fácil de mantener.

##### 🧠 Cita del día:
“Well begun is half done.” — Aristotle