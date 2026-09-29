# 🏥 Gestión API - Java 21 & Quarkus

API RESTful desarrollada con **Java 21** y **Quarkus 3.8**, utilizando **Hibernate ORM con Panache** para la persistencia en una base de datos **H2 (In-Memory)**.

Proyecto diseñado con enfoque de alto rendimiento, bajo consumo de recursos y preparado para despliegues en arquitectura nativa o contenedores.

---

## 🛠️ Tecnologías Utilizadas

- **Java 21**: JDK LTS con soporte para Virtual Threads.
- **Quarkus 3.8.3**: Framework Cloud-Native Java.
- **Hibernate ORM con Panache**: Implementación simplificada del patrón Active Record.
- **H2 Database**: Base de datos en memoria para entornos de desarrollo.
- **Maven**: Gestión de dependencias y Build Tool.
- **Git**: Control de versiones.

---

## 🚀 Endpoints de la API (`/pacientes`)

| Método | Endpoint | Descripción | Estado HTTP |
|---|---|---|---|
| `GET` | `/pacientes` | Obtiene el listado completo de pacientes | `200 OK` |
| `POST` | `/pacientes` | Registra un nuevo paciente | `201 Created` |
| `PUT` | `/pacientes/{id}` | Actualiza los datos de un paciente | `200 OK` / `404 Not Found` |
| `DELETE` | `/pacientes/{id}` | Elimina un paciente por ID | `204 No Content` / `404 Not Found` |

### Ejemplo de Body para `POST` / `PUT` (JSON):

```json
{
  "nombre": "Carlos",
  "apellido": "Ugarte",
  "dni": "12345678",
  "edad": 46
}
