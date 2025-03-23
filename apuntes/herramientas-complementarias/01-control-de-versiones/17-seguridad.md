<h1 align="center">Seguridad básica</h1>

<h2>📑 Contenido</h2>

- [Practicas y consideraciones(básicas)](#practicas-y-consideracionesbásicas)
  - [Gestión de acceso](#gestión-de-acceso)
  - [Utiliza claves SSH](#utiliza-claves-ssh)
  - [Protege tus credenciales](#protege-tus-credenciales)
  - [Escaneo de dependencias](#escaneo-de-dependencias)
  - [Comentarios en el código](#comentarios-en-el-código)
  - [Políticas de contribución](#políticas-de-contribución)
  - [Registro de auditoría](#registro-de-auditoría)
  - [Gestión de branches](#gestión-de-branches)
  - [Seguridad del hosting](#seguridad-del-hosting)
  - [Evaluación de riesgos](#evaluación-de-riesgos)
  - [Seguimiento de cambios](#seguimiento-de-cambios)

## Practicas y consideraciones(básicas)

La seguridad de los repositorios Git es una preocupación importante, ya que proteger tu código fuente y datos es fundamental en el desarrollo de software. Aquí hay algunas prácticas y consideraciones clave para garantizar la seguridad de tus repositorios Git:

### Gestión de acceso

- Utiliza autenticación de dos factores (2FA) para todas las cuentas de usuario.
- Limita el acceso al repositorio solo a los colaboradores y miembros del equipo necesarios.
- Revisa y gestiona regularmente los permisos de acceso, revocando a aquellos que no necesitan acceso continuo.
- Utiliza grupos de usuarios para administrar permisos de acceso de manera eficiente.

### Utiliza claves SSH

- Fomenta el uso de claves SSH para autenticar a los colaboradores en lugar de contraseñas, ya que son más seguras.
- Configura contraseñas fuertes para claves SSH y considera el uso de una herramienta de administración de claves.

**Pasos para crear y subir con SSH**

1. Al crear el proyecto pulsar la opción de SSH.
2. Abrir Git Bash
3. `git remote add origin git@github.com:TU_ENLACE_SSH_DE_GITHUB`
4. `ssh-keygen -t ed25519 -C "tu_email@example.com"`
5. Genera una clave publica/privada
6. Introduces una contraseña
7. Una vez creada, Subir clave **PUBLICA**: En GitHub>Settings> SSH y GPG KEYS > Crear Nueva SSH KEY. Dentro pegar el contenido de la clave con extension .pub
8. `git push -u origin nombre-de-la-rama (main o master)`
9. Introducir la contraseña de la SSH.
10. FIN.

**Pasos para clonar con SSH**

1. Copiar código SSH de GitHub: git@github.com:TU_ENLACE_SSH_DE_GITHUB_SSH
2. git clone git@github.com:TU_ENLACE_SSH_DE_GITHUB_SSH
3. Introducir la contraseña SSH
4. FIN.

### Protege tus credenciales

- Nunca almacenes contraseñas o credenciales en texto sin formato dentro de los repositorios.
- Utiliza variables de entorno o archivos de configuración fuera del control de versiones para gestionar secretos y credenciales.

### Escaneo de dependencias

- Utiliza herramientas de escaneo de dependencias para identificar y abordar vulnerabilidades en las bibliotecas y paquetes que utilizas.

### Comentarios en el código

- Evita dejar comentarios en el código que contengan información confidencial, como contraseñas o claves de acceso.

### Políticas de contribución

Establece políticas claras de contribución y revisión de código para garantizar que todos los cambios sean revisados y aprobados por personas autorizadas.

### Registro de auditoría

Mantén un registro de auditoría para rastrear actividades importantes, como cambios en los permisos de acceso y acciones realizadas por colaboradores.

### Gestión de branches

Limita la capacidad de fusionar o hacer push a branches sensibles, como la rama principal, solo a personas autorizadas.

### Seguridad del hosting

Utiliza servicios de alojamiento de código confiables que implementen medidas de seguridad sólidas. Mantén tu servidor Git y las herramientas relacionadas actualizadas con regularidad

### Evaluación de riesgos

Realiza evaluaciones periódicas de riesgos y pruebas de seguridad para identificar y abordar posibles vulnerabilidades.

### Seguimiento de cambios

Mantén un registro detallado de los cambios realizados en los repositorios, lo que facilita la identificación de actividades sospechosas.

> [!NOTE]
>
> La seguridad es un proceso continuo y que debe adaptarse a las necesidades específicas de tu proyecto y equipo. Mantén tus sistemas y prácticas de seguridad actualizados para proteger tus repositorios Git y datos de manera efectiva
