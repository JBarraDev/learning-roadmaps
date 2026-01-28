# 📅 Día 1 — Semana 2 ## Preparación del entorno y estructura profesional

### 🎯 Objetivo del día
- Revisar el proyecto de la Week 01 para asegurar una base sólida.
- Crear el nuevo proyecto dentro de `week-02`.
- Configurar la estructura profesional de paquetes.
- Añadir dependencias necesarias para validaciones.
- Dejar el proyecto listo para evolucionar hacia una API más robusta.

---

### 🛠️ Actividades realizadas
- Revisión del código de la API de la semana anterior.
- Creación del nuevo proyecto Spring Boot para Week 02.
- Configuración inicial del pom.xml con:
  - `spring-boot-starter-web`
  - `spring-boot-starter-validation`
  - Lombok
- Creación de la clase principal Week02Application.
- Organización de la estructura de paquetes:
  - `controller`
  - `service`
  - `domain`
  - `dto`
  - `exception`
  - `config`
- Configuración del `.gitignore` y `.gitattributes`.
- Ejecución del proyecto para verificar que arranca correctamente.
- Commit inicial con toda la estructura base.

---
### 📂 Estructura creada
```
src/main/java/com/jbarradev/week02/
    controller/
    service/
    model/
    dto/
    exception/
    config/
```
---
### 📚 Aprendizajes clave
- Importancia de separar responsabilidades desde el inicio del proyecto.
- Por qué las validaciones deben ir en los DTOs y no en las entidades.
- Preparación de un proyecto para escalar en complejidad sin perder claridad.
- Configuración de dependencias esenciales para validaciones profesionales.
- Cómo organizar un proyecto para facilitar el manejo global de errores.

---
### 💭 Reflexión personal
Comienza la segunda semana y ya se nota el salto de calidad. Hoy ha sido un día de preparación, de sentar las bases para una API más profesional.
La estructura está lista, el proyecto arranca sin problemas y ya tengo todo preparado para empezar mañana con los DTOs y las validaciones.
Lleno de motivación.

##### 🧠 Cita del día:
“The groundwork of all happiness is health — and the groundwork of all progress is preparation.”
