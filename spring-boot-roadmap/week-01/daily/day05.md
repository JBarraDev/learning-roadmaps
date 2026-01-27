# 📅 Día 5 — Semana 1 ## Revisión de código (validaciones y manejo de errores)

### 🎯 Objetivo del día
- Revisar y asegurar que la API valida correctamente los datos de entrada.
- Confirmar que los errores se manejan de forma global y consistente.
- Verificar que la excepción personalizada `TaskNotFoundException` funciona correctamente.

---
### 🛠️ Actividades realizadas (Solo verificaciones)
- Revisión del DTO TaskRequestDTO con validaciones @NotBlank y @Size.
- Confirmación de que el controlador usa @Valid correctamente.
- Verificación de la excepción personalizada TaskNotFoundException.
- Revisión del GlobalExceptionHandler para validaciones y errores de negocio.
- Pruebas manuales de los endpoints GET, POST y DELETE con casos válidos e inválidos.

---
### 🧪️ Pruebas realizadas
- **POST válido**: datos correctos → `201 Created`.
- **POST inválido**: título vacío → `400 Bad Request` con mensaje de validación.
- **GET existente**: devuelve la tarea correctamente.
- **GET inexistente**: lanza `TaskNotFoundException` → 404 Not Found.
- **DELETE existente**: elimina correctamente.
- **DELETE inexistente**: devuelve `404 Not Found`.

---
### 📚 Aprendizajes clave
- Las validaciones y el manejo global de errores ya estaban correctamente integrados.
- La API responde de forma clara y consistente ante errores de usuario y errores de negocio.
- A veces un día de roadmap es simplemente de verificación, no de código.

---
### 💭 Reflexión personal
Un día en el que no se "pica" código, se revisan cositas.
He confirmado que la base del proyecto está sólida:
validaciones, excepciones y manejo global de errores funcionan como deben.

##### 🧠 Cita del día:
“Quality is not an act, it is a habit.” — Aristotle