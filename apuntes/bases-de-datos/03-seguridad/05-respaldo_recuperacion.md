<h1 align="center">Respaldo y Recuperación</h1>

<h2>📑 Contenido</h2>

- [Respaldo y recuperación](#respaldo-y-recuperación)
- [Copias de seguridad (Backups)](#copias-de-seguridad-backups)
  - [¿Qué es una copia de seguridad?](#qué-es-una-copia-de-seguridad)
  - [Tipos de copias de seguridad](#tipos-de-copias-de-seguridad)
    - [Copia completa (Full Backup)](#copia-completa-full-backup)
    - [Copia incremental (Incremental Backup)](#copia-incremental-incremental-backup)
    - [Copia diferencial (Differential Backup)](#copia-diferencial-differential-backup)
  - [Estrategias de copias de seguridad](#estrategias-de-copias-de-seguridad)
  - [Implementación de copias de seguridad](#implementación-de-copias-de-seguridad)
  - [En MySQL](#en-mysql)
  - [En PostgreSQL](#en-postgresql)
- [Plan de recuperación ante desastres (DRP)](#plan-de-recuperación-ante-desastres-drp)
  - [¿Qué es un plan de recuperación ante desastres?](#qué-es-un-plan-de-recuperación-ante-desastres)
  - [Componentes de un DRP](#componentes-de-un-drp)
    - [Objetivo de tiempo de recuperación (RTO)](#objetivo-de-tiempo-de-recuperación-rto)
    - [Objetivo de punto de recuperación (RPO)](#objetivo-de-punto-de-recuperación-rpo)
    - [Estrategias de recuperación](#estrategias-de-recuperación)
  - [Pasos para crear un DRP](#pasos-para-crear-un-drp)
  - [Ejemplo de DRP para una base de datos](#ejemplo-de-drp-para-una-base-de-datos)
    - [Escenario](#escenario)
    - [Procedimiento de recuperación](#procedimiento-de-recuperación)
- [Herramientas y tecnologías para respaldo y recuperación](#herramientas-y-tecnologías-para-respaldo-y-recuperación)
  - [Herramientas de copias de seguridad](#herramientas-de-copias-de-seguridad)
  - [Soluciones de alta disponibilidad](#soluciones-de-alta-disponibilidad)
  - [Almacenamiento en la nube](#almacenamiento-en-la-nube)
- [Buenas Prácticas en respaldo y recuperación](#buenas-prácticas-en-respaldo-y-recuperación)

## Respaldo y recuperación

El respaldo y la recuperación son componentes críticos de la gestión de bases de datos, ya que garantizan la disponibilidad y la integridad de los datos en caso de fallos, errores humanos o desastres naturales

## Copias de seguridad (Backups)

### ¿Qué es una copia de seguridad?

Una copia de seguridad es una réplica de los datos de la base de datos que se almacena en un medio seguro para su restauración en caso de pérdida o corrupción de datos.

---

### Tipos de copias de seguridad

#### Copia completa (Full Backup)

Copia todos los datos de la base de datos.

- **Ventajas:** Fácil de restaurar.

- **Desventajas:** Requiere más tiempo y espacio de almacenamiento.

- **Uso recomendado:** Como punto de partida para otros tipos de copias.

#### Copia incremental (Incremental Backup)

Copia solo los cambios realizados desde la última copia (completa o incremental).

- **Ventajas:** Más rápido y requiere menos espacio.

- **Desventajas:** La restauración puede ser más compleja.

- **Uso recomendado:** Para bases de datos con cambios frecuentes.

#### Copia diferencial (Differential Backup)

Copia todos los cambios realizados desde la última copia completa.

- **Ventajas:** Más rápido que una copia completa y más fácil de restaurar que una incremental.

- **Desventajas:** Requiere más espacio que una copia incremental.

- **Uso recomendado:** Para bases de datos con cambios moderados.

---

### Estrategias de copias de seguridad

Estrategia 3-2-1

- **3 copias:** Una copia primaria y dos adicionales.

- **2 medios diferentes:** Por ejemplo, disco duro y cinta.

- **1 copia fuera del sitio:** Para proteger contra desastres locales.

Ejemplo de Plan de Copias:
Diario: Copia incremental cada noche.

- **Semanal:** Copia completa cada domingo.

- **Mensual:** Copia completa almacenada fuera del sitio.

---

### Implementación de copias de seguridad

### En MySQL

```bash
# Copia completa usando mysqldump
mysqldump -u usuario -p contraseña nombre_base_de_datos > backup.sql
```

### En PostgreSQL

```bash
# Copia completa usando pg_dump
pg_dump -U usuario -F c -b -v -f backup.dump nombre_base_de_datos
```

## Plan de recuperación ante desastres (DRP)

### ¿Qué es un plan de recuperación ante desastres?

Un plan de recuperación ante desastres (DRP) es un conjunto de procedimientos y políticas diseñados para restaurar la operatividad de una base de datos después de un evento catastrófico, como un fallo de hardware, un ataque cibernético o un desastre natural

---

### Componentes de un DRP

#### Objetivo de tiempo de recuperación (RTO)

El tiempo máximo aceptable para restaurar la base de datos después de un desastre.

- **Ejemplo**: Un RTO de 4 horas significa que la base de datos debe estar operativa dentro de ese plazo.

#### Objetivo de punto de recuperación (RPO)

La cantidad máxima de pérdida de datos aceptable, medida en tiempo.

- **Ejemplo:** Un RPO de 1 hora significa que no se pueden perder más de 1 hora de datos.

#### Estrategias de recuperación

- **Restauración desde copias de seguridad:** Usar copias completas, incrementales o diferenciales.

- **Replicación en tiempo real:** Mantener una réplica sincronizada de la base de datos en un sitio secundario.

- **Alta disponibilidad:** Usar clústeres o soluciones como AlwaysOn en SQL Server.

---

### Pasos para crear un DRP

- **Identificar riesgos:** Evaluar posibles escenarios de desastre (fallos de hardware, ataques, desastres naturales).

- **Definir RTO y RPO:** Establecer los objetivos de recuperación basados en las necesidades del negocio.

- **Seleccionar estrategias:** Elegir métodos de recuperación (copias de seguridad, replicación, etc.).

- **Documentar procedimientos:** Crear guías detalladas para la restauración de datos.

- **Probar el plan:** Realizar simulacros regulares para asegurar que el plan funcione.

---

### Ejemplo de DRP para una base de datos

#### Escenario

- **RTO:** 4 horas.

- **RPO:** 1 hora.

- **Estrategia:**

  - Copias completas semanales.

  - Copias incrementales diarias.

  - Replicación en tiempo real a un sitio secundario.

#### Procedimiento de recuperación

- **Identificar el fallo:** Determinar la causa y el alcance del desastre.

- **Restaurar desde copias de seguridad:**

  - Restaurar la última copia completa.

  - Aplicar copias incrementales hasta el punto de recuperación deseado.

- **Sincronizar réplicas:** Si se usa replicación, sincronizar la base de datos secundaria.

- **Verificar integridad:** Asegurar que los datos estén completos y consistentes.

- **Reanudar operaciones:** Poner la base de datos en línea y notificar a los usuarios.

---

## Herramientas y tecnologías para respaldo y recuperación

### Herramientas de copias de seguridad

- **MySQL:** mysqldump, mysqlbackup, herramientas de terceros como Percona XtraBackup.

- **PostgreSQL:** pg_dump, pg_basebackup, herramientas como Barman.

- **SQL Server:** BACKUP DATABASE, herramientas como SQL Server Management Studio (SSMS).

### Soluciones de alta disponibilidad

- **Replicación:** MySQL Replication, PostgreSQL Streaming Replication.

- **Clústeres:** MySQL Cluster, PostgreSQL Patroni, SQL Server AlwaysOn.

### Almacenamiento en la nube

- **Ventajas:** Escalabilidad, redundancia y acceso remoto.

- **Ejemplos:** Amazon RDS, Google Cloud SQL, Azure SQL Database.

## Buenas Prácticas en respaldo y recuperación

- **Automatización:** Programar copias de seguridad automáticas para evitar errores humanos.

- **Verificación:** Probar regularmente la restauración de copias para asegurar su integridad.

- **Almacenamiento seguro:** Guardar copias en ubicaciones seguras y encriptadas.

- **Documentación:** Mantener un registro detallado de las copias y los procedimientos de recuperación.

- **Actualización:** Revisar y actualizar el plan de recuperación ante desastres periódicamente.
