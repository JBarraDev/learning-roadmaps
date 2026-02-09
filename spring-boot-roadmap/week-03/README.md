# 🛠️ TaskManager Pro — Week 03
Sistema persistente de gestión de tareas utilizando **Spring Data JPA** y base de datos relacional.
Esta semana el proyecto evoluciona desde una API en memoria hacia una aplicación real, con entidades, repositorios, consultas y persistencia completa.

---
## 📌 Descripción del proyecto
Este proyecto inaugura el **Módulo 2 — Persistencia con JPA**, donde aprenderás a conectar tu API a una base de datos real y a trabajar con entidades y repositorios.

La API mantiene la arquitectura profesional de semanas anteriores, pero ahora incorpora:
- **Entidad JPA (`Task`)**
- **Repositorio JPA (`TaskRepository`)**
- **CRUD persistente real**
- **Consultas básicas con Spring Data**
- **Paginación y ordenación**
- **Configuración de H2 o MySQL**
- **DTOs y validaciones**
- **Controladores REST limpios**

El objetivo es que tu TaskManager deje de vivir en memoria y pase a ser un sistema persistente y escalable.

---
## 🧱 Tecnologías utilizadas
- Java 21
- Spring Boot 4.0.1
- Spring Web
- Spring Data JPA
- H2 Database (modo desarrollo)
- MySQL (opcional)
- Hibernate
- Jakarta Validation
- Lombok
- SLF4J (logging)
- Arquitectura por capas
- Postman para pruebas manuales

---
## 📂 Estructura del proyecto
```
src/main/java/com/jbarradev/week03/
    controller/
    service/
    repository/
    entity/
    dto/
    exception/
    config/
```

---
## ⚙️ Configuración de la base de datos
```
spring.datasource.url=jdbc:h2:mem:tasksdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
```
Acceso a la consola:
👉 http://localhost:8080/h2-console

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

### 🔹 Obtener todas las tareas (con paginación opcional)
#### GET /tasks?page=0&size=10

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
- Obtener lista paginada
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
La próxima semana comienza Semana 04 — Relaciones y consultas avanzadas.
- Relaciones OneToMany / ManyToOne
- Consultas personalizadas con JPQL
- Ordenación y filtros
- Migraciones con Flyway

---
#### 🧭 Gracias por la visita.
🪧 JBarraDev