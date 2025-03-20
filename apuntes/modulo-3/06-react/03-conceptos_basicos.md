<h1 align="center">Conceptos básicos de React</h1>

<h2>📑 Contenido</h2>

- [Conceptos básicos](#conceptos-básicos)
- [Componentes (funcionales y de clase)](#componentes-funcionales-y-de-clase)
  - [Componentes funcionales](#componentes-funcionales)
  - [Componentes de clase](#componentes-de-clase)
  - [Diferencias clave](#diferencias-clave)
- [JSX (JavaScript XML)](#jsx-javascript-xml)
  - [Características de JSX](#características-de-jsx)
    - [Sintaxis similar a HTML](#sintaxis-similar-a-html)
    - [Incrustar expresiones JavaScript](#incrustar-expresiones-javascript)
    - [Componentes personalizados](#componentes-personalizados)
- [Props y state](#props-y-state)
  - [Props (propiedades)](#props-propiedades)
  - [State (estado)](#state-estado)
- [Ciclo de vida de los componentes](#ciclo-de-vida-de-los-componentes)
  - [Métodos principales del ciclo de vida (en componentes de clase)](#métodos-principales-del-ciclo-de-vida-en-componentes-de-clase)
    - [Montaje](#montaje)
    - [Actualización](#actualización)
    - [Desmontaje](#desmontaje)
  - [Equivalente en componentes funcionales (usando Hooks)](#equivalente-en-componentes-funcionales-usando-hooks)

## Conceptos básicos

React es una biblioteca poderosa y flexible, pero para aprovechar al máximo su potencial, es crucial entender sus conceptos básicos. En este capítulo, exploraremos los pilares de React: **componentes**, **JSX**, **props**, **state** y el **ciclo de vida de los componentes**.

## Componentes (funcionales y de clase)

En React, todo se basa en componentes. Un componente es una pieza reutilizable de código que define cómo una parte de la interfaz de usuario (UI) debe aparecer y comportarse. Los componentes pueden ser de dos tipos: funcionales y de clase.

### Componentes funcionales

Los componentes funcionales son funciones de JavaScript que devuelven elementos de React (usando JSX). Son la forma más moderna y recomendada de escribir componentes en React, especialmente con la introducción de React Hooks.

```javascript
function Saludo(props) {
  return <h1>¡Hola, {props.nombre}!</h1>;
}
```

### Componentes de clase

Los componentes de clase son clases de JavaScript que extienden React.Component. Aunque siguen siendo válidos, han sido reemplazados en gran medida por componentes funcionales debido a su mayor simplicidad y al uso de Hooks.

```javascript
class Saludo extends React.Component {
  render() {
    return <h1>¡Hola, {this.props.nombre}!</h1>;
  }
}
```

### Diferencias clave

- **Componentes funcionales:** Más simples, usan Hooks para manejar estado y efectos, y son más fáciles de probar.

- **Componentes de clase:** Más verbosos, usan métodos de ciclo de vida y this.state para manejar el estado.

## JSX (JavaScript XML)

JSX es una extensión de sintaxis de JavaScript que permite escribir código similar a HTML dentro de JavaScript. Aunque no es obligatorio usar JSX en React, es la forma más común y recomendada de definir la estructura de la UI.

### Características de JSX

#### Sintaxis similar a HTML

```javascript
const elemento = <h1>¡Hola, mundo!</h1>;
```

#### Incrustar expresiones JavaScript

```javascript
const nombre = "Juan";
const elemento = <h1>¡Hola, {nombre}!</h1>;
```

#### Componentes personalizados

```javascript
function Saludo(props) {
  return <h1>¡Hola, {props.nombre}!</h1>;
}
const elemento = <Saludo nombre="Ana" />;
```

> [!NOTE]
> JSX no es HTML. Es una abstracción que se compila en llamadas a React.`createElement()`, que finalmente crea elementos del DOM virtual.

## Props y state

### Props (propiedades)

Las props son un mecanismo para pasar datos de un componente padre a un componente hijo. Son inmutables, lo que significa que no pueden ser modificadas por el componente hijo.

```javascript
function Saludo(props) {
  return <h1>¡Hola, {props.nombre}!</h1>;
}

// Uso
<Saludo nombre="Carlos" />;
```

### State (estado)

El state es un objeto que almacena datos que pueden cambiar durante la vida útil de un componente. A diferencia de las props, el estado es mutable y se gestiona dentro del componente.

En componentes funcionales (usando Hooks):

```javascript
import React, { useState } from "react";

function Contador() {
  const [contador, setContador] = useState(0);

  return (
    <div>
      <p>Has hecho clic {contador} veces</p>
      <button onClick={() => setContador(contador + 1)}>Clic aquí</button>
    </div>
  );
}
```

En componentes de clase:

```javascript
class Contador extends React.Component {
  constructor(props) {
    super(props);
    this.state = { contador: 0 };
  }

  render() {
    return (
      <div>
        <p>Has hecho clic {this.state.contador} veces</p>
        <button
          onClick={() => this.setState({ contador: this.state.contador + 1 })}
        >
          Clic aquí
        </button>
      </div>
    );
  }
}
```

## Ciclo de vida de los componentes

Los componentes de React tienen un ciclo de vida que consta de varias fases, desde su creación hasta su eliminación. Estas fases permiten ejecutar código en momentos específicos, como cuando un componente se monta, actualiza o desmonta.

### Métodos principales del ciclo de vida (en componentes de clase)

#### Montaje

**`componentDidMount()`:** Se ejecuta después de que el componente se ha renderizado en el DOM.

```javascript
componentDidMount() {
  console.log("El componente se ha montado");
}
```

#### Actualización

**`componentDidUpdate(prevProps, prevState)`:** Se ejecuta después de que el componente se actualiza.

```javascript
componentDidUpdate(prevProps, prevState) {
  console.log("El componente se ha actualizado");
}
```

#### Desmontaje

**`componentWillUnmount()`:** Se ejecuta antes de que el componente se elimine del DOM.

```javascript
componentWillUnmount() {
  console.log("El componente se desmontará");
}
```

### Equivalente en componentes funcionales (usando Hooks)

En componentes funcionales, el ciclo de vida se maneja con el Hook `useEffect`.

```javascript
import React, { useEffect } from "react";

function Ejemplo() {
  useEffect(() => {
    console.log("El componente se ha montado o actualizado");

    return () => {
      console.log("El componente se desmontará");
    };
  }, []); // El array vacío [] significa que solo se ejecuta al montar y desmontar
}
```
