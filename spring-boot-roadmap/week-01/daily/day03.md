# 📅 Día 3 — Semana 1 ## Servicios, arquitectura limpia y manejo global de validaciones

### 🎯 Objetivo del día
- Separar la lógica del controlador creando la capa de servicios.
- Implementar la interfaz `UserService` y su clase `UserServiceImpl`.
- Devolver un DTO de respuesta (`UserResponseDTO`).
- Añadir un manejador global de validaciones con `@ControllerAdvice`.
- Mantener una arquitectura limpia y escalable.
---

### 🛠️ Actividades realizadas
- Creación del DTO de salida `UserResponseDTO`.
- Creación de la interfaz `UserService` con la firma del método `createUser`.
- Implementación de la clase `UserServiceImpl` anotada con `@Service`.
- Refactor del controlador para inyectar la **interfaz**, no la implementación.
- Implementación del manejador global de errores `GlobalExceptionHandler` para capturar validaciones fallidas.
- Pruebas del endpoint POST `/users` con datos válidos e inválidos.

---
### ▶️ Endpoint editado
````
GET /users
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
- respuesta: objeto `UserResponseDTO` con los datos enviados

#### ✔ Petición NO válida

```Json
{
  "name": "",
  "email": "no-es-un-email"
}
```
Resultado esperado
- Código: `400 Bad Request`
- Respuesta generada por el `GlobalExceptionHandler`:

---
### 📚 Aprendizajes clave
- Importancia de separar responsabilidades entre controlador y servicio.
- Uso de interfaces para desacoplar la lógica de negocio.
- Inyección de dependencias mediante constructor (mejor práctica actual).
- Creación de DTOs de entrada y salida para mantener claridad en la API.
- Manejo global de validaciones con `@ControllerAdvice` y `@ExceptionHandler`.
- Cómo Spring Boot ejecuta validaciones automáticamente antes de entrar al controlador.

---
### 💭 Reflexión personal
Es clave entender la estructura par dejarla clara y limpia.  
Cada movimiento tiene un sentido dentro del conjunto.

##### 🧠 Cita del día:
“Simplicity is the soul of efficiency.” — Austin Freeman