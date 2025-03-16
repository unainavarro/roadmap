<h1 align="center">Protocolos de red</h1>

<h2>📑 Contenido</h2>

- [Protocolos de red](#protocolos-de-red)
- [TCP/IP](#tcpip)
  - [TCP (Transmission Control Protocol)](#tcp-transmission-control-protocol)
  - [IP (Internet Protocol)](#ip-internet-protocol)
  - [Arquitectura TCP/IP](#arquitectura-tcpip)
- [HTTP y HTTPS](#http-y-https)
  - [HTTP (HyperText Transfer Protocol)](#http-hypertext-transfer-protocol)
  - [HTTPS (HyperText Transfer Protocol Secure)](#https-hypertext-transfer-protocol-secure)
- [FTP](#ftp)
- [SMTP](#smtp)

## Protocolos de red

**Un protocolo de red es un conjunto de reglas y estándares que permiten la comunicación entre dispositivos en una red**. Estos protocolos definen cómo se envían, reciben y procesan los datos, asegurando que la información llegue de manera confiable y ordenada. Sin protocolos, los dispositivos no podrían entenderse entre sí, lo que haría imposible la comunicación en redes como Internet.

La importancia de los protocolos de red radica en su capacidad para estandarizar la comunicación, lo que permite que dispositivos de diferentes fabricantes y sistemas operativos interactúen sin problemas. Además, los protocolos garantizan la integridad, seguridad y eficiencia de los datos transmitidos.

**Diferencia entre protocolos:** Cada protocolo tiene un propósito específico. Algunos se enfocan en la transferencia de datos (como TCP/IP), otros en la presentación de contenido (como HTTP), y otros en la seguridad (como HTTPS). La elección del protocolo depende del tipo de comunicación y los requisitos de la aplicación.

**Protocolos:**

- TCP/IP es el núcleo de la comunicación en redes.

- HTTP/HTTPS permite la navegación web segura.

- FTP facilita la transferencia de archivos.

- SMTP gestiona el envío de correos electrónicos.

## TCP/IP

TCP/IP (Transmission Control Protocol/Internet Protocol) es el conjunto de protocolos más utilizado en redes modernas, incluyendo Internet. Define cómo los datos se transmiten y se reciben a través de redes, y está compuesto por dos protocolos principales:

### TCP (Transmission Control Protocol)

Proporciona una comunicación confiable y orientada a la conexión.

**Características:**

- Establece una conexión entre el emisor y el receptor antes de enviar datos.

- Garantiza que los datos lleguen en orden y sin errores.

- Utiliza mecanismos de control de flujo y retransmisión para asegurar la entrega.

**Uso común:** Navegación web, transferencia de archivos, correo electrónico.

### IP (Internet Protocol)

Encargado del direccionamiento y enrutamiento de paquetes de datos.

**Características:**

- Asigna direcciones únicas (direcciones IP) a cada dispositivo en la red.

- Enruta los paquetes de datos desde el origen al destino.

- No garantiza la entrega confiable (esto lo hace TCP).

**Uso común:** Comunicación entre redes, enrutamiento de datos.

### Arquitectura TCP/IP

A diferencia del modelo OSI, TCP/IP se organiza en cuatro capas

- **Capa de Aplicación:** Incluye protocolos como HTTP, FTP y SMTP.

- **Capa de Transporte:** TCP y UDP.

- **Capa de Internet:** IP.

- **Capa de Acceso a la Red:** Ethernet, Wi-Fi.

## HTTP y HTTPS

### HTTP (HyperText Transfer Protocol)

Protocolo utilizado para transferir datos en la web, principalmente páginas HTML.

**Características:**

- Funciona sobre TCP/IP.

- Es un protocolo sin estado, lo que significa que no guarda información entre solicitudes.

- Usa métodos como GET (solicitar datos) y POST (enviar datos).

**Uso común:** Navegación web, APIs.

### HTTPS (HyperText Transfer Protocol Secure)

Versión segura de HTTP que utiliza cifrado para proteger los datos.

**Características:**

- Usa SSL/TLS para cifrar la comunicación entre el cliente y el servidor.

- Protege la integridad y confidencialidad de los datos.

- Identifica al servidor mediante certificados digitales.

**Importancia:** Esencial para transacciones en línea, como compras y banca, ya que previene el robo de información sensible.

## FTP

FTP (File Transfer Protocol) es un protocolo utilizado para transferir archivos entre un cliente y un servidor en una red.

**Características:**

- Permite la subida (upload) y descarga (download) de archivos.

- Funciona en dos modos: activo y pasivo.

- Usa dos conexiones: una para comandos y otra para la transferencia de datos.

**Comandos FTP comunes:**

- `ftp nombre_del_servidor`: Conectarse a un servidor FTP.

- `ls`: Listar archivos en el servidor.

- `get archivo`: Descargar un archivo.

- `put archivo`: Subir un archivo.

- `quit`: Cerrar la conexión.

**Ejemplo de uso:**

Un desarrollador sube archivos a un servidor web usando FTP para publicar un sitio.

## SMTP

SMTP (Simple Mail Transfer Protocol) es el protocolo estándar para enviar correos electrónicos. Transfiere mensajes de correo electrónico desde el cliente al servidor y entre servidores.

**Características:**

- Usa el puerto 25 por defecto.

- Solo se encarga del envío de correos, no de la recepción.

**Interacción con otros protocolos:**

- **POP3 (Post Office Protocol):** Descarga correos desde el servidor al cliente.

- **IMAP (Internet Message Access Protocol):** Sincroniza correos entre el servidor y el cliente, permitiendo el acceso desde múltiples dispositivos.

**Ejemplo de flujo:**

1. Un usuario envía un correo usando un cliente (como Outlook).

1. El cliente se conecta al servidor SMTP para enviar el mensaje.

1. El servidor SMTP del destinatario recibe el mensaje y lo almacena.

1. El destinatario usa POP3 o IMAP para acceder al correo.
