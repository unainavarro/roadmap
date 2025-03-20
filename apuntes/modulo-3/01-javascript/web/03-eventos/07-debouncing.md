<h1 align="center">Debouncing</h1>

<h2>📑 Contenido</h2>

- [Debouncing](#debouncing)
- [¿Qué es el debouncing?](#qué-es-el-debouncing)
- [El problema que resuelve el debouncing](#el-problema-que-resuelve-el-debouncing)
- [Implementación de debouncing](#implementación-de-debouncing)
  - [Uso de setTimeout y funciones tradicionales](#uso-de-settimeout-y-funciones-tradicionales)
  - [Uso de funciones flecha](#uso-de-funciones-flecha)
- [Caso práctico: optimizar un buscador](#caso-práctico-optimizar-un-buscador)

## Debouncing

El debouncing es una técnica de programación utilizada para optimizar el manejo de eventos que se ejecutan con mucha frecuencia, como `scroll`, `resize`, o `keyup`. Su objetivo es limitar la cantidad de veces que se ejecuta una función, asegurando que solo se ejecute después de que haya pasado un cierto período de inactividad.

## ¿Qué es el debouncing?

El debouncing es una técnica que retrasa la ejecución de una función hasta que haya pasado un tiempo determinado sin que se dispare el evento nuevamente. Esto es especialmente útil para eventos que se activan muchas veces en un corto período de tiempo, como el movimiento del mouse, el redimensionamiento de la ventana o la escritura en un campo de texto.

## El problema que resuelve el debouncing

Cuando un evento se dispara con mucha frecuencia (por ejemplo, cada vez que el usuario escribe una letra en un campo de búsqueda), puede generar un gran número de llamadas a funciones, lo que puede afectar el rendimiento de la aplicación. El debouncing resuelve este problema asegurando que la función solo se ejecute después de que el usuario haya dejado de interactuar durante un tiempo específico.

## Implementación de debouncing

### Uso de setTimeout y funciones tradicionales

La implementación clásica de debouncing utiliza `setTimeout` para retrasar la ejecución de la función y clearTimeout para cancelar la ejecución si el evento se dispara nuevamente antes de que termine el tiempo de espera.

```javascript
function debounce(func, wait) {
  let timeout;
  return function (...args) {
    clearTimeout(timeout);
    timeout = setTimeout(() => func.apply(this, args), wait);
  };
}
```

### Uso de funciones flecha

Con las funciones flecha, la implementación de debouncing se vuelve más concisa y legible.

```javascript
const debounce = (func, wait) => {
  let timeout;
  return (...args) => {
    clearTimeout(timeout);
    timeout = setTimeout(() => func(...args), wait);
  };
};
```

## Caso práctico: optimizar un buscador

Supongamos que tienes un campo de búsqueda que realiza consultas a una API cada vez que el usuario escribe una letra. Sin debouncing, esto generaría una gran cantidad de solicitudes innecesarias. Con debouncing, podemos asegurar que la consulta solo se realice después de que el usuario haya dejado de escribir durante un tiempo determinado.

```html
<input type="text" id="buscador" placeholder="Buscar..." />
<div id="resultados"></div>
```

```javascript
const buscador = document.getElementById("buscador");
const resultados = document.getElementById("resultados");

// Función que simula una consulta a una API
function buscar(query) {
  resultados.textContent = `Buscando: ${query}`;
  // Aquí iría la lógica para hacer la consulta a la API
}

// Función debounce
const debounce = (func, wait) => {
  let timeout;
  return (...args) => {
    clearTimeout(timeout);
    timeout = setTimeout(() => func(...args), wait);
  };
};

// Aplicar debouncing a la función de búsqueda
const buscarDebounced = debounce(buscar, 300);

// Escuchar el evento keyup en el campo de búsqueda
buscador.addEventListener("keyup", (evento) => {
  buscarDebounced(evento.target.value);
});
```

Explicación

- **Campo de búsqueda:** El usuario escribe en el campo de búsqueda, y el evento `keyup` se dispara con cada tecla presionada.

- **Debouncing:** La función `buscarDebounced` retrasa la ejecución de `buscar` hasta que el usuario haya dejado de escribir durante 300 milisegundos.

- **Resultados:** Solo después de este período de inactividad, se realiza la consulta y se muestran los resultados.
