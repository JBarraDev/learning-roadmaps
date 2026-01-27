# 📝 NotesAPI — Week 01 Challenge
API REST sencilla para gestionar notas con título, contenido y fecha de creación.
Este desafío sirve para comprobar que puedes aplicar de forma autónoma lo aprendido durante la Week 01.

---
## 📌 Enunciado del desafío
Crea una API llamada NotesAPI que permita gestionar notas.  
Cada nota debe tener:
- **id** (Long)
- **title** (String)
- **content** (String)
- **createdAt** (LocalDateTime)

La API debe permitir:

#### ➡ Operaciones CRUD básicas
- Obtener todas las notas
- Obtener una nota por ID
- Crear una nota
- Actualizar una nota
- Eliminar una nota

#### ➡ Funcionalidad adicional (Reto) 
 Buscar notas por palabra clave, filtrando por coincidencias en el título o en el contenido.  
 Ejemplo:  
 `GET /notes/search?keyword=spring`  
 Debe devolver todas las notas cuyo título o contenido contenga la palabra “spring”.
 
---
## 🧱 Requisitos técnicos
Tu API debe seguir la misma arquitectura que la Week 01:
- **Controller** → Maneja las peticiones HTTP
- **Service** → Lógica de negocio
- **Domain** → Clase Note
- **DTOs** → Para entrada y salida
- **Exceptions** → Manejo centralizado de errores
- **Lista en memoria** → No usar base de datos todavía  
Además:
- Validaciones con Jakarta Validation 
- Uso de Lombok
- Respuestas claras y coherentes
- Manejo de errores con un `GlobalExceptionHandler`

---
📂 Estructura recomendada del proyecto
```
src/main/java/com/tuusuario/notesapi/
    controllers/
    services/
    domains/
    dtos/
    exceptions/
```

---
## 🚀 Endpoints requeridos
🔹 Obtener todas las notas  
`GET /notes`

🔹 Obtener una nota por ID  
`GET /notes/{id}`

🔹 Crear una nota  
`POST /notes`
Body ejemplo:
```json
{
  "title": "Mi primera nota",
  "content": "Contenido de ejemplo"
}
```

🔹 Actualizar una nota  
`PUT /notes/{id}`

🔹 Eliminar una nota  
`DELETE /notes/{id}`

🔹 Buscar notas por palabra clave en el título
`GET /notes/search?keyword=palabra`

---
## 📘 Reglas de negocio
- `createdAt` se asigna automáticamente al crear la nota.
- El campo `title` no puede estar vacío.
- El campo `content` debe tener al menos 10 caracteres.
- Si una nota no existe, debe lanzarse una excepción personalizada.
- El endpoint de búsqueda debe ser **case-insensitive** (opcional pero recomendado).

---
## 🧪 Pruebas sugeridas
- Crear varias notas
- Buscar por palabras que existan
- Buscar por palabras que no existan
- Buscar con mayúsculas/minúsculas mezcladas
- Actualizar una nota
- Eliminar una nota
- Probar errores de validación
- Probar ID inexistente

---
## 🛣️ Objetivo del desafío
Este ejercicio demuestra que puedes:
- Replicar una arquitectura profesional
- Crear endpoints REST desde cero
- Aplicar validaciones
- Manejar excepciones
- Implementar lógica de búsqueda
- Documentar tu API
- Trabajar de forma autónoma

---
## 🧭 Consejos finales
- Puedes usar Week01 como referencia, pero no copies y pegues sin entender.
- Mantén el código limpio y organizado.
- Documenta tu API en un README propio.
- Crea una colección Postman como hiciste en Week01.