<h1 align="center">Encriptación</h1>

<h2>📑 Contenido</h2>

- [Encriptación](#encriptación)
- [Encriptación de Datos en Reposo](#encriptación-de-datos-en-reposo)
  - [¿Qué son los Datos en Reposo?](#qué-son-los-datos-en-reposo)
  - [Algoritmos de Encriptación para Datos en Reposo](#algoritmos-de-encriptación-para-datos-en-reposo)
  - [Implementación de Encriptación en Reposo](#implementación-de-encriptación-en-reposo)
  - [Buenas Prácticas para datos en reposo](#buenas-prácticas-para-datos-en-reposo)
- [Encriptación de datos en tránsito](#encriptación-de-datos-en-tránsito)
  - [¿Qué son los datos en tránsito?](#qué-son-los-datos-en-tránsito)
  - [Protocolos de encriptación para datos en tránsito](#protocolos-de-encriptación-para-datos-en-tránsito)
  - [Implementación de SSL/TLS en bases de datos](#implementación-de-ssltls-en-bases-de-datos)
    - [En MySQL](#en-mysql)
    - [En PostgreSQL](#en-postgresql)
  - [Buenas prácticas para datos en tránsito](#buenas-prácticas-para-datos-en-tránsito)
- [Ejemplo práctico: encriptación integral](#ejemplo-práctico-encriptación-integral)
  - [Encriptación de Datos en Reposo (AES)](#encriptación-de-datos-en-reposo-aes)
  - [Encriptación de Datos en Tránsito (SSL/TLS)](#encriptación-de-datos-en-tránsito-ssltls)

## Encriptación

La encriptación es una técnica fundamental para proteger la confidencialidad e integridad de los datos en una base de datos. Consiste en convertir la información en un formato ilegible (cifrado) que solo puede ser descifrado con una clave adecuada.

## Encriptación de Datos en Reposo

### ¿Qué son los Datos en Reposo?

Los datos en reposo son aquellos que se almacenan físicamente en una base de datos, disco duro o cualquier otro medio de almacenamiento. La encriptación de estos datos es crucial para protegerlos en caso de accesos no autorizados o robos de hardware.

### Algoritmos de Encriptación para Datos en Reposo

AES (Advanced Encryption Standard)

- **Descripción:** AES es un algoritmo de encriptación simétrica ampliamente utilizado. Es rápido, seguro y admite tamaños de clave de 128, 192 y 256 bits.

- **Uso común:** Encriptación de bases de datos, archivos y discos duros.

- **Ejemplo:** En SQL Server, se puede usar Transparent Data Encryption (TDE) con AES para encriptar toda la base de datos.

RSA (Rivest-Shamir-Adleman)

- **Descripción:** RSA es un algoritmo de encriptación asimétrica utilizado para proteger claves de encriptación simétrica (como AES) o para firmas digitales.

- **Uso común:** Protección de claves maestras en sistemas de encriptación.

### Implementación de Encriptación en Reposo

En SQL Server (TDE - Transparent Data Encryption)

```sql
-- Habilitar TDE en una base de datos
CREATE DATABASE ENCRYPTION KEY
WITH ALGORITHM = AES_256
ENCRYPTION BY SERVER CERTIFICATE MiCertificado;

ALTER DATABASE MiBaseDeDatos
SET ENCRYPTION ON;
```

En MySQL (InnoDB Tablespace Encryption)

```sql
-- Habilitar encriptación para una tabla
ALTER TABLE MiTabla ENCRYPTION='Y';
```

En PostgreSQL (pgcrypto)

```sql
-- Encriptar una columna
UPDATE MiTabla
SET columna_sensible = pgp_sym_encrypt('DatoConfidencial', 'ClaveSecreta');
```

### Buenas Prácticas para datos en reposo

- **Encriptación completa:** Encriptar toda la base de datos, no solo datos sensibles.

- **Gestión de claves:** Almacenar las claves de encriptación en un sistema seguro, como un HSM (Hardware Security Module).

- **Auditoría:** Monitorear y registrar el acceso a datos encriptados.

## Encriptación de datos en tránsito

### ¿Qué son los datos en tránsito?

Los datos en tránsito son aquellos que se transmiten entre sistemas, como entre una aplicación y una base de datos o entre servidores. La encriptación de estos datos es esencial para prevenir interceptaciones y ataques de "man-in-the-middle".

### Protocolos de encriptación para datos en tránsito

SSL/TLS (Secure Sockets Layer / Transport Layer Security)

- **Descripción:** SSL/TLS son protocolos criptográficos que proporcionan comunicación segura a través de una red.

- **Uso común:** Protección de conexiones entre aplicaciones y bases de datos, navegadores y servidores web, etc.

- **Versiones recomendadas:** TLS 1.2 o superior (TLS 1.3 es la más segura).

SSH (Secure Shell)

- **Descripción:** SSH es un protocolo para acceder y gestionar sistemas de forma segura.

- **Uso común:** Conexiones seguras a servidores y transferencia de archivos.

### Implementación de SSL/TLS en bases de datos

#### En MySQL

```bash
# Generar certificados SSL
openssl req -x509 -newkey rsa:2048 -keyout server-key.pem -out server-cert.pem -days 365 -nodes

# Configurar MySQL para usar SSL
[mysqld]
ssl-ca=/ruta/al/ca-cert.pem
ssl-cert=/ruta/al/server-cert.pem
ssl-key=/ruta/al/server-key.pem

# Verificar la conexión SSL SSL EN EL SQL
SHOW VARIABLES LIKE '%ssl%';
```

#### En PostgreSQL

```bash
# Generar certificados SSL
openssl req -x509 -newkey rsa:2048 -keyout server.key -out server.crt -days 365 -nodes

# Configurar MySQL para usar SSL
# postgresql.conf
ssl = on
ssl_cert_file = '/ruta/al/server.crt'
ssl_key_file = '/ruta/al/server.key'

# Verificar la conexión SSL EN EL SQL
SELECT * FROM pg_stat_ssl;
```

### Buenas prácticas para datos en tránsito

- **Usar TLS 1.2 o superior:** Evitar versiones obsoletas como SSL 3.0 o TLS 1.0.

- **Certificados válidos:** Asegurarse de que los certificados SSL/TLS estén actualizados y sean emitidos por una autoridad de confianza.

- **Cifrado fuerte:** Configurar el servidor para usar solo algoritmos de cifrado seguros (por ejemplo, AES-GCM).

## Ejemplo práctico: encriptación integral

### Encriptación de Datos en Reposo (AES)

```sql
-- Encriptar una columna en PostgreSQL usando pgcrypto
UPDATE MiTabla
SET columna_sensible = pgp_sym_encrypt('DatoConfidencial', 'ClaveSecreta');
```

### Encriptación de Datos en Tránsito (SSL/TLS)

```bash
# Configurar MySQL para usar SSL
[mysqld]
ssl-ca=/ruta/al/ca-cert.pem
ssl-cert=/ruta/al/server-cert.pem
ssl-key=/ruta/al/server-key.pem
```
