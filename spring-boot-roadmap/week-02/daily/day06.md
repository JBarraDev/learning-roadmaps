# 📅 Día 6 — Semana 2 ## Refactorización y limpieza final

### 🎯 Objetivo del día
- Revisar y mejorar la calidad del código.
- Asegurar coherencia en nombres, DTOs, logs y excepciones.
- Eliminar duplicaciones y dejar el proyecto listo para producción (sin base de datos).
- Aplicar principios de **KISS**, **DRY** y **Clean Code**.

---
### 🛠️ Actividades realizadas
🟦 **Revisión del dominio (`domain`)**
- La clase `Task` se mantiene simple, clara y minimalista.
- Uso correcto de Lombok (`@Getter`, `@Setter`, `@AllArgsConstructor`, `@NoArgsConstructor`).
- Estructura adecuada para un proyecto sin base de datos.  

🟩 **Revisión de DTOs (`dto`)**
- `TaskRequestDTO` validado con `@NotBlank` y `@Size`.
- `TaskResponseDTO` estructurado para devolver datos limpios al cliente.
- Se mantuvo la separación clara entre entrada y salida.
- Se revisó que no haya campos innecesarios ni lógica dentro de los DTOs.

🟧 **Revisión del servicio (`service`)**
- Métodos con nombres claros y consistentes.
- Validación previa (`checkNegativeId`) antes de ejecutar lógica.
- Conversión a DTO centralizada en un método privado.
- Logs bien colocados en puntos clave: creación, actualización, borrado, búsqueda y errores.
- Excepciones de negocio correctamente lanzadas (`TaskNotFoundException`, `InvalidTaskException`).
- Código limpio, sin duplicación y con responsabilidades bien separadas.

🟨 **Revisión del controlador (`controller`)**
- Endpoints REST bien diseñados y coherentes.
- Uso correcto de `@Valid`, `@PathVariable`, `@RequestBody`.
- Respuestas adecuadas con `ResponseEntity`.
- Sin lógica innecesaria en el controlador: delega todo al servicio.
- Estructura clara y fácil de mantener.

🟪 **Revisión del manejo de excepciones (`exception`)**
- `GlobalExceptionHandler` captura validaciones, errores de negocio y argumentos inválidos.
- Respuestas consistentes mediante `ExceptionResponseDTO`.
- Mensajes claros y útiles para el cliente.
- Estructura profesional y lista para producción.

---
### 📚 Aprendizajes clave
🧠 Principio KISS:  
Keep It Simple, Stupid → Evitar complejidad innecesaria.  
Mantener el código simple evita errores y facilita el mantenimiento.

🧠 DRY:
Don’t Repeat Yourself → Evitar duplicación de lógica.  
Evitar duplicación mejora la claridad y reduce inconsistencias.

🧠 Clean Code
- Nombres claros y semánticos.
- Métodos cortos y con una sola responsabilidad.
- Estructura de paquetes coherente.
- Logs útiles, no ruidosos.
- Excepciones claras y manejadas de forma centralizada.

---
### 🧪 Pruebas realizadas
- Validación de DTOs con datos correctos e incorrectos.
- Pruebas de creación, actualización, borrado y búsqueda de tareas.
- Verificación de logs en consola.
- Comprobación de respuestas de error: 400, 404 y validaciones.
- Revisión manual de estructura de paquetes y duplicación de código.

---
### 💭 Reflexión personal
Con días como hoy, más ligeros de código pero contundentes en revisión, te das cuenta que refactorizar no es reescribir: es mejorar lo que ya existe, darle forma y coherencia.

##### 🧠 Cita del día:
“Clean code always looks like it was written by someone who cares.”
