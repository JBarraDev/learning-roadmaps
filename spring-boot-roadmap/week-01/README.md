# 📝 API de Gestión de Tareas — Week 01
API REST sencilla desarrollada durante la primera semana del roadmap.
Permite gestionar tareas mediante operaciones CRUD y acciones específicas como marcar una tarea como completada o alternar su estado.

---
## 📌 Descripción del proyecto
Este proyecto es una API REST construida con Java 21 y Spring Boot 4.0.1, siguiendo una arquitectura por capas clara y profesional:
- **Controller** → Maneja las peticiones HTTP
- **Service** → Contiene la lógica de negocio
- **Domain** → Representa las entidades del sistema
- **DTOs** → Objetos de transferencia para entrada y salida
- **Exceptions** → Manejo centralizado de errores  
La API funciona en memoria usando una lista interna, ideal para aprendizaje y pruebas.

---
## 🧱 Tecnologías utilizadas
- Java 21
- Spring Boot 4.0.1
- Spring Web
- Validaciones con Jakarta Validation
- Lombok
- Arquitectura por capas
- Postman para pruebas manuales

---
## 📂 Estructura del proyecto
```
src/main/java/com/jbarradev/week01/
    controllers/
    services/
    domains/
    dtos/
    exceptions/
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
  "description": "Terminar el proyecto de la semana de Java + Spring Boot"
}
```

### 🔹 Actualizar una tarea
#### PUT /tasks/{id}

### 🔹 Eliminar una tarea
#### DELETE /tasks/{id}

### 🔹 Marcar una tarea como completada
#### PATCH /tasks/{id}/complete

### 🔹 Alternar el estado "completed" de una tarea
#### PATCH /tasks/{id}/toggle

---
## 📘 Ejemplos de request/response
### ✔ Crear tarea
#### POST /tasks
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
### ✔ Error por ID inexistente
#### GET /tasks/999
Response:
```
La tarea con id 999 no existe.
```
### ✔ Validación fallida
#### POST /tasks
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
  "title": "El título es obligatorio", 
  "description": "El mensaje debe contener al menos 10 caracteres"
}
```

---
## 🧪 Pruebas manuales (Postman)
Se han probado:
#### Casos válidos:
- Crear tareas
- Obtener lista
- Obtener por ID
- PUT
- PATCH complete
- PATCH toggle
- DELETE
#### Casos NO válidos:
- ID inexistente
- Validaciones fallidas
- PUT con datos incorrectos

---
## 📦 Colección Postman
Se incluye una colección exportada en:
```
/postman/collection.json
```
Contiene todos los endpoints listos para usar.

---
## 🛣️ Roadmap
La próxima semana comienza la Week 02, donde se continúa con una versión mejorada de esta API.

---
#### 🧭 Gracias por la visita.
🪧 JBarraDev
