<h1 align="center">Patrones arquitectónicos</h1>

<h2>📑 Contenido</h2>

- [Patrones arquitectónicos](#patrones-arquitectónicos)
- [Modelo-Vista-Controlador (MVC)](#modelo-vista-controlador-mvc)
- [Modelo-Vista-Presentador (MVP)](#modelo-vista-presentador-mvp)
- [Modelo-Vista-ViewModel (MVVM)](#modelo-vista-viewmodel-mvvm)
- [Capas (Layers)](#capas-layers)
- [Arquitectura hexagonal (Hexagonal Architecture)](#arquitectura-hexagonal-hexagonal-architecture)
- [Microservicios (Microservices)](#microservicios-microservices)
- [Arquitectura Orientada a Servicios (Service-Oriented Architecture, SOA)](#arquitectura-orientada-a-servicios-service-oriented-architecture-soa)
- [Arquitectura de Eventos (Event-Driven Architecture)](#arquitectura-de-eventos-event-driven-architecture)

## Patrones arquitectónicos

Los patrones arquitectónicos son patrones de diseño de alto nivel que proporcionan soluciones generales para problemas recurrentes en el diseño de sistemas de software a nivel arquitectónico. Estos patrones ayudan a estructurar y organizar el código de una manera que mejora la flexibilidad, mantenibilidad y escalabilidad del sistema.

## Modelo-Vista-Controlador (MVC)

Divide una aplicación en tres componentes principales: el Modelo (que maneja la lógica de la aplicación y los datos), la Vista (que presenta la interfaz de usuario) y el Controlador (que maneja las interacciones del usuario y actualiza el modelo y la vista en consecuencia).

## Modelo-Vista-Presentador (MVP)

Similar al MVC, pero con una separación más estricta entre la vista y el modelo. El Presentador actúa como un intermediario que maneja las interacciones del usuario y actualiza el modelo y la vista en consecuencia.

## Modelo-Vista-ViewModel (MVVM)

Diseñado específicamente para aplicaciones de interfaz de usuario, donde el ViewModel actúa como un adaptador entre la vista y el modelo, proporcionando enlaces de datos y manejo de eventos.

## Capas (Layers)

Divide una aplicación en capas lógicas, como la capa de presentación, la capa de lógica de negocio y la capa de acceso a datos, para separar las preocupaciones y mejorar la modularidad y la reutilización del código.

## Arquitectura hexagonal (Hexagonal Architecture)

También conocida como Puertos y Adaptadores, separa la lógica de negocio de los detalles de implementación y las tecnologías externas, lo que facilita las pruebas y la adaptación a cambios en las tecnologías externas.

## Microservicios (Microservices)

Diseña una aplicación como un conjunto de servicios pequeños e independientes, cada uno ejecutando un proceso específico y comunicándose a través de protocolos ligeros como HTTP o AMQP.

## Arquitectura Orientada a Servicios (Service-Oriented Architecture, SOA)

Organiza una aplicación como un conjunto de servicios independientes y reutilizables que se comunican entre sí a través de interfaces bien definidas y estándares abiertos.

## Arquitectura de Eventos (Event-Driven Architecture)

Diseña una aplicación para responder a eventos producidos por diferentes partes del sistema, permitiendo una comunicación asíncrona y desacoplada entre los componentes.
