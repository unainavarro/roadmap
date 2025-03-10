<h1 align="center"> Amenazas Comunes</h1>

<h2>📑 Contenido</h2>

- [Amenazas comunes](#amenazas-comunes)
- [Inyección SQL (SQL Injection)](#inyección-sql-sql-injection)
  - [¿Qué es una Inyección SQL?](#qué-es-una-inyección-sql)
  - [Ejemplo de Ataque](#ejemplo-de-ataque)
  - [Mitigación](#mitigación)
- [Ataques de fuerza bruta (Brute Force Attacks)](#ataques-de-fuerza-bruta-brute-force-attacks)
  - [¿Qué es un ataque de fuerza bruta?](#qué-es-un-ataque-de-fuerza-bruta)
  - [Ejemplo de ataque](#ejemplo-de-ataque-1)
  - [Mitigación](#mitigación-1)
- [Exposición de datos sensibles](#exposición-de-datos-sensibles)
  - [¿Qué es la exposición de datos sensibles?](#qué-es-la-exposición-de-datos-sensibles)
  - [Ejemplo de ataque](#ejemplo-de-ataque-2)
  - [Mitigación](#mitigación-2)
- [Ataques de inyección NoSQL](#ataques-de-inyección-nosql)
  - [¿Qué es una inyección NoSQL?](#qué-es-una-inyección-nosql)
  - [Ejemplo de ataque](#ejemplo-de-ataque-3)
  - [Mitigación](#mitigación-3)
- [Denegación de servicio (DoS y DDoS)](#denegación-de-servicio-dos-y-ddos)
  - [¿Qué es un ataque de denegación de servicio?](#qué-es-un-ataque-de-denegación-de-servicio)
  - [Ejemplo de ataque](#ejemplo-de-ataque-4)
  - [Mitigación](#mitigación-4)
- [Ataques de ingeniería social](#ataques-de-ingeniería-social)
  - [¿Qué es la ingeniería social?](#qué-es-la-ingeniería-social)
  - [Ejemplo de ataque](#ejemplo-de-ataque-5)
  - [Mitigación](#mitigación-5)

## Amenazas comunes

Las bases de datos son un componente crítico en la mayoría de las aplicaciones modernas, ya que almacenan información valiosa y sensible. Sin embargo, también son un objetivo frecuente de ataques maliciosos.

## Inyección SQL (SQL Injection)

### ¿Qué es una Inyección SQL?

La inyección SQL es una técnica de ataque que explota vulnerabilidades en las aplicaciones que interactúan con bases de datos. Los atacantes insertan código SQL malicioso en entradas de usuario (como formularios) para manipular consultas y acceder, modificar o eliminar datos sin autorización.

### Ejemplo de Ataque

Supongamos que una aplicación web tiene un formulario de inicio de sesión con la siguiente consulta SQL:

```sql
SELECT * FROM Usuarios WHERE usuario = 'input_usuario' AND contraseña = 'input_contraseña';
```

Un atacante podría ingresar lo siguiente en el campo de usuario:

```sql
' OR '1'='1
```

La consulta resultante sería:

```sql
SELECT * FROM Usuarios WHERE usuario = '' OR '1'='1' AND contraseña = 'input_contraseña';
```

Esto permitiría al atacante acceder a la aplicación sin credenciales válidas.

### Mitigación

- **Consultas parametrizadas:** Usar consultas preparadas con parámetros para evitar la interpretación directa de entradas de usuario.

- **Validación de entradas:** Validar y sanitizar todas las entradas de usuario.

- **Principio de menor privilegio:** Limitar los permisos de la cuenta de la base de datos utilizada por la aplicación.

## Ataques de fuerza bruta (Brute Force Attacks)

### ¿Qué es un ataque de fuerza bruta?

Un ataque de fuerza bruta consiste en intentar adivinar credenciales de acceso (como nombres de usuario y contraseñas) mediante la prueba sistemática de combinaciones hasta encontrar la correcta.

### Ejemplo de ataque

Un atacante utiliza un script automatizado para probar miles de combinaciones de nombres de usuario y contraseñas en un formulario de inicio de sesión.

### Mitigación

- **Contraseñas fuertes:** Exigir contraseñas complejas y de suficiente longitud.

- **Límites de intentos:** Bloquear cuentas después de un número limitado de intentos fallidos.

- **Autenticación de dos factores (2FA):** Requerir un segundo factor de autenticación, como un código enviado al teléfono del usuario.

## Exposición de datos sensibles

### ¿Qué es la exposición de datos sensibles?

Ocurre cuando datos confidenciales, como contraseñas, números de tarjetas de crédito o información personal, son accesibles sin la debida protección.

### Ejemplo de ataque

Un atacante explota una configuración incorrecta de permisos en la base de datos para acceder a información sensible.

### Mitigación

- **Encriptación:** Encriptar datos sensibles tanto en tránsito como en reposo.

- **Máscara de datos:** Ocultar partes de los datos sensibles (por ejemplo, mostrar solo los últimos cuatro dígitos de un número de tarjeta).

- **Auditorías regulares:** Revisar y corregir configuraciones de permisos y acceso.

## Ataques de inyección NoSQL

### ¿Qué es una inyección NoSQL?

Similar a la inyección SQL, pero dirigida a bases de datos NoSQL. Los atacantes manipulan consultas NoSQL (como MongoDB o Cassandra) para acceder o modificar datos.

### Ejemplo de ataque

Un atacante envía una consulta maliciosa en formato JSON para explotar una vulnerabilidad en una API que interactúa con una base de datos NoSQL.

### Mitigación

**Validación de entradas:** Validar y sanitizar todas las entradas de usuario.

**Consultas parametrizadas:** Usar consultas preparadas o métodos seguros para interactuar con la base de datos.

**Principio de menor privilegio:** Limitar los permisos de la aplicación en la base de datos.

## Denegación de servicio (DoS y DDoS)

### ¿Qué es un ataque de denegación de servicio?

Un ataque de denegación de servicio (DoS) o denegación de servicio distribuida (DDoS) busca sobrecargar un sistema o base de datos para que deje de estar disponible para los usuarios legítimos.

### Ejemplo de ataque

Un atacante inunda la base de datos con consultas complejas o solicitudes masivas para agotar los recursos del servidor.

### Mitigación

- **Limitación de consultas:** Establecer límites en el número de consultas que un usuario puede realizar en un período de tiempo.

- **Balanceo de carga:** Distribuir la carga entre múltiples servidores.

- **Firewalls y sistemas de detección de intrusiones:** Monitorear y bloquear tráfico malicioso.

## Ataques de ingeniería social

### ¿Qué es la ingeniería social?

Los atacantes manipulan a los usuarios para obtener acceso a credenciales o información sensible. Esto puede incluir phishing, pretexting o baiting.

### Ejemplo de ataque

Un atacante envía un correo electrónico falso que parece ser de un administrador de sistemas, solicitando las credenciales de la base de datos.

### Mitigación

- **Concientización:** Capacitar a los usuarios sobre cómo identificar y evitar ataques de ingeniería social.

- **Políticas de seguridad:** Establecer políticas claras sobre el manejo de credenciales y datos sensibles.

- **Autenticación multifactor:** Reducir el riesgo incluso si las credenciales son comprometidas.
