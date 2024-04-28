# REST API with Spring Boot applying best practices

This project contains the configuration and development necessary for you to start creating your first REST API from scratch with Spring Boot, applying best practices to enhance your projects.

## Applying Swagger to document the APIs
Swagger UI allows anyone — be it your development team or your end consumers — to visualize and interact with the API’s resources without having any of the implementation logic in place. It’s automatically generated from your OpenAPI (formerly known as Swagger) Specification, with the visual documentation making it easy for back end
implementation and client side consumption.

For the integration between spring-boot and swagger-ui, add the library to the list of your project dependencies (No additional configuration is needed)
````
<dependency>
      <groupId>org.springdoc</groupId>
      <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
      <version>2.5.0</version>
   </dependency>
```
Path to run it from your website.

`http://localhost:8092/swagger-ui-custom.html`

### Springdoc Applications Demos

![swagger](https://github.com/mickfree/api-rest-springboot/assets/81603830/e9a9624c-49a9-40bd-aa57-d2cfb4054d86)

![swagger3](https://github.com/mickfree/api-rest-springboot/assets/81603830/5ac432ca-d142-46e8-a438-ae678a01727f)

## Database Script

```
create database db_springboot_dev;
CREATE TABLE `db_springboot_dev`.`clientes` (
  `id_cliente` INT ZEROFILL NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido` VARCHAR(45) NOT NULL,
  `correo` VARCHAR(45) NOT NULL,
  `fecha_registro` date  NOT NULL,
  PRIMARY KEY (`id_cliente`));
INSERT INTO clientes (nombre, apellido, correo, fecha_registro) VALUES('Joel', 'Jurado', 'juradoec@yahoo.com', '2023-08-01');
INSERT INTO clientes (nombre, apellido, correo, fecha_registro) VALUES('Carlos', 'Miranda', 'mirandaTr98@gmail.com', '2023-08-02');
INSERT INTO clientes (nombre, apellido, correo, fecha_registro) VALUES('Marcela', 'Sanchez', 'schMarce@itb.com', '2023-08-03');
INSERT INTO clientes (nombre, apellido, correo, fecha_registro) VALUES('Ben', 'Tennyson', 'ben10@cn.com', '2023-08-04');
```

