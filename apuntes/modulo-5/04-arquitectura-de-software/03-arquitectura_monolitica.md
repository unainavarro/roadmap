<h1 align="center">Arquitectura monolítica</h1>

<h2>📑 Contenido</h2>

- [Arquitectura monolítica](#arquitectura-monolítica)
- [Características principales](#características-principales)
- [Ventajas](#ventajas)
- [Desventajas](#desventajas)

## Arquitectura monolítica

La arquitectura monolítica es un enfoque de diseño de software en el que todas las funcionalidades de una aplicación se desarrollan, implementan y despliegan como un solo bloque de código. En este modelo, todas las capas de la aplicación (como la interfaz de usuario, la lógica de negocio y el acceso a datos) están integradas y se ejecutan en el mismo proceso.

## Características principales

- **Mono-Componente:** La aplicación se compone de un solo conjunto de código fuente, generalmente escrito en un único lenguaje de programación.

- **Tecnología Integrada:** Todas las funcionalidades de la aplicación se implementan utilizando la misma tecnología y bibliotecas, lo que simplifica el desarrollo y la depuración.

- **Despliegue Unitario:** La aplicación se despliega como un único artefacto, lo que facilita la gestión y el despliegue en un entorno de producción.

- **Ejecución en un Proceso Único:** Todas las capas de la aplicación se ejecutan en el mismo proceso, lo que puede simplificar la comunicación entre los diferentes componentes pero también puede limitar la escalabilidad y la disponibilidad.

- **Comunicación Sincrónica:** La comunicación entre los diferentes módulos de la aplicación suele ser síncrona y directa, lo que puede simplificar el diseño pero también puede aumentar la complejidad y la acoplamiento.

## Ventajas

- **Simplicidad de Desarrollo:** La arquitectura monolítica es relativamente simple de entender y desarrollar, ya que todas las funcionalidades están integradas en un único código base.

- **Facilidad de Depuración:** Debido a que todas las funcionalidades están integradas, la depuración de problemas y errores puede ser más sencilla en comparación con arquitecturas distribuidas.

- **Rendimiento:** Al ejecutarse en un solo proceso, las aplicaciones monolíticas pueden tener un rendimiento más predecible y consistente en comparación con arquitecturas distribuidas.

- **Menor Sobrecarga Operativa:** La gestión y el mantenimiento de una única aplicación monolítica pueden ser menos complejos en comparación con sistemas distribuidos que involucran múltiples componentes y servicios.

## Desventajas

- **Escalabilidad Limitada:** La arquitectura monolítica puede tener dificultades para escalar horizontalmente debido a que todas las funcionalidades comparten los mismos recursos y deben escalar juntas.

- **Acoplamiento Fuerte:** Debido a que todas las funcionalidades están integradas, los cambios en una parte de la aplicación pueden tener efectos no deseados en otras partes, lo que puede aumentar el riesgo de errores y degradación del sistema.

- **Dificultad para la Implementación de Tecnologías Nuevas:** Puede ser difícil adoptar nuevas tecnologías o actualizar componentes individuales sin afectar a toda la aplicación.

- **Dificultad para la Colaboración:** En aplicaciones grandes, puede ser difícil para equipos grandes colaborar y trabajar de manera efectiva en un único código base.
