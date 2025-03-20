<h1 align="center">Optimización y buenas prácticas</h1>

<h2>📑 Contenido</h2>

- [Optimización y buenas prácticas](#optimización-y-buenas-prácticas)
- [Optimización de rendimiento (React.memo, useMemo, useCallback)](#optimización-de-rendimiento-reactmemo-usememo-usecallback)
  - [React.memo](#reactmemo)
  - [useMemo](#usememo)
  - [useCallback](#usecallback)
- [Código limpio y buenas prácticas de desarrollo](#código-limpio-y-buenas-prácticas-de-desarrollo)
  - [Componentes pequeños y reutilizables](#componentes-pequeños-y-reutilizables)
  - [Nombres descriptivos](#nombres-descriptivos)
  - [Evitar código duplicado](#evitar-código-duplicado)
  - [Manejo de errores](#manejo-de-errores)
  - [Documentación](#documentación)

## Optimización y buenas prácticas

Desarrollar aplicaciones React no solo implica crear funcionalidades, sino también garantizar que el código sea eficiente, mantenible y accesible.

## Optimización de rendimiento (React.memo, useMemo, useCallback)

React es conocido por su eficiencia, pero en aplicaciones grandes o complejas, el rendimiento puede verse afectado. Afortunadamente, React ofrece herramientas para optimizar el rendimiento.

### React.memo

`React.memo` es una función de orden superior que memoriza un componente, evitando re-renderizados innecesarios cuando sus props no cambian.

```javascript
import React from "react";

const ComponenteMemoizado = React.memo(function MiComponente({ texto }) {
  console.log("Renderizado");
  return <p>{texto}</p>;
});

function App() {
  const [contador, setContador] = React.useState(0);

  return (
    <div>
      <ComponenteMemoizado texto="Texto fijo" />
      <button onClick={() => setContador(contador + 1)}>
        Clic: {contador}
      </button>
    </div>
  );
}
```

En este ejemplo, `ComponenteMemoizado` solo se renderiza una vez, ya que su prop `texto` no cambia.

### useMemo

`useMemo` memoriza un valor calculado, evitando cálculos costosos en cada renderizado.

```javascript
import React, { useMemo } from "react";

function Lista({ items }) {
  const total = useMemo(() => {
    console.log("Calculando total...");
    return items.reduce((acc, item) => acc + item.precio, 0);
  }, [items]);

  return <p>Total: {total}</p>;
}
```

Aquí, total solo se `recalcula` cuando items cambia.

### useCallback

`useCallback` memoriza una función, evitando que se cree una nueva instancia en cada renderizado. Es útil para optimizar componentes que dependen de la igualdad de referencias.

```javascript
import React, { useCallback, useState } from "react";

function BotonClick() {
  const [contador, setContador] = useState(0);

  const incrementar = useCallback(() => {
    setContador((prev) => prev + 1);
  }, []);

  return <button onClick={incrementar}>Clics: {contador}</button>;
}
```

En este caso, `incrementar` no cambia entre renderizados, lo que optimiza el rendimiento.

## Código limpio y buenas prácticas de desarrollo

Escribir código limpio y seguir buenas prácticas es esencial para mantener aplicaciones escalables y fáciles de entender.

### Componentes pequeños y reutilizables

- Divide la lógica en componentes más pequeños.

- Evita componentes monolíticos que hagan demasiado.

### Nombres descriptivos

- Usa nombres claros y descriptivos para componentes, variables y funciones.

- Ejemplo: `UserProfile` en lugar de `Comp1`.

### Evitar código duplicado

- Extrae lógica repetitiva en funciones o custom hooks.

- Usa componentes de orden superior (HOCs) o render props cuando sea necesario.

### Manejo de errores

- Usa `try/catch` para manejar errores en operaciones asíncronas.

- Proporciona mensajes de error claros y útiles.

### Documentación

- Documenta componentes y funciones importantes.

- Usa herramientas como JSDoc para generar documentación automática.
