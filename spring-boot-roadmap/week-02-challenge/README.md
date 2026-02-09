# 🧑‍💼 UserRegistry — Week 02 Challenge
API REST para gestionar usuarios con validaciones profesionales, manejo global de errores, DTOs limpios y logs estructurados.  
Este desafío sirve para comprobar que puedes aplicar de forma autónoma todo lo aprendido durante la Week 02.

---
## 📌 Enunciado del desafío
Crea una API llamada UserRegistry que permita gestionar usuarios.
Cada usuario debe tener:
- **id** (Long)
- **name** (String)
- **email** (String)
- **age** (Integer)

La API debe permitir:

#### ➡ Operaciones CRUD básicas
- Obtener todos los usuarios
- Obtener un usuario por ID
- Crear un usuario
- Actualizar un usuario
- Eliminar un usuario

#### ➡ Validaciones obligatorias
- `name` → obligatorio
- `email` → formato válido
- `age` → mínimo 18

#### ➡ Manejo global de errores
- Validaciones
- Usuario no encontrado
- Datos inválidos
- Respuestas estandarizadas
 
---
## 🧱 Requisitos técnicos
Tu API debe seguir la arquitectura profesional de la Week 02:
- **Controller** → Manejo de peticiones HTTP
- **Service** → Lógica de negocio
- **Domain** → Clase User
- **DTOs** → UserRequestDTO y UserResponseDTO
- **Exceptions** → Excepciones personalizadas
- **GlobalExceptionHandler** → Manejo centralizado de errores
- **Lista en memoria** → No usar base de datos todavía
- **Logs** → SLF4J en el servicio

Además:
- Validaciones con **Jakarta Validation**
- Uso de **Lombok**
- Respuestas claras y coherentes
- Código limpio y organizado

---
📂 Estructura recomendada del proyecto
```
src/main/java/com/tuusuario/userregistry/
    controller/
    service/
    domain/
    dto/
    exception/
    config/
```

---
## 🚀 Endpoints requeridos
🔹 Obtener todos los usuarios  
`GET /users`

🔹 Obtener un usuario por ID  
`GET /users/{id}`

🔹 Crear una nota  
`POST /users`
Body ejemplo:
```json
{
  "name": "Juan Pérez",
  "email": "juan@example.com",
  "age": 25
}

```

🔹 Actualizar una nota  
`PUT /users/{id}`

🔹 Eliminar una nota  
`DELETE /users/{id}`

---
## 📘 Reglas de negocio
- `name` no puede estar vacío.
- `email` debe tener un formato válido.
- `age` debe ser **≥ 18**.
- Si un usuario no existe, debe lanzarse una excepción personalizada.
- Las respuestas de error deben seguir un formato estándar:
```json
{
  "timestamp": "...",
  "message": "...",
  "details": "..."
}
```

---
## 🧪 Pruebas sugeridas
- Crear usuarios válidos
- Crear usuarios inválidos (email incorrecto, edad < 18, nombre vacío)
- Obtener usuario por ID
- Actualizar usuario
- Eliminar usuario
- Probar ID inexistente
- Verificar logs en consola
- Validar que el GlobalExceptionHandler captura todos los errores

---
## 🛣️ Objetivo del desafío
Este ejercicio demuestra que puedes:
- Replicar una arquitectura profesional
- Aplicar validaciones reales
- Manejar excepciones de forma centralizada
- Crear DTOs limpios y coherentes
- Implementar CRUD completo
- Añadir logs útiles
- Documentar tu API
- Trabajar de forma autónoma

---
## 🧭 Consejos finales
- No copies y pegues del proyecto anterior: recréalo desde cero.
- Mantén la estructura clara y coherente.
- Usa nombres semánticos y logs útiles.
- Documenta tu API en un README propio.
- Crea una colección Postman para probar todos los endpoints.