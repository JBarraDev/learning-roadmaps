# 📅 Día 3 — Semana 2 ## Manejo global de errores con @ControllerAdvice

### 🎯 Objetivo del día
- Implementar un sistema profesional de manejo de errores.
- Centralizar todas las excepciones en un único punto.
- Devolver respuestas claras, consistentes y útiles para el cliente.
- Preparar la API para comportarse como un servicio real.

---

### 🛠️ Actividades realizadas
- Creación de la clase `GlobalExceptionHandler` dentro del paquete config.
- Implementación de `@ControllerAdvice` para interceptar errores globalmente.
- Manejo de excepciones clave:
  - `MethodArgumentNotValidException` → errores de validación en DTOs
  - `TaskNotFoundException` → entidad no encontrada
  - `IllegalArgumentExceptio` → errores de lógica o parámetros incorrectos
- Creación de un objeto de error estándar con:
  - `timestamp`
  - `message`
  - `details`
- Ajuste del controlador para que las excepciones se propaguen correctamente.
- Pruebas manuales para verificar que cada error devuelve una respuesta coherente.

---
### 📚 Aprendizajes clave
- **Qué es @ControllerAdvice:**  
  Una forma elegante de capturar errores en toda la aplicación sin duplicar código en cada controlador.
- **Errores controlados vs no controlados:**
  - Controlados → excepciones que esperamos y gestionamos (por ejemplo, ID inexistente).
  - No controlados → errores inesperados que deben registrarse y devolverse de forma segura.
- **Importancia de las respuestas estandarizadas:**  
Facilitan el consumo de la API, ayudan al debugging y mantienen consistencia.
- **Cómo comunicar errores de forma útil:**  
Mensajes claros, sin exponer detalles internos, y siempre con contexto suficiente para entender qué ha fallado.

---
### 🧪 Pruebas realizadas
- Enviar DTOs con validaciones incorrectas para comprobar el formato de error.
- Forzar un `TaskNotFoundException` con un ID inexistente.
- Probar parámetros inválidos para disparar `IllegalArgumentException`.
- Verificar que todos los errores siguen el mismo formato JSON.
- Confirmar que el timestamp y los detalles se generan correctamente.

---
### 💭 Reflexión personal
El manejo de errores es una de las cosas que más me ha costado, pero hay que invertir el tiempo necesario para comprenderlo bien y ser capaces de usarlo de la forma correcta. Sin ello, la aplicación puede romper de la manera más tonta que creas.

##### 🧠 Cita del día:
“Every error is a step toward mastery.”
