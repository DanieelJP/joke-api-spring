# Aplicación de Chistes Aleatorios

Esta aplicación web muestra chistes aleatorios utilizando la JokeAPI. Está desarrollada con Spring Boot y utiliza Thymeleaf para las plantillas.

## Características

- Muestra chistes aleatorios de la JokeAPI
- Soporta chistes de una parte y de dos partes (setup y delivery)
- Interfaz moderna y responsive usando Bootstrap
- Actualización en tiempo real de chistes

## Tecnologías Utilizadas

- Java 16
- Spring Boot 2.4.5
- Thymeleaf
- Bootstrap 5.1.3
- Maven

## Requisitos Previos

- Java JDK 16 o superior
- Maven 3.6 o superior

## Instalación

1. Clona el repositorio:
```bash
git clone [URL_DEL_REPOSITORIO]
```

2. Navega al directorio del proyecto:
```bash
cd consuming-rest
```

3. Compila el proyecto:
```bash
./mvnw clean install
```

## Ejecución

Para ejecutar la aplicación:

```bash
./mvnw spring-boot:run
```

La aplicación estará disponible en: `http://localhost:8080/jokes`

## Estructura del Proyecto

```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── example/
│   │           └── consumingrest/
│   │               ├── ConsumingRestApplication.java
│   │               ├── Joke.java
│   │               ├── JokeController.java
│   │               └── JokeService.java
│   └── resources/
│       └── templates/
│           ├── joke.html
│           └── error.html
```

## API Externa

La aplicación utiliza la JokeAPI:
- URL Base: https://v2.jokeapi.dev/
- Endpoint: /joke/Any
- Proporciona chistes aleatorios en varios idiomas y categorías

## Autor

DanieelJP

## Licencia

Este proyecto está bajo la Licencia MIT.