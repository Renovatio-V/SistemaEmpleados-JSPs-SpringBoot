# Sistema de Empleados con JSPs y Spring Boot

## Arquitectura del Sistema

El sistema de empleados está diseñado utilizando una arquitectura en capas basada en el patrón MVC, e incluye las siguientes componentes:

1. **Base de Datos**: MySQL
2. **Presentación**: JSP's y Spring MVC
3. **Servicio**: Spring
4. **Repositorio**: Spring Data
5. **Entidad**: Representación de los datos del empleado.

## Descripción del Programa

El programa gestiona la información de los empleados con los siguientes campos:

- **Id**
- **Nombre**
- **Departamento**
- **Sueldo**

### Funcionalidades

- **Agregar nuevo empleado**
- **Editar empleado existente**
- **Eliminar empleado**

Todas las operaciones se actualizan en la base de datos MySQL.

## Interfaz de Usuario

Para la parte visual del sistema se utilizó **Bootstrap**.

## Dependencias de Spring

- **Spring Web**
- **Spring Data JPA**
- **MySQL Driver**
- **Lombok**

## Archivo POM (pom.xml)

```xml
<dependencies>
    <!-- Dependencias para manejar JSPs -->
    <dependency>
        <groupId>org.apache.tomcat.embed</groupId>
        <artifactId>tomcat-embed-jasper</artifactId>
    </dependency>
    <!-- Dependencias de JSTL -->
    <dependency>
        <groupId>jakarta.servlet.jsp.jstl</groupId>
        <artifactId>jakarta.servlet.jsp.jstl-api</artifactId>
    </dependency>
    <dependency>
        <groupId>org.glassfish.web</groupId>
        <artifactId>jakarta.servlet.jsp.jstl</artifactId>
    </dependency>
    <!-- Dependencias adicionales de Spring -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
    </dependency>
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
    </dependency>
</dependencies>
