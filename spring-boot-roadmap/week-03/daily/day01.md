# 📅 Día 1 — Semana 3 ## Configuración de la base de datos y preparación del entorno JPA

### 🎯 Objetivo del día
- Crear un nuevo proyecto para la Week 03, independiente del de semanas anteriores.
- Añadir las dependencias necesarias para trabajar con JPA y una base de datos.
- Configurar correctamente application.properties para usar H2 (o MySQL).
- Verificar que la base de datos arranca y está accesible.
- Dejar el proyecto preparado para comenzar mañana con entidades y repositorios..

---
### 🛠️ Actividades realizadas
- Creación de un nuevo proyecto Spring Boot para la Week 03.
- Inclusión de dependencias esenciales en el `pom.xml`:
  - `spring-boot-starter-data-jpa`
  - `h2` (modo desarrollo)
  - Lombok
- Configuración inicial de la base de datos en application.properties:
  - URL de conexión
  - Driver
  - Usuario/contraseña
  - spring.jpa.hibernate.ddl-auto=update
  - Consola H2 habilitada
- Verificación de que la aplicación arranca sin errores.
- Acceso a la consola H2 en /h2-console para confirmar la conexión.
- Commit inicial con toda la configuración base del proyecto.

---
## ⚙️ Configuración aplicada
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

---
### 📂 Estructura creada
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
### 📚 Aprendizajes clave
- Qué es JPA y por qué es el estándar para persistencia en Java.
- Diferencias entre JPA (especificación) y Hibernate (implementación).
- Ventajas de usar H2 en desarrollo: rapidez, simplicidad y entorno limpio.
- Importancia de ddl-auto y sus modos (update, create, validate, etc.).
- Cómo preparar un proyecto para trabajar con entidades y repositorios sin errores.
- Por qué es buena práctica separar este proyecto del de la semana anterio

---
### 💭 Reflexión personal
Hoy ha sido un día de preparación, pero de los importantes.
He dejado listo un proyecto completamente nuevo, configurado para trabajar con JPA y una base de datos real. Sensación de entrar en un terreno más real con BBDD.

##### 🧠 Cita del día:
“Every great structure begins with a solid foundation.”
