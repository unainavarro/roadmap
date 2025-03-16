<h1 align="center">Modelos de referencia (OSI)</h1>

<h2>📑 Contenido</h2>

- [Modelos de referencia (OSI)](#modelos-de-referencia-osi)
- [Capas del modelo OSI](#capas-del-modelo-osi)
  - [Capa física (capa 1)](#capa-física-capa-1)
  - [Capa de enlace de datos (capa 2)](#capa-de-enlace-de-datos-capa-2)
  - [Capa de red (capa 3)](#capa-de-red-capa-3)
  - [Capa de transporte (capa 4)](#capa-de-transporte-capa-4)
  - [Capa de sesión (capa 5)](#capa-de-sesión-capa-5)
  - [Capa de presentación (capa 6)](#capa-de-presentación-capa-6)
  - [Capa de aplicación (capa 7)](#capa-de-aplicación-capa-7)
- [Interacción entre capas](#interacción-entre-capas)
  - [Encapsulación](#encapsulación)
  - [Desencapsulación](#desencapsulación)
  - [Ejemplo de comunicación](#ejemplo-de-comunicación)
- [Ejemplos de protocolos y tecnologías por capa](#ejemplos-de-protocolos-y-tecnologías-por-capa)

## Modelos de referencia (OSI)

El Modelo OSI (Open Systems Interconnection) es un marco de referencia conceptual que describe cómo los sistemas de comunicación deben interactuar en una red. Desarrollado por la Organización Internacional para la Estandarización (ISO) en 1984, el modelo OSI divide el proceso de comunicación en siete capas, cada una con funciones específicas. Su propósito principal es estandarizar la comunicación entre diferentes sistemas y dispositivos, independientemente de su hardware o software subyacente.

La importancia del modelo OSI radica en su capacidad para facilitar la interoperabilidad entre tecnologías de red. Al proporcionar un marco común, permite que los fabricantes y desarrolladores creen productos compatibles entre sí, lo que promueve la expansión y evolución de las redes globales.

## Capas del modelo OSI

El modelo OSI consta de siete capas, cada una con responsabilidades específicas en el proceso de comunicación. A continuación, se describen las capas en orden ascendente:

### Capa física (capa 1)

Transmite bits brutos a través del medio físico (cables, fibra óptica, ondas de radio, etc.).

- **Responsabilidades:** Define las características físicas de la conexión, como voltajes, tasas de transferencia y conectores.

- **Ejemplos de tecnologías:** Ethernet, USB, HDMI, DSL.

### Capa de enlace de datos (capa 2)

Proporciona un enlace confiable entre dos dispositivos directamente conectados.

- **Responsabilidades:** Detección y corrección de errores, control de flujo y direccionamiento físico (MAC).

- **Ejemplos de protocolos:** Ethernet, Wi-Fi (IEEE 802.11), PPP.

### Capa de red (capa 3)

Gestiona el enrutamiento de datos entre dispositivos en diferentes redes.

- **Responsabilidades:** Direccionamiento lógico (IP), enrutamiento y fragmentación de paquetes.

- **Ejemplos de protocolos:** IP (Internet Protocol), ICMP, ARP, routers.

### Capa de transporte (capa 4)

Asegura la transferencia confiable de datos entre dispositivos.

- **Responsabilidades:** Control de flujo, detección de errores, multiplexación y segmentación de datos.

- **Ejemplos de protocolos:** TCP (Transmission Control Protocol), UDP (User Datagram Protocol).

### Capa de sesión (capa 5)

Establece, gestiona y finaliza las sesiones de comunicación entre aplicaciones.

- **Responsabilidades:** Sincronización, control de diálogo y recuperación de sesiones.

- **Ejemplos de protocolos:** NetBIOS, RPC (Remote Procedure Call).

### Capa de presentación (capa 6)

Traduce, cifra y comprime los datos para que sean compatibles entre sistemas.

- **Responsabilidades:** Conversión de formatos, cifrado y compresión de datos.

- **Ejemplos de protocolos:** SSL/TLS (cifrado), JPEG (compresión de imágenes).

### Capa de aplicación (capa 7)

Proporciona servicios de red directamente a las aplicaciones del usuario.

- **Responsabilidades:** Interfaz entre el usuario y la red, manejo de solicitudes y respuestas.

- **Ejemplos de protocolos:** HTTP, FTP, SMTP, DNS.

## Interacción entre capas

Las capas del modelo OSI interactúan de manera jerárquica para facilitar la comunicación de datos. Cada capa se comunica con su capa adyacente (superior o inferior) y realiza funciones específicas antes de pasar los datos a la siguiente capa. Este proceso se conoce como encapsulación:

### Encapsulación

Cuando los datos viajan desde la capa de aplicación hacia la capa física, cada capa agrega información de control (encabezados) a los datos.

**Ejemplo:**

En la capa de transporte, los datos se dividen en segmentos (TCP) o datagramas (UDP), y se agrega un encabezado con información como puertos y números de secuencia.

### Desencapsulación

Cuando los datos llegan al dispositivo de destino, cada capa elimina su encabezado correspondiente y pasa los datos a la capa superior.

**Ejemplo:**

En la capa de red, el encabezado IP se elimina y los datos se pasan a la capa de transporte.

### Ejemplo de comunicación

Supongamos que un usuario envía un correo electrónico:

- La capa de aplicación (SMTP) prepara el mensaje.

- La capa de presentación cifra los datos si es necesario.

- La capa de sesión establece una conexión con el servidor.

- La capa de transporte divide los datos en segmentos.

- La capa de red agrega direcciones IP y enruta los paquetes.

- La capa de enlace de datos agrega direcciones MAC y detecta errores.

- La capa física transmite los bits a través del medio.

## Ejemplos de protocolos y tecnologías por capa

| **Capa**        | **Protocolos y Tecnologías Asociadas**     |
| --------------- | ------------------------------------------ |
| Aplicación      | HTTP, FTP, SMTP, DNS, Telnet, SSH          |
| Presentación    | SSL/TLS, JPEG, MPEG, GIF                   |
| Sesión          | NetBIOS, RPC, PPTP                         |
| Transporte      | TCP, UDP, SCTP                             |
| Red             | IP, ICMP, ARP, Routers, BGP                |
| Enlace de Datos | Ethernet, Wi-Fi, PPP, Switch, MAC          |
| Física          | Cables UTP, Fibra óptica, Hub, Repetidores |
