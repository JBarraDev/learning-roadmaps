# 📅 Día 2 — Semana 2 ## DTOs profesionales y separación de capas

### 🎯 Objetivo del día
- Separar completamente la capa de entrada/salida de la lógica interna.
- Crear los DTOs necesarios para la API.
- Añadir validaciones profesionales.
- Adaptar el controlador y el servicio para trabajar con DTOs en lugar de entidades.
- Mantener una arquitectura limpia y coherente.

---

### 🛠️ Actividades realizadas
- Creación de `TaskRequestDTO` y `TaskResponseDTO`.
- Añadidas validaciones esenciales:
  - `@NotBlank` para el título
  - `@Size(min = 5)` para la descripción
- Adaptación del controlador para recibir y devolver DTOs.
- Ajuste del servicio para convertir manualmente entre entidad ↔ DTO.
- Revisión de la entidad `Task` para asegurar que no se expone directamente.
- Pruebas manuales de validaciones y CRUD con Postman.
- Confirmación de que la API sigue funcionando correctamente tras la refactorización.

---
### 📚 Aprendizajes clave
- **Por qué no se deben exponer entidades directamente:**  
  Protege la estructura interna, evita filtraciones de datos y permite evolucionar el modelo sin romper la API.

- **Validaciones en DTOs:**  
La validación debe ocurrir en la capa más cercana al usuario, no en la entidad interna.

- **Conversión manual entre DTO ↔ entidad:**  
Aunque existen herramientas como ModelMapper, hacerlo manualmente ayuda a entender mejor el flujo de datos y mantener control total.

- **Separación de responsabilidades:**  
El controlador solo gestiona peticiones; el servicio gestiona la lógica; los DTOs gestionan la entrada y salida.

---
### 🧪 Pruebas realizadas
- Crear tareas con datos válidos.
- Intentar crear tareas con título vacío o descripción demasiado corta.
- Actualizar tareas usando DTOs.
- Verificar que las respuestas devuelven únicamente los campos del DTO de salida.
- Confirmar que la entidad interna no aparece en ninguna respuesta.

---
### 💭 Reflexión personal
De momento el día de ayer y de hoy ayudan a reforzar ideas, sin llegar a hacer nada absolutamente nuevo.
Hay que dar importancia a repetir estructuras para comprenderlo de forma clara.

##### 🧠 Cita del día:
“Small improvements each day lead to big results over time.”
