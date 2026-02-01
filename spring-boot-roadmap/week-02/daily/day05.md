# 📅 Día 5 — Semana 2 ## Logs profesionales con SLF4J

### 🎯 Objetivo del día
- Añadir logs útiles y bien estructurados en el servicio.
- Registrar eventos importantes: creación, eliminación, búsquedas y errores.
- Utilizar niveles de log adecuados (`info`, `warn`, `error`).
- Preparar el servicio para depuración real y auditoría.

---
### 🛠️ Actividades realizadas
- Integración de SLF4J en el servicio  
  Añadiste el logger siguiendo la convención estándar:
```java 
 private static final Logger log = LoggerFactory.getLogger(TaskServiceImpl.class);
```
- Logs en operaciones clave
    - Creación de tareas → `info`
    - Eliminación de tareas → `info`
    - Búsquedas → `info`
    - Errores de negocio (IDs negativos, tarea no encontrada) → `warn`
    - Errores inesperados (si los hubiera) → `error`
- Ejemplos aplicados en tu servicio
    - Al crear una tarea:
    ```java
    log.info("Creating task with title: {}", taskRequestDTO.getTitle());
    ```
    - Al buscar una tarea:
    ```java
    log.info("Fetching task with id: {}", id);
    ```
  - Al eliminar:
  ```java
  log.info("Deleting task with id: {}", id);
  ```
  - Al detectar un ID inválido:
  ```java
  log.warn("Invalid ID received: {}", id);
  ```
  - Al lanzar una excepción de negocio:
  ```java
  log.warn("Task not found: {}", id);
  ```
- Logs limpios, sin datos sensibles  
Solo registras lo necesario: IDs, títulos, acciones.  
Nada de información privada ni payloads completos.
- Formatear logs con `logback-spring.xml` para que se visualice mejor en la consola.

---
### 📚 Aprendizajes clave
🟦 Buenas prácticas de logging
- **Loguear eventos importantes**, no cada línea de código.
- **Evitar logs ruidosos** que saturen la consola.
- **Nunca loguear datos sensibles** (contraseñas, tokens, emails…).
- **Usar placeholders** `{}` para evitar concatenaciones innecesarias.  
🟦 Qué loguear
- Acciones del usuario (crear, borrar, actualizar)
- Validaciones fallidas.
- Excepciones de negocio.
- Comportamientos inesperados.  
🟦 Qué NO loguear
- Datos sensibles.
- Objetos completos sin necesidad.
- Información repetitiva o irrelevante.  
🟦 Diferencia entre niveles
- **info** → eventos normales del flujo de la aplicación.
- **warn** → algo no rompe, pero no debería ocurrir (ID negativo, recurso no encontrado).
- **error** → fallos graves o inesperados.

---
### 🧪 Pruebas realizadas
- Crear tareas y verificar logs `info`.
- Buscar tareas existentes y no existentes.
- Probar IDs negativos para ver logs `warn`.
- Eliminar tareas y confirmar el log correspondiente.
- Revisar que los logs aparecen en consola con formato claro.

---
### 💭 Reflexión personal
Los logs son una herramienta esencial. Ahora mi servicio no solo funciona: habla, explica y deja rastro de lo que hace.

##### 🧠 Cita del día:
“Good logs turn confusion into clarity.”
