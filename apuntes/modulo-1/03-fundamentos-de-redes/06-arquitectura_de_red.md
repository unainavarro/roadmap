<h1 align="center">Arquitectura de red</h1>

<h2>📑 Contenido</h2>

- [Arquitectura de red](#arquitectura-de-red)
- [Modelos de arquitectura comunes](#modelos-de-arquitectura-comunes)
  - [Modelo cliente-servidor](#modelo-cliente-servidor)
  - [Modelo peer-to-peer (P2P)](#modelo-peer-to-peer-p2p)
  - [Modelo híbrido](#modelo-híbrido)
  - [Modelo en nube (cloud computing)](#modelo-en-nube-cloud-computing)
  - [Modelo de red definida por software (SDN)](#modelo-de-red-definida-por-software-sdn)
- [Comparación de modelos de arquitectura](#comparación-de-modelos-de-arquitectura)

## Arquitectura de red

Un modelo de arquitectura de red es un marco conceptual que define cómo se organizan y conectan los componentes de una red para facilitar la comunicación entre dispositivos. Estos modelos proporcionan una estructura clara para el diseño, implementación y gestión de redes, asegurando que los sistemas sean eficientes, escalables y seguros.

**Importancia:**

- **Estandarización:** Facilita la interoperabilidad entre dispositivos y tecnologías de diferentes fabricantes.

- **Modularidad:** Permite dividir la red en componentes manejables, lo que simplifica el diseño y la resolución de problemas.

- **Escalabilidad:** Proporciona una base para expandir la red según sea necesario.

- **Seguridad:** Define cómo se protegen los datos y se controla el acceso a la red.

**Elección de la arquitectura adecuada:**

- Depende de factores como el tamaño de la red, los requisitos de rendimiento, el presupuesto y las necesidades de seguridad.

- Una arquitectura bien elegida optimiza el rendimiento, reduce costos y facilita la administración.

## Modelos de arquitectura comunes

### Modelo cliente-servidor

En este modelo, los clientes (dispositivos finales) solicitan servicios a los servidores (dispositivos centralizados que proporcionan recursos).

**Características:**

- **Centralizado:** Los servidores gestionan recursos como archivos, bases de datos y aplicaciones.

- **Escalable:** Se pueden agregar más clientes o servidores según sea necesario.

- **Seguro:** Los servidores controlan el acceso a los recursos.

- **Ejemplos:** Servidores web, correo electrónico, bases de datos.

### Modelo peer-to-peer (P2P)

En este modelo, los dispositivos (pares) actúan tanto como clientes como servidores, compartiendo recursos directamente entre sí.

**Características:**

- **Descentralizado:** No hay un servidor central.

- **Flexible:** Fácil de configurar y mantener en redes pequeñas.

- **Menos seguro:** Depende de la configuración de cada dispositivo.

- **Ejemplos:** Compartir archivos (BitTorrent), redes domésticas.

### Modelo híbrido

Combina características de los modelos cliente-servidor y P2P.

**Características:**

- **Balanceado:** Utiliza servidores para tareas críticas y P2P para compartir recursos.

- **Versátil:** Adecuado para redes medianas y grandes.

- **Ejemplos:** Redes empresariales con servidores centrales y colaboración entre empleados.

### Modelo en nube (cloud computing)

Los recursos y servicios se alojan en servidores remotos (nube) y se acceden a través de Internet.

**Características:**

- **Escalable:** Los recursos se ajustan según la demanda.

- **Flexible:** Acceso desde cualquier lugar con conexión a Internet.

- **Costo-efectivo:** Pago por uso en lugar de inversión en infraestructura.

- **Ejemplos:** Google Workspace, Amazon Web Services (AWS), Microsoft Azure.

### Modelo de red definida por software (SDN)

Separa el plano de control (gestión de la red) del plano de datos (tráfico de red), permitiendo una administración centralizada y programable.

**Características:**

- **Dinámico:** Permite cambios rápidos en la configuración de la red.

- **Eficiente:** Optimiza el tráfico y reduce costos.

- **Ejemplos:** Redes empresariales avanzadas, centros de datos.

## Comparación de modelos de arquitectura

| **Modelo**       | **Ventajas**                         | **Desventajas**                         | **Uso común**                     |
| ---------------- | ------------------------------------ | --------------------------------------- | --------------------------------- |
| Cliente-Servidor | Centralizado, seguro, escalable      | Dependencia del servidor, mayor costo   | Empresas, servicios en línea      |
| Peer-to-Peer     | Descentralizado, fácil de configurar | Menos seguro, limitado en redes grandes | Redes domésticas, P2P             |
| Híbrido          | Balanceado, versátil                 | Complejidad en la administración        | Redes medianas y grandes          |
| Nube             | Escalable, flexible, costo-efectivo  | Dependencia de la conexión a Internet   | Empresas, aplicaciones web        |
| SDN              | Dinámico, eficiente, programable     | Requiere conocimientos avanzados        | Centros de datos, redes avanzadas |
