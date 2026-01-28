# 🛠️ TaskManager Pro — Week 02
Aplicación mejorada de la API de gestión de tareas desarrollada durante la primera semana del roadmap.
Esta versión incluye validaciones profesionales, manejo global de errores, DTOs limpios y logs estructurados.

---
## 📌 Descripción del proyecto
Este proyecto amplía la API de la Week 01, manteniendo una arquitectura por capas clara y profesional.
Se han incorporado prácticas reales de desarrollo backend:
- **Controller** → Maneja las peticiones HTTP
- **Service** → Lógica de negocio
- **Model** → Entidad interna (`Task`)
- **DTOs** → Separación de entrada/salida (`TaskRequestDTO`, `TaskResponseDTO`)
- **Exception** → Excepciones personalizadas
- **Config** → Manejador global de errores (`GlobalExceptionHandler`)

La API sigue funcionando en memoria, sin base de datos, ideal para centrarse en la lógica y estructura profesional.

---
## 🧱 Tecnologías utilizadas
- Java 21
- Spring Boot 4.0.1
- Spring Web
- Jakarta Validation
- Lombok
- SLF4J (logging)
- Arquitectura por capas
- Postman para pruebas manuales

---
## 📂 Estructura del proyecto
```
src/main/java/com/jbarradev/week02/
    controller/
    service/
    domain/
    dto/
    exception/
    config/
```

---
## 🚀 Cómo ejecutar el proyecto
1. Clonar el repositorio
2. Abrirlo en el IDE (IntelliJ, VSCode, Eclipse, ...)
3. Ejecutar:
``` 
mvn spring-boot:run
```
4. La API estará disponible en:
``` 
http://localhost:8080/tasks
```

---
## 📡 Endpoints disponibles

### 🔹 Obtener todas las tareas
#### GET /tasks

### 🔹 Obtener una tarea por ID
#### GET /tasks/{id}

### 🔹 Crear una tarea
#### POST /tasks
Body:
```json
{
  "title": "Estudiar Spring Boot",
  "description": "Terminar el proyecto de validaciones y errores"
}
```

### 🔹 Actualizar una tarea
#### PUT /tasks/{id}

### 🔹 Eliminar una tarea
#### DELETE /tasks/{id}

---
## 📘 Ejemplos de request/response
### ✔ Crear tarea válida
Request:
```json
{
  "title": "Estudiar Spring",
  "description": "Repasar controladores, servicios y DTOs"
}
```
Response:
```json
{
  "id": 1,
  "title": "Estudiar Spring",
  "description": "Repasar controladores, servicios y DTOs",
  "completed": false
}
```
### ❌ Validación fallida
Request:
```json
{
  "title": "",
  "description": "corto"
}
```
Response:
```json
{
  "timestamp": "2026-01-28T10:30:00",
  "message": "Error de validación",
  "details": [
    "El título es obligatorio",
    "La descripción debe tener al menos 5 caracteres"
  ]
}
```
### ❌ Tarea no encontrada
`GET /tasks/999`

Response:
```json
{
  "timestamp": "2026-01-28T10:30:00",
  "message": "La tarea con id 999 no existe",
  "details": "/tasks/999"
}
```

---
## 🧪 Pruebas manuales (Postman)
Se han probado:
#### Casos válidos:
- Crear tareas
- Obtener lista
- Obtener por ID
- Actualizar
- Eliminar
#### Casos NO válidos:
- ID inexistente
- Validaciones fallidas
- Datos incorrectos

---
## 📦 Colección Postman
Se incluye una colección exportada en:
```
/postman/collection.json
```
Contiene todos los endpoints listos para probar.

---
## 🔍 Logs profesionales
Se han añadido logs con SLF4J en el servicio:
- `info` → creación, actualización, eliminación
- `warn` → búsquedas fallidas
- `error` → excepciones inesperada

---
## 🛣️ Roadmap
La próxima semana comienza la Week 03, donde se introduce persistencia real con JPA y base de datos.

---
#### 🧭 Gracias por la visita.
🪧 JBarraDev
