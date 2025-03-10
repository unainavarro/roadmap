<h1 align="center">Control de Acceso</h1>

<h2>📑 Contenido</h2>

- [Control de acceso](#control-de-acceso)
- [Autenticación (Authentication)](#autenticación-authentication)
  - [¿Qué es la autenticación?](#qué-es-la-autenticación)
  - [Métodos de autenticación](#métodos-de-autenticación)
  - [Autenticación basada en contraseñas](#autenticación-basada-en-contraseñas)
  - [Autenticación de dos factores (2FA)](#autenticación-de-dos-factores-2fa)
  - [Autenticación integrada con sistemas externos](#autenticación-integrada-con-sistemas-externos)
- [Autorización (Authorization)](#autorización-authorization)
  - [¿Qué es la autorización?](#qué-es-la-autorización)
  - [Roles y permisos](#roles-y-permisos)
- [Gestión de permisos con GRANT y REVOKE](#gestión-de-permisos-con-grant-y-revoke)
  - [GRANT](#grant)
  - [REVOKE](#revoke)
- [Buenas prácticas](#buenas-prácticas)
- [Integración de autenticación y autorización](#integración-de-autenticación-y-autorización)
  - [Flujo de control de acceso](#flujo-de-control-de-acceso)
  - [Ejemplo de integración con 2FA y Roles](#ejemplo-de-integración-con-2fa-y-roles)
- [Ejemplo práctico: implementación de control de acceso](#ejemplo-práctico-implementación-de-control-de-acceso)
  - [Creación de roles y asignación de permisos](#creación-de-roles-y-asignación-de-permisos)
  - [Revocación de permisos](#revocación-de-permisos)

## Control de acceso

El control de acceso es un componente fundamental de la seguridad en bases de datos. Consiste en garantizar que solo usuarios autorizados puedan acceder a los datos y realizar operaciones específicas. Este control se divide en dos procesos principales: la autenticación (verificar la identidad del usuario) y la autorización (determinar qué acciones puede realizar el usuario).

## Autenticación (Authentication)

### ¿Qué es la autenticación?

La autenticación es el proceso de verificar la identidad de un usuario, aplicación o sistema que intenta acceder a la base de datos. Es la primera línea de defensa para proteger los datos.

### Métodos de autenticación

### Autenticación basada en contraseñas

El método más común, donde el usuario proporciona un nombre de usuario y una contraseña.

Buenas prácticas:

- Exigir contraseñas complejas (mínimo 12 caracteres, con mayúsculas, minúsculas, números y símbolos).

- Almacenar contraseñas encriptadas (usando algoritmos como bcrypt o SHA-256).

---

### Autenticación de dos factores (2FA)

Añade una capa adicional de seguridad al requerir un segundo factor de autenticación, además de la contraseña.

Factores comunes:

- Códigos enviados por SMS o correo electrónico.

- Aplicaciones de autenticación (como Google Authenticator o Authy).

- Dispositivos físicos (como tokens USB o tarjetas inteligentes).

---

### Autenticación integrada con sistemas externos

Utiliza sistemas externos como LDAP, Active Directory o OAuth para autenticar usuarios.

Ventajas:

- Centraliza la gestión de usuarios.

- Reduce la necesidad de almacenar credenciales en la base de datos.

---

## Autorización (Authorization)

### ¿Qué es la autorización?

La autorización es el proceso de determinar qué acciones puede realizar un usuario autenticado. Esto incluye permisos para leer, escribir, modificar o eliminar datos.

### Roles y permisos

Los roles son grupos de permisos que se asignan a usuarios o aplicaciones. Los permisos definen las operaciones específicas que se pueden realizar en la base de datos.

Ejemplo de Roles Comunes:

- **Administrador:** Acceso completo a la base de datos.

- **Lector:** Solo puede realizar consultas de lectura.

- **Editor**: Puede leer y modificar datos, pero no eliminar tablas.

## Gestión de permisos con GRANT y REVOKE

En SQL, los permisos se gestionan mediante los comandos GRANT y REVOKE.

### GRANT

Otorga permisos a un usuario o rol.

```sql
-- sintaxis
GRANT permiso ON objeto TO usuario_o_rol;

-- Otorgar permiso de lectura en una tabla
GRANT SELECT ON Empleados TO Lector;

-- Otorgar permiso de inserción y actualización
GRANT INSERT, UPDATE ON Empleados TO Editor;

```

---

### REVOKE

Revoca permisos previamente otorgados.

```sql
-- sintaxis
REVOKE permiso ON objeto FROM usuario_o_rol;

-- Revocar permiso de eliminación
REVOKE DELETE ON Empleados FROM Editor;

-- Revocar todos los permisos
REVOKE ALL PRIVILEGES ON Empleados FROM Editor;
```

## Buenas prácticas

- **Principio de mínimo privilegio:** Otorgar solo los permisos necesarios.

- **Uso de roles:** Asignar permisos a roles en lugar de usuarios individuales para simplificar la gestión.

- **Auditoría regular:** Revisar y ajustar los permisos periódicamente.

## Integración de autenticación y autorización

### Flujo de control de acceso

- **Autenticación:** El usuario inicia sesión con su nombre de usuario y contraseña (y un segundo factor si está habilitado 2FA).

- **Autorización:** El sistema verifica los permisos del usuario basados en su rol.

- **Acceso:** El usuario puede realizar solo las operaciones permitidas.

### Ejemplo de integración con 2FA y Roles

- Un usuario con rol Lector inicia sesión con 2FA y solo puede realizar consultas.

- Un usuario con rol Editor inicia sesión con 2FA y puede leer, insertar y modificar datos.

- Un usuario con rol Administrador inicia sesión con 2FA y tiene acceso completo

## Ejemplo práctico: implementación de control de acceso

### Creación de roles y asignación de permisos

```sql
-- Crear roles
CREATE ROLE Lector;
CREATE ROLE Editor;
CREATE ROLE Administrador;

-- Asignar permisos a roles
GRANT SELECT ON Empleados TO Lector;
GRANT SELECT, INSERT, UPDATE ON Empleados TO Editor;
GRANT ALL PRIVILEGES ON Empleados TO Administrador;

-- Asignar roles a usuarios
GRANT Lector TO usuario_lector;
GRANT Editor TO usuario_editor;
GRANT Administrador TO usuario_admin;
```

### Revocación de permisos

```sql
-- Revocar permiso de inserción
REVOKE INSERT ON Empleados FROM Editor;

-- Revocar todos los permisos
REVOKE ALL PRIVILEGES ON Empleados FROM usuario_editor;
```
