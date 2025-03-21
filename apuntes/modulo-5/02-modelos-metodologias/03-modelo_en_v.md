<h1 align="center">Modelo en V (modelo de verificación y validación)</h1>

<h2>📑 Contenido</h2>

- [Modelo en V](#modelo-en-v)
- [Fases del Modelo en V](#fases-del-modelo-en-v)
  - [Requisitos del sistema (System Requirements)](#requisitos-del-sistema-system-requirements)
  - [Requisitos del software (Software Requirements)](#requisitos-del-software-software-requirements)
  - [Diseño de arquitectura (Architectural Design)](#diseño-de-arquitectura-architectural-design)
  - [Diseño de componentes (Component Design)](#diseño-de-componentes-component-design)
  - [Implementación (Implementation)](#implementación-implementation)
  - [Pruebas unitarias (Unit Testing)](#pruebas-unitarias-unit-testing)
  - [Pruebas de integración de componentes (Component Integration Testing)](#pruebas-de-integración-de-componentes-component-integration-testing)
  - [Pruebas de integración del sistema (System Integration Testing)](#pruebas-de-integración-del-sistema-system-integration-testing)
  - [Pruebas de aceptación del usuario (User Acceptance Testing - UAT)](#pruebas-de-aceptación-del-usuario-user-acceptance-testing---uat)
- [Ventajas](#ventajas)
- [Desventajas](#desventajas)

## Modelo en V

El Modelo en V, también conocido como el Modelo de Verificación y Validación, es una extensión del modelo en cascada. Su principal característica es la relación paralela entre las fases de desarrollo y las fases de pruebas, formando una estructura en forma de "V". Esto implica que cada fase de desarrollo tiene una fase de prueba correspondiente, lo que asegura una verificación y validación sistemáticas del software en cada etapa.

El Modelo en V enfatiza una relación directa entre cada fase de desarrollo y una fase de prueba correspondiente, promoviendo una verificación continua y una validación temprana. La mitad izquierda de la "V" representa la definición y especificación del sistema, mientras que la mitad derecha representa las actividades de prueba y validación.

## Fases del Modelo en V

### Requisitos del sistema (System Requirements)

- **Objetivo:** Recopilar y documentar los requisitos del sistema a nivel global.
- **Actividades:** Entrevistas con clientes, análisis de requisitos.
- **Entregables:** Documento de requisitos del sistema.
- **Pruebas Asociadas:** Pruebas de aceptación del sistema.

---

### Requisitos del software (Software Requirements)

- **Objetivo:** Detallar los requisitos del software derivado de los requisitos del sistema.
- **Actividades:** Análisis detallado, creación de especificaciones funcionales.
- **Entregables:** Documento de requisitos de software.
- **Pruebas Asociadas:** Pruebas de aceptación de usuario.

---

### Diseño de arquitectura (Architectural Design)

- **Objetivo:** Definir la arquitectura del sistema, incluyendo componentes y sus interacciones.
- **Actividades:** Diagramas de arquitectura, especificaciones de interfaz.
- **Entregables:** Documento de diseño arquitectónico.
- **Pruebas Asociadas:** Pruebas de integración del sistema.

---

### Diseño de componentes (Component Design)

- **Objetivo:** Diseñar los detalles de cada componente del sistema.
- **Actividades:** Diagramas de componentes, especificaciones de módulos.
- **Entregables:** Documento de diseño de componentes.
- **Pruebas Asociadas:** Pruebas de integración de componentes.

---

### Implementación (Implementation)

- **Objetivo:** Codificar y crear los componentes del sistema.
- **Actividades:** Programación, desarrollo de bases de datos, integración inicial.
- **Entregables:** Código fuente, scripts de bases de datos.
- **Pruebas Asociadas:** Pruebas unitarias.

---

### Pruebas unitarias (Unit Testing)

- **Objetivo:** Verificar que cada componente funciona correctamente de manera individual.
- **Actividades:** Ejecución de casos de prueba unitarios.
- **Entregables:** Informes de pruebas unitarias.

---

### Pruebas de integración de componentes (Component Integration Testing)

- **Objetivo:** Verificar que los componentes integrados funcionen juntos correctamente.
- **Actividades:** Ejecución de casos de prueba de integración de componentes.
- **Entregables:** Informes de pruebas de integración de componentes.

---

### Pruebas de integración del sistema (System Integration Testing)

- **Objetivo:** Verificar que todos los componentes y sistemas funcionen juntos como un todo.
- **Actividades:** Ejecución de casos de prueba de integración del sistema.
- **Entregables:** Informes de pruebas de integración del sistema.

---

### Pruebas de aceptación del usuario (User Acceptance Testing - UAT)

- **Objetivo:** Verificar que el sistema cumple con los requisitos de usuario y está listo para la implementación.
- **Actividades:** Ejecución de casos de prueba de aceptación del usuario.
- **Entregables:** Informes de pruebas de aceptación del usuario

---

## Ventajas

- **Verificación y Validación Estructuradas:** La relación directa entre las fases de desarrollo y las pruebas asegura una verificación y validación sistemáticas.
- **Detección Temprana de Errores:** Los problemas se pueden identificar en fases tempranas gracias a las pruebas planificadas para cada etapa de desarrollo.
- **Claridad en la Documentación:** Cada fase está bien documentada, lo que facilita el seguimiento y la gestión del proyecto.
- **Mejor Gestión del Riesgo:** Las pruebas continuas ayudan a identificar y mitigar riesgos más temprano en el ciclo de desarrollo.

## Desventajas

- **Rigidez y Falta de Flexibilidad:** Similar al modelo en cascada, es difícil adaptarse a cambios en los requisitos una vez que una fase está completada.
- **Alta Dependencia en la Documentación Inicial:** La precisión de las fases de pruebas depende en gran medida de la calidad de la documentación inicial de requisitos y diseño.
- **Complejidad en Proyectos Grandes:** Puede ser complicado y costoso implementar y gestionar en proyectos de gran escala o con requisitos muy cambiantes.
  Aplicaciones del Modelo en V
- **Proyectos con Requisitos Claros y Estables:** Ideal para proyectos donde los requisitos son bien entendidos y poco propensos a cambios significativos.
- **Entornos Regulatorios:** Utilizado en industrias donde la documentación detallada y las pruebas exhaustivas son esenciales, como en la industria aeroespacial, defensa y automotriz.
- **Proyectos Pequeños y Medianos:** Se adapta bien a proyectos donde la gestión estructurada y la documentación detallada son esenciales para el éxito.
