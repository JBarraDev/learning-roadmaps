# 📅 Día 4 — Semana 2 ## Excepciones personalizadas y respuestas limpias

### 🎯 Objetivo del día
- Crear excepciones propias para mejorar la claridad de la API.
- Validar parámetros manualmente desde el servicio.
- Ajustar el controlador para devolver códigos HTTP correctos.
- Mantener un formato de error consistente y profesional.
- Preparar la API para comportarse como un servicio real y mantenible.

---
### 🛠️ Actividades realizadas
- Creación y revisión de excepciones personalizadas:
  - `TaskNotFoundException` → cuando una tarea no existe.
  - `InvalidTaskException` → cuando un parámetro es inválido (por ejemplo, ID negativo).
- Implementación de validaciones manuales en el servicio:
  - Método `checkNegativeId(Long id)` para detectar IDs inválidos.
- Ajuste del servicio para lanzar excepciones claras y específicas.
- Actualización del `GlobalExceptionHandler` para manejar:
  - `MethodArgumentNotValidException` → errores de validación en DTOs.
  - `TaskNotFoundException` → recurso no encontrado.
  - `InvalidTaskException` → parámetros inválidos definidos por la lógica de negocio.
  - `IllegalArgumentException` → errores de conversión o parámetros mal formados.
- Ajuste del controlador para devolver códigos HTTP correctos:
  - `201 CREATED` al crear una tarea.
  - `200 OK` en operaciones de lectura, actualización y borrado.
- Pruebas manuales de todos los casos de error para asegurar coherencia.

---
### 📚 Aprendizajes clave
- **Por qué usar excepciones personalizadas:**  
  Permiten comunicar errores de forma clara, separan la lógica de negocio del manejo de errores y hacen el código más mantenible.
- **Validación manual vs validación automática:**
  - Automática → `@Valid` en DTOs.
  - Manual → reglas de negocio específicas (como IDs negativos).
- **Importancia de los códigos HTTP correctos:**  
Una API profesional no solo funciona, también comunica correctamente:
  - 201 → recurso creado
  - 200 → operación exitosa
  - 400 → datos inválidos
  - 404 → recurso no encontrado
- **Consistencia en las respuestas de error:**  
Mantener siempre el mismo formato facilita el debugging y mejora la experiencia del cliente.

---
### 🧪 Pruebas realizadas
- Enviar DTOs con campos inválidos para comprobar el manejo de `MethodArgumentNotValidException`.
- Probar IDs inexistentes para disparar `TaskNotFoundException`.
- Probar IDs negativos para validar `InvalidTaskException`.
- Enviar parámetros no numéricos en la URL para provocar `IllegalArgumentException`.
- Confirmar que todas las respuestas de error comparten el mismo formato JSON:
  - `timestamp`
  - `message`
  - `details`

---
### 💭 Reflexión personal
Hoy he entendido la importancia de comunicar errores de forma clara y consistente.

##### 🧠 Cita del día:
“Clarity grows from disciplined refinement.”
