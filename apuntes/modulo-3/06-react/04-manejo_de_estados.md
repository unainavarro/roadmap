<h1 align="center">Manejo de estado</h1>

<h2>📑 Contenido</h2>

- [Manejo de estado](#manejo-de-estado)
- [Uso del hook useState](#uso-del-hook-usestate)
  - [Sintaxis básica](#sintaxis-básica)
- [Gestión de estado complejo con useReducer](#gestión-de-estado-complejo-con-usereducer)
- [Cuándo usar useReducer](#cuándo-usar-usereducer)
- [Context API para manejo de estado global](#context-api-para-manejo-de-estado-global)
  - [Pasos para usar Context API](#pasos-para-usar-context-api)
  - [Cuándo usar Context API](#cuándo-usar-context-api)
- [Uso de bibliotecas de gestión de estado (Redux, Zustand)](#uso-de-bibliotecas-de-gestión-de-estado-redux-zustand)
  - [Redux](#redux)
- [Zustand](#zustand)

## Manejo de estado

El manejo del estado es uno de los aspectos más importantes en el desarrollo de aplicaciones React. El estado determina cómo se comporta y renderiza una aplicación en respuesta a interacciones del usuario o cambios en los datos.

## Uso del hook useState

El Hook useState es la forma más básica y común de manejar el estado en componentes funcionales. Permite agregar estado local a un componente y actualizarlo de manera reactiva.

### Sintaxis básica

```javascript
const [estado, setEstado] = useState(valorInicial);
```

- **estado:** El valor actual del estado.

- **setEstado:** Una función para actualizar el estado.

- **valorInicial:** El valor inicial del estado (puede ser un número, string, array, objeto, etc.).

Ejemplo práctico:

```javascript
import React, { useState } from "react";

function Contador() {
  const [contador, setContador] = useState(0);

  return (
    <div>
      <p>Has hecho clic {contador} veces</p>
      <button onClick={() => setContador(contador + 1)}>Incrementar</button>
    </div>
  );
}
```

> [!NOTE]
>
> - `useState` puede usarse múltiples veces en un componente para manejar diferentes piezas de estado.
> - Actualizar el estado con `setEstado` provoca un re-renderizado del componente.

## Gestión de estado complejo con useReducer

Cuando el estado de un componente se vuelve complejo o depende de acciones específicas, useReducer es una alternativa más adecuada que useState. Este Hook está inspirado en el patrón Redux y es ideal para manejar lógica de estado más avanzada.

**Sintaxis básica:**

```javascript
const [estado, dispatch] = useReducer(reducer, estadoInicial);
```

- **reducer:** Una función que recibe el estado actual y una acción, y devuelve el nuevo estado.

- **estadoInicial:** El valor inicial del estado.

- **dispatch:** Una función para enviar acciones al reducer

Ejemplo:

```javascript
import React, { useReducer } from "react";

const initialState = { contador: 0 };

function reducer(state, action) {
  switch (action.type) {
    case "incrementar":
      return { contador: state.contador + 1 };
    case "decrementar":
      return { contador: state.contador - 1 };
    default:
      throw new Error("Acción no válida");
  }
}

function Contador() {
  const [state, dispatch] = useReducer(reducer, initialState);

  return (
    <div>
      <p>Contador: {state.contador}</p>
      <button onClick={() => dispatch({ type: "incrementar" })}>
        Incrementar
      </button>
      <button onClick={() => dispatch({ type: "decrementar" })}>
        Decrementar
      </button>
    </div>
  );
}
```

## Cuándo usar useReducer

- Cuando el estado tiene una estructura compleja (objetos anidados, arrays, etc.).

- Cuando las actualizaciones de estado dependen de acciones específicas.

- Cuando necesitas compartir lógica de estado entre componentes.

## Context API para manejo de estado global

La Context API es una característica de React que permite compartir estado entre componentes sin necesidad de pasar props manualmente en cada nivel del árbol de componentes. Es ideal para manejar estado global en aplicaciones pequeñas o medianas.

### Pasos para usar Context API

Crear un contexto:

```javascript
import React, { createContext, useState } from "react";

const MiContexto = createContext();
```

Proveer el contexto:

```javascript
function ProveedorContexto({ children }) {
  const [estado, setEstado] = useState("valor inicial");

  return (
    <MiContexto.Provider value={{ estado, setEstado }}>
      {children}
    </MiContexto.Provider>
  );
}
```

Consumir el contexto:

```javascript
function ComponenteHijo() {
  const { estado, setEstado } = useContext(MiContexto);

  return (
    <div>
      <p>Estado: {estado}</p>
      <button onClick={() => setEstado("nuevo valor")}>Cambiar estado</button>
    </div>
  );
}
```

Envolver la aplicación con el proveedor:

```javascript
function App() {
  return (
    <ProveedorContexto>
      <ComponenteHijo />
    </ProveedorContexto>
  );
}
```

### Cuándo usar Context API

- Para compartir estado entre componentes que no están directamente conectados en el árbol.

- En aplicaciones pequeñas o medianas donde no se necesita una solución más robusta como Redux.

## Uso de bibliotecas de gestión de estado (Redux, Zustand)

Para aplicaciones grandes y complejas, las bibliotecas de gestión de estado como Redux o Zustand son más adecuadas. Estas herramientas ofrecen un enfoque más estructurado y escalable para manejar el estado global.

### Redux

Redux es una biblioteca popular para gestionar el estado global en aplicaciones React. Sigue el patrón de un solo store y estado inmutable.

Características principales:

- **Store:** Un objeto que contiene todo el estado de la aplicación.

- **Actions:** Objetos que describen qué sucedió.

- **Reducers:** Funciones que especifican cómo el estado cambia en respuesta a las acciones.

Ejemplo:

```javascript
import { createStore } from "redux";
import { Provider, useSelector, useDispatch } from "react-redux";

// Reducer
function contadorReducer(state = { contador: 0 }, action) {
  switch (action.type) {
    case "incrementar":
      return { contador: state.contador + 1 };
    case "decrementar":
      return { contador: state.contador - 1 };
    default:
      return state;
  }
}

// Store
const store = createStore(contadorReducer);

// Componente
function Contador() {
  const contador = useSelector((state) => state.contador);
  const dispatch = useDispatch();

  return (
    <div>
      <p>Contador: {contador}</p>
      <button onClick={() => dispatch({ type: "incrementar" })}>
        Incrementar
      </button>
      <button onClick={() => dispatch({ type: "decrementar" })}>
        Decrementar
      </button>
    </div>
  );
}

// App
function App() {
  return (
    <Provider store={store}>
      <Contador />
    </Provider>
  );
}
```

## Zustand

Zustand es una biblioteca minimalista para la gestión del estado global. Es más sencilla que Redux y no requiere tanta configuración.

```javascript
import create from "zustand";

// Store
const useStore = create((set) => ({
  contador: 0,
  incrementar: () => set((state) => ({ contador: state.contador + 1 })),
  decrementar: () => set((state) => ({ contador: state.contador - 1 })),
}));

// Componente
function Contador() {
  const { contador, incrementar, decrementar } = useStore();

  return (
    <div>
      <p>Contador: {contador}</p>
      <button onClick={incrementar}>Incrementar</button>
      <button onClick={decrementar}>Decrementar</button>
    </div>
  );
}
```

Comparación:

- **Redux:** Ideal para aplicaciones grandes y complejas, pero requiere más configuración.

- **Zustand:** Más sencillo y ligero, perfecto para aplicaciones medianas.
