<h1 align="center">Modelo incremental</h1>

<h2>📑 Contenido</h2>

- [Modelo incremental](#modelo-incremental)
- [Fases del modelo incremental](#fases-del-modelo-incremental)
  - [Análisis de requisitos iniciales](#análisis-de-requisitos-iniciales)
  - [Diseño global](#diseño-global)
  - [Desarrollo e implementación de incrementos](#desarrollo-e-implementación-de-incrementos)
  - [Validación del incremento](#validación-del-incremento)
  - [Revisión y retroalimentación](#revisión-y-retroalimentación)
  - [Mantenimiento y mejoras](#mantenimiento-y-mejoras)
- [Ventajas](#ventajas)
- [Desventajas](#desventajas)

## Modelo incremental

El modelo incremental es una metodología de desarrollo de software que divide el proyecto en pequeñas partes funcionales llamadas incrementos. Cada incremento agrega una porción de la funcionalidad completa del software y se desarrolla de manera iterativa. Este enfoque permite obtener versiones funcionales del software en etapas tempranas y mejorar progresivamente el sistema a medida que se agregan nuevos incrementos.

El desarrollo incremental se realiza en ciclos repetidos de especificación, diseño, implementación y pruebas. Cada ciclo entrega un incremento del software, que es una versión parcialmente completa pero funcional del sistema. Los incrementos se integran sucesivamente hasta que el sistema completo esté desarrollado.

## Fases del modelo incremental

### Análisis de requisitos iniciales

- **Objetivo:** Identificar y documentar los requisitos iniciales del sistema.
- **Actividades:** Reuniones con stakeholders, análisis de documentación existente.
- **Entregables:** Documento de requisitos iniciales.

### Diseño global

- **Objetivo:** Crear un diseño general del sistema que permita la incorporación de incrementos sucesivos.
- **Actividades:** Diseño de arquitectura, especificación de interfaces.
- **Entregables:** Documento de diseño arquitectónico global.

### Desarrollo e implementación de incrementos

- **Objetivo:** Desarrollar e implementar cada incremento de manera iterativa.
- **Actividades:**
- **Planificación del Incremento:** Definir las funcionalidades específicas del incremento.
- **Diseño del Incremento:** Diseñar los componentes específicos del incremento.
- **Implementación:** Codificar las funcionalidades del incremento.
- **Pruebas:** Realizar pruebas unitarias, de integración y de sistema para el incremento.
- **Integración:** Integrar el incremento con el sistema existente.
- **Entregables:** Código fuente del incremento, informes de pruebas, versión actualizada del software.

### Validación del incremento

- **Objetivo:** Asegurar que el incremento cumpla con los requisitos especificados y se integre correctamente con el sistema existente.
- **Actividades:** Pruebas de integración, pruebas de aceptación.
- **Entregables:** Informes de validación.

### Revisión y retroalimentación

- **Objetivo:** Evaluar el incremento entregado y recopilar retroalimentación para los siguientes incrementos.
- **Actividades:** Revisión con stakeholders, ajuste de requisitos para próximos incrementos.
- **Entregables:** Documentos de retroalimentación y ajuste de requisitos.

### Mantenimiento y mejoras

- **Objetivo:** Realizar mantenimiento y mejoras basadas en la retroalimentación de los usuarios.
- **Actividades:** Corrección de errores, mejoras de rendimiento, adición de nuevas funcionalidades.
- **Entregables:** Versiones actualizadas del software.

## Ventajas

- **Entrega Temprana de Funcionalidad:** Permite la entrega de versiones funcionales del software en etapas tempranas, proporcionando valor al cliente de manera anticipada.
- **Flexibilidad y Adaptabilidad:** Facilita la incorporación de cambios en los requisitos y ajustes basados en la retroalimentación de los usuarios.
- **Reducción de Riesgos:** Los problemas y errores se detectan y corrigen en etapas tempranas y a menor escala, reduciendo el riesgo global del proyecto.
- **Mejora Continua:** La retroalimentación continua permite mejorar el software de manera iterativa y progresiva.

## Desventajas

- **Complejidad en la Gestión:** Requiere una planificación y gestión cuidadosas para coordinar los incrementos y asegurar la cohesión del sistema.
- **Requiere una Arquitectura Bien Definida:** Es esencial tener un diseño arquitectónico robusto que soporte la integración continua de incrementos.
- **Posible Retrabajo:** Cambios en los requisitos o problemas de integración pueden llevar a la necesidad de realizar retrabajos.
- **Dependencia en la Calidad del Incremento Inicial:** Un diseño inicial deficiente puede afectar negativamente la calidad de los incrementos sucesivos.
