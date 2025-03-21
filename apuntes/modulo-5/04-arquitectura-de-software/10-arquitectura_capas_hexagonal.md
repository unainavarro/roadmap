<h1 align="center">Arquitectura de capas hexagonal (Arquitectura de Puertos y Adaptadores)</h1>

<h2>📑 Contenido</h2>

- [Arquitectura de capas hexagonal](#arquitectura-de-capas-hexagonal)
- [Características principales](#características-principales)
- [Componentes de la arquitectura hexagonal](#componentes-de-la-arquitectura-hexagonal)
- [Ventajas de la arquitectura hexagonal](#ventajas-de-la-arquitectura-hexagonal)
- [Consideraciones](#consideraciones)

## Arquitectura de capas hexagonal

La arquitectura hexagonal, también conocida como arquitectura de puertos y adaptadores, es un enfoque de diseño de software que busca hacer que una aplicación sea independiente de sus mecanismos de entrega y de infraestructura. Este modelo promueve la separación de preocupaciones, la flexibilidad y la capacidad de prueba. Aquí tienes más detalles:

## Características principales

**Independencia de la Infraestructura:**

- La aplicación central (dominio) está desacoplada de la infraestructura y mecanismos externos como bases de datos, interfaces de usuario, y servicios externos.

**Puertos y Adaptadores:**

- **Puertos:** Son interfaces que definen puntos de entrada y salida de la aplicación, permitiendo la comunicación con el mundo exterior.
- **Adaptadores:** Implementan estos puertos y actúan como traductores entre la aplicación central y las tecnologías externas.

**Foco en el Dominio:**

- La lógica de negocio y las reglas de la aplicación se encuentran en el núcleo de la arquitectura, lo que facilita la mantenibilidad y la comprensión del sistema.

## Componentes de la arquitectura hexagonal

**Núcleo de Aplicación (Dominio):**

- Contiene la lógica de negocio y las reglas de la aplicación.
- Está completamente aislado de los detalles de infraestructura.

**Puertos (Interfaces):**

- Definen los puntos de entrada y salida para interactuar con la aplicación.
- Pueden ser puertos de entrada (por donde entran las solicitudes) o puertos de salida (por donde salen las respuestas).

**Adaptadores (Implementaciones):**

- Implementan los puertos para conectar el núcleo de la aplicación con sistemas externos.
- Ejemplos incluyen adaptadores para bases de datos, APIs REST, interfaces de usuario, entre otros.

## Ventajas de la arquitectura hexagonal

**Separación de Preocupaciones:**

- La separación clara entre la lógica de negocio y la infraestructura facilita el mantenimiento y la evolución del sistema.

**Flexibilidad:**

- Permite cambiar o reemplazar componentes de infraestructura (como bases de datos o interfaces de usuario) sin afectar el núcleo de la aplicación.

**Facilidad de Pruebas:**

- La lógica de negocio se puede probar de manera aislada, lo que simplifica las pruebas unitarias y funcionales.

**Reutilización:**

- Los puertos y adaptadores pueden ser reutilizados en diferentes contextos y aplicaciones.

## Consideraciones

**Complejidad Inicial:**

- La configuración inicial puede ser compleja debido a la necesidad de definir puertos y adaptadores de manera adecuada.

**Curva de Aprendizaje:**

- Requiere una comprensión profunda de los principios de diseño y las mejores prácticas de arquitectura.

**Gestión de Dependencias:**

- Es necesario gestionar las dependencias entre los componentes para mantener el desacoplamiento y la independencia del núcleo de la aplicación.
