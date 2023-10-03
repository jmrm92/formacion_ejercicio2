# Microservicio Formacion


## Descripción

Este sistema provee una API REST para gestionar formaciones, permitiendo obtener una lista de las mismas y también añadir nuevas a la base de datos, consumiendo un microservicio externo de gestión de cursos.

## Tecnologías

- Java
- Spring Boot
- RestTemplate para llamadas HTTP

## Funcionalidades Principales

- **Recuperar Formaciones:** Permite obtener una lista de todas las formaciones transformadas desde los cursos.
- **Crear Nueva Formación:** Permite añadir una nueva formación, que será transformada y almacenada como un curso.

## API Endpoints

### Formaciones

- **Obtener todas las formaciones**
    - Método: `GET`
    - Endpoint: `/`

- **Crear una nueva formación**
    - Método: `POST`
    - Endpoint: `/`


### Requisitos

- Java JDK 11 o superior
- Maven

### Pasos

1. **Clone del Repositorio**
   ```
   git clone https://github.com/jmrm92/formacion_ejercicio2
   ```
   
2. **Build y Ejecución con Maven**
   ```
   mvn clean install
   mvn spring-boot:run
   ```
   
   La API estará disponible en `http://localhost:9090`.
