<h1 align="center">Maven</h1>

<h2>📑 Contenido</h2>

- [Maven](#maven)
- [Conceptos básicos de Maven](#conceptos-básicos-de-maven)
  - [¿Qué es Maven y por qué se utiliza?](#qué-es-maven-y-por-qué-se-utiliza)
  - [Estructura de un proyecto Maven](#estructura-de-un-proyecto-maven)
- [Archivo pom.xml](#archivo-pomxml)
  - [Configuración básica](#configuración-básica)
  - [Dependencias](#dependencias)
- [Ciclo de vida de Maven](#ciclo-de-vida-de-maven)
  - [Uso de comandos básicos](#uso-de-comandos-básicos)
- [Gestión de dependencias](#gestión-de-dependencias)
  - [Repositorios](#repositorios)
  - [Alcance de dependencias](#alcance-de-dependencias)
- [Exclusiones y conflictos](#exclusiones-y-conflictos)
- [Plugins de Maven](#plugins-de-maven)
- [Perfiles en Maven](#perfiles-en-maven)
- [Integración con otras herramientas](#integración-con-otras-herramientas)
  - [IDEs](#ides)
  - [Control de versiones](#control-de-versiones)
  - [CI/CD](#cicd)
- [Buenas prácticas](#buenas-prácticas)

## Maven

En el desarrollo de software, la gestión de dependencias, la compilación, las pruebas y el empaquetado de proyectos son tareas fundamentales. Maven es una herramienta de automatización de construcción y gestión de proyectos que simplifica estas tareas, permitiendo a los desarrolladores centrarse en escribir código en lugar de preocuparse por la configuración manual.

## Conceptos básicos de Maven

### ¿Qué es Maven y por qué se utiliza?

Maven es una herramienta de gestión y construcción de proyectos basada en el concepto de **Project Object Model (POM)**. Se utiliza principalmente para:

- Gestionar dependencias de librerías externas.

- Compilar, probar y empaquetar proyectos.

- Automatizar tareas repetitivas.

- Generar documentación y reportes.

Maven sigue el principio de Convención sobre Configuración, lo que significa que, si sigues las convenciones predeterminadas, necesitarás muy poca configuración para que tu proyecto funcione.

### Estructura de un proyecto Maven

Un proyecto Maven sigue una estructura de carpetas estándar:

```
mi-proyecto/
├── src/
│   ├── main/
│   │   ├── java/          # Código fuente principal
│   │   └── resources/     # Recursos (archivos de configuración, propiedades, etc.)
│   └── test/
│       ├── java/          # Código fuente de pruebas
│       └── resources/     # Recursos para pruebas
└── pom.xml               # Archivo de configuración de Maven
```

## Archivo pom.xml

El archivo `pom.xm`l (Project Object Model) es el corazón de un proyecto Maven. Define la configuración del proyecto, sus dependencias y cómo se debe construir.

### Configuración básica

Un `pom.xml` básico incluye:

- **groupId:** Identifica el proyecto de manera única (por ejemplo, com.empresa.miproyecto).

- **artifactId:** Nombre del proyecto (por ejemplo, mi-aplicacion).

- **version:** Versión del proyecto (por ejemplo, 1.0.0).

```xml
<project>
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.empresa</groupId>
    <artifactId>mi-aplicacion</artifactId>
    <version>1.0.0</version>
</project>
```

### Dependencias

Las dependencias se añaden en la sección `<dependencies>`. Por ejemplo, para añadir JUnit:

```xml
<dependencies>
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.13.2</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```

## Ciclo de vida de Maven

Maven sigue un ciclo de vida con fases predefinidas. Las fases principales son:

- **clean:** Elimina archivos generados previamente.

- **compile:** Compila el código fuente.

- **test:** Ejecuta las pruebas unitarias.

- **package:** Empaqueta el proyecto (por ejemplo, en un archivo JAR).

- **install:** Instala el paquete en el repositorio local.

- **deploy:** Sube el paquete a un repositorio remoto.

### Uso de comandos básicos

- **Compilar y empaquetar:** mvn clean package

- **Ejecutar pruebas:** mvn test

- **Instalar en el repositorio local:** mvn install

## Gestión de dependencias

### Repositorios

- **Repositorio local:** Almacena dependencias descargadas en tu máquina (~/.m2/repository).

- **Repositorio central:** Repositorio público de Maven donde se encuentran la mayoría de las dependencias.

- **Repositorios remotos:** Repositorios privados o de terceros.

### Alcance de dependencias

- **compile:** Dependencia disponible en todas las fases (por defecto).

- **test:** Solo disponible para pruebas.

- **provided:** Proporcionada por el entorno de ejecución (por ejemplo, servlets en un servidor).

- **runtime:** Necesaria en tiempo de ejecución, pero no para compilar.

## Exclusiones y conflictos

Para evitar conflictos de versiones, puedes excluir dependencias:

```xml
<dependency>
    <groupId>grupo</groupId>
    <artifactId>artefacto</artifactId>
    <version>versión</version>
    <exclusions>
        <exclusion>
            <groupId>grupo-excluido</groupId>
            <artifactId>artefacto-excluido</artifactId>
        </exclusion>
    </exclusions>
</dependency>
```

## Plugins de Maven

Los plugins extienden las funcionalidades de Maven. Algunos plugins comunes son:

- **maven-compiler-plugin:** Configura la versión de Java para compilar.

- **maven-surefire-plugin:** Ejecuta pruebas unitarias.

- **maven-jar-plugin:** Personaliza la creación de archivos JAR.

Ejemplo de configuración del `maven-compiler-plugin`:

```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <version>3.8.1</version>
            <configuration>
                <source>11</source>
                <target>11</target>
            </configuration>
        </plugin>
    </plugins>
</build>
```

## Perfiles en Maven

Los perfiles permiten configuraciones específicas para diferentes entornos (desarrollo, pruebas, producción). Ejemplo:

```xml
<profiles>
    <profile>
        <id>produccion</id>
        <properties>
            <env>prod</env>
        </properties>
    </profile>
</profiles>
```

## Integración con otras herramientas

### IDEs

IntelliJ IDEA y Eclipse tienen soporte integrado para Maven. Puedes importar un proyecto Maven directamente.

### Control de versiones

Maven se integra fácilmente con Git. El archivo `pom.xml` debe incluirse en el repositorio.

### CI/CD

En pipelines de CI/CD (como Jenkins o GitHub Actions), puedes usar comandos de Maven para compilar, probar y desplegar proyectos.

## Buenas prácticas

**Mantén un pom.xml limpio:** Evita añadir dependencias innecesarias.

**Documenta configuraciones importantes:** Usa comentarios en el pom.xml para explicar decisiones clave.

**Usa versiones específicas:** Evita el uso de versiones dinámicas (por ejemplo, 1.0.0-SNAPSHOT) en producción.

**Revisa conflictos de dependencias:** Usa mvn dependency:tree para analizar las dependencias.
