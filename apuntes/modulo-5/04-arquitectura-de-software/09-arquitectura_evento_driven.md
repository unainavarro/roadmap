<h1 align="center">Arquitectura de evento-driven (Event-Driven Architecture)</h1>

<h2>📑 Contenido</h2>

- [Arquitectura de event-driven](#arquitectura-de-event-driven)
- [Características principales](#características-principales)
- [Componentes de EDA](#componentes-de-eda)
- [Ventajas de EDA](#ventajas-de-eda)
- [Consideraciones](#consideraciones)

## Arquitectura de event-driven

La arquitectura orientada a eventos (Event-Driven Architecture, EDA) es un enfoque de diseño de software en el que los eventos juegan un papel central en la comunicación entre diferentes componentes del sistema. Los eventos representan cambios en el estado del sistema o acciones que deben ser procesadas de manera asíncrona. Este enfoque es altamente adaptable y escalable, adecuado para sistemas distribuidos y aplicaciones en tiempo real.

## Características principales

**Desacoplamiento:**

- Los componentes del sistema están desacoplados y se comunican mediante eventos, lo que permite una mayor flexibilidad y modularidad.

**Asincronía:**

- Los eventos se procesan de manera asíncrona, lo que mejora el rendimiento y la capacidad de respuesta del sistema.

**Escalabilidad:**

- La arquitectura orientada a eventos puede escalar fácilmente para manejar grandes volúmenes de eventos y usuarios concurrentes.

**Reactividad:**

- El sistema reacciona a los eventos en tiempo real, lo que es ideal para aplicaciones que requieren respuestas inmediatas a cambios o acciones.

## Componentes de EDA

**Emisores de Eventos (Event Producers):**

- Generan eventos cuando ocurre un cambio en el estado del sistema o una acción específica.
- Los emisores pueden ser interfaces de usuario, sensores, sistemas externos, entre otros.

**Consumidores de Eventos (Event Consumers):**

- Escuchan y responden a los eventos generados por los emisores.
- Los consumidores pueden realizar acciones como actualizar bases de datos, enviar notificaciones, iniciar procesos adicionales, etc.

**Bus de Eventos (Event Bus):**

- Actúa como intermediario entre emisores y consumidores de eventos.
- Facilita la transmisión de eventos de manera eficiente y gestionada.
- Ejemplos incluyen Kafka, RabbitMQ, y otros sistemas de mensajería.

**Procesadores de Eventos (Event Processors):**

- Pueden transformar, enrutar, o realizar operaciones adicionales sobre los eventos antes de que sean consumidos.
- Incluyen lógica de negocio para procesar eventos de manera específica.

## Ventajas de EDA

**Flexibilidad y Extensibilidad:**

- Los componentes pueden ser añadidos, eliminados o modificados sin afectar significativamente a otros componentes del sistema.

**Manejo de Altos Volúmenes de Datos:**

- Ideal para sistemas que requieren procesar grandes cantidades de datos en tiempo real.

**Resiliencia:**

- El desacoplamiento de componentes mejora la resiliencia, ya que un fallo en un componente no afecta necesariamente a todo el sistema.

**Mejora del Rendimiento:**

- La capacidad de procesar eventos de manera asíncrona y en paralelo mejora el rendimiento general del sistema.

## Consideraciones

**Complejidad Operativa:**

- La gestión de múltiples eventos y componentes asíncronos puede introducir complejidad en términos de monitoreo, depuración y mantenimiento.

**Consistencia de Datos:**

- Mantener la consistencia de los datos en un sistema distribuido y orientado a eventos puede ser un desafío.

**Latencia:**

- Aunque la arquitectura orientada a eventos es generalmente rápida, la latencia puede convertirse en un problema en ciertos escenarios.

**Garantía de Entrega:**

- Asegurar que los eventos se entreguen y procesen de manera confiable requiere mecanismos adicionales de confirmación y reintento.
