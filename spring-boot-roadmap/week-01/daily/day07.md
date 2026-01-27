# 📅 Día 7 — Semana 1 ## Revisión final, limpieza del proyecto y documentación completa

### 🎯 Objetivo del día
- Revisar todo el proyecto de forma integral como lo haría un desarrollador senior.
- Asegurar que la arquitectura, el código y la documentación cumplen estándares profesionales.
- Crear la colección Postman definitiva.
- Realizar la limpieza final del repositorio.
- Dejar la Week 01 lista para portfolio y para comenzar la Week 02.

---
### 🛠️ Actividades realizadas
- Revisión completa de la estructura del proyecto: paquetes, clases y organización interna.
- Revisión exhaustiva del controlador, servicio, domain, DTOs y excepciones.
- Validación de buenas prácticas:
    - Controlador sin lógica de negocio.
    - Servicio con métodos claros y sin duplicación.
    - DTOs con validaciones correctas.
    - Excepciones centralizadas en un `GlobalExceptionHandler`.
- Limpieza del proyecto:
    - Optimización de imports.
    - Reformat del código.
    - Eliminación de archivos innecesarios.
    - Revisión del `.gitignore`.
- Creación y documentación de la colección Postman:
  - 7 endpoints completos.
  - Descripciones profesionales.
  - Bodies de ejemplo.
  - URLs correctas.
- Preparación del repositorio para los commits finales.

---
### ▶️ Endpoints finales
````
GET     /tasks
GET     /tasks/{id}
POST    /tasks
PUT     /tasks/{id}
PATCH   /tasks/{id}/complete
PATCH   /tasks/{id}/toggle
DELETE  /tasks/{id}
````

---
### 🧪️ Pruebas realizadas
- Pruebas manuales en Postman de todos los endpoints.
- Validación de casos de error:
  - ID inexistente → `"La tarea con id XX no existe."`
  - Validaciones fallidas → mapa de errores con mensajes personalizados.
- Confirmación de que las respuestas coinciden con el README.
- Verificación de que la API funciona correctamente desde un estado vacío.

---
### 📚 Aprendizajes clave
- La importancia de una revisión final antes de cerrar un proyecto.
- La documentación (README + Postman) es tan importante como el código.
- Mantener el proyecto limpio y organizado facilita su mantenimiento.
- Una arquitectura por capas bien aplicada hace que el código sea escalable.
- La consistencia entre código, documentación y pruebas es fundamental.
- El valor de trabajar con estándares profesionales desde el primer proyecto.

---
### 💭 Reflexión personal
Hoy cierro la Week 01 con una API sencilla, funcional, clara, documentada y probada.
Ha sido una semana intensa, pero el resultado final demuestra que el esfuerzo ha merecido la pena.
Me siento orgulloso del progreso y motivado para afrontar la Week 02, donde la API evolucionará.

##### 🧠 Cita del día:
“Every accomplishment starts with the decision to try.” — John F. Kennedy