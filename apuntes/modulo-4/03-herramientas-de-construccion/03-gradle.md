<h1 align="center">Gradle</h1>

<h2>📑 Contenido</h2>

- [Gradle](#gradle)
- [Conceptos básicos de Gradle](#conceptos-básicos-de-gradle)
  - [¿Qué es Gradle y para qué sirve?](#qué-es-gradle-y-para-qué-sirve)
  - [Diferencias entre Gradle y otras herramientas](#diferencias-entre-gradle-y-otras-herramientas)
- [Configuración inicial y estructura básica de un proyecto Gradle](#configuración-inicial-y-estructura-básica-de-un-proyecto-gradle)
- [Archivos principales](#archivos-principales)
  - [El archivo build.gradle](#el-archivo-buildgradle)
- [¿Qué son las tareas (tasks) en Gradle?](#qué-son-las-tareas-tasks-en-gradle)
- [Configuración del settings.gradle](#configuración-del-settingsgradle)
- [Dependencias](#dependencias)
  - [Cómo declarar dependencias](#cómo-declarar-dependencias)
  - [Configuraciones de dependencia](#configuraciones-de-dependencia)
- [Repositorios](#repositorios)
- [Ciclo de vida de Gradle](#ciclo-de-vida-de-gradle)
  - [Ejecución de tareas básicas](#ejecución-de-tareas-básicas)
  - [Tareas predefinidas](#tareas-predefinidas)
  - [Personalización de tareas](#personalización-de-tareas)

## Gradle

En el mundo del desarrollo de software, la automatización de tareas como la compilación, las pruebas y el empaquetado es esencial. Gradle es una herramienta de construcción flexible y potente que combina lo mejor de Maven y Ant, ofreciendo un enfoque moderno y eficiente para la gestión de proyectos.

## Conceptos básicos de Gradle

### ¿Qué es Gradle y para qué sirve?

Gradle es una herramienta de automatización de construcción de código abierto que utiliza un enfoque basado en scripts (Groovy o Kotlin) para definir tareas y dependencias. Es ampliamente utilizado en proyectos Java, Kotlin y Android. Sus principales ventajas son:

- **Flexibilidad:** Permite personalizar tareas y flujos de trabajo.

- **Rendimiento:** Utiliza un sistema de caché para acelerar las construcciones.

- **Extensibilidad:** Admite plugins para ampliar sus funcionalidades.

### Diferencias entre Gradle y otras herramientas

- **Maven:** Maven utiliza un enfoque basado en XML (`pom.xml`), mientras que Gradle usa scripts en Groovy o Kotlin (`build.gradle`), lo que lo hace más expresivo y flexible.

- **Ant:** Ant es más manual y menos estructurado, mientras que Gradle ofrece un enfoque más moderno y automatizado.

## Configuración inicial y estructura básica de un proyecto Gradle

Un proyecto Gradle básico tiene la siguiente estructura:

```
mi-proyecto/
├── src/
│   ├── main/
│   │   ├── java/          # Código fuente principal
│   │   └── resources/     # Recursos (archivos de configuración, propiedades, etc.)
│   └── test/
│       ├── java/          # Código fuente de pruebas
│       └── resources/     # Recursos para pruebas
├── build.gradle           # Archivo de configuración principal
└── settings.gradle        # Configuración de proyectos multi-módulo
```

## Archivos principales

### El archivo build.gradle

El archivo `build.gradle` es el corazón de un proyecto Gradle. Define las dependencias, tareas y configuraciones del proyecto. Puede escribirse en Groovy o Kotlin (usando `build.gradle.kts`).

Ejemplo básico en Groovy:

```groovy
plugins {
    id 'java'
}

group = 'com.empresa'
version = '1.0.0'

repositories {
    mavenCentral()
}

dependencies {
    testImplementation 'junit:junit:4.13.2'
}
```

## ¿Qué son las tareas (tasks) en Gradle?

Las tareas son acciones que Gradle ejecuta, como compilar, probar o empaquetar. Puedes definir tareas personalizadas:

```groovy
task saludar {
    doLast {
        println '¡Hola, Gradle!'
    }
}
```

Ejecuta la tarea con: `gradle saludar`.

## Configuración del settings.gradle

El archivo `settings.gradle` se utiliza para configurar proyectos multi-módulo. Por ejemplo:

```groovy
rootProject.name = 'mi-proyecto'
include 'modulo1', 'modulo2'
```

## Dependencias

### Cómo declarar dependencias

Las dependencias se declaran en la sección `dependencies` del `build.gradle`. Por ejemplo:

```groovy
dependencies {
    implementation 'com.google.guava:guava:30.1-jre'
    testImplementation 'junit:junit:4.13.2'
}
```

### Configuraciones de dependencia

- **implementation:** Dependencia para el código principal.

- **api:** Expone la dependencia a los consumidores del módulo.

- **testImplementation:** Dependencia para pruebas.

## Repositorios

Gradle busca dependencias en repositorios como Maven Central o JCenter. Puedes configurar repositorios adicionales:

```groovy
repositories {
    mavenCentral()
    maven {
        url 'https://repo.ejemplo.com'
    }
}
```

## Ciclo de vida de Gradle

### Ejecución de tareas básicas

- **Compilar y empaquetar:** `gradle build`

- **Limpiar el proyecto:** `gradle clean`

- **Ejecutar pruebas:** `gradle test`

### Tareas predefinidas

- **assemble:** Crea los archivos de salida (JAR, WAR, etc.).

- **check:** Ejecuta pruebas y verificaciones.

### Personalización de tareas

Puedes crear tareas personalizadas para automatizar procesos:

```groovy
task copiarArchivos(type: Copy) {
    from 'src/main/resources'
    into 'build/resources'
}
```

> [!NOTE]
> Breve introducción para adquirir los conceptos y empezar a practicar.
