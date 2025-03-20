<h1 align="center">Efectos y hooks</h1>

<h2>📑 Contenido</h2>

- [Efectos y hooks](#efectos-y-hooks)
- [Uso del hook useEffect](#uso-del-hook-useeffect)
- [Ejemplos de uso](#ejemplos-de-uso)
  - [Llamada a una API](#llamada-a-una-api)
  - [Suscripción a eventos](#suscripción-a-eventos)
- [Otros hooks útiles](#otros-hooks-útiles)
  - [useContext](#usecontext)
  - [useRef](#useref)
  - [useMemo](#usememo)
  - [useCallback](#usecallback)
- [Creación de custom hooks](#creación-de-custom-hooks)
  - [Ejemplo: custom hook para fetch de datos](#ejemplo-custom-hook-para-fetch-de-datos)
  - [Beneficios de los custom hooks](#beneficios-de-los-custom-hooks)

## Efectos y hooks

Los Hooks son una característica fundamental de React que permiten a los componentes funcionales manejar estado, efectos secundarios y otras funcionalidades que antes solo estaban disponibles en componentes de clase.

## Uso del hook useEffect

El Hook `useEffect` es esencial para manejar efectos secundarios en componentes funcionales, como llamadas a APIs, suscripciones o manipulación del DOM. Este Hook se ejecuta después de cada renderizado y puede limpiar recursos cuando el componente se desmonta.

Sintaxis básica:

```javascript
useEffect(() => {
  // Código del efecto
  return () => {
    // Código de limpieza (opcional)
  };
}, [dependencias]);
```

- **Primer argumento:** Una función que contiene el código del efecto.

- **Segundo argumento (opcional):** Un array de dependencias. Si se proporciona, el efecto solo se ejecutará cuando alguna de las dependencias cambie.

## Ejemplos de uso

### Llamada a una API

```javascript
import React, { useState, useEffect } from "react";

function DatosUsuario() {
  const [usuario, setUsuario] = useState(null);

  useEffect(() => {
    fetch("https://jsonplaceholder.typicode.com/users/1")
      .then((response) => response.json())
      .then((data) => setUsuario(data));
  }, []); // El array vacío [] significa que solo se ejecuta al montar

  if (!usuario) return <p>Cargando...</p>;

  return <p>Nombre: {usuario.name}</p>;
}
```

### Suscripción a eventos

```javascript
import React, { useState, useEffect } from "react";

function ContadorClicks() {
  const [clicks, setClicks] = useState(0);

  useEffect(() => {
    const handleClick = () => setClicks((prev) => prev + 1);
    window.addEventListener("click", handleClick);

    return () => {
      window.removeEventListener("click", handleClick); // Limpieza
    };
  }, []);

  return <p>Clicks: {clicks}</p>;
}
```

## Otros hooks útiles

Además de `useState` y `useEffect`, React ofrece otros Hooks que pueden ser muy útiles en diferentes situaciones.

### useContext

El Hook `useContext` permite acceder al valor de un contexto sin necesidad de usar un componente `Consumer`.

```javascript
import React, { useContext } from "react";

const MiContexto = createContext();

function ComponenteHijo() {
  const valor = useContext(MiContexto);
  return <p>Valor del contexto: {valor}</p>;
}
```

### useRef

El Hook `useRef` se utiliza para crear una referencia mutable que persiste durante todo el ciclo de vida del componente. Es útil para acceder a elementos del DOM o almacenar valores que no provocan re-renderizados.

```javascript
import React, { useRef } from "react";

function InputFocus() {
  const inputRef = useRef(null);

  const handleClick = () => {
    inputRef.current.focus();
  };

  return (
    <div>
      <input ref={inputRef} type="text" />
      <button onClick={handleClick}>Enfocar input</button>
    </div>
  );
}
```

### useMemo

El Hook `useMemo` memoriza un valor calculado, evitando cálculos innecesarios en cada renderizado.

```javascript
import React, { useMemo, useState } from "react";

function CalculoCostoso({ numero }) {
  const resultado = useMemo(() => {
    console.log("Calculando...");
    return numero * 2;
  }, [numero]); // Solo recalcula si `numero` cambia

  return <p>Resultado: {resultado}</p>;
}
```

### useCallback

El Hook `useCallback` memoriza una función, evitando que se cree una nueva instancia en cada renderizado. Es útil para optimizar componentes que dependen de la igualdad de referencias.

```javascript
import React, { useState, useCallback } from "react";

function BotonClick() {
  const [contador, setContador] = useState(0);

  const incrementar = useCallback(() => {
    setContador((prev) => prev + 1);
  }, []); // La función no cambia entre renderizados

  return <button onClick={incrementar}>Clics: {contador}</button>;
}
```

## Creación de custom hooks

Los custom hooks son funciones que encapsulan lógica reutilizable. Permiten extraer y compartir lógica entre componentes sin duplicar código.

### Ejemplo: custom hook para fetch de datos

```javascript
import { useState, useEffect } from "react";

function useFetch(url) {
  const [data, setData] = useState(null);
  const [cargando, setCargando] = useState(true);

  useEffect(() => {
    fetch(url)
      .then((response) => response.json())
      .then((data) => {
        setData(data);
        setCargando(false);
      });
  }, [url]);

  return { data, cargando };
}

// Uso en un componente
function DatosUsuario() {
  const { data, cargando } = useFetch(
    "https://jsonplaceholder.typicode.com/users/1"
  );

  if (cargando) return <p>Cargando...</p>;
  return <p>Nombre: {data.name}</p>;
}
```

### Beneficios de los custom hooks

- **Reutilización:** Evita duplicar lógica en diferentes componentes.

- **Organización:** Mantiene el código limpio y modular.

- **Testabilidad:** Facilita las pruebas unitarias de la lógica encapsulada.
