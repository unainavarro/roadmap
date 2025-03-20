<h1 align="center">Decoradores</h1>

<h2>📑 Contenido</h2>

- [Decoradores](#decoradores)
- [Tipos de decoradores](#tipos-de-decoradores)
  - [Decoradores de clase](#decoradores-de-clase)
  - [Decoradores de método](#decoradores-de-método)
  - [Decoradores de parámetro](#decoradores-de-parámetro)
- [Ejemplo práctico](#ejemplo-práctico)

## Decoradores

Los decoradores son una característica de TypeScript que proporciona una forma de añadir metadatos y modificar comportamientos en clases, métodos, propiedades y otros elementos del lenguaje de manera declarativa. Los decoradores se utilizan comúnmente en aplicaciones TypeScript y en el ecosistema de Angular para realizar tareas como la inyección de dependencias, la validación de datos, el enrutamiento, la administración de estados y más.

Los decoradores se definen utilizando la sintaxis `@nombreDelDecorador` justo antes de la declaración del elemento que se va a decorar. Un decorador es simplemente una función que acepta uno o más argumentos y devuelve una función, la cual es llamada con el objeto de destino y otras informaciones relevantes en tiempo de ejecución.

```ts
// Decorador de método
function miDecorador(
  target: any,
  propertyKey: string,
  descriptor: PropertyDescriptor
) {
  console.log(
    `Decorando el método ${propertyKey} de la clase ${target.constructor.name}`
  );
}

class MiClase {
  @miDecorador
  miMetodo() {
    console.log("Ejecutando miMetodo");
  }
}

let instancia = new MiClase();
instancia.miMetodo();
```

En este ejemplo, @miDecorador es un decorador de método que se aplica al método miMetodo de la clase MiClase. Cuando se instancia MiClase y se llama a miMetodo(), el decorador se ejecuta y muestra un mensaje en la consola.

## Tipos de decoradores

TypeScript ofrece varios tipos de decoradores:

### Decoradores de clase

Se aplican a clases y se utilizan para modificar o extender su comportamiento.

```typescript
function decoradorDeClase(constructor: Function) {
  console.log(`Clase decorada: ${constructor.name}`);
}

@decoradorDeClase
class MiClase {}
```

### Decoradores de método

Se aplican a métodos de clase para modificar su comportamiento o agregar lógica adicional.

```typescript
function logLlamadas(
  target: any,
  propertyKey: string,
  descriptor: PropertyDescriptor
) {
  const metodoOriginal = descriptor.value;
  descriptor.value = function (...args: any[]) {
    console.log(`Método llamado: ${propertyKey} con argumentos: ${args}`);
    return metodoOriginal.apply(this, args);
  };
}

class MiClase {
  @logLlamadas
  saludar(nombre: string) {
    return `Hola, ${nombre}`;
  }
}
```

### Decoradores de parámetro

Se aplican a los parámetros de un método para manipular o registrar datos de los mismos.

```typescript
function decoradorDeParametro(
  target: any,
  propertyKey: string,
  parameterIndex: number
) {
  console.log(
    `Parámetro decorado: ${propertyKey}, posición: ${parameterIndex}`
  );
}

class MiClase {
  saludar(@decoradorDeParametro mensaje: string) {
    console.log(mensaje);
  }
}
```

## Ejemplo práctico

```typescript
function Authenticated(
  target: any,
  propertyKey: string,
  descriptor: PropertyDescriptor
) {
  const metodoOriginal = descriptor.value;
  descriptor.value = function (...args: any[]) {
    if (!this.isLoggedIn) {
      throw new Error("Usuario no autenticado");
    }
    return metodoOriginal.apply(this, args);
  };
}

class Usuario {
  isLoggedIn = false;

  @Authenticated
  accederDashboard() {
    console.log("Accediendo al dashboard...");
  }
}

const usuario = new Usuario();
try {
  usuario.accederDashboard(); // Lanza un error porque isLoggedIn es false
} catch (error) {
  console.error(error.message);
}

usuario.isLoggedIn = true;
usuario.accederDashboard(); // Accede correctamente
```
