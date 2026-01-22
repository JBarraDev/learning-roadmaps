# 📅 Día 2 — Semana 1 ## Primer DTO, validaciones y endpoint POST

### 🎯 Objetivo del día
- Crear el primer DTO con validaciones usando `jakarta.validation`.
- Implementar un endpoint POST que reciba datos en formato JSON.
- Probar validaciones automáticas de Spring Boot.
- Uso de Lombok para reducir boilerplate
- Mantener una estructura limpia y modular del proyecto.

---

### 🛠️ Actividades realizadas
- Creación del paquete `dtos`
- Implementación del `UserRequestDTO`: 
  - Incluye validaciones básicas 
  - Lombok para simplificar getters y setters (@Data)
- Creación del controlador `UserController`. 
- Creación del endpoint POST `/users`
- Realización de pruebas con Postman
- Revisión de la estructura del proyecto para mantener claridad y escalabilidad.

---
### ▶️ Endpoint creado
````
POST /users
````
---
### 🧪️ Pruebas realizadas
#### ✔ Petición válida  
Request
```Json
{
  "name": "Javier",
  "email": "hola@jbarradev.com"
}
```
Resultado esperado
- Código: `200 OK`
- respuesta: mensaje de confirmación

#### ✔ Petición NO válida  

```Json
{
  "name": "",
  "email": "no-es-un-email"
}
```
Resultado esperado
- Código: `400 Bad Request`
- Respuesta: lista de errores generada automáticamente por Spring Boot:
    - El nombre es obligatorio
    - El email no es válido

---
### 📚 Aprendizajes clave
- Uso de DTOs para separar la entrada de datos del dominio.
- Validaciones automáticas con `jakarta.validation`.
- Funcionamiento de `@Valid` y `@RequestBody`.
- Cómo Spring Boot gestiona errores de validación sin código adicional:
  - Anotaciones `@NotBlank`, `@Size` y `@Email`
- Anotación `@Data`de Lombok
- Importancia de mantener una estructura modular desde el inicio.
- Flujo completo de una petición POST con JSON.

---
### 💭 Reflexión personal
Hoy ya metidos en harina hemos descubierto cosas interesantes de Spring Boot. 
Hemos avanzado rápido debido a los conocimientos previos, sin olvidar la importancia de estos primeros pasos.
##### 🧠 Cita del día:
“We are what we repeatedly do. Excellence, then, is not an act but a habit.” — Aristotle

